import java.util.Scanner;
class Main {
	public static void main (String[] args){
        
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
      int n= (nn/2)+1;
		int star_count = 2*n - 1;
		for (int row_no = 1; row_no <= n; row_no++) {
			for(int space = 1; space <= (row_no - 1); space++) {
				System.out.print(" ");
			}
			for(int star = 1; star<=(star_count-2*(row_no-1)); star++) {
				if(star==1 || star ==(star_count-2*(row_no-1)) )
              System.out.print("*");
              else 
                 System.out.print(" ");
			}
			System.out.print("\n");
		}
      
      for (int row_no = 2; row_no <= n; row_no++) {
			for(int space = 1; space <= (n - row_no); space++) {
				System.out.print(" ");
			}
			for(int col_no = 1; col_no <= (2*row_no -1); col_no++) {
				if(col_no == 1 || col_no== (2*row_no -1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
      
      
	}
}