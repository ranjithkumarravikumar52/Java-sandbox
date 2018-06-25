package collections.test;

import collections.main.Theatre;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheatreTest {

    @Test
    public void totalSeatsCountTest(){
        Theatre theatre = new Theatre("AMC", 10, 15);
        assertEquals(10*15, theatre.getSeats().size());
    }



}