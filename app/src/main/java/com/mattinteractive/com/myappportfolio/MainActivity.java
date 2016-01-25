package com.mattinteractive.com.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
// import android.widget.TextView;
// import android.content.res.AssetManager;
// import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        Button button1 = (Button)findViewById(R.id.mm_button_1);
        Button button2 = (Button)findViewById(R.id.mm_button_2);
        Button button3 = (Button)findViewById(R.id.mm_button_3);
        Button button4 = (Button)findViewById(R.id.mm_button_4);
        Button button5 = (Button)findViewById(R.id.mm_button_5);
        Button button6 = (Button)findViewById(R.id.mm_button_6);

        Typeface font = Typeface.createFromAsset(getAssets(), "Montserrat-Regular.ttf");
        button1.setTypeface(font);
        button2.setTypeface(font);
        button3.setTypeface(font);
        button4.setTypeface(font);
        button5.setTypeface(font);
        button6.setTypeface(font);
    }

    public void displayToast(View view){
        // display toast
        Context context = getApplicationContext();

        CharSequence txt = "";

        switch(view.getId()){
            case(R.id.mm_button_1):
                txt = "Will launch Spotify app!";
            break;

            case(R.id.mm_button_2):
                txt = "Will launch Football Scores app!";
            break;

            case(R.id.mm_button_3):
                txt = "Will launch Library app!";
            break;

            case(R.id.mm_button_4):
                txt = "Will launch Build It Bigger app!";
            break;
            case(R.id.mm_button_5):
                txt = "Will launch XYZ Reader app!";
            break;
            case(R.id.mm_button_6):
                txt = "Will launch Capstone app!";
            break;

        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, txt, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}