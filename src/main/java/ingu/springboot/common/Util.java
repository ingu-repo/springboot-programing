package ingu.springboot.common;

import com.github.javafaker.Faker;

public class Util {
    private static Faker faker = Faker.instance();

    public static Faker faker() {
        return faker;
    }
    public static void sleepSeconds(long seconds){
        try {
//            System.out.println("sleeping " + seconds);
//            Thread.sleep(Duration.ofSeconds(seconds));
            Thread.sleep (seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
