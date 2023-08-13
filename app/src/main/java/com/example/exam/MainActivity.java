package com.example.exam;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.bmkg.go.id/DataMKG/TEWS/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);


        RecyclerView gempaRV = findViewById(R.id.idRVGempa);
        Call<List<Gempa>> call = apiService.getGempaData();
        call.enqueue(new Callback<List<Gempa>>() {
            @Override
            public void onResponse(Call<List<Gempa>> call, Response<List<Gempa>> response) {
                if (response.isSuccessful()) {
                    List<Gempa> gempaDataList = response.body();
                    GempaAdapter adapter = new GempaAdapter(gempaDataList);
                    gempaRV.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Gempa>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"ERRORRRRRRRRRRRRRRRRRRRR",Toast.LENGTH_SHORT).show();
            }
        });

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        gempaRV.setLayoutManager(linearLayoutManager);
    }
}