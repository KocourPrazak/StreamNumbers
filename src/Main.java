import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mapInt = new TreeSet<>();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int intVal: intList) {
            if(intVal < 0) continue;
            if(intVal % 2 != 0) continue;
            mapInt.add(intVal);
        }
        for (int i:
             mapInt) {
            System.out.println(i); //0 is positive and even number
        }
    }
}
