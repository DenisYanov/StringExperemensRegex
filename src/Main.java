import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        int totalIncome=0;

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            totalIncome +=Integer.parseInt(text.substring(matcher.start(), matcher.end()));
        }

        System.out.println("Total income:" + totalIncome+ " rub.");
    }
}