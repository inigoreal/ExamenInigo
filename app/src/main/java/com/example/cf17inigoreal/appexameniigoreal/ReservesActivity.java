package com.example.cf17inigoreal.appexameniigoreal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReservesActivity extends AppCompatActivity {
    private EditText fechaReserva;
    private EditText comensalesReserva;
    private EditText nombreReserva;
    private EditText telefReserva;
    private EditText comentarioReserva;
    private Button btnEnviar;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserves);

        fechaReserva     = (EditText) findViewById(R.id.fechaReserva);
        comensalesReserva= (EditText) findViewById(R.id.ComensalesReserva);
        nombreReserva    = (EditText) findViewById(R.id.nombreReserva);
        telefReserva     = (EditText) findViewById(R.id.telefReserva);
        comentarioReserva= (EditText) findViewById(R.id.comentarioReserva);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        fechaReserva.setText("ss");

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Reserves");

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                databaseReference.push().setValue(new Reserva(fechaReserva.getText().toString(),comensalesReserva.getText().toString(),nombreReserva.getText().toString(),telefReserva.getText().toString(),comentarioReserva.getText().toString()));


            }
        });

    }
}
