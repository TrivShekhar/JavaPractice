public class User {
    private String id;
    private String name;
    private String address;
    private String mobileNumber;
    User(String id,String name,String address,String mobileNumber){
        this.id = id;
        this.address =address;
        this.name = name;
        this.mobileNumber =mobileNumber;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Mobile Number: "+mobileNumber);
    }
}
