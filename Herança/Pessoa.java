package heranca;

//Classe abstrata
public abstract class Pessoa {
    //O modificador de acesso protected permite que as subclasses visualizem os atributos
    protected String nome;
    protected int idade;
    protected String sexo;

    //Método final não pode ser sobreposto
    public final void fazerAniversario(){
        this.setIdade(this.getIdade()+ 1);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Informações \n" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo+"\n    ----------";
    }
    
    
    
}
