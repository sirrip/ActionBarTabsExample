package com.rtmillerprojects.actionbartabsexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ryan on 5/21/2016.
 */
public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1_layout, container, false);
    }
    /*
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        if(container==null) {
            return null;
        }
        return inflater.inflate(R.layout.fragment1_layout, container, false);
    }
    */

}
