package OOPS;

class A{
    A(){
        System.out.println("in constructor");
    }
    void fun(){
        System.out.println("In parent fun");
    }
    public static void main(String[] args){
        System.out.println("In class a");
        System.out.println(args);
    }
}
class B extends A{
    public static void main(String[] args){
        System.out.println("In class b");
        B obj = new B();
        obj.fun();
        A.main(new String[] {"kartikya","ruhani"});

    }
}

