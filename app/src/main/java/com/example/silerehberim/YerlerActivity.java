package com.example.silerehberim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class YerlerActivity extends AppCompatActivity {
    private Toolbar toolbarYer;
    private RecyclerView yerlerRv;
    private ArrayList<Yerler> yerlerArrayList;
    private YerlerAdapter adapter;
    private  FirebaseDatabase database;
    private DatabaseReference myRefYerler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yerler);
        toolbarYer=findViewById(R.id.toolbarYer);
        yerlerRv=findViewById(R.id.yerlerRv);

        database=FirebaseDatabase.getInstance();
        myRefYerler=database.getReference("yerler");

        toolbarYer.setTitle("Gezilecek Yerler");
        setSupportActionBar(toolbarYer);



        yerlerRv.setHasFixedSize(true);
        yerlerRv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));





        tumYerler();
    }


    public void tumYerler(){
        myRefYerler.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                yerlerArrayList=new ArrayList<>();
               // yerlerArrayList.clear();


                for (DataSnapshot d:snapshot.getChildren()){
                    Yerler yer=d.getValue(Yerler.class);
                    yer.setYer_id(d.getKey());

                    yerlerArrayList.add(yer);
                }

                adapter=new YerlerAdapter(YerlerActivity.this,yerlerArrayList);
                yerlerRv.setAdapter(adapter);
              // adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}