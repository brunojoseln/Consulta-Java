package heranca;

/*Se a palavra final estivesse na declaração essa classe se tornaria uma classe final
não podendo ser herdada por outras classes */
public /*final*/ class Aluno extends Pessoa {
    private int matricula;
    private String Curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de "+this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    
}
