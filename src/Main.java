final class Main {
    /**
     * Private default constructor.
     */
    private Main() { }

    public static void main(final String[] args) {
        final int regNo = 32;
        final int course = 4;

        Student s1 = new Student("Ivan", regNo, course);
        Student s2 = new Student("Ivan", regNo, course);

        if (s1 .equals(s2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        System.out.println(s1.compareTo(s2));
        Student s3 = new Student("Pavlo", regNo, course);
        System.out.println(s1.compareTo(s3));
    }
}
