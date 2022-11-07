import com.saxion.Backtrack;
import org.junit.jupiter.api.Test;

public class BacktrackingTest {
    @Test
    public void Grid() {
        int x = 0, y = 0, f = 2, n = 2;
        int result = Backtrack.Grid(x, y, f, n);
        assert result == 6;
    }
}
