package ru.dmitrikonnov.springAndDucks.programLauncher;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dmitrikonnov.springAndDucks.ducks.Duck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DucksTestLauncher {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Duck duck1 = context.getBean("duck", Duck.class);
        Duck duck2 = context.getBean("duck2", Duck.class);
        Duck duck3 = context.getBean("mallardDuck", Duck.class);
        Duck duck4 = context.getBean("duck3", Duck.class);
        Duck duck5 = context.getBean("protoDuck", Duck.class);
        Duck duck6 = context.getBean("protoDuck", Duck.class);
        Duck duck7 = context.getBean("protoDuck", Duck.class);

        context.close();

        List<Duck> duckList = new ArrayList<>(Arrays.asList(duck1, duck2, duck3, duck4, duck5, duck6, duck7));
        duckList.forEach((duck)->{
            duck.performFly();
            System.out.println(duck.performQuack());
            duck.swim();
            System.out.println();});
    }
}
