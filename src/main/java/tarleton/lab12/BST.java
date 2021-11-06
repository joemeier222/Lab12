package tarleton.lab12;

import java.util.Iterator;

/**
 *
 * @author Joe Meier
 */
public class BST {
    
    private Node root;

    public BST() {
    }

    public Node getRoot() {
        return root;
    }
    
    public void add(Integer value){
        if (root == null){
            root = new Node(value, null);
        } else {
            root.add(value, root);
        }
    }
    
    public boolean contains(Integer value){
        if (root == null){
            return false;
        }
        return root.contains(value);
}

    public Iterator<Integer> iterator() {
        return new BSTIterator();
    }
    
    private class BSTIterator implements Iterator<Integer> {
        
        Node current = root;

        BSTIterator() {
            current = root;
            while (current.getLeft() != null){
                current = current.getLeft();
            }
        }
        
        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public Integer next() {
           Integer value = current.getValue();
           if (this.hasNext()){
                if (current.getRight() != null) {
                    current = current.getRight();
                    while (current.getLeft() != null) {
                        current = current.getLeft();
                    }
                    return value;
                }
                Node temp = current;
                current = current.getParent();
                while (current != null && temp == current.getRight()){
                    temp = current;
                    current = current.getParent();
                }
            }
            return value;
        }
                
    }
    
}
