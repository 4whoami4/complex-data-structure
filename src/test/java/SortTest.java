import com.saxion.Customer;
import com.saxion.Package;
import com.saxion.Sort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SortTest {
    private ArrayList<Customer> customers;
    private ArrayList<Package> packages;

    @BeforeEach
    public void Setup() {
        customers = new ArrayList<>(List.of(
                new Customer(8, "John", "Doe", 0, 0),
                new Customer(2, "Jane", "Doe", 0, 0),
                new Customer(5, "Jane", "Doe", 0, 0),
                new Customer(1, "Jane", "Doe", 0, 0)
        ));

        packages = new ArrayList<>(List.of(
                new Package(12, 0, 0, 0, 0, "1970-01-01", 0),
                new Package(3, 0, 0, 0, 0, "1970-01-01", 0),
                new Package(7, 0, 0, 0, 0, "1970-01-01", 0),
                new Package(1, 0, 0, 0, 0, "1970-01-01", 0)
        ));
    }

    @Test
    public void BubbleSortCustomers() {
        Sort.Bubble(customers);
        assert customers.get(0).clientId() == 1;
        assert customers.get(1).clientId() == 2;
        assert customers.get(2).clientId() == 5;
        assert customers.get(3).clientId() == 8;
    }

    @Test
    public void BubbleSortPackages() {
        Sort.Bubble(packages);
        assert packages.get(0).packageId() == 1;
        assert packages.get(1).packageId() == 3;
        assert packages.get(2).packageId() == 7;
        assert packages.get(3).packageId() == 12;
    }

    @Test
    public void SelectionSortCustomers() {
        Sort.Selection(customers);
        assert customers.get(0).clientId() == 1;
        assert customers.get(1).clientId() == 2;
        assert customers.get(2).clientId() == 5;
        assert customers.get(3).clientId() == 8;
    }

    @Test
    public void SelectionSortPackages() {
        Sort.Selection(packages);
        assert packages.get(0).packageId() == 1;
        assert packages.get(1).packageId() == 3;
        assert packages.get(2).packageId() == 7;
        assert packages.get(3).packageId() == 12;
    }

    @Test
    public void InsertionSortCustomers() {
        Sort.Insertion(customers);
        assert customers.get(0).clientId() == 1;
        assert customers.get(1).clientId() == 2;
        assert customers.get(2).clientId() == 5;
        assert customers.get(3).clientId() == 8;
    }

    @Test
    public void InsertionSortPackages() {
        Sort.Insertion(packages);
        assert packages.get(0).packageId() == 1;
        assert packages.get(1).packageId() == 3;
        assert packages.get(2).packageId() == 7;
        assert packages.get(3).packageId() == 12;
    }

    @Test
    public void MergeSortCustomers() {
        Sort.Merge(customers);
        assert customers.get(0).clientId() == 1;
        assert customers.get(1).clientId() == 2;
        assert customers.get(2).clientId() == 5;
        assert customers.get(3).clientId() == 8;
    }

    @Test
    public void MergeSortPackages() {
        Sort.Merge(packages);
        assert packages.get(0).packageId() == 1;
        assert packages.get(1).packageId() == 3;
        assert packages.get(2).packageId() == 7;
        assert packages.get(3).packageId() == 12;
    }

    @Test
    public void QuickSortCustomers() {
        Sort.Quick(customers);
        assert customers.get(0).clientId() == 1;
        assert customers.get(1).clientId() == 2;
        assert customers.get(2).clientId() == 5;
        assert customers.get(3).clientId() == 8;
    }

    @Test
    public void QuickSortPackages() {
        Sort.Quick(packages);
        assert packages.get(0).packageId() == 1;
        assert packages.get(1).packageId() == 3;
        assert packages.get(2).packageId() == 7;
        assert packages.get(3).packageId() == 12;
    }
}
