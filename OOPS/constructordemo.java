package OOPS;

public class constructordemo {
    int x;
    constructordemo(){
        this(20,10);
        int x = 20;
        this.x = x;
        int y = 10;
        System.out.println(x);
        System.out.println(y);
    }
    constructordemo(int x, int y){
        this.fun();
        System.out.println("In parametrised constructor");
    }

    void fun(){
        System.out.println("This is fun method");
    }
    public static void main(String[] args){

    }
}
