package JavaImp;

public class FindDuplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Prajnan";
		char dup[] = name.toCharArray();  
		
		System.out.println("duplicates are " );
		for(int i = 0;i<name.length();i++)
		{
			for(int j =i+1;j<name.length();j++)
			{
			   if (dup[i]==dup[j])
			   {
				   System.out.println(dup[j]);
				   break;
			   }
			

				   
			}
		}
		
	}

}
