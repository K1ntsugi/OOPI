package Aufgabe1;

public class InvalidMathException extends Exception{

    public InvalidMathException(String s)
    {
        super(s);
    }

    public InvalidMathException()
    {
        super();
    }

}
