package com.niceapp.lib.tagview;

import java.util.ArrayList;
import java.util.List;

import com.niceapp.lib.tagview.widget.Tag;
import com.niceapp.lib.tagview.widget.TagListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * @author Forty'7
 * @time 2016.1.10
 * @category tagview 
 * 
 */
public class MainActivity extends Activity {

	private TagListView mTagListView;
	private final List<Tag> mTags = new ArrayList<Tag>();
	private final String[] titles = { "普通话", "英语" , "粤语", "俄语", "日语", "法语", "西班牙语", "意大利语", "阿布哈兹语", "阿拉伯语", "阿维斯陀语"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_tag_activity);

		mTagListView = (TagListView) findViewById(R.id.tagview);
		setUpData();
		mTagListView.setTags(mTags);
		
		
	}

	private void setUpData() {
		for (int i = 0; i < titles.length; i++) {
			Tag tag = new Tag();
			tag.setId(i);
			tag.setChecked(true);
			tag.setTitle(titles[i]);
			mTags.add(tag);
		}
	}
}
