import java.util.TreeSet;

public class TreeSort {

    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<Object>();
        treeSet.add("nat");
        treeSet.add("mat");
        treeSet.add("hat");
        treeSet.add("lat");
        treeSet.add("bat");
        treeSet.add("ant");
//        treeSet.add(10);
//        treeSet.add(60);
//        treeSet.add(80);
        System.out.println("TreeSet\n" + treeSet);
        TreeSet<Object> res = (TreeSet<Object>)treeSet.descendingSet();
        System.out.println("TreeSet after sorting in descending order\n" + res);
    }
}
