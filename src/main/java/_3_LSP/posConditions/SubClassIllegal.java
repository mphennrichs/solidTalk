package _3_LSP.posConditions;

public class SubClass extends SuperClass {

    @Override
    public String sayHelloSomeone(String name) {
        //no more "hello"?
        //what if someone wants a "hello"????
        return "hi " + name;
    }
}
