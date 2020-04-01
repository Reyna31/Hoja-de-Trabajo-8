import java.util.Vector;

// Metodos percolateUp y PushNodo sacado de referencia de:
// https://courses.cs.washington.edu/courses/cse326/06au/lectures/lect05.pdf

public class VectorH<E extends Comparable<E>> implements PriorityQueue<E> {

    protected Vector<E> data;

    public VectorH(){
        data = new Vector<E>();
    }

    public E getFirst(){
        return data.get(0);
    }

    public VectorH(Vector<E> v){
        int i;
        data = new Vector<E>(v.size());
        for (i = 0; i <v.size(); i++){
            add(v.get(i));
        }
    }

    protected static int parent (int i){
        return (i - 1) / 2;
    }

    protected static int left(int i){
        return 2* i + 1;
    }

    protected static int right(int i){
        return(2 * i + 1) + 1;
    }

    protected void percolateUp(int leaf){
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)){
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }

    protected void pushNodo(int root){
        int heapSize = data.size();
        E value = data.get(root);
        while (root< heapSize){
            int child = left(root);
            if (child < heapSize){
                if (right(root)<heapSize && (data.get( child + 1).compareTo(data.get(child)) < 0)){
                    child++;
                }
                else if((data.get(child).compareTo(value)) < 0){
                    data.set(root,data.get(child));
                    root = child;
                }else{
                    data.set(root,value);
                    return;
                }
            }else {
                data.set(root,value);
                return;
            }
        }
    }

    public E remove(){
        E val = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()- 1);
        if (data.size() > 1 ){
            pushNodo(0);
        }
        return val;
    }

    public void add(E value){
        data.add(value);
    }

    public boolean isEmpty(){
        return data.size() == 0;
    }

    public int size(){
        return data.size();
    }

    public void clear(){
        data.clear();
    }
}
