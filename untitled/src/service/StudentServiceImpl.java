package service;

import data.User;
import util.ReadToTxt;
import util.WriteToText;

public class StudentServiceImpl implements DataService {
    @Override
    public void create(User user) {
        WriteToText.write(user);
    }

    @Override
    public User read(User user) {
        return ReadToTxt.read(user);
    }
}
