package atividadeArray;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 0;
		
		do {
			
			System.out.println(Math.round( Math.random()*r));
			r++;
		}while(r <= 20);
		
		System.out.println("Quantidade: "+r);
	}

}
