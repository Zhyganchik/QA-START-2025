public class MyHome {
    public static void main(String[] args) {
        String email = "my.home.mail@gmail.com";

        long atCount = email.chars().filter(ch -> ch == '@').count();
        if (atCount != 1) {
            System.out.println("Email має містити рівно один символ '@'");
            return;
        }

        if (!email.endsWith("gmail.com")) {
            System.out.println("Email має закінчуватись на 'gmail.com'");
            return;
        }

        int lastDotIndex = email.lastIndexOf('.');
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '.' && i != lastDotIndex) {
                result.append('_');
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
