import com.javaBaics.javaBaics.testIntface;

import java.util.ServiceLoader;

public class test {
    public static void main(String[] args) {
        ServiceLoader<testIntface> t = ServiceLoader.load(testIntface.class);
        for (testIntface b:t){
            b.execut();
        }
    }
}
