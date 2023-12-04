package org.codeFor;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FibonacciUhr {


    public static final int[] FIBONACCI_SERIES = {1,1,2,3,5};

    public void toFiboTime() {
     LocalDateTime currentTime = LocalDateTime.now();
     int hour = currentTime.getHour() % 12;
     int minutes = currentTime.getMinute() / 5;

     ArrayList<Integer> blocksForHours = findBlocks(hour);
     ArrayList<Integer> blocksForMinutes = findBlocks(minutes);

     displayColorSequenceForBlocks(blocksForHours,blocksForMinutes);

 }

    public void displayColorSequenceForBlocks(ArrayList<Integer> blocksForHours, ArrayList<Integer> blocksForMinutes) {
     List<Integer> blue = new ArrayList<>(blocksForHours);
     blue.retainAll(blocksForMinutes); //find common between hours and minutes to color blue

     List<Integer> red = new ArrayList<>(blocksForHours);
     red.removeAll(blue); // only hours one ---red

     List<Integer> green = new ArrayList<>(blocksForMinutes);
     green.removeAll(blue); // only for minutes

     System.out.println("R " +red + "--  G " + green+" -- B "+blue);


    }

    public ArrayList<Integer> findBlocksForHours(int number) {
        ArrayList<Integer> blocks = new ArrayList<>();
        int newNumber = number;

        for (int i = FIBONACCI_SERIES.length - 1; i >= 0 ; i--) {
            if (FIBONACCI_SERIES[i]<=newNumber) {
                blocks.add(FIBONACCI_SERIES[i]);
                newNumber -= FIBONACCI_SERIES[i];
            }
        }

        return blocks;
    }

    public ArrayList<Integer> findBlocks(int number) {
        ArrayList<Integer> blocks = new ArrayList<>();
        int newNumber = number;

        for (int i = FIBONACCI_SERIES.length - 1; i >= 0 ; i--) {
            if (FIBONACCI_SERIES[i]<=newNumber) {
                blocks.add(FIBONACCI_SERIES[i]);
                newNumber -= FIBONACCI_SERIES[i];
            }
        }

        return blocks;
    }

    public ArrayList<Integer> findBlocksForMinutes(int minutes) {
        ArrayList<Integer> blocks = new ArrayList<>();
        int newNumber = minutes;

        for (int i =0; i < FIBONACCI_SERIES.length - 1 ; i++) {
            if (FIBONACCI_SERIES[i]<=newNumber) {
                blocks.add(FIBONACCI_SERIES[i]);
                newNumber -= FIBONACCI_SERIES[i];
            }
        }

        return blocks;
    }


}
