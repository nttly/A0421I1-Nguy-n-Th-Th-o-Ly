package string_regex.baitap.validatePhone;

public class Test {
    static String[] valiOrInvali = {"(84)-(0337772617)", "(84)-(0373835432)", "a8)-(0337772617)"};

    public static void main(String[] args) {
        ValidatePhone validateAccount = new ValidatePhone();
        for (String str : valiOrInvali) {
            boolean valiorinvali = validateAccount.CheckRegex(str);
            System.out.println(str + " is validate " + valiorinvali);
        }

    }
}
