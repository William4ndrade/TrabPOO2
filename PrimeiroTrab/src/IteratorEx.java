import java.util.*;
import java.util.stream.StreamSupport;

public class IteratorEx {


    private static boolean Contains(Iterable<?> it, Object obj){
        Iterator<?> iterator = it.iterator();
        while(iterator.hasNext()){
            Object current = iterator.next();
            if(current.equals(obj)) return true;
        }
        return false;
    }

    private static void Interseção(Iterable<?> a, Iterable<?> b){
        Iterator<?> f = a.iterator();
        while(f.hasNext()){
            Object current = f.next();
            if(Contains(b, current)) System.out.println(current);
        }



    }

    private static void Interseção2(Iterable<?> a, Iterable<?> b){
        Iterator<?> f = a.iterator();
        Iterator<?> g = b.iterator();
        HashSet<Object> finalset = new HashSet<>();
        while(f.hasNext()){
            finalset.add(f.next());
        }
        while (g.hasNext()){
            Object ol = g.next();
            if(finalset.add(ol) == false){
                System.out.println(ol );
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4);
        Interseção2(a, Arrays.asList(1,2,4));
    }

}
