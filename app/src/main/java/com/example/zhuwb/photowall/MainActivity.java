package com.example.zhuwb.photowall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView mPhotoWall;

    private PhotoWallAdapter photoWallAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mPhotoWall= (GridView) findViewById(R.id.photo_wall);
        photoWallAdapter=new PhotoWallAdapter(this,0,Images.imageThumbUrls,mPhotoWall);
        mPhotoWall.setAdapter(photoWallAdapter);



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //退出程序时结束所有下载任务
        photoWallAdapter.cancelAllTasks();
    }
}
