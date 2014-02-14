package com.example.fragment3.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment3.R;

public class MessageFragment extends Fragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v("MessageFragment", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.v("MessageFragment", "onCreateView");
		View view = inflater.inflate(R.layout.fragment_message, container,
				false);
		return view;
	}

	@Override
	public void onAttach(Activity activity) {
		Log.v("MessageFragment", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v("MessageFragment", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v("MessageFragment", "onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.v("MessageFragment", "onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v("MessageFragment", "onPause");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.v("MessageFragment", "onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v("MessageFragment", "onStart");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.v("MessageFragment", "onStop");
		super.onStop();
	}
}
