package study.day1012;

public class Hospital {
    private  String id;
    private  String address;
    private  String district;
    private  String category;
    private  Integer emergencyRoom;
    private  String subdivision;

    public Hospital(String id, String address, String district, String category, Integer emergencyRoom, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.subdivision = subdivision;
    }
}
