package digiplus.ma.mymusicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter {

    ArrayList<CAlbum> Albums;

    public AlbumAdapter(@NonNull Context context, ArrayList<CAlbum> Albums) {
        super(context, 0);
        this.Albums = Albums;
    }

    @Override
    public int getCount() {
        return Albums.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View a = convertView;
        if (a == null)
            a = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_albums, null);
        ImageView AlbImage = a.findViewById(R.id.Image_Album);
        TextView album_Nam = a.findViewById(R.id.AlbumID);
        TextView artist_Nam = a.findViewById(R.id.ArtisteID);

        AlbImage.setImageResource(Albums.get(position).getmAlb_Image());
        album_Nam.setText(Albums.get(position).getmAlbum_Nam());
        artist_Nam.setText(Albums.get(position).getmArtist_Nam());
        return a;
    }
}
