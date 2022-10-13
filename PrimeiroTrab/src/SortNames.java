import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("william");
        names.add("pedro");
        names.add("joao");
        names.add("ana");
        Collections.sort(names);
        names.forEach(System.out::println);


    }


}
