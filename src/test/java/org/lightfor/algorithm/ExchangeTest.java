package org.lightfor.algorithm;

import org.junit.Test;

public class ExchangeTest {

    @Test
    public void test() {
        Integer i = 1;
        Integer j = 2;
        System.out.println(i+" "+j);
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println(i+" "+j);
    }
}
