/*
 * Класс для программы Name generator из списка нубских программ.
 */
package DimansApps;

import java.util.Random;

class NameGenerator {
    static String generateName() {
    String[] firstName = {"Александр", "Алексей", "Борис", "Владимир", "Виталий", "Геннадий", "Дмитрий", "Евгений",
        "Зорро", "Николай"};
    String[] secondName = {"Иванов","Петров","Сидоров","Кошкин","Мышкин","Путин","Ли"};

    Random rand = new Random();
    return firstName[rand.nextInt(10)]+" "+secondName[rand.nextInt(7)];
    }
}