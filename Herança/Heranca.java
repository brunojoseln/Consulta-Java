package heranca;
public class Heranca {

    public static void main(String[] args) {
        /*A classe pessoa não pode ser instanciada pois é uma classe abstrata
        Pessoa p = new Pessoa(); */
        
        Visitante v1 = new Visitante();
        v1.setNome("José");
        v1.setIdade(37);
        v1.setSexo("Maculino");
        System.out.println(v1.toString());
        
        
        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setMatricula(4002);
        a1.setCurso("Informática");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Gabriel");
        b1.pagarMensalidade();
        
    }
    
}
