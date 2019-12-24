package com.nuonuo.authorization.controller;

import com.nuonuo.authorization.model.AuthUser;
import com.nuonuo.authorization.service.AuthUserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 为了与springboot命名一致，这里将ExampleResource rename为 ExampleController
 */
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleController {

/*    @Inject
    BookService bookService;*/
    @Inject
    AuthUserService authUserService;
    
    @GET
    @Path(value = "/aa")
    
    public List<AuthUser> hello() {
        System.out.println("sdfsdf");
        return authUserService.getAllUser();
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
