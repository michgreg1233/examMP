package com.example.exam;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Infogempa {

    @SerializedName("gempa")
    @Expose
    private List<Gempa> gempa;

    public List<Gempa> getGempa() {
        return gempa;
    }

    public void setGempa(List<Gempa> gempa) {
        this.gempa = gempa;
    }

}
