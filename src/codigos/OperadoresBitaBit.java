package codigos;

public class OperadoresBitaBit {

	private static int x = 60; // 00111100
	private static int y = 13; // 00001101

	public static void main(String args[]) {

		// Comparando bit a bit, da esquerda para a direita, de baixo para cima
		// 0 e 0 = 0
		// 0 e 1 = 0
		// 1 e 0 = 0
		// 1 e 1 = 1

		// & and
		// 00111100 = 60
		// 00001101 = 13
		// 00001100 = 12
		System.out.println(new StringBuilder().append("Resultado do operador &: ").append(x & y));
		System.out.println("12 em Binario: 0000" + Integer.toBinaryString(12));

		// | or
		// 00111100 = 60
		// 00001101 = 13
		// 00111101 =
		System.out.println(new StringBuilder().append("Resultado do operador &: ").append(x | y));
		System.out.println("61 em Binario: 00" + Integer.toBinaryString(61));

		// << deslocar para a esquerda
		// 00111100 = 60
		// 11110000 = 240
		System.out.println(new StringBuilder().append("Resultado do operador <<: ").append(x << 2));
		System.out.println("240 em Binario: " + Integer.toBinaryString(240));

		// >> deslocar para a direita
		// 00111100 = 60
		// 00001111 = 15
		System.out.println(new StringBuilder().append("Resultado do operador <<: ").append(x >> 2));
		System.out.println("15 em Binario: 0000" + Integer.toBinaryString(15));

		System.out.println();
		
		// 00111100 = 60
		// 00000000 = 00
		System.out.println(x >>> 10);

		// Com multiplos de 8 acima de 16, retorna o proprio 60
		// 00111100 = 60
		// 00000111 = 07
		System.out.println(x >>> 32);
	}

}
