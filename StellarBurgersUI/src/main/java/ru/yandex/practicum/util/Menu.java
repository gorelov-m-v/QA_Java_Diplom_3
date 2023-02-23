package ru.yandex.practicum.util;

public class Menu {

    public static final String[] BUNS_ARRAY = {"Флюоресцентная булка R2-D3", "Краторная булка N-200i"};

    public static final String[] SOUSES_ARRAY = {"Соус Spicy-X", "Соус фирменный Space Sauce",
                                     "Соус традиционный галактический", "Соус с шипами Антарианского плоскоходца"};

    public static final String[] TOPPINGS_ARRAY = {"Мясо бессмертных моллюсков Protostomia", "Говяжий метеорит (отбивная)",
                                       "Биокотлета из марсианской Магнолии", "Филе Люминесцентного тетраодонтимформа",
                                       "Хрустящие минеральные кольца", "Плоды Фалленианского дерева",
                                       "Кристаллы марсианских альфа-сахаридов", "Мини-салат Экзо-Плантаго",
                                       "Сыр с астероидной плесенью"};

//    Ввел ограничения для конструктора, дабы не затягивать каждый отдельный тест.
//    Оставил возможность взять каждый ингредиент.
//    Булка должна быть всегда.
    public static final int SOUSES_LIMIT_PER_ORDER = 4;
    public static final int TOPPINGS_LIMIT_PER_ORDER = 9;
}
