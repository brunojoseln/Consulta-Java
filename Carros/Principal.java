public class Principal {

	public static void main(String[] args) {
		
		//Primeiro carro
		
		//Instanciando uma nova classe
		Carro c1 = new Carro();
		
		//Atribuindo valores aos atributos do objeto
		c1.nome = "Fusca";
		c1.potencia = 10;
		c1.velocidade = 0;
		
		
		//Métodos do objeto c1
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		c1.imprimir();
		
		//Segundo carro
		Carro c2 = new Carro();
		c2.nome = "Gol";
		c2.potencia = 37;
		c2.velocidade = 0;
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.frear();
		c2.imprimir();
		

	}

}
