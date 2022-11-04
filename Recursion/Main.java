public class Main {
    public static void main(String[] args) {

        System.out.println("Recursion starts:_basic::calling functions");

        message();
    }
    static void message(){
        System.out.println("I am message:1");
        message2();
    }
    static void message2(){
        System.out.println("I am message:2");
        message3();
    }
    static void message3(){
        System.out.println("I am message:3");
        message4();
    }

    //function here gets changed, so it's a special case, that will work as
    static void message4(){
        System.out.println("I am message:4");

    }
}