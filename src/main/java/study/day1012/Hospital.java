package study.day1012;

public class Hospital {
    private  String id;

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;

        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
        this.setDistrict();
    }

    private  String address;

    public String getDistrict() {
        return district;
    }

    private  String district;
    private  String category;
    private  Integer emergencyRoom;

    private  String name;
    private  String subdivision;



    public  void setDistrict(){
        String[] splitted = this.address.split(" ");
        this.district=splitted[0]+" "+splitted[1];
    }

}
