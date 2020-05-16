package digiplus.ma.mymusicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class Album_Activity extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        gridView = findViewById(R.id.Album_Grid);
        final ArrayList<CAlbum> List_Album = new ArrayList<CAlbum>();
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        List_Album.add(new CAlbum((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        List_Album.add(new CAlbum((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        List_Album.add(new CAlbum((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Album_Activity.this, Playing.class);
                intent.putExtra("album", List_Album.get(i).getmAlbum_Nam());
                intent.putExtra("artist", List_Album.get(i).getmArtist_Nam());
                intent.putExtra("title", "track 1");
                intent.putExtra("img_res", List_Album.get(i).getmAlb_Image());
                startActivity(intent);
            }
        });

        gridView.setAdapter(new AlbumAdapter(this, List_Album));

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

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
