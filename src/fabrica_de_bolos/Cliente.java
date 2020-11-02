package fabrica_de_bolos;

public class Cliente {
	public static void main(String[] args) {
		ChocolateComCaramelo boloChocolateCaramelo = new ChocolateComCaramelo();
		BaunilhaComMorango boloBaunilhaMorango = new BaunilhaComMorango();
		boloChocolateCaramelo.prepararBolo();
		boloBaunilhaMorango.prepararBolo();
	}
}