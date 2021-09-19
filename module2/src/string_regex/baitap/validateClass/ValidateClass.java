package string_regex.baitap.validateClass;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateClass {
    private static final   String regex ="^[CAP][0-9]{4}[GHIKLM]$";
    public ValidateClass(){

    }
    public boolean CheckRegex(String strRegex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(strRegex);
        return matcher.matches();
    }
}
