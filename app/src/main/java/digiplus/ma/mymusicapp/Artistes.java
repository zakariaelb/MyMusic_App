package digiplus.ma.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
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
}
