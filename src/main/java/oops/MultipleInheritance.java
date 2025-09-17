package oops;

interface MultipleInheritance {

    default void method1(){
        System.out.println("interface1");
    }
}

interface multipleinheritance2{

    default void method2(){
        System.out.println("interface2");
    }

    static void method3(){
        System.out.println("static method");
    }

}

class Test1 implements MultipleInheritance, multipleinheritance2{
    public static void main(String[] args) {

        multipleinheritance2.method3();
        multipleinheritance2 m2 = new multipleinheritance2() { };
        m2.method2();

    }
}

