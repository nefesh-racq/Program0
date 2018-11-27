/*
* program0 control táctil de la pantalla
* muestra el numero de veces que tocas la pantalla
* */
package com.example.nova.program0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int touchCount;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        touchCount = 0;
        button = new Button(this);

        button.setText("toca la pantalla");
        button.setOnClickListener(this);
        setContentView(button);
    }

    @Override
    public void onClick(View view) {
        button.setText("tocaste " + ++touchCount + " veces la pantalla");
    }
}
