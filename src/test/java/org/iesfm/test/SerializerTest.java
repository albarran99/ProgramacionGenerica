package org.iesfm.test;

import org.iesfm.genericSerializer.Animal;
import org.iesfm.genericSerializer.Deserializer;
import org.iesfm.genericSerializer.User;
import org.iesfm.genericSerializer.serializer.SerializerAnimal;
import org.iesfm.genericSerializer.serializer.SerializerUser;
import org.junit.Assert;
import org.junit.Test;

public class SerializerTest {
    @Test
    public void AnimalSerializerTest() {
        SerializerAnimal animalSerializer = new SerializerAnimal();

        Animal animal = new Animal("Rojo", 12, "Gato");

        String expected = "Colour:Rojo,Age:12,Specie:Gato";

        String serializerAnimal = animalSerializer.serialize(animal);

        Assert.assertEquals(expected, serializerAnimal);
    }

    @Test
    public void UserSerializerTest() {
        SerializerUser userSerializer = new SerializerUser();

        User user = new User("GamerPro", "CoolGuy", 15);

        String expected = "Username:GamerPro,Password:CoolGuy,Level:15";

        String result = userSerializer.serialize(user);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void AnimalDeserializerTest() {
        Deserializer<Animal> animalDeserializer = new SerializerAnimal();

        String animal = "color:Rojo,age:12,specie:Gato";

        Animal expected = new Animal("Rojo", 12, "Gato");
        Animal result = animalDeserializer.deserializer(animal);

        Assert.assertEquals(expected, result);
    }
}
