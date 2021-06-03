import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class EmployeePayRollServiceTest {
    @Test
    public void givenEmployeePayRollInDB_WhenRetribed_ShouldMatchEmployeeCount(){
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayRollData();
        Assertions.assertEquals(4,employeePayrollData.size());

    }
}
