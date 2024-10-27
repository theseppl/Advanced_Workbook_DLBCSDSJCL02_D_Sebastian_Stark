package aufgabe_4;

public class MainString {
    public static void main(String[] args) {
        String text = "Kontaktiere uns unter support@example.com oder info@example.org.";
        
        // contains() Methode
        if (text.contains("support@example.com")) {
            System.out.println("Die E-Mail-Adresse support@example.com ist im Text enthalten.");
        }

        // indexOf() Methode
        int index = text.indexOf("info@example.org");
        if (index != -1) {
            System.out.println("Die E-Mail-Adresse info@example.org beginnt bei Index: " + index);
        }

        // substring() Methode
        String email = text.substring(text.indexOf("support@example.com"), text.indexOf(" oder"));
        System.out.println("Extrahierte E-Mail-Adresse: " + email);
    }
}

