class S {
    int num=20;
    public void display() {
        System.out.println("super class method");
    }
}

public class ThisUse extends S{
    int num;
    public ThisUse(int num) {
        this.num=num;
    }
    public void display() {
        System.out.println("display method");
    }
    public void show() {
        this.display();
        display();
        System.out.println(this.num);
        System.out.println(num);
    }
    public static void main(String[]args) {
        ThisUse o=new ThisUse(10);
        o.show();
    }
}

/*

OUTPUT:
display method
display method
10
10

*/