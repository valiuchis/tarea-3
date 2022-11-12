
package progra3;

public abstract class Bebida{

    private int Serie;

    public Bebida(int s){
        Serie = s;
    }

    public int getSerie() {
        return Serie;
    }

    public String beber(){
        return "Sabor: ";
    }

}

class Sprite extends Bebida {

    public Sprite(int Serie) {
        super(Serie);
    }
    public String beber(){
        return super.beber() + "Sprite";

    }
}

class CocaCola extends Bebida {

    public CocaCola(int Serie) {
        super(Serie);
    }

    public String beber(){
        return super.beber() + "CocaCola";
    }
}

class Fanta extends Bebida {

    public Fanta(int Serie) {
        super(Serie);
    }

    public String beber(){
        return super.beber() + "Fanta";
    }
}