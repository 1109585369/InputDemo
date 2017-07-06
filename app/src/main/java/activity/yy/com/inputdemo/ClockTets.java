package activity.yy.com.inputdemo;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class ClockTets extends AppCompatActivity {

    Chronometer ch;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_tets);

        //获取计时器组件
        ch= (Chronometer) findViewById(R.id.chronometer);
        //获取开始按钮
        bt= (Button) findViewById(R.id.start);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置开始计时时间
                ch.setBase(SystemClock.elapsedRealtime());
                //启动计时器
                ch.start();
                bt.setEnabled(false);

            }
        });

        //为chronometer绑定事件监听器
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                //如果从开始计时到现在超过了20s
                if(SystemClock.elapsedRealtime()-ch.getBase()>20*1000)
                {
                    ch.stop();
                    bt.setEnabled(true);
                }
            }
        });
    }
}
