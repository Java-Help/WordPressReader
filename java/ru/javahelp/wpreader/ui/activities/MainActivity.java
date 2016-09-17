package ru.javahelp.wpreader.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.javahelp.wpreader.R;
import ru.javahelp.wpreader.ui.fragments.MainFragment;

public class MainActivity
        extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        init();
    }

    private void init()
    {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_frame, new MainFragment())
                .commit();
    }
}