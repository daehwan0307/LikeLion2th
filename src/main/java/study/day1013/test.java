package study.day1013;

public class test {
    public static void main(String[] args) {
        String[] strs = new String[]{"소아과","내과","치과"};


        String a = "소아과한한한";
        String b = "";
        for(String str : strs){
            if(a.contains(str)) {
                b = str;
            }else
                b = "??";
        }
        System.out.println(b);
    }
}
