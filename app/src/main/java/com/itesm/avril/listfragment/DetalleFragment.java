package com.itesm.avril.listfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetalleFragment extends Fragment {
    public TextView textUno;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
      View view = inflater.inflate(R.layout.layout_detalle, container, false);
      textUno = (TextView) view.findViewById(R.id.textView3);

      return view;
    }

    public void setText(Perro r){
        textUno.setText(r.getCaracteristicas());
    }
}
