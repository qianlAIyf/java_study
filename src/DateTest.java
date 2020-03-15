import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {
    public static void main(String [] args){
        Date date = new Date();
//        System.out.println("current time:" + date.toString());

        //使用printf格式化时间
//        System.out.printf("current time:%tc%n",date);
//        使用 < 表示先前被格式化的参数还要使用
//        System.out.printf("%s %tB %<te,%<tY %<tT" , "current time:", date);
//        使用索引来格式化：索引必须紧跟在%之后，而且必须以$结束
//        System.out.printf("%1$s %2$tB %2$te,%2$tY","current time:",date);

        //使用SimpleDateFormat类来格式化
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("formate time:" + simpleDateFormat.format(date));
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//        String input = "2020-3-8" ;
//        System.out.print(input + " parsed as ");
//        Date t;
//        try {
//            t = simpleDateFormat1.parse(input);
//            System.out.println(t);
//        }catch (ParseException e){
//            System.out.println("Unparseable using " + simpleDateFormat1);
//        }

        //定义日期格式转换符，使日期生成新字符串
        String timeString = String.format(Locale.US,"英文月份简称：%tb",date);
        System.out.printf(timeString);
    }
}
