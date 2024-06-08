package com.onur.papatya;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class papatya extends AppCompatActivity {
    ImageView papatya1,papatya2,papatya3,papatya4,papatya5,papatya6,papatya7,papatya8;
    TextView sonuc;
    Button again;

    String var ="Evet",yok="Hayır";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_papatya);

        papatya1 = findViewById(R.id.papatya1);
        papatya2=findViewById(R.id.papatya2);
        papatya3 =findViewById(R.id.papatya3);
        papatya4 =findViewById(R.id.papatya4);
        papatya5 = findViewById(R.id.papatya5);
        papatya6 = findViewById(R.id.papatya6);
        papatya7 = findViewById(R.id.papatya7);
        papatya8 =findViewById(R.id.papatya8);
        again = findViewById(R.id.again);
        sonuc =findViewById(R.id.sonuc);
        again.setVisibility(View.INVISIBLE);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @SuppressLint("SetTextI18n")
    public void papatya1 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya1.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    @SuppressLint("SetTextI18n")
    public void papatya2 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya2.setVisibility(View.GONE);
        if (papatya1.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya1.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void papatya3 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya3.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE &&
                papatya1.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya1.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){

                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void papatya4 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya4.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya1.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya1.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void papatya5 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya5.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya1.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya1.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void papatya6 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya6.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya1.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya1.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void papatya7 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya7.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya1.getVisibility()==View.GONE&&
                papatya8.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya1.getVisibility()==View.VISIBLE&&
                    papatya8.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void papatya8 (View view){
        Intent intentt= getIntent();
        String veri = intentt.getStringExtra("veri");
        papatya8.setVisibility(View.GONE);
        if (papatya2.getVisibility()== View.GONE
                &&papatya3.getVisibility()==View.GONE&&
                papatya4.getVisibility()==View.GONE&&
                papatya5.getVisibility()==View.GONE&&
                papatya6.getVisibility()==View.GONE&&
                papatya7.getVisibility()==View.GONE&&
                papatya1.getVisibility()==View.GONE){
            sonuc.setText(veri+"\nCevap: "+var);
            again.setVisibility(View.VISIBLE);
        }
        else{
            if (papatya2.getVisibility()== View.VISIBLE&&
                    papatya3.getVisibility()==View.VISIBLE&&
                    papatya4.getVisibility()==View.VISIBLE&&
                    papatya5.getVisibility()==View.VISIBLE&&
                    papatya6.getVisibility()==View.VISIBLE&&
                    papatya7.getVisibility()==View.VISIBLE&&
                    papatya1.getVisibility()==View.VISIBLE){
                sonuc.setText(yok);
            }
            else if (sonuc.getText().toString().equals(var))
                sonuc.setText(yok);
            else{
                sonuc.setText(var);
            }
        }

    }
    public void kontrol (View view){
        Intent anasayfayagec= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(anasayfayagec);
    }
}