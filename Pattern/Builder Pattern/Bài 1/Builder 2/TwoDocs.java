import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TwoDocs implements DocumentBuilder {

    private String extension ; 
    private Boolean encryption ; 

    @Override
    public Document buildDoc() {
        Document doc = new Document(extension, encryption);
        try {
            String content = "This is a document."; // Nội dung mẫu
            String fileName = "File" ; 

            if (encryption) {
                SecretKey key = generateKey(); // Tạo khóa AES
                saveConfidentialFile(content, fileName , key); // Lưu file zip
            } else {
                saveNormalFile(content, fileName ); // Lưu file bình thường
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }
    

    private SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }


    @Override
    public DocumentBuilder setEncryption(boolean encryption) {
        this.encryption = encryption ; 
        return this ; 
    }

    @Override
    public DocumentBuilder setExtension(String extension) {
        this.extension = extension ; 
        return this; 
    }

    private static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static void saveNormalFile(String content, String fileName) {
        try {
            File file = new File(fileName + ".txt");
            PrintWriter writer = new PrintWriter(file);
            writer.println(content);

            writer.close();
            
            System.out.println("Normal file saved: " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveConfidentialFile(String content, String fileName, SecretKey key) {
        try {
            String encryptedContent = encrypt(content, key); // Mã hóa nội dung
            File zipFile = new File(fileName + ".zip");

            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);

            ZipEntry entry = new ZipEntry(fileName + ".txt"); // Tạo file .txt bên trong zip
            zos.putNextEntry(entry);
            zos.write(encryptedContent.getBytes()); // Ghi nội dung mã hóa vào file
            zos.closeEntry();

            zos.close();
            System.out.println("confidental file saved:  " + zipFile.getAbsolutePath());
        } catch (Exception e) {
        }
    }



}
