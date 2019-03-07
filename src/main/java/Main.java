import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\balas\\Desktop\\readfille\\src\\main\\java\\read.txt");
        File file1 = new File("C:\\Users\\balas\\Desktop\\readfille\\src\\main\\java\\write.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            fw = new FileWriter(file1);
            int change;
            while ((change = fr.read()) != -1) {
                fw.write(change);
            }
        } finally {

            fr.close();
            fw.close();
        }
    }
}