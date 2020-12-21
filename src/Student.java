/**
 * Software construction. Lab2
 *
 * @author Spekles
 *
 * @version 1.0
 */

public class Student implements Comparable<Student> {
    /**Student's name.*/
    private final String name;

    /**Student's registration number.*/
    private final int regNo;

    /**Student's course.*/
    private final int course;

    /**
     * Constructor.
     * @param n
     * @param r
     * @param c
     */
    public Student(final String n, final int r, final int c) {
        name = n;
        regNo = r;
        course = c;
    }

    /**
     * Getter for name.
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for registration number.
     * @return int
     */
    public int getRegNo() {
        return regNo;
    }
    /**
     * Getter for course.
     * @return int
     */
    public int getCourse() {
        return course;
    }

    /**
     * Overridden equals.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }
        Student c = (Student) o;

        return course == c.getCourse() && regNo == c.getRegNo()
                && (name.compareTo(c.getName()) == 0);
    }

    /**
     * Overridden hashCode.
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + name.hashCode();
        result = prime * result + regNo;
        result = prime * result + course;
        return result;
    }

    /**
     * Overridden compareTo.
     * @param s
     * @return int
     */
    @Override
    public int compareTo(final Student s) {
        final int nameDiff = name.compareToIgnoreCase(s.getName());
        if (nameDiff != 0) {
            return nameDiff;
        }

        final int regNoDiff = regNo - s.getRegNo();
        if (regNoDiff != 0) {
            return regNoDiff;
        }

        final int courseDiff = course - s.getCourse();
        return courseDiff;
    }
}
