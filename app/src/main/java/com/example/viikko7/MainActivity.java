package com.example.viikko7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textBox;
    TextView numberBox;
    SeekBar slider;
    Spinner menu;

    BottleDispenser BoDi = new BottleDispenser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBox = (TextView) findViewById(R.id.textView);
        numberBox = (TextView) findViewById(R.id.textView3);
        slider = (SeekBar) findViewById(R.id.seekBar);
        menu = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.products));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menu.setAdapter(myAdapter);

        numberBox.setText(BoDi.getMoney());
    }

    public void addMoney(View v) {
        BoDi.addMoney(slider.getProgress(), textBox);
        slider.setProgress(0);
        numberBox.setText(BoDi.getMoney());
    }
    public void buyBottle(View v) {
        BoDi.buyBottle(menu.getSelectedItemPosition(), textBox);
        numberBox.setText(BoDi.getMoney());
    }
    public void returnMoney(View v) {
        BoDi.returnMoney(textBox);
        numberBox.setText(BoDi.getMoney());
    }
}

