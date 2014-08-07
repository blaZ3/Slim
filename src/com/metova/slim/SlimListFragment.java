package com.metova.slim;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class SlimListFragment extends ListFragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Slim.injectCallbacks(this, activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Slim.injectExtras(getArguments(), this);
    }
}