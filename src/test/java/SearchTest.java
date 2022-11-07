import com.saxion.records.Customer;
import com.saxion.records.Package;
import com.saxion.utils.Reader;
import com.saxion.utils.Search;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

public class SearchTest {
    private ArrayList<Customer> customers;
    private ArrayList<Package> packages;

    @BeforeEach
    public void Setup() {
        customers = Reader.ReadCustomers();
        packages = Reader.ReadPackages();
    }

    @Test
    public void LinearSearchCustomers() {
        Customer customer = customers.get(0);
        Customer result = Search.Linear(customers, customer.id());
        assert Objects.equals(result, customer);
    }

    @Test
    public void LinearSearchPackages() {
        Package pack = packages.get(0);
        Package result = Search.Linear(packages, pack.id());
        assert Objects.equals(result, pack);
    }

    @Test
    public void BinarySearchCustomers() {
        Customer customer = customers.get(0);
        Customer result = Search.Binary(customers, customer.id());
        assert Objects.equals(result, customer);
    }

    @Test
    public void BinarySearchPackages() {
        Package pack = packages.get(0);
        Package result = Search.Binary(packages, pack.id());
        assert Objects.equals(result, pack);
    }
}
