/**
 * 访问限定修饰符：
 *      public： 公有的
 *      private：私有的
 *      protected：受保护的
 *      什么都不写：默认权限--包访问权限
 */
class Person {
    // 字段 --> 成员变量
    public String name;
    public int age;
    public char ch;
    boolean flag;
    // 静态成员变量
    public static int num;
    // 方法 --> 行为
    // 构造方法：
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("person!!");
    }
    public Person() {
        System.out.println("person!");
    }
    // 实例成员方法：
    public void eat() {
        System.out.println("eat!");
    }
    public void sleep() {
        System.out.println("sleep!");
    }
    public void show() {
        System.out.println("我叫" + name + ",今年" + age + "岁了");
    }
    public static void fun() {
        System.out.println("static::fun()");
    }
}
public class object_01 {
    public static void main(String[] args) {
        // C语言是面向过程的，关注的是过程，分析出问题的步骤，通过函数调用逐步解决问题
        // java是基于面向对象的，关注的是对象，将一件事拆分成不同的对象，靠对象之间的交互完成
        // 面向过程注重的是过程，在整个过程中所涉及的行为，就是功能
        // 面向对象注重的是对象，参与过程中所涉及的主体，通过逻辑将一个个功能实现连接起来
        // 类：一类对象的统称；对象：类的具体化的实例。即类相当于一个模板，而对象是由模板产生的样本。
        // 一个类可以产生无数的对象
        // 声明一个类就是创建一个新的数据类型，而类在java中属于引用类型
        // 声明类：class 类名 {成员变量; 成员方法}
            // 成员变量，定义在方法的外面、类的里面，也叫作实例成员变量
        // 实例化对象：
        Person person = new Person();
            // 对象在堆上或方法区被创建，对象名在栈上被创建，指向堆上的对象
        // 访问对象中的实例成员变量：对象的引用.成员变量
            // 对象中的成员变量属于对象这个引用类型，存储在堆中
            // 实例成员变量没有被初始化时，引用类型（string、array等）默认为null，数字类型默认为0，char默认为'\u0000',boolean默认为false
        System.out.println(person.name); // null
        System.out.println(person.age);  // 0
        System.out.println(person.ch);
        System.out.println(person.flag); // false
        // 访问对象中的静态成员变量：类名.静态成员变量
            // 静态成员变量属于类，储存在方法区
            // 静态成员变量没有被初始化时，默认为0
        System.out.println(Person.num);
        // 访问对象中的实例成员方法：对象名.方法名
            // 如果实例成员方法中含有变量，这个变量属于局部变量，储存在栈中
            // 该方法属于对象，储存在堆上
        person.eat();
        person.sleep();
        // 访问静态成员方法：类名.方法名
        Person.fun();
        // 调用show
        person.name = "孔祥鸽";
        person.age = 18;
        person.show();
        // 创建对象的过程：
            // 1.为对象分配内存    2.调用合适的构造方法
            // 构造方法：方法名与类名相同，没有返回值类型声明，其作用就是构造对象
                // 构造方法可能不止一个
                // 没有提供构造方法时，编译器会自动提供一个没有参数的构造方法
                // 在写构造方法后，编译器就不再提供构造方法
                // 在创建对象new的时候，就会根据参数调用合适的构造方法
        // 调用不同的构造方法实例化对象：
        Person person1 = new Person ("孔祥鸽", 18);
        //Person person2 = new Person("孔祥鸽"); --找不到合适的构造器

        // this表示当前对象的引用，而不是当前对象,借助this访问当前对象
            // 只有构造方法执行完，才产生了当前对象，而在构造方法的内部，就已经使用了this关键字
            // 所以this表示的是第一步完成之后的内容，表示当前对象的引用
            // 用法：this.()--调用构造方法； this.data--调用当前对象的属性； this.func()--调用当前对象的方法
            // 注意：调用构造方法时，只能在类中其他构造方法里面写，且只能调用一次 --对this的调用必须是构造器中的第一个语句
        // 匿名对象：没有引用的对象，只能在创建对象时使用
            // 如果一个对象只是使用一次，后面不再使用，则考虑使用匿名对象
    }
}
