public class ExtendsTest {
    public static void main(String [] args){
        SubClass subClass = new SubClass();
        SubClass subClass1 = new SubClass(10);
        SuperClass superClass = new SuperClass();
        SuperClass superClass1 = new SuperClass(10);
    }
}

class SuperClass{
    private int n;
    public SuperClass(){
        System.out.println("SuperClass()");
        this.n = n;
    }
    public SuperClass(int n){
        System.out.println("SuperClass(int n):" + n);
        this.n = n;
    }
}

class SubClass extends SuperClass{
    private int n;
    public SubClass(){
        System.out.println("SubClass()");
        this.n = n;
    }
    public SubClass(int n){
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}