package aufgabe_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPattern {

    public static void main(String[] args) {
        String text = "Kontaktiere uns unter support@example.com oder info@example.org.";
//        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        String regex = "[A-Za-z.]+@[A-Za-z.]+\\.[A-Za-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Gefundene E-Mail: " + matcher.group());
        }
    	
//    	String testString = "Hallo Welt, 'wie geht es' dir?";
//    	System.out.println(Pattern.matches("0+", ""));
//    	System.out.println("'Hallo Welt'".matches(testString));
    }
}
