package com.koperasipetik.koperasipetik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homepage);

        Button btnInput = (Button)findViewById(R.id.btnInput);
        Button btnHistory = (Button)findViewById(R.id.btnHistory);
    }
}
