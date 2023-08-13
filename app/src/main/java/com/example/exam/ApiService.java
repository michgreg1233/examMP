package com.example.exam;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("gempaterikini")
    Call<List<Gempa>>getGempaData();
}
