package amani.aslan.amani.amanishoppinglist.mainlistfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentFragment extends Fragment {
    private TextView TVTotal;
    private TextView TVTotalValue;
    private TextView TVCount;
    private TextView TVCountValue;
    private ImageButton IMBSAVE;
    private ListView LSVCurrent;


    public CurrentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(amani.amani.amani4.Amanishoppinglist.R.layout.fragment_current, container, false);
        TVTotal=(TextView) view.findViewById(amani.amani.amani4.Amanishoppinglist.R.id.TVTotal);
        TVTotalValue=(TextView) view.findViewById(amani.amani.amani4.Amanishoppinglist.R.id.TVTotalValue);
        TVCount=(TextView) view.findViewById(amani.amani.amani4.Amanishoppinglist.R.id.TVCount);
        TVCountValue=(TextView) view.findViewById(amani.amani.amani4.Amanishoppinglist.R.id.TVCountValue);
        IMBSAVE=(ImageButton) view.findViewById(amani.amani.amani4.Amanishoppinglist.R.id.IMBSAVE);
        LSVCurrent=(ListView) view.findViewById(amani.amani.amani4.Amanishoppinglist.R.id.LSTVCurrent);

        String []ar={"stam1","stam2","stam3"};
        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,)

        //4.
        return view;
    }

}
