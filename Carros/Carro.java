public class Carro {
	int velocidade;
	int potencia;
	String nome;

	//M�todos da classe Carro
	void acelerar(){
		velocidade += potencia;
	}
	
	void frear(){
		velocidade = velocidade/2;
	}
	
	int getVelocidade(){
		return velocidade;
	}
	
	void imprimir(){
		System.out.println("O carro "+nome+" esta a "+getVelocidade()+"km/h");
	}
}
