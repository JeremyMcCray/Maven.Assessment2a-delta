package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    public Address() {
        addressLineOne = "";
        addressLineTwo = "";
        cityy = "";
        statee ="";
        zipcodee = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    String addressLineOne;
    String addressLineTwo;
    String cityy;
    String statee;
    String zipcodee;




    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLineOne = addressLine1;
        this.addressLineTwo = addressLine2;
        this.cityy = city;
        this.statee = state;
        this.zipcodee = zipcode;
    }

    public String getAddressLine1() {

        return this.addressLineOne;
    }

    public void setAddressLine1(String addressLine1) {
    addressLineOne = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLineTwo;
    }

    public void setAddressLine2(String addressLine2) {
        addressLineTwo = addressLine2;
    }

    public String getCity() {
        return this.cityy;
    }

    public void setCity(String city) {
        cityy=city;
    }

    public String getState() {
        return this.statee;
    }

    public void setState(String state) {
        statee = state;
    }

    public String getZipcode() {
        return this.zipcodee;
    }

    public void setZipcode(String zipcode) {
        zipcodee = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Address){
            if(
                    ((Address) o).getAddressLine1().equals(this.addressLineOne)
                            && ((Address) o).getAddressLine2().equals(this.addressLineTwo)
                            && ((Address)o).getZipcode().equals(this.zipcodee)
                            && ((Address)o).getState().equals(this.statee)
                            && ((Address)o).getCity().equals(this.cityy)

            ){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
    String answer = "Address{";
    answer+="addressLine1='" + this.getAddressLine1() +"', addressLine2='" + this.getAddressLine2() + "', city='" + getCity() + "', state='"+ getState() +"', zipcode='"+getZipcode() +"'}";
    return answer;
    }
}
