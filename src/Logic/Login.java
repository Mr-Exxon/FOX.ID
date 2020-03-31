package Logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    public Boolean checkId(String id) {
		Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
		Matcher matchername = pattern.matcher(id);
		return matchername.matches();
	}
}
