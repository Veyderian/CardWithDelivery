package ru.netology.cardWithDelivery.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static com.sun.java.util.jar.pack.Package.Version.of;

public class DataGenerator {


    public class DataGenerator {
        private DataGenerator() {
        }
        private static Random random = new Random();
//        private String generateDate(int addDays, String pattern) {
//            return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
//        }

        public static String generateDate(int shift) {
            // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
            // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты
//            int date = generateDate(int shift);//возвращает объект, который представляет дату с определенными годом, месяцем и днем
            LocalDate date = LocalDate.of(2019, 2, 22);
            int shift = LocalDate of(int m);
            int getYear(); // возвращает год даты

            int getMonthValue(); // возвращает месяц

            int getDayOfMonth(); // возвращает день месяца (значение от 1 до 31)

            return date;
        }

        public static String generateCity(String locale) {
            // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
            // с помощью Faker, либо используя массив валидных городов и класс Random
            String[] cities = new String[]{"Москва", "Краснодар", "Санкт-Петербург", "Воронеж", "Ставрополь", "Владимир"};
            return cities[random.nextInt(cities.length)];
//            String city;
//            return city;
        }
//        public static String generateCity() {
//            String[] cities = new String[]{"Москва", "Краснодар", "Санкт-Петербург", "Воронеж", "Ставрополь", "Владимир"};
//            return cities[random.nextInt(cities.length)];
//        }

        public static String generateName(String locale) {
            // TODO: добавить логику для объявления переменной name и задания её значения, для генерации можно
            // использовать Faker
            Faker faker = new Faker(new generateName(locale));
//            return new RequestInfo(generateCity(),
            faker.name().lastName() + " " + faker.name().firstName(),

            return name;
        }
//

        public static String generatePhone(String locale) {
            // TODO: добавить логику для объявления переменной phone и задания её значения, для генерации можно
            // использовать Faker
            Faker faker = new Faker(generatePhone(locale);
            Srting phone = faker.phoneNumber().phoneNumber();
            return phone;
        }

        public static class Registration {
            private Registration() {
            }

            public static UserInfo generateUser(String locale) {
                // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
                // generateName(locale), generatePhone(locale)
                return user;
            }
        }

        @Value
        public static class UserInfo {
            String city;
            String name;
            String phone;
        }
    }
}


