package digiplus.ma.mymusicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageView).setOnClickListener(this);
        findViewById(R.id.imageView3).setOnClickListener(this);
        findViewById(R.id.imageView2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView3:
                AlbumsBroser();
                break;
            case R.id.imageView:
                ArtisteBroser();
                break;
            case R.id.imageView2:
                PlayBroser();
                break;
                    }
    }
    public void AlbumsBroser() {
        startActivity(new Intent(this, Album_Activity.class));
    }

    public void ArtisteBroser() {
        startActivity(new Intent(this, Artistes.class));
    }
    public void PlayBroser() {
        startActivity(new Intent(this, Playing.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Item1:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.Item2:
                startActivity(new Intent(this, Album_Activity.class));
                return true;
            case R.id.Item3:
                startActivity(new Intent(this, Playing.class));
                return true;
            case R.id.Item4:
                startActivity(new Intent(this, Artistes.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
