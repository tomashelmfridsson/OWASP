import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHasher {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "tomas123";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }

        System.out.println("Hashat lösenord: " + hexString.toString());
    }
}