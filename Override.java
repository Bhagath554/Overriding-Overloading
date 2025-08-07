 class Parent {
     void sayHello(){
        System.out.println("Hello from Parent");
    }
    
}

class Child extends Parent {
   @Override
     void sayHello(){
        System.out.println("Hello from Parent");
    }
}
class Override{
    public static void main(String[]args){
        Child p = new Child();
        p.sayHello();
    }
}
