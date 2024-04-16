public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        InformationPersonal informationPersonal = new InformationPersonal();
        String password = "dhfgvnYG_";
        String login = "reeuiPI_d";
        String confirmPassword = "dhfgvnYG";

        char[] arrSymbol = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_'};


        Service service = new Service();
        char[] arrPassword = password.toCharArray();
        char[] arrLogin = login.toCharArray();

        try {
            service.checkPassword(arrPassword, arrSymbol);
            service.checkLogin(arrLogin, arrSymbol);
            service.checkConfirm(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Либо превышен размер пароля, либо не соотвтствуют символы при создании пароля, либо пароли не совпадают");
        } catch (WrongLoginException e) {
            System.out.println("Либо превышен размер логина, либо не соотвтствуют символы при создании логина");
        }

    }
}