package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity{

    //@Column(name="firstName")
    private String name;
   // @Column (name="surname")
    private String surname;
   // @Column (name="age")
    private Byte age;

   // @Column(name= "id_card")
    private String id_card;
    public Person(Long id,String name, String surname, Byte age,String id_card)
    {
        super(id);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id_card=id_card;
    }

}
