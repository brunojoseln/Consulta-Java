package caninos;

public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){
        System.out.println("Latir");
    }
    
    //Polimorfismo de Sobrecarga, todos os métodos possuem assinaturas diferentes
    public void reagir(String frase){
        if (frase.equals("Cheguei")  || frase.equals("Bom dia")) {
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Sem reação");
        }
    }
    
    public void reagir(int hora, int minuto){
        if (hora < 12) {
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("anar e latir");
        }
        
    }
    
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if (peso < 10 ) {
                System.out.println("Rosnar");
            }else{
                System.out.println("ignorar");
            }
        }
    }
}
