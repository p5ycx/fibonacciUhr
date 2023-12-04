package org.codeFor;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FibonacciUhrTest {


    @Test
    public void testNumberToFibonacciBlocks() {
        FibonacciUhr fibonacciUhr = new FibonacciUhr();
        ArrayList<Integer> blocks  = fibonacciUhr.findBlocksForHours(10);

        Assert.assertNotNull(blocks);
        Assert.assertTrue(blocks.contains(5));
        Assert.assertTrue(blocks.contains(3));
        Assert.assertTrue(blocks.contains(2));
    }


    @Test
    public void testDisplayBlocks() {

        FibonacciUhr fibonacciUhr = new FibonacciUhr();
        ArrayList<Integer> HourBlocks  = fibonacciUhr.findBlocks(12);
        ArrayList<Integer> MinutesBlocks  = fibonacciUhr.findBlocks(1);
        fibonacciUhr.displayColorSequenceForBlocks(HourBlocks,MinutesBlocks);



    }

    @Test
    public void testForMinutes() {
        FibonacciUhr fibonacciUhr = new FibonacciUhr();
        ArrayList<Integer> MinutesBlocks  = fibonacciUhr.findBlocksForMinutes(8);

        Assert.assertNotNull(MinutesBlocks);

    }

}