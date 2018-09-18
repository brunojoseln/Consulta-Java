package heranca;

//A palavra final indica que esta classe não terá filho
public final class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa....");
    }
    
    //Override é usado quando ha sobreposição de métodos
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome+" é bolsista pagamento facilitado!");
                
    }
    
    /*@Override
    public void fazerAniversario(){
      A sobreposição nessa caso não irá funcionar, pois o método foi declarado como
      um método final na classe ancestral 
    }*/
}
