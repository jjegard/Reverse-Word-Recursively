import java.util.Scanner;

/**
 * 
 * @author John Jegard
 *
 *The goal is to reverse a word recursively
 */

public class RecursiveWordReversal
{
	public static String reverseRecursively(String word)
	{
		//If the word is 1 character long, then the character is the last character
		//in the original word but will be the first character in the reversed word
		if(word.length() <= 1)
		{
			return word;
		}
		
		//sends the substring of everything after the first character in the word
		//back into this method and concatenates the first letter in the word
		//to then end of the string
		return reverseRecursively(word.substring(1)) + word.charAt(0);
	}
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word to be reversed recursively\n");
		String word = input.nextLine();
		input.close();
		
		word = reverseRecursively(word);
		
		System.out.println(word);
	}
}
