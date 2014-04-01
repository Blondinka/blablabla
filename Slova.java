package slova;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Slova{
	public static void main(String[] args){
		String input="A matcher may be reset or explicitly by invoking its reset() method,";
		System.out.println(input); 
		String[] Array = input.split("[\\s,.()]");
		int k=Array.length;
		Pattern pattern = Pattern.compile("^[aeiou]", Pattern.CASE_INSENSITIVE);
		for (int i=0; i<k; i++){
			Matcher matcher = pattern.matcher(Array[i]);
			if (matcher.find()){
				Arrays.sort(Array);
				System.out.print(Array[i]+" ");
			}
		}
	}
}