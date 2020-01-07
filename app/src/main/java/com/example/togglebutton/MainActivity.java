package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);
    }

    public void toggleButton(View view) {
        boolean checked=((ToggleButton)view).isChecked();
        if(checked)
        {
            textView.setText("Wifi is on");
            textView.setVisibility(View.VISIBLE);
        }
        else
        {
            textView.setText("Wifi is off");
            textView.setVisibility(View.VISIBLE);
        }
    }
}
