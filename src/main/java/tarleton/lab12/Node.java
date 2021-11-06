package tarleton.lab12;

/**
 *
 * @author Joe Meier
 */
public class Node {
    private final Integer value;
    private Node left;
    private Node right;
    private Node parent;
    
    void add(Integer val, Node par){
        int c = value.compareTo(val);
        if (c > 0){
            if (left == null){
                left = new Node(val, this);
            } else {
                left.add(val, this);
            }
        }else if (c < 0) {
            if (right == null){
                right = new Node(val, this);
            } else {
                right.add(val, this);
            }
        }
    }
    
    boolean contains(Integer val){
        int c = value.compareTo(val);
        if (c > 0) {
            if (left == null){
                return false;
            }
            return left.contains(val);    
        }
        if (c < 0) {
            if (right == null){
                return false;
            }
            return right.contains(val);    
        }
        return true;
    }

    public Node(Integer value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Integer getValue() {
        return value;
    }
    
}
