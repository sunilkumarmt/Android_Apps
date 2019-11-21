package com.example.assesment3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int tot=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        textView=findViewById(R.id.textView);
        switch (item.getItemId()) {
            case R.id.vRice:
                textView.setText("Veg Rice= 80");
                tot=tot+80;
                return true;

            case R.id.vcurry:
                textView.setText("Mix Veg Curry= 60");
                tot=tot+60;
                return true;

            case R.id.cb:
                textView.setText("Chicken Biryani= 120");
                tot=tot+120;
                return true;

            case R.id.mcurry:
                textView.setText("Mutton Curry= 160");
                tot=tot+160;
                return true;

            case R.id.total:
                textView.setText("Total="+tot);
                return true;
        }
        return true;
    }
}
