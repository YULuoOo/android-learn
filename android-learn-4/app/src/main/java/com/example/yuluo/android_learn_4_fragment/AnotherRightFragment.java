package com.example.yuluo.android_learn_4_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AnotherRightFragment extends Fragment {
    public static final String TAG = "RightFragment";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"AnotherRightFragment onAttach");
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"AnotherRightFragment onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"AnotherRightFragment onCreateView");
        View view = inflater.inflate(R.layout.another_right_frag,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"AnotherRightFragment onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"AnotherRightFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"AnotherRightFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"AnotherRightFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"AnotherRightFragment onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"AnotherRightFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"AnotherRightFragment onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"AnotherRightFragment onDetach");
    }
}
