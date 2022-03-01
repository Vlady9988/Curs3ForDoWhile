package curs3;

public class doWhileExample {

	public static void main(String[] args) {
		
		String[] array = {"one", "two", "three","four"};
		int j=0;
		
		boolean flag = false;
		
		while(flag==true) {
			
			System.out.println(array[j]);
			j++;
		}
		
		System.out.println("---------------");
		
		int x=0;
		do {
			System.out.println(array[x]);
			x++;
		}while(flag==true);

	}

}
