import com.saxion.records.Customer;
import com.saxion.records.Package;
import com.saxion.utils.Reader;
import com.saxion.utils.Sort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SortTest {
    private ArrayList<Customer> customers;
    private ArrayList<Package> packages;

    @BeforeEach
    public void Setup() {
        customers = Reader.ReadCustomers();
        packages = Reader.ReadPackages();
    }

    @Test
    public void BubbleSortCustomers() {
        Sort.Bubble(customers);
        for (int i = 0; i < customers.size() - 1; i++)
            assert customers.get(i).clientId() <= customers.get(i + 1).clientId();
    }

    @Test
    public void BubbleSortPackages() {
        Sort.Bubble(packages);
        for (int i = 0; i < packages.size() - 1; i++)
            assert packages.get(i).packageId() <= packages.get(i + 1).packageId();
    }

    @Test
    public void SelectionSortCustomers() {
        Sort.Selection(customers);
        for (int i = 0; i < customers.size() - 1; i++)
            assert customers.get(i).clientId() <= customers.get(i + 1).clientId();
    }

    @Test
    public void SelectionSortPackages() {
        Sort.Selection(packages);
        for (int i = 0; i < packages.size() - 1; i++)
            assert packages.get(i).packageId() <= packages.get(i + 1).packageId();
    }

    @Test
    public void InsertionSortCustomers() {
        Sort.Insertion(customers);
        for (int i = 0; i < customers.size() - 1; i++)
            assert customers.get(i).clientId() <= customers.get(i + 1).clientId();
    }

    @Test
    public void InsertionSortPackages() {
        Sort.Insertion(packages);
        for (int i = 0; i < packages.size() - 1; i++)
            assert packages.get(i).packageId() <= packages.get(i + 1).packageId();
    }

    @Test
    public void MergeSortCustomers() {
        Sort.Merge(customers);
        for (int i = 0; i < customers.size() - 1; i++)
            assert customers.get(i).clientId() <= customers.get(i + 1).clientId();
    }

    @Test
    public void MergeSortPackages() {
        Sort.Merge(packages);
        for (int i = 0; i < packages.size() - 1; i++)
            assert packages.get(i).packageId() <= packages.get(i + 1).packageId();
    }

    @Test
    public void QuickSortCustomers() {
        Sort.Quick(customers);
        for (int i = 0; i < customers.size() - 1; i++)
            assert customers.get(i).clientId() <= customers.get(i + 1).clientId();
    }

    @Test
    public void QuickSortPackages() {
        Sort.Quick(packages);
        for (int i = 0; i < packages.size() - 1; i++)
            assert packages.get(i).packageId() <= packages.get(i + 1).packageId();
    }
}
