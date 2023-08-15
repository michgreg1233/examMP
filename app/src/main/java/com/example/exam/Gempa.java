package com.example.exam;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Gempa {

    @SerializedName("Infogempa")
    @Expose
    private Infogempa infogempa;

    public Infogempa getInfogempa() {
        return infogempa;
    }

    public void setInfogempa(Infogempa infogempa) {
        this.infogempa = infogempa;
    }

}