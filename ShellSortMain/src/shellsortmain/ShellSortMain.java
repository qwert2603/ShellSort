/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsortmain;

import java.util.Random;
import shellsort.ShellSort;

/**
 *
 * @author alex
 */
public class ShellSortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] m = new int[10000];
        Random r = new Random();
        for(int q = 0; q != m.length; ++q)
            m[q] = (int) r.nextInt(10000);
        System.out.println("start\t");
        ShellSort.sort(m);
        /*for(int w = 0; w != m.length; ++w)
                System.out.println(m[w]);*/
        System.out.println("finish\t" + m[2614]);
    }
    
}
