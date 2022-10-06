package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappDatajpaApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappDatajpaApplication.class, args);
	}
    @Autowired
    IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
		Book book=new Book("Twilight",1,"Andy Rose","Novel",1000);
		Book book1=new Book("Ring",2,"peter Jaction","Fiction",5000);
		bookService.addBook(book);
		bookService.addBook(book1);
		
////		bookService.getAll().forEach(System.out::println);
//		
//		Book nbook=bookService.getById(100);
//		System.out.println(nbook);
//		
//		nbook.setAuthor("kathy sierra");
//		nbook.setPrice(1200);
//		bookService.updateBook(nbook);
		
		bookService.getByAuthor("peter Jaction").forEach(System.out::println);
		bookService.getByCategory("Novel").forEach(System.out::println);
		bookService.getByPriceLessThan(7000).forEach(System.out::println);
	}

}
