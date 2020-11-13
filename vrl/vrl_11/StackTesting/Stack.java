public class Stack
{
  private Book[] array; // Neu: Objektarray aus Klasse Book
  private int top = 0;
  // Konstruktor
  public Stack(int nr)
  {
    array = new Book[nr];
  }
  // Funktionen
  public void push(Book element)
  {
    array[top++] = element;
  }
  public Book pop()
  {
    return array[--top];
  }
  public boolean isEmpty()
  {
    return (top == 0);
  }
  public boolean isFull()
  {
    return (top == array.length);
  }
}
