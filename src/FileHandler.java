import java.io.*;
import java.util.Base64;

/**
 * The purpose of this class is to create/read files
 * this includes textfiles, where information will be stored, and folders where the text files are located
 */

public class FileHandler {
    private File file;
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final Base64.Encoder encoder = Base64.getEncoder();

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
        File file = new File(path);

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
        File folder = new File(path + "Password_Manager");
        boolean createFile = folder.mkdir();
        if (createFile){
            file = folder;
        } else {
            throw new FileException("Error in creating folder");
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
     * @throws FileException throws this incase file does not exist
     * @throws IOException
     */
    public void addWebsite(Website website) throws FileException, IOException {
        if (file == null){
            throw new FileException("File doesn't exist");
        } else {
            File textDoc = new File (file.getPath() + website.getWebsiteName() + ".txt");
            textDoc.createNewFile();
            FileWriter fileWriter = new FileWriter(textDoc);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String encodedPW = encoder.encodeToString(website.getPassword().getBytes());
            String encodedAns = encoder.encodeToString(website.getSecurityAnswer().getBytes());

            bufferedWriter.write(website.getWebsiteName() + "\n" +
                    website.getUrl() + "\n" +
                    website.getUsername() + "\n" +
                    encodedPW + "\n" +
                    website.getSecurityQuestion() + "\n" +
                    encodedAns
            );

            bufferedWriter.close();
        }
    }

    public void readWebsite(Website website) throws FileException{
        if (file == null){
            throw new FileException("Folder doesn't exist");
        } else {
            File data = new File(file.getPath() + website.getWebsiteName());
            if (data.exists()){

            } else {
                throw new FileException("Text doc doesn't exist");
            }
        }
    }
}
