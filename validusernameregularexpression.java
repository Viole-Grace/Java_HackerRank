
class UsernameValidator {
    //String regex = "^[A-ZA-z]\\w{7,29}$"; 
    // checks for all A- Z combinations and l_char, wchar checks for constraint of 30 word item chars, ends with $ removing the first predefined char
    public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";
}
