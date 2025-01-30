package com.example.BookStore.service;

import com.example.BookStore.model.Book;
import com.example.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(UUID id){
        return bookRepository.findById(id);
    }

    public Book createBook( Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(UUID id){
        if (bookRepository.existsById(id)){
            bookRepository.deleteById(id);
        } else {
            throw new RuntimeException("Book not found with id: " + id);
        }
    }
}
