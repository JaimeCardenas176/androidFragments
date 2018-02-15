package com.example.jaime.vuelos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Date;
import java.util.List;


public class MyVueloRecyclerViewAdapter extends RecyclerView.Adapter<MyVueloRecyclerViewAdapter.ViewHolder> {

    private Context contexto;
    private final List<Vuelo> mValues;

    public MyVueloRecyclerViewAdapter(Context contexto, List<Vuelo> mValues) {
        this.contexto = contexto;
        this.mValues = mValues;
    }

    //aqui se carga el vuelo fragment?
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_vuelo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        holder.salida.setText(holder.mItem.getSalida().toString());
        holder.destino.setText(holder.mItem.getDestino().toString());
        holder.plazas.setText(String.valueOf(holder.mItem.getPlazas()));

        Picasso.with(contexto)
                .load(holder.mItem.getUrlImageCompany())
                .resize(600, 150)
                .centerCrop()
                .into(holder.foto);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView salida;
        private TextView destino;
        private TextView plazas;
        private TextView precio;
        private TextView company;
        private ImageView foto;
        public final View mView;
        public Vuelo mItem;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            salida = view.findViewById(R.id.salida);
        }

    }
}

