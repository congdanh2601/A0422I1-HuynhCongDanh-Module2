package final_exam.xac_minh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XacMinh {
    static Scanner scanner = new Scanner(System.in);
    public static final String XAC_MINH_TEN = "^([A-Z][a-z]? )?";
    public static final String XAC_MINH_GIOI_TINH = "^[A-Z][a-z]?";

    public static byte xacMinhLuaChon() {
        while (true) {
            try {
                Byte luaChon = Byte.parseByte(scanner.nextLine());
                if (luaChon > 4 || luaChon < 1) {
                    System.out.println("Lựa chọn không phù hợp. Vui lòng chọn lại.");
                    continue;
                }
                return luaChon;
            } catch (NumberFormatException e) {
                e.getMessage();
            }
        }
    }

    public static Date xacMinhNgay(String ngayNhap) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date ngay = null;
        try {
            ngay = dateFormat.parse(ngayNhap);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ngay;
    }

    public static Date validateDate(String dateAsString) throws UserException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date date = null;
        try {
            date = format.parse(dateAsString);
            return date;
        } catch (ParseException e) {
            throw new UserException(Message.DATE_FORMAT);
        }
    }

    public static boolean selectIdNote(String idNote) throws UserException {
        final String CLASS_REGEX = "^STK-[0-9]{4}$";
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(idNote);
        System.out.println("Input name of class is: " + matcher.matches());
        if (matcher.matches() == false) {
            throw new UserException(Message.WRONG_ID_NOTE);
        }
        return true;
    }

    public static boolean validateLongTerm(int longTerm) throws UserException {
        if (longTerm != 1 && longTerm != 3 && longTerm != 5 && longTerm != 10) {
            throw new UserException(Message.WRONG_LONG_TERM);
        }
        return true;
    }

    public static boolean validateShortTerm(int shortTerm) throws UserException {
        if (shortTerm != 3 && shortTerm != 6) {
            throw new UserException(Message.WRONG_SHORT_TERM);
        }
        return true;
    }

    public static boolean validateMoney(double money) throws UserException {
        if (money < 1000000) {
            throw new UserException(Message.MONEY_TOO_SMALL);
        }
        return true;
    }

    public static boolean validate() throws UserException {
        if (true) {
            throw new UserException(Message.NOT_FOUND_SAVING_EXCEPTION);
        }
        return true;
    }


}
