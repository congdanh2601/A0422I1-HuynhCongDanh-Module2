package case_study.validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validator {

    public static final String NAME_REGEX = "^[A-Z][a-z]?";

    public static Date dateValidator(String dateAsString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date date = null;
        try {
            date = dateFormat.parse(dateAsString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

//    public static Date dateOfBirthValidator(String dateOfBirthStr) {
//        Date dateOfBirth = Validator.dateValidator(dateOfBirthStr);
//        if(dateOfBirth.before(new Date("9/9/2004")) && dateOfBirth.before(new Date("9/10/1922"))) {
//
//        }
//    }


}
