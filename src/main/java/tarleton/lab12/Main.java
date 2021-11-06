package tarleton.lab12;

import java.util.Iterator;

/**
 *
 * @author Joe Meier
 */
public class Main {
    public static void main(String[] args){
        BST t = new BST();
        t.add(5);
        t.add(3);
        t.add(1);
        t.add(8);
        t.add(4);
        t.add(2);
        Iterator<Integer> it = t.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}
