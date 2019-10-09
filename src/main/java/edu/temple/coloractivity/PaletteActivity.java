package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    public static final String color = "edu.temple.PaletteActivity.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        final String [] colors = {"Red", "Blue", "Green", "Gray", "Cyan", "Magenta", "Lime", "Yellow", "Aqua", "Purple"};
//        ArrayAdapter adapter = new ArrayAdapter<>(PaletteActivity.this, android.R.layout.simple_list_item_1, colors );
        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, colors);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                view.setBackgroundColor(Color.WHITE);
                findViewById(R.id.layoutID).setBackgroundColor(Color.parseColor(colors[i]));
                if(i!=0) {
                    Intent intent = new Intent(getApplicationContext(), CanvasActivity.class);
                    intent.putExtra(color, colors[i]);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });

        spinner1.setAdapter(adapter);

    }
}
