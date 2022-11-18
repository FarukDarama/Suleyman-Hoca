package day27exceptions;

//Eger Exception classa extends ederseniz sizin Classınız Compile Time Exception olur
public class IllegalGradeException extends Exception {
    public IllegalGradeException(String message){
        super(message);
    }

}
