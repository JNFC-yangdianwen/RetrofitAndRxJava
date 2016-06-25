package com.example.yangdianwen.retrofitandrxjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yangdianwen on 16-6-24.
 */
public class MyAdapter extends BaseAdapter {
    private List<JavaBean.ResultsBean> mData;
    private LayoutInflater mInflater;
    private Context context;

    public MyAdapter(List<JavaBean.ResultsBean> mData,Context context ) {
        this.mData = mData;
        this.context=context;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        if (mData!=null){
            return mData.size();
        }
        return 0;
    }
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView = mInflater.inflate(R.layout.item, null);
        }
        TextView tv1 = (TextView) convertView.findViewById(R.id.tv1);
        TextView tv2 = (TextView) convertView.findViewById(R.id.tv2);
        TextView tv3 = (TextView) convertView.findViewById(R.id.tv3);
        JavaBean.ResultsBean jb=mData.get(position);
        tv1.setText(jb.getDesc());
        tv2.setText(jb.getPublishedAt());
        tv3.setText(jb.getWho());
        return convertView;
    }
}
