package com.example.proyectofss.fragmentsIyC;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectofss.databinding.FragmentListaProductosBinding;


public class ListaProductos extends Fragment {

    private FragmentListaProductosBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListaProductosBinding.inflate(inflater, container, false);
        String []ob ={"1", "2", "3"};
        CustomAdapterProductos customAdapterProductos = new CustomAdapterProductos(getContext(),ob);
        binding.reciclerViewProductos.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.reciclerViewProductos.setAdapter(customAdapterProductos);
        View root = binding.getRoot();

        return root;
    }
}