package com.kani.project.nanodegreeportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PortfolioMain extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);
       setUpButtons();

    }

    private void setUpButtons() {
        findViewById(R.id.button_popularmovies).setOnClickListener(this);
        findViewById(R.id.button_stockhawk).setOnClickListener(this);
        findViewById(R.id.button_builditbigger).setOnClickListener(this);
        findViewById(R.id.button_makeyourappmaterial).setOnClickListener(this);
        findViewById(R.id.button_goubiquitous).setOnClickListener(this);
        findViewById(R.id.button_capstone).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String message=getResources().getString(R.string.toastmessagepre);
        switch (view.getId())
        {
            case R.id.button_popularmovies:
                message=message+getResources().getString(R.string.popularmovies);
                break;
            case R.id.button_stockhawk:
                message=message+getResources().getString(R.string.stockhawk);
                break;
            case R.id.button_builditbigger:
                message=message+getResources().getString(R.string.builditbigger);
                break;
            case R.id.button_makeyourappmaterial:
                message=message+getResources().getString(R.string.makeyourappmaterial);
                break;
            case R.id.button_goubiquitous:
                message=message+getResources().getString(R.string.goubiquitous);
                break;
            case R.id.button_capstone:
                message=message+getResources().getString(R.string.capstone);
                break;
        }
        message=message+getResources().getString(R.string.toastmessagepost);

        Toast.makeText(getBaseContext(),message,Toast.LENGTH_SHORT).show();

    }
}
