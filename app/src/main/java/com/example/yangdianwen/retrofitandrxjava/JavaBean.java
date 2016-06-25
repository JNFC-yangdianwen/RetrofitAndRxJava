package com.example.yangdianwen.retrofitandrxjava;

import java.util.List;

/**
 * Created by yangdianwen on 16-6-24.
 */
public class JavaBean {

    /**
     * error : false
     * results : [{"_id":"576ca580421aa94f422c94fb","createdAt":"2016-06-24T11:14:08.166Z","desc":"各种动画效果的LoadingView","publishedAt":"2016-06-24T12:01:16.638Z","source":"chrome","type":"Android","url":"https://github.com/ldoublem/LoadingView","used":true,"who":"dreamxuwj"},{"_id":"576ca4d9421aa9024497c2de","createdAt":"2016-06-24T11:11:21.321Z","desc":"带点击和滑动删除的recyclerview","publishedAt":"2016-06-24T12:01:16.638Z","source":"chrome","type":"Android","url":"https://github.com/nikhilpanju/RecyclerViewEnhanced","used":true,"who":"dreamxuwj"},{"_id":"576c8f6b421aa94f422c94fa","createdAt":"2016-06-24T09:39:55.951Z","desc":"Android Material Design Icon Generator Plugin","publishedAt":"2016-06-24T12:01:16.638Z","source":"web","type":"Android","url":"https://github.com/konifar/android-material-design-icon-generator-plugin","used":true,"who":"潇涧"},{"_id":"576c6f3a421aa94f365b4fce","createdAt":"2016-06-24T07:22:34.763Z","desc":"实现1-7阶贝塞尔曲线的形成动画","publishedAt":"2016-06-24T12:01:16.638Z","source":"chrome","type":"Android","url":"https://github.com/venshine/BezierMaker","used":true,"who":"大熊"},{"_id":"576b5b71421aa94f422c94e5","createdAt":"2016-06-23T11:45:53.286Z","desc":"MaterialDateTimePicker","publishedAt":"2016-06-24T12:01:16.638Z","source":"chrome","type":"Android","url":"https://github.com/wdullaer/MaterialDateTimePicker","used":true,"who":"wuzheng"},{"_id":"576b3cbb421aa9363a0d7a52","createdAt":"2016-06-23T09:34:51.610Z","desc":"使用 DialogFragment 实现底部弹窗布局","publishedAt":"2016-06-23T11:58:15.971Z","source":"chrome","type":"Android","url":"https://github.com/SpikeKing/BottomDialogDemo","used":true,"who":"大熊"},{"_id":"576b395f421aa9364a525e67","createdAt":"2016-06-23T09:20:31.296Z","desc":"流程指示器","publishedAt":"2016-06-23T11:58:15.971Z","source":"chrome","type":"Android","url":"https://github.com/baoyachi/StepView","used":true,"who":"大熊"},{"_id":"5769f7f3421aa914aa400c01","createdAt":"2016-06-22T10:29:07.839Z","desc":"可读取pdf文件的view","publishedAt":"2016-06-22T11:57:27.848Z","source":"chrome","type":"Android","url":"https://github.com/barteksc/AndroidPdfViewer","used":true,"who":"dreamxuwj"},{"_id":"5769f37d421aa914aa400bfe","createdAt":"2016-06-22T10:10:05.954Z","desc":"给用户提供一个好看的 Rating 打分效果","publishedAt":"2016-06-22T11:57:27.848Z","source":"chrome","type":"Android","url":"https://github.com/eugeneek/SmileBar","used":true,"who":"代码家"},{"_id":"5769f347421aa91496a32dc1","createdAt":"2016-06-22T10:09:11.768Z","desc":"超实用的 Android 图片压缩工具。","publishedAt":"2016-06-22T11:57:27.848Z","source":"chrome","type":"Android","url":"https://github.com/zetbaitsu/Compressor","used":true,"who":"代码家"}]
     */

    private boolean error;
    /**
     * _id : 576ca580421aa94f422c94fb
     * createdAt : 2016-06-24T11:14:08.166Z
     * desc : 各种动画效果的LoadingView
     * publishedAt : 2016-06-24T12:01:16.638Z
     * source : chrome
     * type : Android
     * url : https://github.com/ldoublem/LoadingView
     * used : true
     * who : dreamxuwj
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}

