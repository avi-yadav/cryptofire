package cryptofire;

 
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 
public class AES 
{
    static String IV = "AAAAAAAAAAAAAAAA";
    //static String plaintext = "test text 123\0\0\0"; /*Note null padding*/
    //static byte[] encryptionKey = "HELLOAVI";
  /*public static void main(String [] args) {
    try {
      
      String plaintext;
      String encryptionKey_old,encryptionKey1,encryptionKey;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the plain text:");
      plaintext = input.next();
      System.out.println("Enter the secretkey:");
      encryptionKey_old = input.next();
      encryptionKey1 = encryptionKey_old + "1111111111111111"; 
      encryptionKey = encryptionKey1.substring(0, 16);
      System.out.println("encryption key : " + encryptionKey);
      System.out.println("==Java==");
      System.out.println("plain:   " + plaintext);
      
      byte[] cipher = encrypt(plaintext, encryptionKey);
 
      System.out.print("cipher:  ");
      for (int i=0; i<cipher.length; i++)
        System.out.print(new Integer(cipher[i])+" ");
      System.out.println("");
 
      String decrypted = decrypt(cipher, encryptionKey);
 
      System.out.println("decrypt: " + decrypted);
 
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }*/

    /**
     *
     * @param plainText
     * @param encryptionKey
     * @return
     * @throws java.lang.Exception
     */
    public static byte[] encrypt(byte[] plainText, byte[] encryptionKey) throws Exception
    {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        
        return cipher.doFinal(plainText);
    }
 
    public static byte[] decrypt(byte[] cipherText, byte[] encryptionKey) throws Exception
    {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(encryptionKey, "AES");
        cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        return (cipher.doFinal(cipherText));
    }
}