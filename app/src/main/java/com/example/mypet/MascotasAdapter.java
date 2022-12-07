package com.example.mypet;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MascotasAdapter extends RecyclerView.Adapter<MascotasAdapter.ViewHolder> {

    private static List<Mascotas> mascotasList;

    public MascotasAdapter(List<Mascotas> mascotasList) {

        this.mascotasList = mascotasList;
    }



    @NonNull
    @Override
    public MascotasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_mascotas, parent,false );

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasAdapter.ViewHolder holder, int position) {

        holder.tvNombreMascotaCard.setText(mascotasList.get(position).getNombre());
        holder.tvEdadMascotaCard.setText(mascotasList.get(position).getEdad());
        holder.tvRazaMascotaCard.setText(mascotasList.get(position).getRaza());
        holder.imgMascotaCard.setImageResource(mascotasList.get(position).getIdImagen());
        holder.position = holder.getAdapterPosition();

    }

    @Override
    public int getItemCount() {
        return mascotasList.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{

        private ImageView imgMascotaCard;
        private TextView tvNombreMascotaCard, tvRazaMascotaCard, tvEdadMascotaCard;
        private int position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascotaCard = itemView.findViewById(R.id.imgMascotaCard);
            tvEdadMascotaCard = itemView.findViewById(R.id.tvEdadMascotaCard);
            tvRazaMascotaCard = itemView.findViewById(R.id.tvRazaMascotaCard);
            tvNombreMascotaCard = itemView.findViewById(R.id.tvNombreMascotaCard);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), InfoMascotas.class);
                    intent.putExtra("nombre", mascotasList.get(position).getNombre());
                    intent.putExtra("edad", mascotasList.get(position).getEdad());
                    intent.putExtra("raza", mascotasList.get(position).getRaza());
                    intent.putExtra("telefono", mascotasList.get(position).getTelefono());
                    intent.putExtra("idImagen", mascotasList.get(position).getIdImagen());
                    view.getContext().startActivity(intent);
                }
            });


        }
    }

}
