package com.example.cf17inigoreal.appexameniigoreal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView personasCard;
    private TextView fechaCard;

    public ViewHolder( View itemView) {
        super(itemView);

        personasCard =(TextView) itemView.findViewById(R.id.personasCard);
        fechaCard=(TextView) itemView.findViewById(R.id.fechaCard);
    }

    public TextView getPersonasCard() {
        return personasCard;
    }

    public void setPersonasCard(TextView personasCard) {
        this.personasCard = personasCard;
    }

    public TextView getFechaCard() {
        return fechaCard;
    }

    public void setFechaCard(TextView fechaCard) {
        this.fechaCard = fechaCard;
    }
}
