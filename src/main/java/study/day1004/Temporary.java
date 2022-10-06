package study.day1004;

import study.day1004.Employee;

public class Temporary extends Employee {
    int workhour; // 일한 시간
    int time_pay; // 시간당 보수
    Temporary(String name, int age, String address, String department) {
        super(name, age, address, department);
        time_pay=10000;
    }
    public void setWorkHours(int workhour) {
        this.workhour = workhour;
        this.salary = workhour*time_pay;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("비정규직");
        System.out.println("일한 시간 : "+workhour);
        System.out.println("급여 : "+salary);
        System.out.println();
    }
}
