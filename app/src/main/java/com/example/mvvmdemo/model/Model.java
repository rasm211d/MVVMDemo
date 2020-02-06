package com.example.mvvmdemo.model;
import com.example.mvvmdemo.ui.MainActivity;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {

    private String text;

    public static Model model = new Model();

    private Model(){}


    public void setText(String text) {
        this.text = text;
        setChanged();
        notifyObservers();
    }

    public String getText() {
        return text;
    }
}
