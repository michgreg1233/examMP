package com.example.exam;
import android.content.Context;
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

    private List<Gempa> gempaModelList;

    // Constructor
    public GempaAdapter(List<Gempa> gempaModelList) {
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
        Gempa model = gempaModelList.get(position);
        holder.LokasiTV.setText(model.getWilayah());
        holder.DateTV.setText(model.getTanggal());
        holder.KekuatanTV.setText(model.getMagnitude());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return gempaModelList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView KekuatanTV;
        private final TextView LokasiTV;
        private final TextView DateTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            KekuatanTV = itemView.findViewById(R.id.idIVKekuatan);
            LokasiTV = itemView.findViewById(R.id.idTVLokasi);
            DateTV = itemView.findViewById(R.id.idTVDate);
        }
    }
}
