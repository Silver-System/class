package csw2;
abstract class Libraryresource{
	private String title;
	private String author;
	public Libraryresource(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	abstract void displaydetails();
}
class book extends Libraryresource{
	int pagecount;
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public book(String title, String author,int page) {
		super(title,author);
		pagecount=page;
	}
	void displaydetails() {
		System.out.println("Title:- "+getTitle()+"\nAuthor:- "+getAuthor()+"\nPages:- "+pagecount);
		System.out.println("--------------------------------------------------------------------");
	}
}
class magazine extends Libraryresource{
	String issuedate;
	public magazine(String title, String author,String issuedate) {
		super(title, author);
		this.issuedate=issuedate;
	
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	void displaydetails() {
		System.out.println("Title:- "+getTitle()+"\nAuthor:- "+getAuthor()+"\nIssue Date:- "+issuedate);
		System.out.println("--------------------------------------------------------------------");
	}
}
class dvd extends Libraryresource{
	String duration;
	public dvd(String title, String author,String duration) {
		super(title, author);
		this.duration=duration;
	
	}
	public String getduration() {
		return duration;
	}
	public void setduration(String duration) {
		this.duration = duration;
	}
	void displaydetails() {
		System.out.println("Title:- "+getTitle()+"\nAuthor:- "+getAuthor()+"\nduration:- "+duration);
		System.out.println("--------------------------------------------------------------------");
	}
}
public class LibrarySystem {

	public static void main(String[] args) {
    Libraryresource l1=new book("Book1","A1",2354);
    Libraryresource l2=new magazine("Mag1","A2","2/4/2021");
    l1.displaydetails();
    l2.displaydetails();
    Libraryresource l3=new dvd("DVD1","A3","25 mins");
    l3.displaydetails();
    

	}

}
