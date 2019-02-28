package com.example.cf17inigoreal.appexameniigoreal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AdapterLista extends RecyclerView.Adapter<ViewHolder>{
    private List<Reserva> listaMensaje = new ArrayList<>();
    private Context c;

    public AdapterLista(Context c) {
        this.c = c;
    }
    public void addMensaje(Reserva m){
        listaMensaje.add(m);
        notifyDataSetChanged();
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(c).inflate(R.layout.recycledviewcard,viewGroup,false); //crear vista
        return new ViewHolder(view); //enviar vista
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holderChat, int i) { //al llegar el item
        holderChat.getFechaCard().setText(listaMensaje.get(i).getFechaReserva());
        holderChat.getPersonasCard().setText(listaMensaje.get(i).getComensalesReserva());

    }

    @Override
    public int getItemCount() {
        return listaMensaje.size();
    }
}
