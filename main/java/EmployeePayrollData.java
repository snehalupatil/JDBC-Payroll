import java.time.LocalDate;
import java.util.Objects;

public class EmployeePayrollData{
    public int id;
    public String name;
    public double basic_pay;
    public LocalDate startDate;

    /**
     * Initialize the value of variables
     * @param id
     * @param name
     * @param basic_pay
     * @param startDate
     */
    public EmployeePayrollData(int id, String name, double basic_pay, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.basic_pay = basic_pay;
        this.startDate = startDate;
    }

    /**
     * display values
     * @return
     */
    @Override
    public  String toString(){
        return "EmployeePayRollData[Id=" + id + "\nName=" + name + "\nSalary=" + basic_pay +"\nStart Date:"+startDate +"]";
    }

    /**
     *
     * @param o
     * @return true if object is the same as the obj argument
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EmployeePayrollData that = (EmployeePayrollData) o;
        return id == that.id && Double.compare(that.basic_pay, basic_pay) == 0 && Objects.equals(name, that.name);
    }
}