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
public class GalleryFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    Button gbtnReg,gbtnLog;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        gbtnReg=root.findViewById(R.id.btnReg);
        gbtnLog= root.findViewById(R.id.btnLog);
        gbtnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Register clicked", Toast.LENGTH_SHORT).show();
            }
        });
        gbtnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Log In clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    // TODO: Rename method, update argument and hook method into UI event
}
