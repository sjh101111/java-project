package com.estsoft.hellospring.repository;

import com.estsoft.hellospring.controller.BookDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class BookRepository {
    private Map<String, BookDTO> bookMap;

    public BookRepository() {
        bookMap = new HashMap<>();
        BookDTO bookDTO = new BookDTO(
                "123","오늘도 개발자가 안된다고 말했다", "기획자");
        bookMap.put(bookDTO.getId(), bookDTO);
    }

    public List<BookDTO> getAllBooks() {
        List<BookDTO> bookList = new ArrayList<>();
        for (Map.Entry<String, BookDTO> book : bookMap.entrySet()) {
            bookList.add(book.getValue());
        }
        return bookList ;
    }

    public void saveBook(BookDTO book) {
        bookMap.put(book.getId(),book);
    }

    public BookDTO getBook(String id) {
       return bookMap.getOrDefault(id, new BookDTO());
    }
}
