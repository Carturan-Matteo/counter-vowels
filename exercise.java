import java.util.Scanner;
public class exercise{
	public static void main (String[] args){

		int a = 0,e = 0,i = 0,o = 0,u = 0;		
		System.out.println("Inserisci una parola");
		String sr = new Scanner(System.in).nextLine();
		System.out.println();
        
		for(int y = 0; y < sr.length(); y++)
		{
			switch(sr.charAt(y))
			{
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				default: 
					break;
			}
		}

		System.out.println(("a = "+ a)+ ("\ne = " +e)+("\ni = "+ i)+("\no = "+ o)+("\nu = "+ u));
		
	}
}