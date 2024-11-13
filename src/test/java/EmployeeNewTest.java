import com.bigdata.java.EmployeeNew;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeNewTest {
    @Test
    public void getDateTest() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String expected = formatter.format(date);

        EmployeeNew employeeNew = new EmployeeNew();
        String actual = employeeNew.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testStringToInt() {
        EmployeeNew employeeNew = new EmployeeNew();

        String inputString = "abc";

        int expected = 0;
        int actual = employeeNew.stringToInteger(inputString);

        assertEquals(expected, actual);
    }

/*    @Test
    public void testStringToInt2() {
        EmployeeNew employeeNew = new EmployeeNew();
        String inputString = "10";
        int expected = 0;
        int actual = employeeNew.stringToInteger(inputString);
        assertEquals(expected, actual);
    }*/
}
