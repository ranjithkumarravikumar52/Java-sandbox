package collections.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);
//        basicCollectionOperations(theatre);

        traversingMethodsInCollection(theatre);

    }

    private static void traversingMethodsInCollection(Theatre theatre) {
        Collection<Seat> copy1 = new ArrayList<>(theatre.getSeats());
        List<Seat> copyList = new ArrayList<>(theatre.getSeats());
        Seat A1 = copyList.get(0);

        //stream
        System.out.println("Steam...");
        copy1.stream().forEach(seat -> System.out.print(seat.getSeatNumber()+" "));
        System.out.println();

        //parallelStream
        System.out.println("Parallel Stream...");
        copy1.parallelStream().forEach(seat -> System.out.print(seat.getSeatNumber()+" "));
        System.out.println();
    }

    private static void basicCollectionOperations(Theatre theatre) {
//        Collection<Seat> copy = theatre.getSeats();
//        /*
//        The Collection interface contains methods that perform basic operations,
//        such as int size(),
//         boolean isEmpty(),
//         boolean contains(Object element),
//         boolean add(E element),
//         boolean remove(Object element),
//          and Iterator<E> iterator().
//         */
//
//        System.out.println("Size: " + copy.size());
//        System.out.println("Is empty: " + copy.isEmpty());
//
//        Seat T1 = new Seat("T1");
//        System.out.println("Adding T1 seat: " + copy.add(T1));
//        System.out.println("Does theatre contain T1: " + copy.contains(T1));
//        System.out.println("Removing T1 seat: " + copy.remove(T1));
//
//        System.out.println("Displaying seats using iterator...");
//        Iterator<Seat> seatIterator = copy.iterator();
//        while (seatIterator.hasNext()) {
//            System.out.print(seatIterator.next().getSeatNumber() + " ");
//        }
//        System.out.println();

        /*
        It also contains methods that operate on entire collections, such as
        boolean containsAll(Collection<?> c),
        boolean addAll(Collection<? extends E> c),
        boolean removeAll(Collection<?> c),
        boolean retainAll(Collection<?> c), and
        void clear().
         */

        //containsAll
//        Collection<Seat> copy1 = new ArrayList<>(theatre.getSeats());
//        Collection<Seat> copy2 = new LinkedList<>(theatre.getSeats());
//        System.out.println("copy1.containsAll(copy2): " + copy1.containsAll(copy2));
//
//        //addAll
//        ((ArrayList<Seat>) copy1).addAll(1, copy2);
//        System.out.println("Checking addAll method...");
//        for (Seat s : copy1) {
//            System.out.print(s.getSeatNumber() + " ");
//        }
//        System.out.println();
//
//        //removeAll
//        System.out.println("copy1.removeAll(copy2): " + copy1.removeAll(copy2));
//        for (Seat s : copy1) {
//            System.out.print(s.getSeatNumber() + " ");
//        }
//        System.out.println();
//
//        //retainAll
//        copy1.add(new Seat("T1"));
//        System.out.println("copy1 contains (before retainAll)...");
//        displaySeats(copy1);
//
//        System.out.println("copy2 contains...");
//        displaySeats(copy2);
//
//        System.out.println("copy1.retainAll(copy2): " + copy1.retainAll(copy2));
//        displaySeats(copy1);
//
//        //clear
//        copy1.clear();
//        System.out.println("copy1.clear() size " + copy1.size());
//        displaySeats(copy1);

        /*
        Additional methods for array operations (such as Object[] toArray() and <T> T[] toArray(T[] a) exist as well.
         */

        //Object[] toArray()
//        System.out.println("Object[] toArray()...");
//        Object[] seatArrayCopy1 =  copy1.toArray();
//        for(int i=0; i<seatArrayCopy1.length; i++){
//            System.out.println(seatArrayCopy1[i]);
//        }
//
//        //<T> T[] toArray(T[] a)
//        System.out.println("<T> T[] toArray(T[] a)...");
//        Seat[] seatArrayCopy2 = new Seat[copy2.size()];
//        copy2.toArray(seatArrayCopy2);
//        for(int i=0; i<seatArrayCopy2.length; i++){
//            System.out.print(seatArrayCopy2[i].getSeatNumber()+" ");
//        }
//        System.out.println();

    }

    private static void displaySeats(Collection<Seat> copy1) {
        for (Seat s : copy1) {
            System.out.println(s);
        }
        System.out.println();
    }


}
