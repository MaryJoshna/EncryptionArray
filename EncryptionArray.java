import java.util.Scanner;
class EncryptionArray
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
			System.out.println(" Enter The plain Text : " );
			String text = input.nextLine();
			
			System.out.print(" Enter array  length : ");
			int lenProKey = input.nextInt();
		
			int [] ProKey = new int[lenProKey];
			
			System.out.println("Enter array  values ");
			
			for (int i = 0 ; i < lenProKey ; i++)
			{
				ProKey[i] = input.nextInt();
			}
		
			System.out.print(" Your ProArray is : [ " );
			for (int i = 0 ; i < lenProKey ; i++)
			{
				if ( i == lenProKey - 1)
					System.out.print(ProKey[i]);
				else
					System.out.print(ProKey[i] + ", ");
			}
			System.out.print( " ]");
			
			int max = ProKey[0];
			int maxid = 0;
			int temp = 0;
			
			for(int i = 0; i <= ProKey.length -1 ; i ++)
			{
				if(ProKey[i] > max)
				{
					max = ProKey[i];
					maxid = i;
				}
			}
			
			int sum = 0;
			for(int i = 0 ; i < ProKey.length ; i ++)
				{
					sum += ProKey[i] ;     
				}
			System.out.println("\n Sum of this array is : " + sum);
			
			int Key = (max + sum) % 26;
			System.out.println(" The Key Value is : " + Key);
			
			System.out.println(" The plain Text is : " + text);
			System.out.print(" The Cipher Text is : ");
			
			char [] charts = text.toCharArray();
			
			int i;
			for( i = 0; i <= charts.length-1 ; i++)
			{
				charts[i] += Key;
				System.out.print(charts[i] );	
			}
	}
}