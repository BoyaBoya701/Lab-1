import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.lang.Math;
public class Version_2 {
    public static void main(String[] args) {
        int count = 100_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // ArrayList.add
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {arrayList.add(i);}
        {System.out.printf("ArrayList.add :%d|", System.currentTimeMillis() - time);}

        // LinkedList.add
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {linkedList.add(i);}
        {System.out.printf("LinkedList.add :%d|", System.currentTimeMillis() - time1);}

        // ArrayList for(Integer item: arraylist)
        long time3 = System.currentTimeMillis();
        for (Integer item: arrayList);
        {System.out.printf("ArrayList Sequential access :%d|", System.currentTimeMillis() - time3);}

        // LinkedList for(Integer item: linkedlist)
        long time4 = System.currentTimeMillis();
        for (Integer item: linkedList);
        {System.out.printf("linkedList Sequential access :%d|", System.currentTimeMillis() - time4);}

        // ArrayList random access
        long time5 = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {arrayList.get((int) (Math.random() * count));}
        System.out.printf("ArrayList random access :%d|", System.currentTimeMillis() - time5);

        // LinkedList random access
        long time6 = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {linkedList.get((int) (Math.random() * count));}
        System.out.printf("linkedList random access :%d|", System.currentTimeMillis() - time6);

        // ArrayList add First
        long time7 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arrayList.add(0,(int) (Math.random() * count));
        System.out.printf("ArrayList add First :%d|", System.currentTimeMillis() - time7);

        // LinkedList add.First
        long time8 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linkedList.add(0,(int) (Math.random() * count));
        System.out.printf("LinkedList add First :%d|", System.currentTimeMillis() - time8);

        // ArrayList add in the end
        long time9 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arrayList.add(count-1,(int) (Math.random() * count));
        System.out.printf("ArrayList add in the end :%d|", System.currentTimeMillis() - time9);

        // LinkedList add in the end
        long time10 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linkedList.add(count-1,(int) (Math.random() * count));
        System.out.printf("LinkedList add in the end :%d|", System.currentTimeMillis() - time10);

        // ArrayList add in middle
        long time11 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arrayList.add((int) (Math.random() * (count-3) + 1),(int) (Math.random() * count));
        System.out.printf("ArrayList add in middle :%d|", System.currentTimeMillis() - time11);

        // LinkedList add in middle
        long time12 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linkedList.add((int) (Math.random() * (count-3) + 1),(int) (Math.random() * count));
        System.out.printf("LinkedList add in middle :%d|", System.currentTimeMillis() - time12);
    }



}