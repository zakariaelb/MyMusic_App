package digiplus.ma.mymusicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import static android.widget.GridView.*;

public class Artistes extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistes);

        ArrayList<CArtiste> list_Artiste = new ArrayList<>();
        list_Artiste.add(new CArtiste((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        list_Artiste.add(new CArtiste((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        list_Artiste.add(new CArtiste((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        list_Artiste.add(new CArtiste((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        list_Artiste.add(new CArtiste((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        list_Artiste.add(new CArtiste((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        list_Artiste.add(new CArtiste((R.drawable.theweekend), getString(R.string.Top1), getString(R.string.Top1_1)));
        list_Artiste.add(new CArtiste((R.drawable.camila_cabello_feat_dababy), getString(R.string.Top2), getString(R.string.Top2_2)));
        list_Artiste.add(new CArtiste((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));
        list_Artiste.add(new CArtiste((R.drawable.doja_cat), getString(R.string.Top3), getString(R.string.Top3_3)));

        mRecyclerView = findViewById(R.id.Artiste_RV);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ArtisteAdapter(list_Artiste);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
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
                startActivity(new Intent(this, Artistes.class));
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
