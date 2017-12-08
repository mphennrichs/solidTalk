package _3_LSP.historyConstraint;

public class SubClass extends SuperClass {

    private String name;
    private Integer age;

    public SubClass(String name){
        super(name);
    }

    public String getName() {
        return name;
    }

    //not expected
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }
}
