package com.almaralengineering.multiplebuttons;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button_1);
        Button button2 = (Button) findViewById(R.id.button_2);
        Button button3 = (Button) findViewById(R.id.button_3);
        Button button4 = (Button) findViewById(R.id.button_4);
        Button button5 = (Button) findViewById(R.id.button_5);
        Button button6 = (Button) findViewById(R.id.button_6);
        Button button7 = (Button) findViewById(R.id.button_7);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int buttonId = v.getId();

        switch(buttonId){

            case R.id.button_1:
                Toast.makeText(this, "Hoy es día Lunes u.u", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_2:
                Toast.makeText(this, "Hoy es día Martes :(", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_3:
                Toast.makeText(this, "Hoy es día Miércoles :|", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_4:
                Toast.makeText(this, "Hoy es día Jueves :)", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_5:
                Toast.makeText(this, "Hoy es día Viernes :D", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_6:
                Toast.makeText(this, "Hoy es día Sábado XD", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_7:
                Toast.makeText(this, "Hoy es día Domingo -.-", Toast.LENGTH_SHORT).show();
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
