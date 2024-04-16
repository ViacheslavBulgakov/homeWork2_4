
public class Service {
    public void checkPassword(char[] arr, char[] arr2) throws WrongPasswordException {
        if (arr.length > 20) {
            System.out.println("Превышен размер пароля");
            throw new WrongPasswordException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr[i] == arr2[j]) {
                        break;
                    } else if (j != arr2.length - 1) {
                        continue;
                    } else {
                        System.out.println("Элемент " + arr[i] + " не соответствует условиям создания пароля.");
                        throw new WrongPasswordException();
                    }
                }
            }
        }
    }
    public void checkLogin(char[] arr, char[] arr2) throws WrongLoginException{
        if (arr.length > 20) {
            System.out.println("Превышен размер логина");
            throw new WrongLoginException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr[i] == arr2[j]) {
                        break;
                    } else if (j != arr2.length - 1) {
                        continue;
                    } else {
                        System.out.println("Элемент " + arr[i] + " не соответствует условиям создания логина.");
                        throw new WrongLoginException();
                    }
                }
            }
        }
    }
    public void checkConfirm(String password, String confirmPassword) throws WrongPasswordException{
        if (password.equals(confirmPassword)) {
            System.out.println("Пароли совпадали");

        } else {
            System.out.println("Пароли не совпали");
            throw new WrongPasswordException();
        }
    }

}


