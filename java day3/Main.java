class A{
    void sum(){
        System.out.println("hey");
    }
}
class B extends A{
    void sum(){
        System.out.println("hello");
    }
    void sub(){
        System.out.println("hi");
    }
}
class Main{
    public static void main(String[]args){
        A a=new B();
        a.sum();
    }
}