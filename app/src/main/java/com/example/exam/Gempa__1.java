
package com.example.exam;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Gempa__1 {

    @SerializedName("Tanggal")
    @Expose
    private String tanggal;
    @SerializedName("Jam")
    @Expose
    private String jam;
    @SerializedName("DateTime")
    @Expose
    private String dateTime;
    @SerializedName("Coordinates")
    @Expose
    private String coordinates;
    @SerializedName("Lintang")
    @Expose
    private String lintang;
    @SerializedName("Bujur")
    @Expose
    private String bujur;
    @SerializedName("Magnitude")
    @Expose
    private String magnitude;
    @SerializedName("Kedalaman")
    @Expose
    private String kedalaman;
    @SerializedName("Wilayah")
    @Expose
    private String wilayah;
    @SerializedName("Potensi")
    @Expose
    private String potensi;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getLintang() {
        return lintang;
    }

    public void setLintang(String lintang) {
        this.lintang = lintang;
    }

    public String getBujur() {
        return bujur;
    }

    public void setBujur(String bujur) {
        this.bujur = bujur;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getKedalaman() {
        return kedalaman;
    }

    public void setKedalaman(String kedalaman) {
        this.kedalaman = kedalaman;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public String getPotensi() {
        return potensi;
    }

    public void setPotensi(String potensi) {
        this.potensi = potensi;
    }

}