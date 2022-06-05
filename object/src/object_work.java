class Calculator {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int sum() {
        return (num1+num2);
    }
    public int sub() {
        return (num1-num2);
    }
    public int mul() {
        return (num1*num2);
    }
    public int dev() {
        return (num1/num2);
    }
}
class Persons {
    private String name;
    private int age;
    public Persons(String name, int age) {
        this.name=name;
        this.age=age;
        System.out.println("person!");
    }
    public Persons() {
        System.out.println("person！！");
    }
}
class Swap {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void swapNum() {
        int tmp = this.a;
        this.a = this.b;
        this.b = tmp;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
public class object_work {
    public static void main(String[] args) {
        // 编写类Calculator，两个属性num1，num2两个数据，实现加减乘除
        Calculator c1 = new Calculator();
        c1.setNum1(25);
        c1.setNum2(20);
        System.out.println(c1.sum());
        System.out.println(c1.sub());
        System.out.println(c1.mul());
        System.out.println(c1.dev());
        // 编写含有不同构造方法的类，并通过构造方法实例化对象
        Persons person1 = new Persons("向红", 20);
        Persons person2 = new Persons();
        // 类中实现交换两个变量的值
        Swap s1 = new Swap();
        s1.setA(5);
        s1.setB(10);
        s1.swapNum();
        System.out.println(s1.getA());
        System.out.println(s1.getB());
    }
}
