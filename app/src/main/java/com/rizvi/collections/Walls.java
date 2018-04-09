package com.rizvi.collections;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.io.IOException;

public class Walls extends AppCompatActivity {

    GridView myGridView;
    ImageView myCurrentWall;
    WallpaperManager myWallManager;
    Drawable myDrawable;


    Integer[] myImageArray={
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d
            ,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walls);

        myGridView = findViewById(R.id.myGridView);
        myCurrentWall = findViewById(R.id.myImageView);

        myGridView.setAdapter(new ImageAdapter(getApplicationContext()));
        UpdateWallpaper();
    }

    private void UpdateWallpaper(){
        myWallManager = WallpaperManager.getInstance(getApplicationContext());
        myDrawable = myWallManager.getDrawable();
        myCurrentWall.setImageDrawable(myDrawable);
    }

    public class ImageAdapter extends BaseAdapter {

        Context myCotext;

        public ImageAdapter(Context applicationContext) {
            myCotext = applicationContext;
        }

        @Override
        public int getCount() {
            return myImageArray.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            ImageView GridImageView;

            if(convertView ==null){

                GridImageView = new ImageView(myCotext);
                GridImageView.setLayoutParams(new GridView.LayoutParams(512,512));
                GridImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else{
                GridImageView= (ImageView) convertView;

            }

            GridImageView.setImageResource(myImageArray[position]);


            GridImageView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View convertView){

                    try {
                        myWallManager.setResource(myImageArray [position]);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    UpdateWallpaper();
                }
            });

            return GridImageView;
        }
    }

}
