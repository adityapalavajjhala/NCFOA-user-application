package com.example.ncfoa_user_application.ui.order_current;

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

public class OrderCurrentFragment extends Fragment {

    private OrderCurrentViewModel orderCurrentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        orderCurrentViewModel =
                new ViewModelProvider(this).get(OrderCurrentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_order_current, container, false);
        final TextView textView = root.findViewById(R.id.text_order_current);
        orderCurrentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}