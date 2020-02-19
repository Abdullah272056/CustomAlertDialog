package com.example.customalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                View covertView= LayoutInflater.from(MainActivity.this).inflate(R.layout.sample,null);
                builder.setView(covertView);
                final AlertDialog alertDialog=builder.create();
                Button yesButton=covertView.findViewById(R.id.yesButtonId);
                Button noButton=covertView.findViewById(R.id.noButtonId);

                yesButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.cancel();
                        Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                });
                noButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                        alertDialog.cancel();
                    }
                });
               // alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                alertDialog.show();

            }
        });
    }
}
