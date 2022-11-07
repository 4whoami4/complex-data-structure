import com.saxion.utils.CustomersMap;
import org.junit.jupiter.api.Test;

public class CustomerMapTest {
    @Test
    public void testAddCustomer() {
        CustomersMap customersMap = new CustomersMap();
        customersMap.addCustomer("John", 1);
        customersMap.addCustomer("Jane", 2);
        customersMap.addCustomer("Jack", 3);

        assert customersMap.size() == 3;
    }

    @Test
    public void testGetCustomerId() {
        CustomersMap customersMap = new CustomersMap();
        customersMap.addCustomer("John", 1);
        customersMap.addCustomer("Jane", 2);
        customersMap.addCustomer("Jack", 3);

        assert customersMap.getCustomerId("John") == 1;
        assert customersMap.getCustomerId("Jane") == 2;
        assert customersMap.getCustomerId("Jack") == 3;
    }

    @Test
    public void testContainsCustomer() {
        CustomersMap customersMap = new CustomersMap();
        customersMap.addCustomer("John", 1);
        customersMap.addCustomer("Jane", 2);
        customersMap.addCustomer("Jack", 3);

        assert customersMap.containsCustomer("John");
        assert customersMap.containsCustomer("Jane");
        assert customersMap.containsCustomer("Jack");
    }

    @Test
    public void testSize() {
        CustomersMap customersMap = new CustomersMap();
        customersMap.addCustomer("John", 1);
        customersMap.addCustomer("Jane", 2);
        customersMap.addCustomer("Jack", 3);

        assert customersMap.size() == 3;
    }

    @Test
    public void testAddCustomerTwice() {
        CustomersMap customersMap = new CustomersMap();
        customersMap.addCustomer("John", 1);
        customersMap.addCustomer("John", 2);

        assert customersMap.size() == 1;
        assert customersMap.getCustomerId("John") == 2;
    }
}
