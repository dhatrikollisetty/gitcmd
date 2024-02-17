public class StudentClass {
    public String name;
    public String mobileNo;

    public StudentClass(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
