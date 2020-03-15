import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String [] args){
//        String content = "I am a software coder!";
//        String pattern = ".*am.*";
//
//        boolean isMatch = Pattern.matches(pattern,content);
//        System.out.printf("match?"+isMatch);
//

        String content = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(content);
        if(matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
