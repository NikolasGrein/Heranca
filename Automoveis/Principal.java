package Automoveis;

public class Principal {

	public static void main(String[] args) {

		Automovel automovel = new Automovel(4, "V12", "Corola", "2.0", 2002, "vermelho");

		System.out.println("NumeroPortas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		System.out.println("Marca: " +automovel.getMarca());
		System.out.println("Modelo: " +automovel.getModelo());
		System.out.println("Ano: " +automovel.getAno());
		System.out.println("Cor: " +automovel.getCor());

		Moto moto = new Moto(200, "Yamaha", "MT07", 2013, "Bege");
		
		System.out.println("Cilindradas: " + moto.getCilindrada());
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());

		Veiculo veiculo = new Veiculo("Boeing", "Boeing 237", 2017, "Branco");
		System.out.println("Marca: " +veiculo.getMarca());
		System.out.println("Modelo: " +veiculo.getModelo());
		System.out.println("Ano: " +veiculo.getAno());
		System.out.println("Cor: " +veiculo.getCor());
	}
}
