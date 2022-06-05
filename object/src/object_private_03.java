class Student {
    private String name; // 限定只能在类中访问
    public int age;
    // 提供一个公开的接口
    // 设置名字的接口
    public void setName(String MyName) {
        this.name = MyName;
    }
    // 得到名字的接口
    public String getName() {
        return name;
    }
    // 设置年龄
    public void setAge(int age) {
        // age = age;--由于局部变量优先，所以意思是自己给自己赋值,没有赋值属性
        this.age = age;
    }
    public void fun() {
        System.out.println("fun");
    }
    public void show() {
        System.out.println("名字是：" + this.name + "；年龄是" + this.age);
    }
    // 重新实现了一下object类的toString()方法：
    @Override  // 这是注解，注解说明这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class object_private_03 {
    public static void main(String[] args) {
        // 封装：类中的成员变量用private修饰，限定访问权限
            // 如果成员变量都是公开的，则类的实现者和类的调用者可能无法实现成员变量名称统一
            // 因此将类中的变量写为私有的，通过接口getter和setter方法来设置类中的变量
            // 如果类的实现者修改了字段的名字，类的调用者不需要做出任何修改（类的调用者根本访问不到name这样的字段）
            // 不是所有的字段都一定要提供setter和getter方法，而是根据实际情况提供哪种方法
        // this关键字：表示当前实例对象的引用，编程规范强调加上this
        // 规范上把所有的成员变量都封装为private，将所有的接口都设为public，快捷键fn+alt+INSERT可以快速生成接口
            // 一般类提供的public方法都比较稳定
        Student s1 = new Student();
        s1.setName("孔祥鸽");
        s1.setAge(18);
        // toString方法：
            // 如果没有toString方法，则print(s1),则输出的是s1+地址的哈希值
            // println是在底层实现了print，实现的是重写的object.toString方法
        System.out.println(s1);
    }
}
