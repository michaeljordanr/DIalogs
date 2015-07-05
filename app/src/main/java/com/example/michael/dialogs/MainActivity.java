package com.example.michael.dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view){
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.show(getFragmentManager(), "dialog");
    }

    public void openSimple(View view){
        SimpleDialogFragment dialogSimple = new SimpleDialogFragment();
        dialogSimple.show(getFragmentManager(), "dialogSimple");
    }

    public void openRadio(View view){
        RadioDialogFragment dialogRadio = new RadioDialogFragment();
        dialogRadio.show(getFragmentManager(), "dialogRadio");
    }

    public void openMultiple(View view){
        MultipleDialogFragment dialogMultiple = new MultipleDialogFragment();
        dialogMultiple.show(getFragmentManager(), "dialogMuliple");
    }
}
