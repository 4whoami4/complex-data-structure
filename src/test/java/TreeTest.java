import com.saxion.avl.Tree;
import com.saxion.records.Package;
import com.saxion.utils.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TreeTest {

    private Tree<Package> tree;
    private ArrayList<Package> packages;

    @BeforeEach
    public void Setup() {
        packages = Reader.ReadPackages();
        tree = new Tree<>();

        for(int i = 0; i < 10; i++) {
            var pack = packages.get(i);
            tree.root = tree.Insert(tree.root, pack.id(), pack.height(), pack);
        }
    }

    @Test
    public void PreOrder() {
        String result = tree.PreOrder(tree.root).toString();
        assert result.equals("[107582, 107574, 107571, 107566, 107561, 107555, 107548, 107539, 107533, 107583]");
    }

    @Test
    public void Search() {
        var result = tree.Search(tree.root, 107582);
        assert result.height == 76;
    }
}
