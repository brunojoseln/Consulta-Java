package dvdplayer;

/*Classe que ira implementar a classe Controlador
É necessário colocar implements e o nome da classe que sera implementada */
public class ControleRemoto implements Controlador {
    
    private boolean ligado;
    private boolean aberto;
    
        public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    @Override
    public void ligar() {
        if (!this.isLigado()) {
            System.out.println("Ligando DVD");
            this.setLigado(true);
        }else{
            System.err.println("O DVD ja está ligado");
        }
        
    }

    @Override
    public void desligar() {
        if (this.isLigado()) {
            this.setLigado(false);
            System.out.println("Desligando");
        }else{
            System.err.println("O DVD já está desligado");
        }
        
    }

    @Override
    public void abrirDVD() {
        if (this.isLigado() && !this.isAberto()) {
            System.out.println("Abrindo");
            this.setAberto(true);
        }else if (this.isAberto()){
            System.err.println("O DVD ja está aberto");
        }else{
            System.err.println("O DVD está desligado");
        }
    }

    
    @Override
    public void fecharDVD() {
        if (this.isLigado() && this.isAberto()) {
            System.out.println("Fechando");
            this.setAberto(false);
        }else if (!this.isAberto()){
            System.err.println("O DVD já está fechado");
        }else{
            System.err.println("O DVD está desligado");
        }
        
    }

    @Override
    public void menu() {
        System.out.println(" \nO dvd está ligado?  "+this.isLigado()+"\nestá aberto? "+this.isAberto()+"\n ------");
    }
    
}
