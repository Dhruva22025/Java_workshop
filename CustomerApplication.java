import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerApplication {
    public static void main(String[] args) {
        // Create a list of customers
        List<Customer> customers = new ArrayList<>();

        // Add customers to the list
        customers.add(new Customer(3, "Alice", "Smith", 5000.0));
        customers.add(new Customer(1, "John", "Doe", 3000.0));
        customers.add(new Customer(2, "Alice", "Brown", 7000.0));
        customers.add(new Customer(4, "John", "Brown", 2000.0));

        // Sort customers based on the specified criteria
        customers.sort(Comparator.comparing(Customer::getFirstName)
                .thenComparing(Customer::getLastName)
                .thenComparing(Customer::getId)
                .thenComparing(Customer::getBalance));

        // Display the sorted list
        System.out.println("Sorted Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private double balance;

    // Default constructor
    public Customer() {}

    // Parameterized constructor
    public Customer(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // Getters and Setters (JavaBeans principles)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Override toString for better output formatting
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
