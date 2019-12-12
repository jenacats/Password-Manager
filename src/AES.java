import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {

    private SecretKeySpec key;
    private byte[] keyByte;
    private static final Base64.Decoder decoder = Base64.getDecoder();
    private static final Base64.Encoder encoder = Base64.getEncoder();

    public AES(String key) throws Exception {
        keyByte = key.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        keyByte = sha.digest(keyByte);
        keyByte = Arrays.copyOf(keyByte, 16);
        this.key = new SecretKeySpec(keyByte, "AES");
    }

    public String encrypt(String data) throws Exception {

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        String encrypted = encoder.encodeToString(cipher.doFinal(data.getBytes("UTF-8")));

        return encrypted;
    }

    public String decrypt(String data) throws Exception{

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);
        String decrypted = new String(cipher.doFinal(decoder.decode(data)));

        return decrypted;
    }
}