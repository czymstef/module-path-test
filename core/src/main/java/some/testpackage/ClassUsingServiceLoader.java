package some.testpackage;

import java.util.Optional;
import java.util.ServiceLoader;

public class ClassUsingServiceLoader {
    public void test() {
        ServiceLoader<TestInterface> load = ServiceLoader.load(TestInterface.class);
        Optional<TestInterface> first = load.findFirst();

        if (first.isPresent()) {
            //java -p some-module/target/classes;launcher/target/classes;core/target/classes -m launcher/some.launcherpackage.Main
            System.out.println("works as expected!");
        } else  {
            System.out.println("error!");
        }
    }
}