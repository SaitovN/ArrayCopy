package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int []soc = {1,2,3,4,5};

        int[]des = soc;
        System.out.println(Arrays.toString(des));
        for (int i = 0; i < soc.length; i++) {
            des[i]= soc[i];
        }


        System.out.println(Arrays.toString(des));
    }
}
