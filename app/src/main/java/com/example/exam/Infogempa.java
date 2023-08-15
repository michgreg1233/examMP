package com.example.exam;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Infogempa {

    @SerializedName("gempa")
    @Expose
    private List<Gempa__1> gempa;

    public List<Gempa__1> getGempa() {
        return gempa;
    }

    public void setGempa(List<Gempa__1> gempa) {
        this.gempa = gempa;
    }

}