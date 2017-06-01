package com.example.abhujeeth.project_was;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentFirst.SetWork{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void doWork() {
        Fragment fragment=new FragmentFour();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fm.beginTransaction();
        fragmentTransaction.replace(R.id.activity_main,fragment,"t");
        fragmentTransaction.addToBackStack("t");
        fragmentTransaction.commit();
    }
}
