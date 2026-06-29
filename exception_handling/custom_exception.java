package exception_handling;

    class InvalidAgeException extends Exception{
        InvalidAgeException(String message){
            super(message);
        }
    }
    public class custom_exception {
        static void checkAge(int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("Age must be 18+");
            }
            System.out.println("Valid age");
        }
        public static void main(String[] args) {
            try{
                checkAge(15);
            }
            catch (InvalidAgeException e){
                System.out.println(e.getMessage());
            }
        }
        }
