public class User {
    
    private Integer userId;
    private String firstname;
    private String lastname;
    private Location address;
    private String mobNo;
    private String emailId;

    public void setuserId(int userId) {
        this.userId = userId;;
    }
    public void setfirstname(String firstname) {
        this.firstname = firstname;;
    }
    public void setlastname(String lastname) {
        this.lastname = lastname;;
    }
    public void setaddress(Location address) {
        this.address = address;;
    }
    public void setmobNo(String mobNo) {
        this.mobNo = mobNo;;
    }
    public void setemailId(String emailId) {
        this.emailId = emailId;;
    }

    public int getUserId() {
        return userId;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getAddress() {
        return address;
    }
    public String getMobNo() {
        return mobNo;
    }
    public String getEmailId() {
        return emailId;
    }
}
