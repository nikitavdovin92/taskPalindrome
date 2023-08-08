public class PalindromeChecker {
    public static boolean isPalindrome(String string) {
        // Удаление пробелов и приведение всех символов к нижнему регистру
        string = string.replace(" ", "").toLowerCase();
        // Проверка, является ли строка палиндромом
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
