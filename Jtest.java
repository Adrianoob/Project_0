public class Jtest {
    public static void main(String [] args) {
        Cashier c = new Cashier();
  		c.addItem("123");
  		c.addItem("234");
  		c.sum();
  		c.tax();
    }
}