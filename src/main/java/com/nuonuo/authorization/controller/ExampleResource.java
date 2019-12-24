package com.nuonuo.authorization.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 为了与springboot命名一致，这里将ExampleResource rename为 ExampleController
 */
@Path("/example")
public class ExampleResource {

/*    @Inject
    BookService bookService;*/
    
    @GET
    @Path(value = "/aa")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("sdfsdf");
        return "54454hello";
    }
    
/*    @GET
    @Path(value = "/addBook")
    @Produces(MediaType.TEXT_PLAIN)
    public String addBook() {
        bookService.addBook();
        return "success";
    }
    
    @GET
    @Path(value = "/addBookTwice")
    @Produces(MediaType.TEXT_PLAIN)
    public String addBookTwice() {
        bookService.addBookTwice();
        
        return "fail";
    }
    @GET
    @Path(value = "/getBooks")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        List<Book> list = bookService.getBooks();
    
        return list;
    }*/
}
