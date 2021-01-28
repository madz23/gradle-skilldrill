package edu.isu.cs.cs2263;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class IOManager {
    public void gsonSerialize(Student stud) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(stud);
        System.out.println(json);
    }

//    public List<Student> readData(String students) {
//    }

    public void writeData(String file, String data) {

    }


}
