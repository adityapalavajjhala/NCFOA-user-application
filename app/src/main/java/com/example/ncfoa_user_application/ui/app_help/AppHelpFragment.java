package com.example.ncfoa_user_application.ui.app_help;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ncfoa_user_application.R;

public class AppHelpFragment extends Fragment {

    private AppHelpViewModel appHelpViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        appHelpViewModel =
                new ViewModelProvider(this).get(AppHelpViewModel.class);
        View root = inflater.inflate(R.layout.fragment_app_help, container, false);
        final TextView textView = root.findViewById(R.id.text_app_help);
        appHelpViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}