package upc.pe.edu.franpar;

import com.orm.SugarRecord;

public class Book extends SugarRecord<Book> {
    String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
