 class Parent {
protected void protect(){
    System.out.println("I'M INSIDE Protected Method");
}
}

class Child extends Parent {
private void privateMethod(){
    System.out.println("I'M INSIDE Private Method");
}
}

class Access{
    public static void main(String[] args){
        Child kid = new Child();

        System.out.println("Hello World");
    }
}

