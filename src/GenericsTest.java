public class GenericsTest {
    public static void main(String [] args){
        Integer [] integers = {1, 2, 3};
        Double [] doubles = {2.1, 33.12, 343.123};
        Character [] characters = {'a', 'b'};

//        t1(integers);
//        t1(doubles);
//        t1(characters);

        System.out.println(t2("pear","apple"));
    }

    //泛型方法(不限制类型参数的范围)
    public static <T> void t1(T [] array){
        for(T i : array){
            System.out.printf("%s ",i);
        }
        System.out.println();
    }

    //泛型方法(限制类型参数的范围)
    public static <T extends Comparable<T>> T t2(T x, T y){
        T max;
        if(x.compareTo(y) > 0)
            max = x;
        else
            max = y;
        return max;
    }
}
