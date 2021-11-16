package com.example.proyectofss.fragmentsIyC;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.proyectofss.R;
import com.example.proyectofss.databinding.FragmentCategoriasBinding;

public class CategoriasF extends Fragment {

    private FragmentCategoriasBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCategoriasBinding.inflate(inflater, container, false);

        CustomAdapterCategorias customAdapterCategorias = new CustomAdapterCategorias(getContext());
        binding.gridViewCategorias.setAdapter(customAdapterCategorias);
        binding.gridViewCategorias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Navigation.findNavController(view).navigate(R.id.navigation_categorias_to_listaProductos);
            }
        });
        View root = binding.getRoot();

        return root;
    }

}