public class Jtest {
    public static void main(String [] args) {
        Scanning sc = new Scanning();
        sc.loadInformation();
        Item item = sc.scan("123");
        System.out.println(item.toString());
        //System.out.println(sc.toString());
    }
}