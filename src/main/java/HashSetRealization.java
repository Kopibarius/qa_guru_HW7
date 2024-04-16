import java.util.HashSet;
import java.util.Iterator;

public class HashSetRealization {

    public void addElementByName(HashSet<String> set, String name) {
        set.add(name);
    }

    public void removeElementByName(HashSet<String> set, String name) {
        set.add(name);
    }

    public void searchByName(HashSet<String> set, String name) {
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
