package oops;

interface sampleinterface {

    default void m1(){
        System.out.println("method default");
    }

    default int hashcode(){
        return 10;
    }
}

class Test implements sampleinterface{
    public static void main(String[] args) {
        sampleinterface t = new Test();
        t.m1();
        System.out.println(t.hashcode());
    }
}
