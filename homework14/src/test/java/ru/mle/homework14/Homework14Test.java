package ru.mle.homework14;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Homework14Test extends TestCase {


    @Test
    public void testCheckArray1() {
        int[] arr1 = {1,2,4,4,2,3,4,1,7};
        int[] arr2 = {0,2,2,2,2,5,6,7};
        int[] arr3 = {1,4,1,4,1,4};

        Homework14.checkArray1(arr1);
        Homework14.checkArray1(arr2);
        Homework14.checkArray1(arr3);
    }

    public void testCheckArray2() {

        int[] arr1 = {1,2,4,4,2,3,4,1,7};
        int[] arr2 = {0,2,4,1,2,5,6,7};
        int[] arr3 = {1,4,1,4,1,4};

        Homework14.checkArray1(arr1);
        Homework14.checkArray1(arr2);
        Homework14.checkArray1(arr3);
    }
}