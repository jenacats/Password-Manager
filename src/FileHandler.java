import java.io.*;
import java.util.Base64;

/**
 * The purpose of this class is to create/read files
 * this includes textfiles, where information will be stored, and folders where the text files are located
 */

public class FileHandler {
    private File file;

    public FileHandler(){
        file = null;
    }

    public FileHandler(String path) throws FileException{
        File file = new File(path);

        if (!file.exists()){
            throw new FileException("File doesn't exist!");
        }
    }

    public void createDirectory(String path) throws FileException {
        File folder = new File(path + "Password_Manager");
        boolean createFile = folder.mkdir();
        if (createFile){
            file = folder;
        } else {
            throw new FileException("Error in creating folder");
        }
    }

    public void addWebsite(Website website) throws FileException, IOException {
        if (file == null){
            throw new FileException("File doesn't exist");
        } else {
            File textDoc = new File (file.getPath() + website.getWebsiteName() + ".txt");
            textDoc.createNewFile();
            FileWriter fileWriter = new FileWriter(textDoc);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Base64.Decoder decoder = Base64.getDecoder();
            Base64.Encoder encoder = Base64.getEncoder();

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
}
