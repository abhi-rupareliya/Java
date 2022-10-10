/*   ID   : 21ce117
     Name : Abhi Rupareliya
     Aim  : Create a Triplet class that encapsulates three objects of the same data type in a given 
            instance of Triplet.
 */

class Triplet<T> {
    private T object1;
    private T object2;
    private T object3;
    
    public Triplet(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }
    
    public T getObject1() {
        return object1;
    }
    
    public T getObject2() {
        return object2;
    }
    
    public T getObject3() {
        return object3;
    }
}

public class PR11 {
    public static void main(String[] args) {
        Triplet<Integer> triplet = new Triplet<>(10,20,30);
        System.out.println(triplet.getObject1());
        System.out.println(triplet.getObject2());
        System.out.println(triplet.getObject3());
    }
}