package cola;

public class errorvacio extends Exception {

    public errorvacio(){
        this("Está ");

    }
    public errorvacio (String str){
        super(str+ " vacia");
    }

}
