import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class demoSort {

    public static void main(String[] args)
    {
        //List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);

        List<String> list = Arrays.asList("cat", "bat", "ant", "hat");
        list.sort(Comparator.reverseOrder());

        System.out.println(list);
    }
}

