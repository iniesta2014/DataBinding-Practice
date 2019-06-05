package come.example.qiaowenhao.practicesdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import come.example.qiaowenhao.practicesdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1.使用DataBindingUtil.setContentView替代setContentView
        //2.ActivityMainBinding继承自ViewDataBinding,根据布局文件名字命名

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("qiaowenhao", 25);
        binding.setUser(user);
    }
}
