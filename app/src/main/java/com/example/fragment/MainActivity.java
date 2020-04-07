package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 public void changeFragment(View view){
     Fragment fragment;
     if (view==findViewById(R.id.button)){
         fragment = new FragmentOne();
         FragmentManager fragmentManager=getFragmentManager();
         FragmentTransaction ft = fragmentManager.beginTransaction();
         ft.replace(R.id.fragment_place,fragment);
         ft.commit();
     }
     if (view==findViewById(R.id.button2)) {
         fragment = new FragmentTwo();
         FragmentManager fragmentManager = getFragmentManager();
         FragmentTransaction ft = fragmentManager.beginTransaction();
         ft.replace(R.id.fragment_place, fragment);
         ft.commit();
     }
 }
}

