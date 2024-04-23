import java.security.Provider;

public class Main {
    public static void main(String[] args) {


        try {
            Service.check("java_skypro_go554ж", "java_skypro_go", "java_skypro_go");


        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(" Не верные входные данные " + exception.getMessage());
        }
    }
}

