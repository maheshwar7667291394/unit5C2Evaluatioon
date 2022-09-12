package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	List<Book> addbooka=new ArrayList<>();
	
	void addBook(Book book)throws BookException{
		if(addbooka.contains(book)) {
			BookException b=new BookException("book already present in llist");
		}
		else {
			addbooka.add(book);
		}
	}
	public List<Book> viewAllBooks()throws BookException{
		
		if(addbooka.size()==0) {
			BookException b=new BookException("No book present in llist");
		}
		Collections.sort(addbooka,(s1,s2)->s1.getBookName().compareTo(s2.getBookName())>1?+1:-1);
		
			return addbooka;
	}
	
	public List<String> viewBooksByAuthor(String author)throws BookException{
		List<String> auth=new ArrayList<>();
		for(Book item:addbooka) {
			if(item.getAuthor().compareTo(author)==0) {
				auth.add(author);
			}
		}
		if(auth.size()==0) {
			BookException b=new BookException("No any book writem by "+author+" preset");
			throw b;
		}
		
		
		return auth;
	}
	
	public Book getBookByISBN(int isbn)throws BookException{
		Book book=null;
		for(Book item:addbooka) {
			if(item.getIsbn()==isbn) {

				return item;
			}
			
		}
		BookException b=new BookException("book not fount");
		throw b;

	}
	
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 
		 Library lab=new Library();
		 while(true) {
			 System.out.println("Enter the isbn no");
			 int in=input.nextInt();
			 
			 System.out.println("Enter the book name");
			 String name=input.next();
			 
			 System.out.println("Enter the author name");
			 String aut=input.next();
			 Book book=new Book(in, name, aut);
			 try {
				lab.addBook(book);
			} catch (BookException e) {
			  System.out.println(e.getMessage());
			}
			 
			 System.out.println("want add more yes/no");
			 String s=input.next();
			 if(s.equalsIgnoreCase("no")) {
				 break;
			 }
			 
		 }
		 
		 
			try {
				List<Book> bk=lab.viewAllBooks();
				for(Book item:bk) {
					System.out.println(item);
				}
			} catch (BookException e) {
				
				e.printStackTrace();
			}
			
			
			
			System.out.println();
			
			System.out.println("want serch book by anuthor yes/no");
			String au=input.next();
			if(au.equalsIgnoreCase("yes")) {
				System.out.println("Enter author naem");
				String name=input.next();
				try {
					List<String> lbk=lab.viewBooksByAuthor(name);
					System.out.println(lbk);
				} catch (BookException e) {
					System.out.println(e.getMessage());
				 
				}
			}
			
			System.out.println();
			System.out.println("want to serch book by isbn number yes/no");
			String is=input.next();
			if(is.equalsIgnoreCase("yes")) {
				System.out.println("Enter isbn number");
				int isb=input.nextInt();
				try {
					Book bk=lab.getBookByISBN(isb);
				   System.out.println(bk);
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				
			}
			
	System.out.println("wnt to  Exit/no");	
	String exit=input.next();
	if(exit.equalsIgnoreCase("Exit")) {
		System.out.println(" Thank You..!!");
	}
	
	}
	


}
