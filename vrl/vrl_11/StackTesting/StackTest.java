public class StackTest
{
  public static void main (String[] args)
  {
    Stack myStack = new Stack(5);
    if (!myStack.isFull())
    {
      myStack.push(new Book("Harry Potter", "Rowling"));
    }
    if (!myStack.isFull())
    {
      myStack.push(new Book("Der Schwarm", "Schaetzing"));
    }
    if (!myStack.isEmpty())
    {
      Book element = myStack.pop();
      System.out.print("Jetzt lese ich: ");
      element.print();
    }
  }
}
