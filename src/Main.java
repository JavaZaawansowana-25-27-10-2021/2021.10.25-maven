import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String hash = DigestUtils.md5Hex("jan");
        System.out.println(hash);
    }
}
