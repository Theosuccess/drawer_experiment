package com.example.navdrawerexperiment.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navdrawerexperiment.R;

public class ToolsFragment extends Fragment {
    //add the TextView variable
    TextView tText;
    // overide onCreate view

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tools, container, false);
        //fine the tool text and save it in tText
        tText = root.findViewById(R.id.text_tools);
        // set text on tText
        tText.setText("This is Tools Fragment");
        return root;
    }
}
