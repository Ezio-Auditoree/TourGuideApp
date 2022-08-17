package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment {

    View view;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaurantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantFragment newInstance(String param1, String param2) {
        RestaurantFragment fragment = new RestaurantFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.the_blue_restaurant), R.drawable.theblue_restaurant));
        locations.add(new Location(getString(R.string.beeja_restaurant), R.drawable.beeja_restaurant));
        locations.add(new Location(getString(R.string.lobby_lounge_restaurant), R.drawable.lobbylounge_restaurant));
        locations.add(new Location(getString(R.string.saigon_bleu_restaurant), R.drawable.saigonbleu_restaurant));
        locations.add(new Location(getString(R.string.the_blue_restaurant), R.drawable.theblue_restaurant));
        locations.add(new Location(getString(R.string.beeja_restaurant), R.drawable.beeja_restaurant));
        locations.add(new Location(getString(R.string.lobby_lounge_restaurant), R.drawable.lobbylounge_restaurant));
        locations.add(new Location(getString(R.string.saigon_bleu_restaurant), R.drawable.saigonbleu_restaurant));
        locations.add(new Location(getString(R.string.the_blue_restaurant), R.drawable.theblue_restaurant));
        locations.add(new Location(getString(R.string.beeja_restaurant), R.drawable.beeja_restaurant));
        locations.add(new Location(getString(R.string.lobby_lounge_restaurant), R.drawable.lobbylounge_restaurant));
        locations.add(new Location(getString(R.string.saigon_bleu_restaurant), R.drawable.saigonbleu_restaurant));

        view = inflater.inflate(R.layout.location_list, container, false);

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        // Create ListView object in places_list.xml and set the LocationAdapter object to it
        ListView listView = view.findViewById(R.id.list);
        listView.setAdapter((ListAdapter) locationAdapter);

        // Return current View object with the data
        return view;
    }
}