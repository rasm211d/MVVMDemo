package com.example.mvvmdemo.model;
import com.example.mvvmdemo.ui.MainActivity;
import java.util.Observable;

public class Model extends Observable {

    private String text;

    public static Model model = new Model();

    private Model(){
        addObserver(MainActivity.mainActivity);
    }


    public void setText(String text) {
        this.text = text;
        setChanged();
        notifyObservers();
    }

    public String getText() {
        return text;
    }
}
