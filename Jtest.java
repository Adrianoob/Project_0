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
<<<<<<< HEAD
  		System.out.println(c.print());
=======
>>>>>>> 22344100ba65da54deb13004f2b880be73546de6
    }
}