package com.example.silerehberim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {
private ImageView imageViewResim;
private TextView textViewYerName;
private TextView textViewIcerik;
private Yerler yer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        imageViewResim=findViewById(R.id.imageViewResim);
        textViewYerName=findViewById(R.id.textViewYerName);
        textViewIcerik=findViewById(R.id.textViewIcerik);

        yer=(Yerler)getIntent().getSerializableExtra("nesne");
        textViewYerName.setText(yer.getYer_ad());
        textViewIcerik.setText(yer.getYer_icerik());

        imageViewResim.setImageResource(getResources().getIdentifier(yer.getYer_resim()
                ,"drawable"
                ,getPackageName()));
    }
}