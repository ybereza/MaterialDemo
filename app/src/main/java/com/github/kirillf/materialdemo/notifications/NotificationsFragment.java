package com.github.kirillf.materialdemo.notifications;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.kirillf.materialdemo.R;

/**
 * Created by k.filimonov on 11/04/2017.
 */

public class NotificationsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.notifications_fragment, container, false);
    }
}
