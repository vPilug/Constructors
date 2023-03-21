public class Main {
    public static void main(String[] args) {
     Customer MaryCustomer = new Customer();

        System.out.println(MaryCustomer.getName());
        System.out.println(MaryCustomer.getEmail());
        System.out.println(MaryCustomer.getCreditLimit());

        Customer JohnCustomer = new Customer("John", 1000.00, "john@gmail.com");
        System.out.println(JohnCustomer.getName());
        System.out.println(JohnCustomer.getCreditLimit());
        System.out.println(JohnCustomer.getEmail());

    }
}