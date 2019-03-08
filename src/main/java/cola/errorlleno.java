package cola;

public class errorlleno extends Exception {

    public errorlleno(){
        this("Está ");

    }
    public errorlleno (String str){
        super(str+ " llena");
    }

}
