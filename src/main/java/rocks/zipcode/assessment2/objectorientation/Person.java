package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    Long idd;
    String namee;
    Address addresss;
    public Person(Long id, String name, Address address) {
        this.idd = id;
        this.namee = name;
        this.addresss = address;
    }

    public Person() {
        this.idd = Long.MIN_VALUE;
        this.namee = "";
        this.addresss = new Address();
    }

    public Long getId() {
        return this.idd;
    }

    public void setId(Long id) {
        idd = id;
    }

    public String getName() {
        return this.namee;
    }

    public void setName(String name) {
        namee = name;
    }

    public Address getAddress() {
        return this.addresss;
    }

    public void setAddress(Address address) {
        addresss = address;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person) {
            if(((Person) o).getId() == null && ((Person) o).getName() == null && ((Person) o).getAddress().equals(this.addresss)){
                return true;
            }
            if (((Person) o).getAddress().equals(this.addresss) && ((Person) o).getId().equals(this.idd) && ((Person) o).getName().equals(this.namee)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String answer = "Person{id=" + this.getId() + ", name='" + this.getName() +"', address="+getAddress().toString() + "}";
        return answer;
    }
}