package org.iesfm.genericSerializer.serializer;

import org.iesfm.genericSerializer.Animal;
import org.iesfm.genericSerializer.Deserializer;
import org.iesfm.genericSerializer.Serializer;

import java.util.HashMap;
import java.util.Map;

public class SerializerAnimal implements Serializer<Animal>, Deserializer<Animal> {

    final static String COLOR_FIELD = "color";
    final static String AGE_FIELD = "age";
    final static String SPECIE_FIELD = "specie";

    @Override
    public String serialize(Animal object) {
        String animalColourField = COLOR_FIELD + ":" + object.getColour();
        String animalAgeField = AGE_FIELD + ":" + object.getAge();
        String animalSpecieField = SPECIE_FIELD + ":" + object.getSpecie();
        return animalColourField + "," + animalAgeField + "," + animalSpecieField;
    }

    @Override
    public Animal deserializer(String object) {
        Map<String, String> aniamlField = new HashMap<>();

        for (String field : object.split(",")) {

            String[] fieldObject = field.split(":");

            aniamlField.put(fieldObject[0], fieldObject[1]);
        }

        String colorValue = aniamlField.get(COLOR_FIELD);
        int ageValue = Integer.parseInt(aniamlField.get(AGE_FIELD));
        String specieValue = aniamlField.get(SPECIE_FIELD);

        return new Animal(colorValue, ageValue, specieValue);
    }
}
