package kg.megacom.lesson33_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> favoriteBooks = new ArrayList<>(5);
        favoriteBooks.add("The Da Vinci Code");
        favoriteBooks.add("When the mountains fall");
        favoriteBooks.add("Genghis Khan's white cloud");
        favoriteBooks.add("Alice in Wonderland");
        favoriteBooks.add("Java. Eckel's philosophy");

        System.out.println("-------------------Выводим на экран");
        favoriteBooks.forEach(System.out::println);

        System.out.println("-------------------После удаляем последний элемент");

        favoriteBooks.remove(favoriteBooks.size() - 1);

        favoriteBooks.forEach(System.out::println);

        System.out.println("-------------------После удаления, меняем последний элемент на удаленную");

        favoriteBooks.set(favoriteBooks.size()-1, "Java. Eckel's philosophy");

        favoriteBooks.forEach(System.out::println);

        System.out.println("-------------------Выводим последний элемент из FavoriteBooks");

        System.out.println(favoriteBooks.get(favoriteBooks.size() - 1));

        favoriteBooks.clear();

        System.out.println("-------------------После очищения");
        favoriteBooks.forEach(System.out::println);
        System.out.println("-------------------Вы использовали favoriteBooks.clear();");
        System.out.println("-------------------Добавляем 3 книги, которые нужно прочесть");

        favoriteBooks.add("Fantastic Beasts and Where to Find Them");
        favoriteBooks.add("Fantastic Beasts: The Crimes of Grindelwald");
        favoriteBooks.add("Fantastic Beasts and Where to Find Them part 3");
        favoriteBooks.forEach(System.out::println);
    }
}
