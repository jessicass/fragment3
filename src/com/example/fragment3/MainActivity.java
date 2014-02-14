package com.example.fragment3;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity {

	// �ײ�ѡ�
	private RadioGroup bottomRg;
	private FragmentManager fragmentManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setFragmentIndicator();
	}

	private void setFragmentIndicator() {
		fragmentManager = getSupportFragmentManager();

		// ��Fragmentҳ��Ͷ�Ӧ��RadioButton
		final BiMap<Fragment, Integer> biMap = HashBiMap.create();
		biMap.put(fragmentManager.findFragmentById(R.id.fragment_home),
				R.id.rb_home);
		biMap.put(fragmentManager.findFragmentById(R.id.fragment_message),
				R.id.rb_message);
		biMap.put(fragmentManager.findFragmentById(R.id.fragment_setting),
				R.id.rb_setting);

		// Ĭ����ʾHomeFragment
		showFragmentByBtnId(biMap, R.id.rb_home);

		bottomRg = (RadioGroup) findViewById(R.id.bottomRg);
		bottomRg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				showFragmentByBtnId(biMap, checkedId);
			}
		});

	}

	private void showFragmentByBtnId(final BiMap<Fragment, Integer> biMap,
			int shownId) {
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		// ���������е�Fragment
		for (Fragment fragment : biMap.keySet()) {
			fragmentTransaction.hide(fragment);
		}
		// ��ʾ��Ӧ��Fragment
		fragmentTransaction.show(biMap.inverse().get(shownId)).commit();
		// biMap.inverse().get(R.id.rb_home)ͨ��biMap��Value���Key
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
