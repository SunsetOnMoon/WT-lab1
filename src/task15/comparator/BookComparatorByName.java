package task15.comparator;

import task15.model.Book;

import java.util.Comparator;

public class BookComparatorByName implements Comparator<Book> {
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
