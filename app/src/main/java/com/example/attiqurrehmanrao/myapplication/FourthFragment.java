package com.example.attiqurrehmanrao.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourthFragment extends BaseFragment {
    @Override
    public void onBackStackUpdate() {
        setTitle("FOUR");
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText("FOUR");
        return view;
    }
}