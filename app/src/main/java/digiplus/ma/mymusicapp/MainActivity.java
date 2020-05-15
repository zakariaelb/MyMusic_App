package digiplus.ma.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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
    /**
        public void Play() {
            Intent intent = new Intent(MainActivity.this, Play.class);
            intent.putExtra("album", "Weekend");
            intent.putExtra("artist", "The Weekend");
            intent.putExtra("title", "Hi");
            intent.putExtra("img_res", R.drawable.theweekend);
            startActivity(intent);
        }
        */
}
