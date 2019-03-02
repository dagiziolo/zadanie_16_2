import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Import {
    public ArrayList<Product> getImport(File file) {
        ArrayList<Product> lists = new ArrayList<>();
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] s = line.split(";");
            lists.add(new Product(s[0], new BigDecimal(s[1]), new BigDecimal(s[2])));
        }
        return lists;
    }
}