package dvdplayer;

//interface indica que está classe é uma interface
public interface Controlador {
    
    /*Métodos abstratos
    Métodos serão obrigatóriamente implementados na classe filha através da sobrescrita de método*/
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirDVD();
    public abstract void fecharDVD();
    public abstract void menu();

}
