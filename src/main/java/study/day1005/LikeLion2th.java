package study.day1005;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {

    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
       Names names = new Names();
       this.students = names.names();
    }

    //멋사 2기 학생들의 이름이 들어있는 list를 return
    public List<String> getStudentList(){
        return this.students;
    }
}
