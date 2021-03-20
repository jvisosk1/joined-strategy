package com.mycompany;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorColumn(name = "PERSON_DB_ID", discriminatorType = DiscriminatorType.INTEGER)
public abstract class Person {
        
    @Id 
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int idPerson;
    private String first_name;
    private String last_name;
    private String address;    


    public int getIdPerson()
        {return idPerson;}
    public void setIdPerson(int idPerson)
        {this.idPerson = idPerson;}

    public String getFirstName()
        {return first_name;}
    public void setFirstName(String first_name)
        {this.first_name = first_name;}

    public String getLastName()
        {return last_name;}
    public void setLastName(String last_name)
        {this.last_name = last_name;}

    public String getAddress()
        {return address;}
    public void setAddress(String address)
        {this.address = address;}
}   