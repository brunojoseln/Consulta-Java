package dvdplayer;


public class Principal {

    public static void main(String[] args) {
        ControleRemoto d1 = new ControleRemoto();
        
        
        d1.ligar();
        d1.abrirDVD();
        
        d1.menu();
        
        d1.fecharDVD();
        d1.desligar();
        
        

    }
    
}
