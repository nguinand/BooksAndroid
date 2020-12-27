package com.example.booksandroid;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Date;

class Author {
    private String name;
    private Date DOB;
    private ArrayList<String> booksWritten;

    Author(){};

    Author(String name, Date DOB){
        this.name = name;
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }

    public String getName() {
        return name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(ArrayList<String> booksWritten) {
        this.booksWritten = booksWritten;
    }

    // If the author books lookup returns a json array.
    public void setBooksWritten(JSONArray JSONbooksWritten) throws JSONException {
        if (JSONbooksWritten != null) {
            for (int i = 0; i < JSONbooksWritten.length(); i++) {
                booksWritten.add(JSONbooksWritten.getString(i));
            }
        }
    }
}
