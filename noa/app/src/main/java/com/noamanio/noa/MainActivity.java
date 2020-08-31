package com.noamanio.noa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    List<ViewPagerModel> models;
    ArgbEvaluator argbEvaluator=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        models=new ArrayList<>();
        models.add(new ViewPagerModel(R.drawable.ic_launcher_foreground,""+getString(R.string.app_name)));
        models.add(new ViewPagerModel(R.drawable.ic_launcher_foreground,""+getString(R.string.app_name)));
        models.add(new ViewPagerModel(R.drawable.ic_launcher_foreground,""+getString(R.string.app_name)));
        models.add(new ViewPagerModel(R.drawable.ic_launcher_foreground,""+getString(R.string.app_name)));
        models.add(new ViewPagerModel(R.drawable.ic_launcher_foreground,""+getString(R.string.app_name)));
        models.add(new ViewPagerModel(R.drawable.ic_launcher_foreground,""+getString(R.string.app_name)));
        adapter=new ViewPagerAdapter(models,this);
        viewPager=findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(8,0,8,0);
    }
}