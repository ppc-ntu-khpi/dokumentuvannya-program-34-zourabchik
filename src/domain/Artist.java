package domain;
/** ̳����� ��������� ������
 * @author KatiaZourab
 */
public class Artist extends Employee {
	/**��������
	 * @param skiils
	 * @param name
	 * @param jobTitle
	 * @param level
	 * @param dept
	 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**��������
     * @param skiils
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**������� ����
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    
    /**³�� ������� 
     * @return s
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
   /** ���������� ���� �������
    * @param skills
    */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /** �������� ���� � ���������
     * @param skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
