import com.saxion.backtracking.HamiltonianCycle;
import com.saxion.backtracking.SubsetSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BacktrackingTest {
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

    @Test
    public void GetHamiltonianCycle() {
        HamiltonianCycle cycle = new HamiltonianCycle();
        int[][] graph = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
        };
        int[] path = cycle.GetHamiltonianCycle(graph);
        assert path.length == 5;
        assert Arrays.equals(path, new int[]{0, 1, 2, 4, 3});
    }
}
