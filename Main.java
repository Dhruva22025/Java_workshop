
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CustomerApplication
        CustomerApplication app = new CustomerApplication();

        // Create a list of customers
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(3, "Alice", "Smith", 5000.0));
        customers.add(new Customer(1, "John", "Doe", 3000.0));
        customers.add(new Customer(2, "Alice", "Brown", 7000.0));
        customers.add(new Customer(4, "John", "Brown", 2000.0));
        customers.add(new Customer(5, "Alice", "Brown", 1000.0));

        // Display unsorted customers
        System.out.println("Unsorted Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // Sort customers using CustomerApplication logic
        System.out.println("\nSorting customers...");
        customers.sort(CustomerApplication.getCustomerComparator());

        // Display sorted customers
        System.out.println("\nSorted Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
