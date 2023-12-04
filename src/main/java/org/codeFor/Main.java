package org.codeFor;

import java.util.Timer;
import java.util.TimerTask;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
        @Override
        public void run() {
            FibonacciUhr fibonacciUhr = new FibonacciUhr();
            fibonacciUhr.toFiboTime();
        }
    },0,5 * 60 * 1000);


    }


}