package com.iteyes.placesproject;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class PagerDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayesha_product_detail);
        setTitle("Nishat Linen");

        final ImageView iv1, iv2, iv3, ivMain;
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        ivMain = findViewById(R.id.ivMain);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable temp;
                temp = iv1.getDrawable();
                iv1.setImageDrawable(ivMain.getDrawable());
                ivMain.setImageDrawable(temp);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable temp;
                temp = iv2.getDrawable();
                iv2.setImageDrawable(ivMain.getDrawable());
                ivMain.setImageDrawable(temp);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable temp;
                temp = iv3.getDrawable();
                iv3.setImageDrawable(ivMain.getDrawable());
                ivMain.setImageDrawable(temp);
            }
        });




        /*ViewPager viewPager = findViewById(R.id.view_pager);

        DotIndicatorPagerAdapter adapter = new DotIndicatorPagerAdapter();
        viewPager.setAdapter(adapter);*/
        //viewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        //dotsIndicator.setViewPager(viewPager);
    }
}
