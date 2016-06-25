package com.example.yangdianwen.retrofitandrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ListView listView;
    private List<JavaBean.ResultsBean> data;
    private MyAdapter myAdapter;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lv);
        data=new ArrayList<>();
        //获取retrofit对象
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Constans.BASE_URL)
                //添加转换器
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        //获取网络服务
        MyInterfaceService service = retrofit.create(MyInterfaceService.class);
        Call<ResponseBody> string = service.getString();
        //响应回调接口
        string.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
               //如果响应成功，读取数据
                if (response.isSuccessful()){
                    try {
                         s = response.body().string();
                        //创建被观察者
                      Observable.create(new Observable.OnSubscribe<String>() {
                          @Override
                          public void call(Subscriber<? super String> subscriber) {
                              //调用call方法进行数据操作，解析数据
                              Gson gson=new Gson();
                              JavaBean bean = gson.fromJson(s, JavaBean.class);
                              List<JavaBean.ResultsBean> results = bean.getResults();
                              for (int i = 0; i <results.size() ; i++) {
                                  data.add(results.get(i));
                              }
                              subscriber.onNext(data.toString());
                          }
                      }) .subscribe(new Observer<String>() {//创建订阅者
                          @Override
                          public void onCompleted() {

                          }

                          @Override
                          public void onError(Throwable e) {

                          }
                          @Override
                          public void onNext(String s) {
                              myAdapter=new MyAdapter(data,MainActivity.this);
                              listView.setAdapter(myAdapter);
                          }
                      }) ;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });
    }
}
