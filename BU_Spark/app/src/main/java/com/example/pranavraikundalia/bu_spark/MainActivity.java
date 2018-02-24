package com.example.pranavraikundalia.bu_spark;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button btnEdu;
    private Button btnLaw;
    private Button btnRes;
    //private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        btnEdu= (Button)findViewById(R.id.btnEdu);
        btnLaw= (Button)findViewById(R.id.btnLaw);
        btnRes= (Button)findViewById(R.id.btnRes);
        btnEdu.setMinimumHeight(height/3);
        btnLaw.setMinimumHeight(height/3);
        btnRes.setMinimumHeight(height/3);
        btnEdu.setMinimumWidth(width);
        btnLaw.setMinimumWidth(width);
        btnRes.setMinimumWidth(width);

        btnEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_edu=new Intent(getApplicationContext(),Edu_Activity.class);
                startActivity(intent_edu);
            }
        });

        btnLaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_edu=new Intent(getApplicationContext(),Law_Activity.class);
                startActivity(intent_edu);
            }
        });


        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_edu=new Intent(getApplicationContext(),Res_Activity.class);
                startActivity(intent_edu);
            }
        });

    }
    public int getToolBarHeight() {
        int[] attrs = new int[] {R.attr.actionBarSize};
        TypedArray ta = getApplicationContext().obtainStyledAttributes(attrs);
        int toolBarHeight = ta.getDimensionPixelSize(0, -1);
        ta.recycle();
        return toolBarHeight;
    }

}
