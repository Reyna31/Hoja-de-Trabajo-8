import java.util.PriorityQueue;

public class MyJcF<E> {
    protected PriorityQueue MyQueue;

    public MyJcF(){
        MyQueue = new PriorityQueue<E>();
    }

    public MyJcF(PriorityQueue<E> vector){
        MyQueue = new PriorityQueue<E>(vector.size());
        for (int i = 0; i < vector.size(); i++){
            vector.poll();
        }
    }

    public void agregar(E value){
        MyQueue.add(value);
    }

    public String Revisar(){
        if(!MyQueue.isEmpty()){
            String paciente = MyQueue.peek().toString();
            return paciente;
        }else {
            String mensaje = "No existen pacientes";
            return mensaje;
        }
    }

    public String siguiente(){
        if (!MyQueue.isEmpty()){
            String paciente = MyQueue.poll().toString();
            return paciente;
        }else{
            String mensaje = "No existen pacientes";
            return mensaje;
        }
    }

}
