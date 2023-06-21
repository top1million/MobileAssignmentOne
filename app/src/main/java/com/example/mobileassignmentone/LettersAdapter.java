package com.example.mobileassignmentone;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class LettersAdapter extends RecyclerView.Adapter<LettersAdapter.ViewHolder> {

    Letter[] ltr_array = new Letter[26];

    public LettersAdapter(Letter[] ltr_array){
        this.ltr_array = ltr_array;
    }
    @NonNull
    @Override
    public LettersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image,
                parent,
                false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LettersAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), ltr_array[position].getImageId());
        imageView.setImageDrawable(dr);
        Button btn = (Button)cardView.findViewById(R.id.btn);
        btn.setText(ltr_array[position].getLetter());
        String uri = "@raw/" + ltr_array[position].getLetter().toLowerCase();
        int resID = cardView.getResources().getIdentifier(uri, null, cardView.getContext().getPackageName());
        btn.setOnClickListener(v -> {
            MediaPlayer mp = MediaPlayer.create(cardView.getContext(), resID);
            mp.start();
        });
    }

    @Override
    public int getItemCount() {
        return ltr_array.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }
    }


}
