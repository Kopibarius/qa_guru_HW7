import java.util.ArrayList;

public class ArrayListRealization {

    protected String result;

    public void addOnFirstPosition(ArrayList<String> array, String name) {
        array.add(0,name);
    }

    public String removeByIndex(ArrayList<String> array, int index) {
        result = array.get(index);
        array.remove(index);
        return result;
    }

    public Integer findByName(ArrayList<String> array, String name) {
        int i;
        for (i = 0; i < array.size(); i++) {
            if (array.get(i).equals(name)){
                break;
            }
        }
        return i;
    }

}
