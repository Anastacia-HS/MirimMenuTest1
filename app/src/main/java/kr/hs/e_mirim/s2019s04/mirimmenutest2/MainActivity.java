package kr.hs.e_mirim.s2019s04.mirimmenutest2;

import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDegree;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDegree = findViewById(R.id.edit_degree);
        img = findViewById(R.id.image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item_rotate:
                img.setRotation(Float.parseFloat(editDegree.getText().toString()));
                return true;

            case R.id.item_sakura:
                img.setImageResource(R.drawable.sakura);
                return true;

            case R.id.item_beer:
                img.setImageResource(R.drawable.beer);
                return true;

            case R.id.item_wave:
                img.setImageResource(R.drawable.wave);
                return true;
        }
        return false;
    }
}