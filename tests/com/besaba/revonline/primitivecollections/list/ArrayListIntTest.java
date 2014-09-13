package com.besaba.revonline.primitivecollections.list;

import com.besaba.revonline.primitivecollections.iterables.iterators.IntIterator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListIntTest {

    @Test
    public void testWithCapacity() throws Exception {
        int size = 20;

        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
        ArrayListInt arrayListInt = ArrayListInt.withCapacity(size);

        assertEquals(arrayList.size(), arrayListInt.size());
    }

    @Test
    public void testFrom() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        ArrayListInt list = ArrayListInt.withCapacity(1);

        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }

        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, list.asArray());
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(10, ArrayListInt.with(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(ArrayListInt.withCapacity(0).isEmpty());
    }

    @Test
    public void testEmptyAfterRemove() throws Exception {
        ArrayListInt listInt = ArrayListInt.with(1);
    }

    @Test
    public void testContains() throws Exception {
        assertTrue(ArrayListInt.with(5, 10, 15, 20, 25, 30, 35, 40, 45, 50).contains(25));
    }

    @Test
    public void testIndexOf() throws Exception {
        assertEquals(1, ArrayListInt.with(0, 1).indexOf(1));
    }

    @Test
    public void testIterator() throws Exception {

    }

    @Test
    public void testWith() throws Exception {
        ArrayListInt list = ArrayListInt.with(1, 2, 3, 4, 5, 6);
        int[] result = {1, 2, 3, 4, 5, 6};

        int prev = 0;
        IntIterator iterator = list.iterator();

        while (iterator.hasNext()) {
            assertEquals(result[prev++], iterator.next());
        }
    }
}