package creatinalPattern.singleton;

/* 
Вселенная под ключ
*/

public class Solution {

    public static void main(String[] args) {

       // Universe universe = new Universe();
        Universe universe = Universe.getInstance();
     //   Universe anotherUniverse = new Universe();
        Universe anotherUniverse = Universe.getInstance();
        System.out.println(universe);
        System.out.println(anotherUniverse);
    }
}
