package com.example.cf17inigoreal.appexameniigoreal;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        String intentInfo="";
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Plats",Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item2:
                Toast.makeText(this,"Reserva",Toast.LENGTH_SHORT).show();
                novaActivity(ReservesActivity.class,"dd");
                return true;
            case R.id.item3:
                Toast.makeText(this,"Veure Reserves",Toast.LENGTH_SHORT).show();
                novaActivity(PantallaReservesActivity.class,"dd");


                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
    public void novaActivity(Class activityCrida, String info) {

        Intent intent = new Intent(this, activityCrida);
        intent.putExtra("info",info);
        startActivity(intent);
    }
}
