/* StackTest.java */
public class Book
{
  private String title;
  private String author;
  // Konstruktor
  public Book(String title, String author)
  {
    this.title = title;
    this.author = author;
  }
  // Funktion
  public void print()
  {
    System.out.println(title + " von " + author);
  }
}
