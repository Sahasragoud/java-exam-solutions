import java.lang.reflect.Method;

class Test {
    public void show() {
        System.out.println("Reflection Example");
    }
}

class import java.lang.reflect.Method;

class Test {
    public void show() {
        System.out.println("Reflection Example");
    }
}

class ReflectionDemo {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("Test");

        Object obj = c.getDeclaredConstructor().newInstance();

        Method[] methods = c.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Method m = c.getDeclaredMethod("show");
        m.invoke(obj);
    }
} {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("Test");

        Object obj = c.getDeclaredConstructor().newInstance();

        Method[] methods = c.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Method m = c.getDeclaredMethod("show");
        m.invoke(obj);
    }
}
