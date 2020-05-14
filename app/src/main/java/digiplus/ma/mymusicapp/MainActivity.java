package digiplus.ma.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Artiste> list_Artiste = new ArrayList<>();
        list_Artiste.add(new Artiste(R.drawable.theweekend, getString(R.string.Top1), getString(R.string.Top1_1)));
        list_Artiste.add(new Artiste(R.drawable.camila_cabello_feat_dababy, getString(R.string.Top2), getString(R.string.Top2_2)));
        list_Artiste.add(new Artiste(R.drawable.doja_cat, getString(R.string.Top3), getString(R.string.Top3_3)));
        list_Artiste.add(new Artiste(R.drawable.theweekend, getString(R.string.Top1), getString(R.string.Top1_1)));
        list_Artiste.add(new Artiste(R.drawable.camila_cabello_feat_dababy, getString(R.string.Top2), getString(R.string.Top2_2)));
        list_Artiste.add(new Artiste(R.drawable.doja_cat, getString(R.string.Top3), getString(R.string.Top3_3)));
        list_Artiste.add(new Artiste(R.drawable.theweekend, getString(R.string.Top1), getString(R.string.Top1_1)));
        list_Artiste.add(new Artiste(R.drawable.camila_cabello_feat_dababy, getString(R.string.Top2), getString(R.string.Top2_2)));
        list_Artiste.add(new Artiste(R.drawable.doja_cat, getString(R.string.Top3), getString(R.string.Top3_3)));
        list_Artiste.add(new Artiste(R.drawable.doja_cat, getString(R.string.Top3), getString(R.string.Top3_3)));

        mRecyclerView = findViewById(R.id.Main_RV);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ArtisteAdapter(list_Artiste);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
