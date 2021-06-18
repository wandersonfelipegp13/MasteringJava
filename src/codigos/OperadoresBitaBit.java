package codigos;

public class OperadoresBitaBit {
	
	private static int x = 60; // 00111100
	private static int y = 13; // 00001101
	
	public static void main(String args[]) {
		
		// Comparando bit a bit, da esquerda para a direita, de baixo para cima,
		// 0 e 0 = 0
		// 0 e 1 = 0
		// 1 e 0 = 0
		// 1 e 1 = 1
		
		//   00111100
		//   00001101
		// = 00001100
		System.out.println(new StringBuilder().append("Resultado do operador &: ").append(x & y));
		System.out.println("12 em Binario: 0000" + Integer.toBinaryString(12));
	}

}
