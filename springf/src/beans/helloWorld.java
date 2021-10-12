package beans;

public class helloWorld {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello: "+name);
    }
}
