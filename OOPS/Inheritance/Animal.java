class animal {
    void eat(){
        System.out.println("All animal eat");
    } 
}
class dog extends animal{
    void bark(){
        System.out.println("bhoww bhoww bhoww");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meow meow");

    }
}
public class Animal{
    public static void main(String[] args) {
        cat c=new cat();

        c.eat();
        c.meow();
        
    }
}

