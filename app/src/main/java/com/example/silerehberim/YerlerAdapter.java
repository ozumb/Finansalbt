package com.example.silerehberim;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class YerlerAdapter extends RecyclerView.Adapter<YerlerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Yerler> yerlerList;

    public YerlerAdapter(Context mContext, List<Yerler> yerlerList) {
        this.mContext = mContext;
        this.yerlerList = yerlerList;
    }


    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.yer_card_tasarim,parent,false);

        return new CardTasarimTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
Yerler yer=yerlerList.get(position);

holder.textViewYerAd.setText(yer.getYer_ad());


holder.imageViewYerResim.setImageResource(mContext.getResources().getIdentifier(yer.getYer_resim()
        ,"drawable"
        ,mContext.getPackageName()));


holder.yer_card.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(mContext,DetayActivity.class);
        intent.putExtra("nesne",yer);
        mContext.startActivity(intent);
    }
});

    }

    @Override
    public int getItemCount() {
       return yerlerList.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardView yer_card;
        private TextView textViewYerAd;
        private ImageView imageViewYerResim;

        public CardTasarimTutucu(@NonNull View itemView) {
            super(itemView);

            yer_card=itemView.findViewById(R.id.yer_card);
            textViewYerAd=itemView.findViewById(R.id.textViewYerAd);
            imageViewYerResim=itemView.findViewById(R.id.imageViewYerResim);
        }
    }
}


