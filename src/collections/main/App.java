package collections.main;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);

//        setInterfaceOperations(theatre);




    }

    private static void setInterfaceOperations(Theatre theatre) {
        Collection<Seat> setsImplementation = new ArrayList<>(theatre.getSeats());
        ((ArrayList<Seat>) setsImplementation).addAll(setsImplementation);
//        displaySeats(setsImplementation);

        //Removing duplicates no order preference
//        Set<Seat> noDups = new HashSet<>(setsImplementation);
//        displaySeats(noDups);

        //Removing duplicates with order preference
//        noDups = new TreeSet<>(setsImplementation);
//        displaySeats(noDups);
//        noDups = new LinkedHashSet<>(setsImplementation);
//        displaySeats(noDups);

        /*
        The size operation returns the number of elements in the Set (its cardinality).
         The isEmpty method does exactly what you think it would.
          The add method adds the specified element to the Set if it is not already present and returns a boolean indicating whether the element was added.
          Similarly, the remove method removes the specified element from the Set if it is present and returns a boolean indicating whether the element was present.
          The iterator method returns an Iterator over the Set.
         */
//        System.out.println("isEmpty: "+noDups.isEmpty());
//        Seat t1 = new Seat("T1");
//        System.out.println("adding new seat...: "+noDups.add(t1));
//        System.out.println("Removing new seat...: "+noDups.remove(t1));
//
//        for(Iterator<Seat> seatIterator = noDups.iterator();seatIterator.hasNext();){
//            System.out.print(seatIterator.next().getSeatNumber()+" ");
//        }
//        System.out.println();


        /**
         * BULK OPERATIONS
         * containsAll
         * addAll
         * retainAll
         * removeAll
         * s1.containsAll(s2) — returns true if s2 is a subset of s1. (s2 is a subset of s1 if set s1 contains all of the elements in s2.)
         * s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the set containing all of the elements contained in either set.)
         * s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2. (The intersection of two sets is the set containing only the elements common to both sets.)
         * s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2. (For example, the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.)
         * */

        //containsAll
        Set<Seat> set1 = new HashSet<>(setsImplementation);
        Collection<Seat> set2 = new ArrayList<>(setsImplementation);
//        set2.addAll(set2);
//        System.out.println("set1...");
//        displaySeats(set1);
//        System.out.println("set2...");
//        displaySeats(set2);
//        System.out.println(set1.containsAll(set2));
//        System.out.println(set2.containsAll(set1));
//        set1.clear();
//        System.out.println("after clearing set1...");
//        System.out.println(set1.containsAll(set2));
//        System.out.println(set2.containsAll(set1));

        //addAll
        set1.addAll(set2);
        displaySeats(set1);
        displaySeats(set2);

        //retainAll
        System.out.println("retainAll...");
        set2.retainAll(set1);
        displaySeats(set1);
        displaySeats(set2);

        //removeAll
        System.out.println("removeAll...");
        set1.removeAll(set2);
        displaySeats(set1);
        displaySeats(set2);
    }

    private static void traversingMethodsInCollection(Theatre theatre) {
        Collection<Seat> copy1 = new ArrayList<>(theatre.getSeats());
        List<Seat> copyList = new ArrayList<>(theatre.getSeats());
        Seat A1 = copyList.get(0);

        //stream
        System.out.println("Steam...");
        copy1.stream().forEach(seat -> System.out.print(seat.getSeatNumber() + " "));
        System.out.println();

        //parallelStream
        System.out.println("Parallel Stream...");
        copy1.parallelStream().forEach(seat -> System.out.print(seat.getSeatNumber() + " "));
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

        //<T> T[] toArray(T[] a)
//        System.out.println("<T> T[] toArray(T[] a)...");
//        Seat[] seatArrayCopy2 = copy2.toArray(new Seat[0]);
//        for(int i=0; i<seatArrayCopy2.length; i++){
//            System.out.print(seatArrayCopy2[i].getSeatNumber()+" ");
//        }
//        System.out.println();

    }

    private static void displaySeats(Collection<Seat> copy1) {
        for (Seat s : copy1) {
            System.out.print(s.getSeatNumber() + " ");
        }
        System.out.println();
    }


}
