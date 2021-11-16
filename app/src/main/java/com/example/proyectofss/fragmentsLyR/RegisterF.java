package com.example.proyectofss.fragmentsLyR;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.proyectofss.Home;
import com.example.proyectofss.databinding.FragmentRegisterBinding;


public class RegisterF extends Fragment {

    private FragmentRegisterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentRegisterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.button2.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), Home.class));
            ((Activity)getContext()).finish();
            onDestroyView();
        });
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}