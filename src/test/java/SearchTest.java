import com.saxion.Customer;
import com.saxion.Package;
import com.saxion.Reader;
import com.saxion.Search;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class SearchTest {
    private ArrayList<Customer> customers;
    private ArrayList<Package> packages;
    private HashMap<Integer, Customer> customersMap;
    private HashMap<Integer, Package> packagesMap;

    @BeforeEach
    public void Setup() {
        customers = Reader.ReadCustomers();
        packages = Reader.ReadPackages();

        customersMap = new HashMap<>();
        for (Customer customer : customers)
            customersMap.put(customer.clientId(), customer);

        packagesMap = new HashMap<>();
        for (Package pack : packages)
            packagesMap.put(pack.packageId(), pack);
    }

    @Test
    public void LinearSearchCustomers() {
        Customer customer = customers.get(0);
        Customer result = Search.Linear(customers, customer);
        assert Objects.equals(result, customer);
    }

    @Test
    public void LinearSearchPackages() {
        Package pack = packages.get(0);
        Package result = Search.Linear(packages, pack);
        assert Objects.equals(result, pack);
    }

    @Test
    public void BinarySearchCustomers() {
        Customer customer = customers.get(0);
        Customer result = Search.Binary(customers, customer);
        assert Objects.equals(result, customer);
    }

    @Test
    public void BinarySearchPackages() {
        Package pack = packages.get(0);
        Package result = Search.Binary(packages, pack);
        assert Objects.equals(result, pack);
    }

    @Test
    public void LinearSearchCustomersMap() {
        Customer customer = customersMap.get(0);
        Customer result = Search.Linear(customersMap, customer);
        assert Objects.equals(result, customer);
    }

    @Test
    public void LinearSearchPackagesMap() {
        Package pack = packagesMap.get(0);
        Package result = Search.Linear(packagesMap, pack);
        assert Objects.equals(result, pack);
    }

    @Test
    public void BinarySearchCustomersMap() {
        Customer customer = customersMap.values().iterator().next();
        Customer result = Search.Binary(customersMap, customer);
        assert Objects.equals(result, customer);
    }

    @Test
    public void BinarySearchPackagesMap() {
        Package pack = packagesMap.values().iterator().next();
        Package result = Search.Binary(packagesMap, pack);
        assert Objects.equals(result, pack);
    }
}
