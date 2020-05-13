package digiplus.ma.mymusicapp;

//import android.support.v7.widget.RecyclerView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * we named this Adapter ArtisteAdapter because its Artiste list
 * Adapter
 */

public class ArtisteAdapter extends RecyclerView.Adapter<ArtisteAdapter.Artists_ViewHolder> {
    private ArrayList<Artiste> mArtiste_Items;

    public static class Artists_ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public Artists_ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageV);
            mTextView1 = itemView.findViewById(R.id.textV1);
            mTextView2 = itemView.findViewById(R.id.textV2);
        }
    }
        public ArtisteAdapter(ArrayList<Artiste> list_Artiste){
            mArtiste_Items = list_Artiste;
        }
    @NonNull
    @Override
    public Artists_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_artistes, parent, false);
        Artists_ViewHolder A_viewHolder = new Artists_ViewHolder(v);
        return A_viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Artists_ViewHolder holder, int position) {
        Artiste CurrentItem = mArtiste_Items.get(position);
        holder.mImageView.setImageResource(CurrentItem.getImageResource());
        holder.mTextView1.setText(CurrentItem.getText1());
        holder.mTextView2.setText(CurrentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mArtiste_Items.size();
    }
}
