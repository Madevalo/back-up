package com.madevalo.morningprojectten;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Button mbtnReg,mbtnLog;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root= inflater.inflate(R.layout.fragment_home, container, false);
        mbtnReg=root.findViewById(R.id.btnReg);
        mbtnLog= root.findViewById(R.id.btnLog);
        mbtnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Register clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mbtnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Log In clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}
