/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarleton.lab12;

import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joeme
 */
public class BSTTest {

    /**
     * Test of add method, of class BST.
     */
    @Test
    public void testAdd() {
        BST t = new BST();
        t.add(1);
        assertEquals(1,t.getRoot().getValue());
    }
    
    @Test
    public void testAddLeft() {
        BST t = new BST();
        t.add(2);
        t.add(1);
        assertEquals(1,t.getRoot().getLeft().getValue());
    }

    @Test
    public void testAddRight() {
        BST t = new BST();
        t.add(1);
        t.add(2);
        assertEquals(2,t.getRoot().getRight().getValue());
    }

    @Test
    public void testAddLeftNeg() {
        BST t = new BST();
        t.add(1);
        t.add(-1);
        assertEquals(-1,t.getRoot().getLeft().getValue());
    }

    @Test
    public void testAddRightNeg() {
        BST t = new BST();
        t.add(-2);
        t.add(-1);
        assertEquals(-1,t.getRoot().getRight().getValue());
    }
    
    @Test
    public void testAddLeftLeft() {
        BST t = new BST();
        t.add(3);
        t.add(2);
        t.add(1);
        assertEquals(1,t.getRoot().getLeft().getLeft().getValue());
    }

    @Test
    public void testAddRightRight() {
        BST t = new BST();
        t.add(1);
        t.add(2);
        t.add(3);
        assertEquals(3,t.getRoot().getRight().getRight().getValue());
    }  
    /**
     * Test of contains method, of class BST.
     */
    @Test
    public void testTrueContains() {
        BST t = new BST();
        t.add(1);
        assertTrue(t.contains(1));
    }
    
    @Test
    public void testFalseContains() {
        BST t = new BST();
        t.add(1);
        assertFalse(t.contains(0));
    }
    /**
     * Test of iterator method, of class BST.
     */
    @Test
    public void testIterator1() {
        BST t = new BST();
        t.add(1);
        t.add(5);
        Iterator<Integer> it = t.iterator();
        it.next();
        Integer d = it.next();
        assertEquals(5, d);
    }
    
    @Test
    public void testIterator2() {
        BST t = new BST();
        t.add(5);
        t.add(1);
        Iterator<Integer> it = t.iterator();
        it.next();
        Integer d = it.next();
        assertEquals(5, d);        
    }
    
    @Test
    public void testIterator3() {
        BST t = new BST();
        t.add(-5);
        t.add(-1);
        Iterator<Integer> it = t.iterator();
        it.next();
        Integer d = it.next();
        assertEquals(-1, d);        
    }
    
    @Test
    public void testIterator4() {
        BST t = new BST();
        t.add(-5);
        t.add(1);
        Iterator<Integer> it = t.iterator();
        it.next();
        Integer d = it.next();
        assertEquals(1, d);        
    }
    
    @Test
    public void testTrueHasNext() {
        BST t = new BST();
        t.add(1);
        t.add(5);
        Iterator<Integer> it = t.iterator();
        it.next();
        assertTrue(it.hasNext());
    }
    
    @Test
    public void testFalseHasNext() {
        BST t = new BST();
        t.add(1);
        t.add(5);
        Iterator<Integer> it = t.iterator();
        it.next();
        it.next();
        assertFalse(it.hasNext());        
    }
}
