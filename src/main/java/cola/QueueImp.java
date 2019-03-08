package cola;
public class QueueImp<E> implements Queue<E> {

    private E[] cola;
    private int max;
    private int ocupado;



    public QueueImp(int size){

        cola = (E[]) new Object[size];
        this.max = size;
        this.ocupado = 0;

    }



    public void push(E e) throws errorlleno {

        if(this.ocupado != max) {

            this.cola[ocupado] = e;
            this.ocupado++;
            System.out.println("Elemento añadido al final de la cola");
        }


        else {
            throw new errorlleno();
        }




        }






    public E  pop() throws errorvacio{

        if(this.ocupado == 0){
            throw new errorvacio();

        }else{

            this.ocupado--;
            System.out.println("Elemento quitado de la cola");
            return cola[ocupado];


        }

    }


    public int size() {

        return this.ocupado;
    }
}