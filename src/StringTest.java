import java.util.Date;

public class StringTest {
    public static void main(String [] args){
        char [] charArray = {'a', 'b'};
        String s1 = new String(charArray);
        System.out.println(s1);
        System.out.println("s1的长度：" + s1.length());
        System.out.println(s1.concat("c"));
        System.out.println("---------------------------------");

        StringBuffer stringBuffer = new StringBuffer("AB");
        stringBuffer.append('C');
        System.out.println(stringBuffer);
    }
}
