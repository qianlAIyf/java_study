import java.util.Stack;

public class DataStuctureTest {
    public static void main(String [] args){

        StackTest.t1();
    }
}

class StackTest{
    public static void t1(){
        Stack stack = new Stack<Integer>();
        System.out.println("stack:" + stack);
        stack.push(6);
        System.out.println("push:6");
        System.out.println("stack:" + stack);

    }
}
