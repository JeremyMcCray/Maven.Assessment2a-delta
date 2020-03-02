package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    public Animal() {
        idd = null;
        person = new Person();
        address = person.getAddress();
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */

    Long idd;
    Person person;
    Address address;
    public Animal(Long id, Person owner) {
        this.idd = id;
        this.person = owner;
        this.address = person.getAddress();
    }

    public Long getId() {
        return this.idd;
    }

    public void setId(Long id) {
        idd=id;
    }

    public Person getOwner() {
        return this.person;
    }

    public void setOwner(Person owner) {
        person = owner;
    }

    public Address getAddress() {
        return person.getAddress();
    }
}
