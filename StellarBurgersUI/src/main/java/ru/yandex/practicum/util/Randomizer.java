package ru.yandex.practicum.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.github.javafaker.Faker;
import static ru.yandex.practicum.util.Menu.*;

public class Randomizer {

    //    Можно выбрать только один вид булок.
    public static String getRandomBun(String[] BUNS_ARRAY) {
        int random = new Random().nextInt(BUNS_ARRAY.length);
        return BUNS_ARRAY[random];
    }

    public static List<String> getRandomListOfSouses(String[] SOUSES_ARRAY) {
        List<String> randomListOfSouses = new ArrayList<>();
        int randomQuantitiesOfSouse = new Random().nextInt(SOUSES_LIMIT_PER_ORDER + 1);
        for(int i = 0; i < randomQuantitiesOfSouse; i++) {
            int randomSouseType = new Random().nextInt(SOUSES_ARRAY.length);
            randomListOfSouses.add(SOUSES_ARRAY[randomSouseType]);
        }
        return randomListOfSouses;
    }

    public static List<String> getRandomListOfToppings(String[] TOPPINGS_ARRAY) {
        List<String> randomListOfToppings = new ArrayList<>();
        int randomQuantitiesOfToppings = new Random().nextInt(TOPPINGS_LIMIT_PER_ORDER + 1);
        for(int i = 0; i < randomQuantitiesOfToppings; i++) {
            int randomToppingsType = new Random().nextInt(TOPPINGS_ARRAY.length);
            randomListOfToppings.add(TOPPINGS_ARRAY[randomToppingsType]);
        }
        return randomListOfToppings;
    }

    public static String getRandomName() {
        String randomName = new Faker().name().firstName();
        return randomName;
    }

    public static String getRandomEmail() {
        Faker faker = new Faker();
        String randomEmail = faker.name().lastName().toLowerCase() +
                             faker.number().digits(4) +
                             "@testmail.ru";
        return randomEmail;
    }

    public static String getRandomPassword(int length) {
        Random random = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String combination = upper + lower + digits;
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            password[i] = combination.charAt(random.nextInt(combination.length()));
        }
        return new String(password);
    }

}
