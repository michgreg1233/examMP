package com.example.exam;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class GempaAdapter extends RecyclerView.Adapter<GempaAdapter.ViewHolder> {

    private Gempa gempaModelList;

    // Constructor
    public GempaAdapter(Gempa gempaModelList) {
        this.gempaModelList = gempaModelList;
    }

    @NonNull
    @Override
    public GempaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GempaAdapter.ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        Gempa__1 model = gempaModelList.getInfogempa().getGempa().get(position);
        holder.LokasiTV.setText(model.getWilayah());
        holder.DateTV.setText(model.getTanggal()+" "+model.getJam());
        holder.KekuatanTV.setText(model.getMagnitude()+"\n SR");
        holder.PotensiTV.setText(model.getPotensi());
        holder.KedalamanTV.setText("Kedalaman : "+model.getKedalaman());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String coords = model.getCoordinates();
                String[] separated = coords.split(",");
                double ltd = Double.parseDouble(separated[0]);
                double lng = Double.parseDouble(separated[1]);
                Intent sendingCoordinate = new Intent(view.getContext(), MapsActivity.class);
                sendingCoordinate.putExtra("ltd",ltd);
                sendingCoordinate.putExtra("lng", lng);
                sendingCoordinate.putExtra("lokasi",model.getWilayah());
                sendingCoordinate.putExtra("magnitude",model.getMagnitude());
                sendingCoordinate.putExtra("waktu",model.getTanggal()+" "+model.getJam());
                view.getContext().startActivity(sendingCoordinate);
            }
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return gempaModelList.getInfogempa().getGempa().size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView KekuatanTV;
        private final TextView LokasiTV;
        private final TextView DateTV;
        private final TextView PotensiTV;
        private final TextView KedalamanTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            KekuatanTV = itemView.findViewById(R.id.idIVKekuatan);
            LokasiTV = itemView.findViewById(R.id.idTVLokasi);
            DateTV = itemView.findViewById(R.id.idTVDate);
            PotensiTV = itemView.findViewById(R.id.idTVPotensi);
            KedalamanTV = itemView.findViewById(R.id.idTVKedalaman);
        }
    }
}
