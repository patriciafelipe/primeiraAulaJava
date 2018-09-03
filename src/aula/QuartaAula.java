package aula;

public class QuartaAula {

	public static int soma(int n1, int n2) {
		int total = n1 + n2;
		return total;
	}
	public static double mult(int n1, int n2){
		double total = n1 * n2;
		return total;
	}
	public static double div(int n1, int n2){
		double total = n1 / n2;
		return total;
	}
	public static void main(String[] args) {
		System.out.println(soma(10,2));
		System.out.println(mult(10,2));
		System.out.println(div(10,2));
	}
}
