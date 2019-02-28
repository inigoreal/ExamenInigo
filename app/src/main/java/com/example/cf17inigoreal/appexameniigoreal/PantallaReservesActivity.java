package com.example.cf17inigoreal.appexameniigoreal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PantallaReservesActivity extends AppCompatActivity {

    private AdapterLista adapterLista;

    private FirebaseDatabase database;

    private DatabaseReference databaseReference;
    private RecyclerView listaRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_reserves);


        listaRecycler = (RecyclerView) findViewById(R.id.listaRecycler);
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Reserves");//sala chat

        adapterLista = new AdapterLista(this);
        LinearLayoutManager l = new LinearLayoutManager(this);
        listaRecycler.setLayoutManager(l);
        listaRecycler.setAdapter(adapterLista);

        databaseReference.addChildEventListener(new ChildEventListener() {//al trobar un nou a la database
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Reserva m = dataSnapshot.getValue(Reserva.class);
                adapterLista.addMensaje(m);
            }

            @Override
            public void onChildChanged( DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved( DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved( DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled( DatabaseError databaseError) {

            }
        });
    }
}