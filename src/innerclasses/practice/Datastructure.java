package innerclasses.practice;

import java.util.Iterator;

/**
 * <p>The DataStructure.java example that follows consists of:</p>
 * <ul>
 * <li>The DataStructure outer class, which includes a constructor to create an instance of DataStructure containing an array filled with consecutive integer values (0, 1, 2, 3, and so on) and a method that prints elements of the array that have an even index value.</li>
 * <li>The EvenIterator inner class, which implements the DataStructureIterator interface, which extends the Iterator< Integer> interface. Iterators are used to step through a data structure and typically have methods to test for the last element, retrieve the current element, and move to the next element.</li>
 * <li>A main method that instantiates a DataStructure object (ds), then invokes the printEven method to print elements of the array arrayOfInts that have an even index value.</li>
 *
 * </ul>
 */
public class Datastructure {

    private final int SIZE = 10;
    private int[] intArray = new int[SIZE];

    public Datastructure() {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
    }

    public void printEven() {
        DataStructureInterface dataStructureInterface = this.new EvenIterator();
        while (dataStructureInterface.hasNext()) {
            System.out.print(dataStructureInterface.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureInterface extends Iterator<Integer> {
    }

    private class EvenIterator implements DataStructureInterface {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            // Record a value of an even index of the array
            Integer retValue = intArray[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
}
