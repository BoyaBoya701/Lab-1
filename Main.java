import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int count = 100_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {arrayList.add(i);}

        System.out.println( System.currentTimeMillis() - time);

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {linkedList.add(i);}

        System.out.println( System.currentTimeMillis() - time1);

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {arrayList.get(i);

        }
        System.out.println(System.currentTimeMillis() - time3);

    }
}