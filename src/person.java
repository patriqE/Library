public class person {
    private String fullName;
    private String address;
    private String stateOfOrigin;
    private String id;

    public person(String fullName, String address, String stateOfOrigin, String id) {
        this.fullName = fullName;
        this.address = address;
        this.stateOfOrigin = stateOfOrigin;
        this.id = id;
    }

    public person() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
