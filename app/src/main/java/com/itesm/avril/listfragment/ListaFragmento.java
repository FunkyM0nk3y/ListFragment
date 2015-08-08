package com.itesm.avril.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;


public class ListaFragmento extends ListFragment {
    private PerrosListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);

      ArrayList<Perro> p =new ArrayList<Perro>();
      p.add(new Perro("Rocky", "Silky Terrier", "20 kg",
              "Es un perro elegante, de cuerpo largo y talla baja, su longitud es del doble de la talla."));
      p.add(new Perro("Dixie", "Dalmata", "40 kg",
              "Es un perro de cuerpo robusto, cabeza ancha, orejas colgantes bien pegadas a las mejillas, ojos oscuros, nariz ancha, mandibulas y cuello poderoso para sostener a la presa durante el cobro."));
      p.add(new Perro("Norton", "Chihuahua", "4 kg",
              "Esta es la raza mas pequena de todas las existentes con un peso que va de los 500 gramos a los 3 Kg. Su cuerpo es ligeramente mas largo que alto."));
      p.add(new Perro("Max", "Beagle", "20 kg",
              "Es un perro de pequeno a mediano en tamano, es compacto y tiene una cabeza potente."));
      p.add(new Perro("Mylo", "Dashound", "9 kg",
              "Es un perro de pequeno a mediano en tamano, es compacto y tiene orejas grandes."));
      p.add(new Perro("Goran", "Pembroke", "15 kg",
              "Es un perro de mediano en tamano, es compacto, fuerte y de mucho vigor."));

      adapter = new PerrosListAdapter(getActivity(),p);
      setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Perro r = (Perro) getListAdapter().getItem(position);
        DetalleFragment df = (DetalleFragment) this.getFragmentManager().findFragmentById(R.id.fragment2);
        if ( df!=null && df.isInLayout() ){
            df.setText(r);
        }
    }
}