package top.itning.yunshuclassschedule.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import top.itning.yunshuclassschedule.entity.EventEntity;
import top.itning.yunshuclassschedule.service.ClassScheduleService;
import top.itning.yunshuclassschedule.service.CommonService;
import top.itning.yunshuclassschedule.service.DownloadService;

/**
 * Base App Activity
 *
 * @author itning
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, CommonService.class));
        startService(new Intent(this, ClassScheduleService.class));
        startService(new Intent(this, DownloadService.class));
    }

    /**
     * 消息事件
     *
     * @param eventEntity what
     */
    public abstract void onMessageEvent(EventEntity eventEntity);
}
