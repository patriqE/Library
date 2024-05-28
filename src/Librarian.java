public class Librarian extends person{

    public Librarian(String fullName, String address, String stateOfOrigin, String id) {
        super(fullName, address, stateOfOrigin, id);
    }

    public Librarian() {

    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getStateOfOrigin() {
        return super.getStateOfOrigin();
    }

    @Override
    public void setStateOfOrigin(String stateOfOrigin) {
        super.setStateOfOrigin(stateOfOrigin);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String toString(){
        return "Reader [Name = " + getFullName() + ", Address = " + getAddress() +
                ", State of origin = " + getStateOfOrigin() + ", id = " + getId() + "]";
    }
}
