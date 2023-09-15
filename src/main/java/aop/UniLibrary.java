package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public  void getBook(){
        System.out.println("We took a book from university ");
        System.out.println("__________________________________");
    }
    public void returnBook (){
        System.out.println("We returned book to unilibrary");
        System.out.println("__________________________________");
    }
    public  void getMagazine(){
        System.out.println("We took a magazine from unilibrary");
        System.out.println("__________________________________");
    }

    public void returnMagazine(){
        System.out.println("returnMagazine : We returned magazine to unilibrary");
        System.out.println("__________________________________");
    }
    public void addBook(String name, Book book){
        System.out.println("We added book to unilibrary");
        System.out.println("__________________________________");
    }
    public void addMagazine(){
        System.out.println("We added magazine to unilibrary");
        System.out.println("__________________________________");
    }
}
