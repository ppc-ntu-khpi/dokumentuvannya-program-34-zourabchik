package domain;
/** Містить реалізацію методів
 * @author KatiaZourab
 */
public class Artist extends Employee {
	/**Ініціалізує
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
    /**Ініціалізує
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
    /**Повертає поле
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    
    /**Вівід значень 
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
   /** Встановити нову навичку
    * @param skills
    */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /** Отримати лист з навичками
     * @param skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
