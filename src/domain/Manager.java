package domain;
/** Містить реалізацію методів
 * @author KatiaZourab
 */
public class Manager extends Employee {
	/** Ініціалізує
	 * @param employees
	 * @param name
	 * @param jobTitle
	 * @param level
	 * @param dept
	 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /** Ініціалізує
     * @param employees
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /** Ініціалізує
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }
    /** Ініціалізує
     */
    private Employee[] employees;
    /** Повертає перемінну
     * @return String s
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /** Встановити перемінну
     * @param employees
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /** Повернути перемінну
     * @return employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
