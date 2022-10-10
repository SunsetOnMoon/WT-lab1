package task15.comparator;

import task15.model.Book;

import java.util.Comparator;

public class BookComparatorByNameAndAuthor implements Comparator<Book> {
    @Override
    public int compare(Book obj1, Book obj2) {
        int result = obj1.getTitle().compareTo(obj2.getTitle());
        if (result == 0) {
            result = obj1.getAuthor().compareTo(obj2.getAuthor());
        }
        return result;
    }
}
