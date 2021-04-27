package org.iesfm.genericSerializer;

public interface Deserializer<T> {

    T deserializer(String object);
}
