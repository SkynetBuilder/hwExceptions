public class Main {
    public static void main(String[] args) {
        String[] account = new String[2];
        account[0] = "java_skypro_go";
        account[1] = "D_1hWiKjjP_9";
        try {
            validateAccount(account[0], account[1], "D_1hWiKjjP_9");
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин");
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль");
        }
    }

    public static void validateAccount(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.matches("\\W+")) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || password.matches("\\W+")) {
            throw new WrongPasswordException();
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException();
        }
        System.out.println("Данные внесены верно");
    }
}