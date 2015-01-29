package com.example.test.testsmashwords;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import Objects.CardGridObjects;
import adapters.CardGridAdapter;

/**
 * Created by umesh on 29/1/15.
 */
public class CardLayoutFragment extends Fragment {

    GridView gridView;
    CardGridAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_layout, null);
        gridView = (GridView) view.findViewById(R.id.grid_view);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAdapter = new CardGridAdapter(getActivity());
        gridView.setAdapter(mAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CardGridObjects obj = (CardGridObjects)mAdapter.getItem(position);

            }
        });
    }
}
