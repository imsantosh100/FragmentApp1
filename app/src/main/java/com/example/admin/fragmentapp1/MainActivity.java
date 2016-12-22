package com.example.admin.fragmentapp1;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    // This method will be called by Blank Fragment  - with data
    public void passData(String data)
    {
        Toast.makeText(MainActivity.this, "Entered data::"+ data, Toast.LENGTH_SHORT).show();
        // Pass this data to BlankFragment2 fragment

        // Get Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        BlankFragment2 blankFragment2 = (BlankFragment2) fragmentManager.findFragmentById(R.id.fragment2);

        // Check BlankFragment2 is avalable are not

        if(blankFragment2 !=null)
        {
            // BlankFragment2  is availble, now send data to BlankFragment2
            blankFragment2.catchData(data);
        }

    }
}
