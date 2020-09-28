package com.example.navdrawerexperiment.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navdrawerexperiment.R;

import java.util.zip.Inflater;

public class ShareFragment extends Fragment {
    //add the TextView variable
    TextView sText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View root = inflater.inflate(R.layout.fragment_share, container, false);
        //fine the tool text and save it in tText
      sText = root.findViewById(R.id.text_share);
        // set text on sText
        sText.setText("This is Share Fragment");
        return root;
    }
}
