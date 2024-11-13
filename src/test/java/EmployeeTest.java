import static org.junit.jupiter.api.Assertions.*;

import com.bigdata.java.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmployeeTest {
    @Test
    public void testEmployeeFake() {
        assert true;
    }

    @Test
    public void testEmployeeName() {
        Employee employee = new Employee(10001L, "Ashok", 34, "Lead");
        String expected = "Ashok";
        String actual = employee.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testEmployeeNameError() {
        Employee employee = new Employee(10001L, "Ashok", 34, "Lead");
        String expected = "Ashok Kumar";
        String actual = employee.getName();

        assertNotEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"one", "two"})
    public void testMethod(String word) {

        assertEquals(word.length(), 3);
    }
}
