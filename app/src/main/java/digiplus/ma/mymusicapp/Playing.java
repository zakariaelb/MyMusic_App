package digiplus.ma.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Playing extends AppCompatActivity {

    boolean playing = true;
    TextView artist;
    TextView title;
    TextView album;
    ImageView imgAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        artist = findViewById(R.id.ArtPlay);
        title = findViewById(R.id.TitlPlay);
        album = findViewById(R.id.AlbPlay);
        imgAlbum = findViewById(R.id.IMG_ALB_Play);

        if (getIntent().hasExtra("album"))
            album.setText(getIntent().getStringExtra("album"));
        if (getIntent().hasExtra("artist"))
            artist.setText(getIntent().getStringExtra("artist"));
        if (getIntent().hasExtra("title"))
            title.setText(getIntent().getStringExtra("title"));
        if (getIntent().hasExtra("img_res"))
            imgAlbum.setImageResource(getIntent().getIntExtra("img_res", R.drawable.ic_launcher_background));

    }

    public void Click_Play(View view) {
        playing = !playing;
        ((ImageView) findViewById(R.id.ArtPlay)).setImageResource(!playing ? R.drawable.baseline_library_music_black_36dp : R.drawable.baseline_play_circle_outline_black_48);

    }
    }

