package _3_LSP.historyConstraint;

public abstract class SuperClass {

    private String name;
    private Integer age;

    public SuperClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }
}
