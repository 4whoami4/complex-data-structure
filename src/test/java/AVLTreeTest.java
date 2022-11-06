import com.saxion.avl.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AVLTreeTest {

    private Tree<Integer> tree;

    @BeforeEach
    public void Setup() {
        tree = new Tree<>();

        tree.root = tree.Insert(tree.root, 10, 6);
        tree.root = tree.Insert(tree.root, 20, 5);
        tree.root = tree.Insert(tree.root, 30, 4);
        tree.root = tree.Insert(tree.root, 40, 3);
        tree.root = tree.Insert(tree.root, 50, 2);
        tree.root = tree.Insert(tree.root, 25, 1);
    }

    @Test
    public void PreOrder() {
        String result = tree.PreOrder(tree.root).toString();
        assert result.equals("[30, 20, 10, 25, 40, 50]");
    }

    @Test
    public void Search() {
        var result = tree.Search(tree.root, 40);
        assert result.value == 3;
    }
}
