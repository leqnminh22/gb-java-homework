package ru.mle.homework12;

public class Homework12 {

    public static final int SIZE = 10000000;
    public static final int HALF = SIZE / 2;

    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public void threadOne() {
        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++)
            arr[i] = 1.0f;
            long a = System.currentTimeMillis();
            calculate(arr);
            System.out.println("Время завершения с одним потоком: " + (System.currentTimeMillis() - a));

    }

    public void threadTwo() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        for (int i = 0; i < arr.length; i++)
            arr[i] = 1.0f;

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);


        Thread t1 = new Thread(() -> {
            float[] a1 = calculate(arr1);
            System.arraycopy(a1,0,arr1, 0, a1.length);
        });

        Thread t2 = new Thread(() -> {
            float[] a2 = calculate(arr2);
            System.arraycopy(a2,0,arr2, 0, a2.length);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

            System.arraycopy(arr1, 0, arr, 0, HALF);
            System.arraycopy(arr2, 0, arr, HALF, HALF);
            System.out.println("Время завершения с двумя потоками: " + (System.currentTimeMillis() - a));

    }

    public static void main(String[] args) {

        Homework12 a = new Homework12();
        a.threadOne();
        a.threadTwo();

    }
}
