import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 说明注释
 * @author 陈乾
 */

public class AnnotationTest {
    /**
     *
     * @param x
     * @return
     */
    public double square(double x){return x * x;}

    /**
     * @return doubleNumber
     * @throws IOException
     */
    public double getNumber() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String string = bufferedReader.readLine();
        return (new Double(string)).doubleValue();
    }
    public static void main(String[] args) throws IOException{
        AnnotationTest annotation = new AnnotationTest();
        double x = annotation.getNumber();//input double digital.
        double xx = annotation.square(x);
        System.out.println("x^2 = " + xx);
    }
}

