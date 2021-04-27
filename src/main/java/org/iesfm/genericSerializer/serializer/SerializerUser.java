package org.iesfm.genericSerializer.serializer;


import org.iesfm.genericSerializer.Serializer;
import org.iesfm.genericSerializer.User;

public class SerializerUser implements Serializer<User> {

    @Override
    public String serialize(User object) {
        String userNameField = "Username:" + object.getUsername();
        String userPasswordField = "Password:" + object.getPassword();
        String userLevelField = "Level:" + object.getLevel();
        return userNameField + "," + userPasswordField + "," + userLevelField;
    }
}
