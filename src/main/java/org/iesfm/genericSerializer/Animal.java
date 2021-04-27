package org.iesfm.genericSerializer;

import java.util.Objects;

public class Animal{

    private String colour;
    private int age;
    private String specie;

    public Animal(String colour, int age, String specie) {
        this.colour = colour;
        this.age = age;
        this.specie = specie;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(colour, animal.colour) && Objects.equals(specie, animal.specie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, age, specie);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                ", specie='" + specie + '\'' +
                '}';
    }
}
