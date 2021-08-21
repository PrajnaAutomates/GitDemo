package JavaImp;

public class ReverseofaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Prajna";
		String rev = "";
		
		for(int i = name.length()-1;i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
		
		System.out.println("length of name is " + name.length());
		System.out.println("Reverse of name is " + rev );
	}

}
