package com.example.com.codepath.example.mysecondapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Toast msg = Toast.makeText(this, "Hello!", Toast.LENGTH_LONG);
        msg.show();*/
        
        View layout = findViewById(R.id.layout);
        Drawable background = layout.getBackground();
        background.setAlpha(250);
        
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String webpage = "http://developer.android.com/index.html";
				Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse(webpage));
				startActivity(intent);
			}
		});
        
        
        
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_SEND);
				intent.putExtra(Intent.EXTRA_TEXT, "Hello from Ruchir");
				intent.setType("text/plain");
				startActivity(intent);
			}
		});
        
     }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    public boolean onOptionsItemSelected(MenuItem menu) {
    	Toast.makeText(this, "You Selected " + menu.getTitle(), Toast.LENGTH_LONG).show();
    	return super.onOptionsItemSelected(menu);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    
    public void gotoActivity(View v)
    {
    	Intent intent = new Intent(this,DetailActivity.class);
    	startActivity(intent);
    }

}
