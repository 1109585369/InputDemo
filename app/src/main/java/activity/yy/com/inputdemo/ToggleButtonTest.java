package activity.yy.com.inputdemo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ToggleButtonTest extends AppCompatActivity {

    ToggleButton toggle;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_test);
        toggle= (ToggleButton) findViewById(R.id.toggle);
        aSwitch= (Switch) findViewById(R.id.switcher);
        final LinearLayout test=(LinearLayout)findViewById(R.id.test);

        CompoundButton.OnCheckedChangeListener listener=new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //设置LinearLayout垂直布局
                    test.setOrientation(1);
                    toggle.setChecked(true);
                    aSwitch.setChecked(true);
                }else{
                    //设置LinearLayout水平布局
                    test.setOrientation(1);
                    toggle.setChecked(true);
                    aSwitch.setChecked(false);
                }
            }
        };
        toggle.setOnCheckedChangeListener(listener);
        aSwitch.setOnCheckedChangeListener(listener);


    }
}
