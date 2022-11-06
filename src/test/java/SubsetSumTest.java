import com.saxion.backtracking.SubsetSum;
import org.junit.jupiter.api.Test;

public class SubsetSumTest {
    @Test
    public void GenerateSubsets() {
        int[] weights = {15, 22, 14, 26, 32, 9, 16, 8};
        int target = 53;

        SubsetSum subsetSum = new SubsetSum();
        subsetSum.GenerateSubsets(weights, weights.length, target);

        assert subsetSum.subsets.size() == 3;
        assert subsetSum.subsets.get(0)[0] == 8;
        assert subsetSum.subsets.get(1)[0] == 8;
        assert subsetSum.subsets.get(2)[0] == 15;
    }
}
