package com.clost.Review;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

/**
 * @author clost
 * @date 2022/9/6 22:00
 */
public class various {


    @Test
    public void Homework01() {
        int n1;
        n1 = 13;
        int n2;
        n2 = 17;
        int n3;
        n3 = n1 + n2;
        System.out.println("n3 = " + n3);
        int n4 = 38;
        int n5 = n4 - n3;
        System.out.println("n5 = " + n5);

    }

    @Test
    public void m2() {
        byte b = 4;
        b += 2;


    }

    @Test
    public void m1() {


        int[][] yanghui = new int[12][];

        for (int i = 0; i < yanghui.length; i++) {

            yanghui[i] = new int[i + 1];

            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == yanghui[i].length - 1) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                }

            }
        }

            for (int[] row : yanghui) {
                for (int data :row) {
                    System.out.print(data + " ");
                }
                System.out.println();


            }

        }

    }



