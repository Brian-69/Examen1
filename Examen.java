import java.util.Scanner;

public class Examen {
 
	public static void main(String[] args) {
		String anita = "anita lava la tina";
		String coco = "Hasta luego cocodrilo";
		//char[] cocoInv = coco.toCharArray();
		String cocoInv= "";
		String primLet = anita.substring(0, 1);
		String let = anita.substring(1);
		char ch;
		
		//primeraMayuscula()
		System.out.println("Cadena, " + anita + ", se convierte a: ");
		primLet = primLet.toUpperCase();
		String mayu = primLet + let;
		System.out.println(mayu);
		
		//invertirCadena()
		System.out.println("\n");
		System.out.println("Cadena, " + coco + ", se convierte a: ");
		//for(int i= cocoInv.length-1; i>=0; i--) {
		for(int i=0; i<coco.length(); i++) {
			//System.out.println(cocoInv[i]);
			ch= coco.charAt(i);
			cocoInv= ch+cocoInv;
		}
			System.out.println(cocoInv); 
		
		//vocalesMayusculas()
		System.out.println("\n");
		System.out.println("Cadena, " + coco + ", se convierte a: ");
		coco = coco.replace('a', 'A');
		coco = coco.replace('e', 'E');
		coco = coco.replace('i', 'I');
		coco = coco.replace('o', 'O');
		coco = coco.replace('u', 'U');
		System.out.println(coco);
		
		//FizzBuzz()
		System.out.println("\n");
		int n =100;
		System.out.println("Numeros de 1 a " + n + " son: ");
		for(int i=1; i<=n; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i+ " ");
			}		
		}
		
		//palindromo()
		System.out.println("\n");
		Scanner scanner = new Scanner(System.in);
		//String poli = "";
		System.out.println("Escribe una palabra y comprobare si es un palindromo o no...");
		String poli = scanner.nextLine();
		StringBuffer buffer = new StringBuffer(poli);
		buffer.reverse();
		String data = buffer.toString();
		
		if(poli.equals(data)) {
			System.out.println("Palabra si es palindromo.");
		}
		else {
			System.out.println("Palabra no es palindromo.");
		}
}
}
