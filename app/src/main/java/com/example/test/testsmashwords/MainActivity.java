package com.example.test.testsmashwords;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;


public class MainActivity extends ActionBarActivity {

    FrameLayout frameLayout;

    private final  String CARD_LAYOUT_FRAGMENT="cardlayoutfragment";

    private final  String LIST_LAYOUT_FRAGMENT="listlayoutfragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.fragment_container);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Adding a Fragment containing card layout
     */
    public void addCardFragment() {
        CardLayoutFragment fragment = new CardLayoutFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, fragment).addToBackStack(CARD_LAYOUT_FRAGMENT).commit();
    }

    /**
     * Adding a fragment containing list layout
     */
    public void addListFragment() {
        ListFragment fragment = new ListFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, fragment).addToBackStack(LIST_LAYOUT_FRAGMENT).commit();
    }
}


