package hellocucumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class Test {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);

        BiConsumer<List<Integer>, List<Integer>> equals = (_a,_b) -> _a.forEach(integerA -> _b.forEach(integerB -> {
            if(Objects.equals(integerA, integerB)){
               System.out.println("===========");
            }
        }));

        equals.accept(a,b);
    }
}
