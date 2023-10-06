package Problema2;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class DTO implements Serializable {
    public Integer id;
    private String nameMall;
    private String city;
    private String direction;

    public DTO(Integer id, String nameMall, String city, String direction) {
        this.id = id;
        this.nameMall = nameMall;
        this.city = city;
        this.direction = direction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameMall() {
        return nameMall;
    }

    public void setNameMall(String nameMall) {
        this.nameMall = nameMall;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public static void writeToFile(ArrayList<DTO> malls, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(malls);
            out.close();
            fileOut.close();
            System.out.println("El ArrayList ha sido guardado en " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<DTO> readFromFile(String fileName) {
        ArrayList<DTO> malls = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            malls = (ArrayList<DTO>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("El ArrayList ha sido cargado desde " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return malls;
    }
}






