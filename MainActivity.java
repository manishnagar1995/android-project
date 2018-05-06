//Tab layout: dividing activity into tab buttons at the top. Same as that
// of viewpager but viewpager will get added to tablayout/Add support v7 Tablayout in xml

package com.example.hp.swipeview;


import android.app.ActionBar;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ViewPager vp;
    TabLayout tl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager)findViewById(R.id.vp);
        tl = (TabLayout)findViewById(R.id.tl);

        MyAdapter md = new MyAdapter(getSupportFragmentManager());
        vp.setAdapter(md);

        tl.setupWithViewPager(vp);   //add viewpager to tablayout and its done


    }

}
