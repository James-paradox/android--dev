package com.siddharth.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int[] images;
    String[] names;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

                images= new int[]{R.drawable.ic_pintrest,R.drawable.ic_twit,R.drawable.ic_whatsapp,R.drawable.ic_youtube};
        names= new String[]{"Pintrest","Twitter","Whatsapp","Youtube"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);

        SocialAdapter adapter = new SocialAdapter(MainActivity.this,getList(images,names));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
            }

            private List<SocialMedia> getList(int[] images,String[] names){

        List<SocialMedia> list = new ArrayList<>();
        for (int i=0;i<images.length;i++){
            SocialMedia media=new SocialMedia();
            media.setImage(images[i]);
            media.setName(names[i]);
            list.add(media);
        }

        return list;
            }





}
