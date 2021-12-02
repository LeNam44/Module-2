package StringAndRegex.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classroom {

    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSNAME_REGEX = "^([CAP])([0-9]{4})([GHIKLM])$";

    public Classroom() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
