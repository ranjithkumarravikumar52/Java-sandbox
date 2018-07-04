package collections.main;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);

    }

    private static void listInterfaceMethods(Theatre theatre) {
        /**
         * A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. In addition to the operations inherited from Collection, the List interface includes operations for the following:
         *
         * Positional access — manipulates elements based on their numerical position in the list. This includes methods such as
         * get,
         * set,
         * add,
         * addAll, and
         * remove.
         *
         * Search — searches for a specified object in the list and returns its numerical position. Search methods include
         * indexOf and
         * lastIndexOf.
         *
         * Iteration — extends Iterator semantics to take advantage of the list's sequential nature.
         * The listIterator methods provide this behavior.
         *
         * Range-view — The sublist method performs arbitrary range operations on the list.
         */
        List<Seat> seatList = new ArrayList<>(theatre.getSeats());
//        List<Seat> seatList1 = new LinkedList<>(theatre.getSeats());
//        Seat t1 = new Seat("T1");

        //get
//        int index = seatList.size() - 3;
//        System.out.println(seatList.get(index).getSeatNumber());


        //set

//        System.out.println(seatList.set(index, t1));
//        System.out.println(seatList.get(index).getSeatNumber());

        //add
//        displaySeats(seatList);
//        seatList.add(3,t1);
//        displaySeats(seatList);
//        seatList.addAll(seatList);
//        displaySeats(seatList);
//
//        seatList.addAll(2, seatList);
//        displaySeats(seatList);
//        seatList.removeAll(seatList1);
//        displaySeats(seatList1);

        //search
//        seatList.add(t1);
//        seatList.add(t1);
//        seatList.add(t1);
//        displaySeats(seatList);
//        System.out.println(seatList.indexOf(t1));
//        System.out.println(seatList.lastIndexOf(t1));

        //ListIterator
//        displaySeats(seatList);
//        ListIterator<Seat> seatListIterator = seatList.listIterator(seatList.size());
//        while(seatListIterator.hasPrevious()){
//            System.out.print(seatListIterator.previous().getSeatNumber()+" ");
//        }

        //Rangeview - immutable I guess?
//        displaySeats(seatList);
//
//        List<Seat> subList = seatList.subList(0,3);
//        displaySeats(subList);
//        List<Seat> reverseList = new LinkedList<>();
//        ListIterator<Seat> seatListIterator = seatList.listIterator(seatList.size());
//        while (seatListIterator.hasPrevious()) {
//            reverseList.add(seatListIterator.previous());
//        }
//
//        seatList.clear();
//        seatListIterator = reverseList.listIterator();
//        while (seatListIterator.hasNext()) {
//            seatList.add(seatListIterator.next());
//        }
//        displaySeats(seatList);
//        displaySeats(reverseList);
//
//        //equal only if both list contains same elements in same order
//        System.out.println(seatList.equals(reverseList));

        /**
         * List Algorithms
         * Most polymorphic algorithms in the Collections class apply specifically to List. Having all these algorithms at your disposal makes it very easy to manipulate lists. Here's a summary of these algorithms, which are described in more detail in the Algorithms section.
         *
         * sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
         *
         * shuffle — randomly permutes the elements in a List.
         *
         * reverse — reverses the order of the elements in a List.
         * rotate — rotates all the elements in a List by a specified distance.
         * swap — swaps the elements at specified positions in a List.
         * replaceAll — replaces all occurrences of one specified value with another.
         * fill — overwrites every element in a List with the specified value.
         * copy — copies the source List into the destination List.
         * binarySearch — searches for an element in an ordered List using the binary search algorithm.
         * indexOfSubList — returns the index of the first sublist of one List that is equal to another.
         * lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
         */

//        seatList.sort(Seat::compareTo);
//        displaySeats(seatList);
//
////        Collections.shuffle(seatList);
////        displaySeats(seatList);
//
////        Collections.reverse(seatList);
////        displaySeats(seatList);
//
//        Collections.rotate(seatList, 0);
//        displaySeats(seatList);
//
//        Collections.swap(seatList, 0, 1);
//        displaySeats(seatList);
//
//        //replaceAll
//        seatList.addAll(seatList);
//        displaySeats(seatList);
//        Collections.replaceAll(seatList, seatList.get(0), seatList.get(seatList.size()-1));
//        displaySeats(seatList);
//
//        //fill
//        Seat t1 = new Seat("T1");
//        Collections.fill(seatList, t1);
//        displaySeats(seatList);
//
//        //copy
////        List<Seat> destList = new ArrayList<>(seatList.addAll(seatList));
////        Collections.copy(destList, seatList);
////        displaySeats(destList);

//        displaySeats(seatList);
//        seatList.addAll(seatList);
//
//        List<Seat> seatList1 = new ArrayList<>(seatList);
//        seatList1.addAll(seatList);
//        System.out.println(Collections.indexOfSubList(seatList, seatList1));
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
