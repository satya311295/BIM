package com.example.satya.bim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   // @Override
    public void newintenttransactions(View view)
    {
        Intent newintenttransactions=new Intent(this, transaction.class);
        startActivity(newintenttransactions);
    }

    public void newintentpending(View view)
    {
        Intent newintentpending=new Intent(this, pending.class);
        startActivity(newintentpending);
    }

    public void newintentcurrentclient(View view)
    {
        Intent newintentcurrentclient=new Intent(this, currentclient.class);
        startActivity(newintentcurrentclient);
    }

    public void newintentwishlish(View view)
    {
        Intent newintentwishlish=new Intent(this, wishlist.class);
        startActivity(newintentwishlish);
    }


    public void newintentgraph(View view)
    {
        Intent newintentgraph=new Intent(this, graph.class);
        startActivity(newintentgraph);
    }

    public void newintentdates(View view)
    {
        Intent newintentdates=new Intent(this, dates.class);
        startActivity(newintentdates);
    }
    public void newintentcurrentwork(View view)
    {
        Intent newintentcurrentwork=new Intent(this, currentwork.class);
        startActivity(newintentcurrentwork);
    }
    public void newintentsalary(View view)
    {
        Intent newintentsalary=new Intent(this, salary.class);
        startActivity(newintentsalary);
    }
    public void newintentstock(View view)
    {
        Intent newintentstock=new Intent(this, stock.class);
        startActivity(newintentstock);
    }
}
