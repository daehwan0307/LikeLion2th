package study.day1004;

public class EmployeeTest {

    public static void main(String arg[]) {

        // TODO Auto-generated method stub

        Regular r = new Regular("이순신", 35, "서울", "인사부");
        Temporary t = new Temporary("장보고", 25, "인천", "경리부");

        r.setSalary(5000000);
        r.printInfo();

        t.setWorkHours(120);
        t.printInfo();

    }
}
