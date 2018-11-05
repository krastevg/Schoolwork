import java.util.regex.*;

public class RegexLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String longString = " I fucking friskiy fuRR hate  you alasadadad1Duck 14422311231133 CA  133 iwanafuken@abv.bg ";
		String strangeString = "}}} }}}} }} {{{  ** **** ### ";
		String phoneNumbers="+3598678911 0889323232  ";
		
		regexChecker("\\s[A-Za-z]{2,20}\\s",longString);
		System.out.println("----------------------------");
		regexChecker("\\d{2,}",longString);
		System.out.println("----------------------------");
		regexChecker("\\s\\d{3}\\s",longString);
		System.out.println("----------------------------");
		regexChecker("f[a-z]{1,}|C[A-Z]",longString);
		System.out.println("----------------------------");
		regexChecker("(\\}+)|(\\{+)",strangeString);
		System.out.println("----------------------------");
		regexChecker("\\W{2,}",strangeString);
		System.out.println("----------------------------");
		regexChecker("[A-Za-z0-9.-_]+@[A-Za-z0-9.-_]+\\.[A-Za-z]{2,4}",longString);
		System.out.println("----------------------------");
		regexChecker("(\\+?[0-9]){1,}|\\d{1,}",phoneNumbers);
		System.out.println("----------------------------");
	    regexReplace(longString,"\\s+","!");
		



	}

	public static void regexChecker(String theRegex, String chekedString) {
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(chekedString);

		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Starts at: " + regexMatcher.start());
			System.out.println("Ends at: " + regexMatcher.end());
		}
	}
	
	
	public static void regexReplace(String str2replace,String thing2beReplaced,String thing2ReplaceWith)
	{
		Pattern replace=Pattern.compile(thing2beReplaced);
		Matcher regexMatcher=replace.matcher(str2replace.trim());
		System.out.println(regexMatcher.replaceAll(thing2ReplaceWith));
	}
}


