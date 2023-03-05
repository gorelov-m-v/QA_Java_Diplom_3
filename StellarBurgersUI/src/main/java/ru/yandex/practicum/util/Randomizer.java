package ru.yandex.practicum.util;

import com.github.javafaker.Faker;
import java.util.Random;

public class Randomizer {

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
