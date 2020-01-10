/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makebricks;

/**
 *
 * @author User
 */
public class MakeBricks {

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 9));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (goal / 5 <= big) {
            return (goal % 5 <= small);
        } else {
            return (goal - 5 * big <= small);
        }
    }

}
