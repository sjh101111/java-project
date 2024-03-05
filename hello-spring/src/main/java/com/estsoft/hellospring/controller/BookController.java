package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class BookController {

    // GET : /books
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public String home (Model model) {
        List<BookDTO> bookList = bookRepository.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "bookManager";
    }

    @PostMapping("books")
    public String savaBook(@RequestParam("id") String id,
                           @RequestParam("name") String name,
                           @RequestParam("author") String author) {
        bookRepository.saveBook(new BookDTO(id, name, author));


        return "redirect:/books";
    }
    @GetMapping("books/{id}")
    public String detail(@PathVariable("id") String isbn, Model model) {
        log.error(isbn);


        //TODO 화면ㅇ ㅔ보여줄 book
        BookDTO bookDTO = bookRepository.getBook(isbn);
        model.addAttribute("book", bookDTO);

        return "bookDetail";
    }
}
