import java.util.Scanner;

class assignment{
	
	public static <T> void print(T input){
		System.out.println(input);
	}

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		String user_input = s.nextLine();
		print(user_input);
	}	
}