package com.example.perehod_artem339;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void bael(View view) {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        Toast toast = Toast.makeText(this, "Вы перешли на страницу о приложении", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END| Gravity.CENTER_VERTICAL,0,0);
        toast.show();


    }
    public void bael4(View view) {
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
        Toast toast = Toast.makeText(this, "Вы перешли на страницу о контактной информации", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
}
