package Stacks;

//Here we create our CustomException class which is extending the Exception class.
public class CustomException extends Exception {

    public CustomException(String message) {
//        Super method will help to invoke the parent class Constructor.
        super(message);
    }
}
