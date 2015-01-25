import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

public class Scanning{
    Item [] item = null;
    public Scanning() {
        item = null;
    }
    
    public void loadInformation() {
        try {
            File f0 = new File("list.txt");
            Scanner scan0 = new Scanner(f0);
            int c = 0;
            while (scan0.hasNextLine()) {
                c++;
                String temp = scan0.nextLine();
            }
            
            item = new Item[c];
            
            File f = new File("list.txt");
            Scanner scan = new Scanner(f);
            for (int i = 0; i < c; i++) {
                String temp = scan.nextLine();
                StringTokenizer tok = new StringTokenizer(temp,",");
                String barcode = tok.nextToken();
                String name = tok.nextToken();
                double price = Double.parseDouble(tok.nextToken());
                item[i] = new Item(barcode, name, price);
            }
        } catch (IOException ioe) {
            System.out.println("Error reading file");
        }
    }
    
    public String scan(String barcode) {
        
        //the return type need to be changed to be Item.
        return "something";
    }
    
    public String toString() {
        String res = "";
        for (int i = 0; i < item.length; i++) {
            res = res + item[i]+"\n";
        }
        return res;
    }
}