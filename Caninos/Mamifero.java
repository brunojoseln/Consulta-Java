package caninos;

public class Mamifero extends Animal{

    protected String corPelo;
    
    //Sobreposição do método emitir som 
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
}
