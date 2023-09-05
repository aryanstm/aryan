package module1;

public class StringFrequency {
public static void main(String args[])
{
	String str="welcome Friends";
	int frequency[]=new int [26];
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ') {
		frequency[str.toLowerCase().charAt(i)-'a']++;
		}
	}
	for(int i=0;i< 26;i++)
	{
		if (frequency[i]!=0) {
			int a = i + 97;
		System.out.print((char)a+" : ");
		System.out.println(frequency[i]);
		}
	}
}
}
