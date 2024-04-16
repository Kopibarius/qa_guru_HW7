import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] arg) {

        ArrayListRealization arrayListRealization = new ArrayListRealization();
        ArrayList<String> list = new ArrayList<>();

        arrayListRealization.addOnFirstPosition(list, "Egor");
        arrayListRealization.addOnFirstPosition(list, "Sony");
        arrayListRealization.addOnFirstPosition(list, "Bin");
        arrayListRealization.addOnFirstPosition(list, "eeeee");
        System.out.println(list);
        arrayListRealization.removeByIndex(list, arrayListRealization.findByName(list,"Bin"));
        System.out.println(list);
    }
}
