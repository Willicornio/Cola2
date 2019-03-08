package cola;
public interface Queue<E>{

    void push(E e) throws errorlleno;
    E pop() throws errorvacio;
    int size();
}
