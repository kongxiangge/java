class Test {
    public int a;
    public static int count;
    public static void test() {
        count = 10;
        // a = 20; 静态方法内部不能访问非静态的成员变量
        System.out.println("test!");
    }
    // 静态代码块：使用static定义的代码块，一般用于初始化静态成员属性
    static {
        System.out.println("静态方法代码块....");
    }
    // 构造代码块：定义在类中的代码块（不加修饰符），也叫实例代码块，可用于初始化实例成员变量
    {
        System.out.println("普通代码块");
    }
}
public class object_static_02 {
    public static void main(String[] args) {
        // static修饰成员变量：
            // 对于实例成员变量，每次new一个对象，都会创建一个新的实例成员变量，
            // 而对于静态成员变量，仅仅会在方法区创建一份，不管是否new新的对象
            // java静态属性与类相关，和具体的实例无关，即同一个类的不同实例共用同一个静态属性
        Test t1 = new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a); // 1
        System.out.println(Test.count); // 1
        System.out.println("--------------");
        Test t2 = new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a); // 1
        System.out.println(Test.count); // 2
        // static 修饰成员方法：
            // 静态方法属于类，不属于类的对象
            // 直接调用静态方法，无需创建类的实例
            // 静态方法内部可以访问静态数据成员，并可以更改静态数据成员的值
        // 代码块：
            // 实例代码块优先于构造函数执行
            // 静态代码块仅仅只执行一次，而普通代码块在创建对象的时候调用
            // 静态代码块执行完毕后，实例代码块执行，再然后是构造函数执行
        Test.test();
        // 注意：
            // 静态方法不能直接使用非静态数据成员或调用非静态方法，非静态数据成员和方法都是与实例相关的
            // 非静态方法可以调用静态数据成员、方法
            // this和super两个关键字不能在静态上下文中使用，this和super都与实例对象相关
    }
}
