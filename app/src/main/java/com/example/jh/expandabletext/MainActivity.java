package com.example.jh.expandabletext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * 微信朋友圈的消息全文与收起效果demo
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRvTestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRvTestList = (RecyclerView) findViewById(R.id.rv_test_list);
        mRvTestList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRvTestList.setAdapter(new TestListAdapter(this));
    }
}
