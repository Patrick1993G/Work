package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity{

    @Column(name="firstName")
    private String name;
    @Column (name="surname")
    private String surname;
    @Column (name="age")
    private Byte age;

    public Person(Long id,String name, String surname, Byte age)
    {
        super(id);
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}
