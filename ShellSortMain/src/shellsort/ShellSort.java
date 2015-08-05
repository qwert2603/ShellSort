/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsort;

/**
 *
 * @author alex
 */
public class ShellSort {
    public static <T extends Number> void sort(T mas[]) {
        int h = 0;
        while(++h <= mas.length / 9)
            h *=3;
        while(h != 0) {
            for(int i = h; i < mas.length; ++i) {
                T e = mas[i];
                int j = i;
                for(; j >= h && mas[j - h].doubleValue() > e.doubleValue(); j -= h) {
                    mas[j] = mas[j - h];
                }
                mas[j] = e;
            }     
            h /= 3;
        }
    }
}