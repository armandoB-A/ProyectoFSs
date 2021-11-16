package com.example.proyectofss.fragmentsIyC;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyectofss.R;

public class CustomAdapterCategorias extends BaseAdapter {
    Context context;
    String[] textos= {"ROPA", "CELULARES", "JUGETES", "COMPUTADORAS", "TELEVISIONES",
            "MOTOCICLETAS", "LINEA BLANCA", "MUEBLES"};
    int[] imagenes= {R.drawable.ropa, R.drawable.celular, R.drawable.jugetes, R.drawable.laptop,
            R.drawable.tele, R.drawable.moto, R.drawable.lavadora, R.drawable.muebles};

    LayoutInflater inflter;
    public CustomAdapterCategorias(Context applicationContext) {
        this.context = applicationContext;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return textos.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.item_categoria, null); // inflate the layout

        ImageView imagen = (ImageView) view.findViewById(R.id.imageView); // get the reference of ImageView
        imagen.setImageResource(imagenes[i]); // set logo images

        TextView Text = (TextView) view.findViewById(R.id.textView); // get the reference of ImageView
        Text.setText(textos[i]); // set logo images

        return view;
    }
}