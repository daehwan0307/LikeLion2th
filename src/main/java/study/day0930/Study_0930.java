package study.day0930;

class DBox<T,S> {

    private  T String;
    private  S Integer;

    public void set(T String, S Integer){
        this.String = String;
        this.Integer = Integer;
    }

    @Override
    public  String toString(){
        return this.String+"&"+this.Integer;
    }
}

public class Study_0930 {
    public static void main(String[] args) {

        DBox<String,Integer> box = new DBox<String,Integer>();
        box.set("Apple",25);

        System.out.println(box);



/*
        Box aBox = new Box();
        Box oBox = new Box();

        //aBox.set(new Apple());
        //oBox.set(new Orange());
        aBox.set("apple");
        oBox.set("oragne");

        //Apple ap = (Apple) aBox.get();
       // Orange og = (Orange) oBox.get();

        System.out.println(aBox.get());
        System.out.println(oBox.get());


        /*
        ArrayList<Integer> arr = null;



        Integer n1 = Integer.valueOf(5);
        Integer n2 = Integer.valueOf("1234");

        System.out.println("큰수"+Integer.max(n1,n2));
        /*
        Calendar d = Calendar.getInstance();

        int hour24 = d.get(Calendar.HOUR_OF_DAY);

        if(hour24>4 && hour24<12){
            System.out.println("Good Morning");
        }
        else if(hour24>12 && hour24 <18){
            System.out.println("Good Afternoon");

        }
        else if(hour24>18 && hour24 <22) {
            System.out.print("Good Evening");
        }
        else
            System.out.print("Good Night");




        /*
        int year = d.get(Calendar.YEAR);
        int month = d.get(Calendar.MONTH);
        int date = d.get(Calendar.DATE);
        int hour12 = d.get(Calendar.HOUR);
        int hour24 = d.get(Calendar.HOUR_OF_DAY);
        int min = d.get(Calendar.MINUTE);
        int sec = d.get(Calendar.SECOND);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(hour12);
        System.out.println(hour24);
        System.out.println(min);
        System.out.println(sec);

*/




        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String str = new String();
        str=sc.nextLine();


        for(int i=0; i<str.length();i++){
            System.out.println(str.substring(i) + str.substring(0, i));
        }





        StringBuilder sb = new StringBuilder("123");
        sb.append(4567);
        sb.delete(0,2);

        System.out.println(sb);
        sb.replace(0,3,"AB");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        */

    }
}
