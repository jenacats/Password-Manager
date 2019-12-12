import java.io.*;
import java.util.Base64;

/**
 * The purpose of this class is to create/read files
 * this includes textfiles, where information will be stored, and folders where the text files are located
 */

public class FileHandler {
    private File file;

    /**
     * Creates filehandler object but will need to createDirectory
     * file variable should hold the folder or directory of where data is stored
     */
    public FileHandler(){
        file = null;
    }

    /**
     *
     * @param path Location of the folder that will store data
     * @throws FileException throws this if file does not exist
     */
    public FileHandler(String path) throws FileException{
        String updatedPath = path;
        if (path.contains("\\")){
            updatedPath = path.replaceAll("\\\\", "/");
        }
        file = new File(updatedPath);

        if (!file.exists()){
            throw new FileException("File doesn't exist!");
        }
    }

    /**
     *
     * @param path Location of where you want to create a new directory that will hold data
     * @throws FileException Throws this if there is a problem creating a new folder
     */
    public void createDirectory(String path) throws FileException {
        String updatedPath = path;
        if (path.contains("\\")){
            updatedPath = path.replaceAll("\\\\", "/");
        }

        File folder = new File(updatedPath + "Password_Manager");
        if (!folder.exists()){
            boolean createFile = folder.mkdir();
            if (createFile){
                file = folder;
            } else {
                throw new FileException("Error in creating folder");
            }
        } else {
            file = folder;
        }
    }

    /**
     * Each website will have its own textfile that will store information
     * line 1 will have website name
     * line 2 website url
     * line 3 username
     * line 4 encoded password
     * line 5 security question
     * line 6 encoded answer for question
     * @param website Website object, filehandler will use data from this
     * @throws FileException throws this incase file does not exist, or text doc already exists
     * @throws IOException
     */
    public void addWebsite(Website website) throws Exception {
        if (file == null) {
            throw new FileException("File doesn't exist");
        } else {
            File data = new File(file.getPath() + "/" + website.getWebsiteName() + ".txt");
            if (data.exists()){
                throw new FileException("Text doc already exists!");

            } else {
                AES aes = new AES(System.getProperty("user.name")); // key is user's name
                File textDoc = new File (file.getPath() + "/" + website.getWebsiteName() + ".txt");
                textDoc.createNewFile();
                FileWriter fileWriter = new FileWriter(textDoc);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                String encryptedPW = aes.encrypt(website.getPassword());
                String encryptedAns = aes.encrypt(website.getSecurityAnswer());

                bufferedWriter.write(website.getWebsiteName() + System.lineSeparator() +
                        website.getUrl() + System.lineSeparator() +
                        website.getUsername() + System.lineSeparator() +
                        encryptedPW + System.lineSeparator() +
                        website.getSecurityQuestion() + System.lineSeparator() +
                        encryptedAns
                );

                bufferedWriter.close();
            }
        }
    }

    public String [] readWebsite(String website) throws Exception {
        if (file == null){
            throw new FileException("Folder doesn't exist");
        } else {
            File data = new File(file.getPath() + "/" + website + ".txt");
            if (data.exists()){
                AES aes = new AES(System.getProperty("user.name")); // key is user's name
                FileReader fileReader = new FileReader(data.getPath());
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String [] total = new String[6];
                total[0] = bufferedReader.readLine() + System.lineSeparator();

                for (int i = 1; i < 6; i++){
                    String line = bufferedReader.readLine();
                    if (i == 3 || i == 5){

                        line = aes.decrypt(line);
                    }
                    total[i] = line;
                }

                bufferedReader.close();
                return total;
            } else {
                throw new FileException("Text doc doesn't exist");
            }
        }
    }

    public boolean checkWebsite(String website) throws FileException {
        if (file == null){
            throw new FileException("Folder doesn't exist");
        } else {
            File data = new File(file.getPath() + "/" + website + ".txt");
            if (data.exists()){
                return true;
            } else {
                return false;
            }
        }
    }

    public void deleteWebsite(String website) throws FileException {
        if (file == null) {
            throw new FileException("Folder doesn't exist");
        } else {
            File data = new File(file.getPath() + "/" + website + ".txt");
            if (data.exists()){
                if (!data.delete()){
                    throw new FileException("Error in deletion");
                }
            } else {
                throw new FileException("Text doc doesn't exist");
            }
        }
    }

    public String getQuestion(String website) throws FileException, IOException {
        if (file == null){
            throw new FileException("Folder doesn't exist");
        } else {
            File data = new File(file.getPath() + "/" + website + ".txt");
            if (data.exists()){
                FileReader fileReader = new FileReader(data.getPath());
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String question = "";
                for (int i = 0; i < 4; i++){
                    bufferedReader.readLine();
                }
                question = bufferedReader.readLine();

                bufferedReader.close();
                return question;
            } else {
                throw new FileException("Text doc doesn't exist");
            }
        }
    }

    public String getAnswer(String website) throws Exception {
        if (file == null){
            throw new FileException("Folder doesn't exist");
        } else {
            File data = new File(file.getPath() + "/" + website + ".txt");
            if (data.exists()){
                AES aes = new AES(System.getProperty("user.name")); // key is user's name
                FileReader fileReader = new FileReader(data.getPath());
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                for (int i = 0; i < 5; i++){
                    bufferedReader.readLine();
                }

                String answer = aes.decrypt(bufferedReader.readLine()).toLowerCase();

                bufferedReader.close();
                return answer;

            } else {
                throw new FileException("Text doc doesn't exist");
            }
        }
    }

    public void editData(Website website) throws Exception {
      if (file == null){
        throw new FileException("Folder doesn't exist");
      } else {
        deleteWebsite(website.getWebsiteName());
        addWebsite(website);
      }
    }
}
