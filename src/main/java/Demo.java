
class GrandParent{
    public void show(){
        System.out.println("grand parent class");
    }

    public void msg(){
        System.out.println("grand parent class");
    }
}

class Parent extends GrandParent{
    public void show(){
        System.out.println("parent class");
    }
}

class Child extends Parent{

    public Child(){
        super.show();
        super.msg();
    }
}

public class Demo {
    public static void main(String[] args) {

        Child child = new Child();
    }
}