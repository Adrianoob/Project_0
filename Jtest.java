public class Jtest {
    public static void main(String [] args) {
        Cashier c = new Cashier();
  		c.addItem("123");
  		c.addItem("234");
  		c.addItem("123");
  		c.deleteItem("123");
  		c.addItem("345");
  		c.addItem("456");
  		c.sum();
  		c.tax();
  		System.out.println(c.print());
    }
}