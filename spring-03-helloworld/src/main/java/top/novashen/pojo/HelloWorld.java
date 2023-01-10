package top.novashen.pojo;

public class HelloWorld {
    private String name;

    private HelloWorld(){
        System.out.println("Created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}
