package com.example.mentalwarning.Class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mentalwarning.R;
import com.example.mentalwarning.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {

    private ActivitySearchBinding binding;

    private TextView search_tv_cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//设置状态栏黑色字
        }

        setContentView(R.layout.activity_search);

        initView();
    }

    private void initView(){
        search_tv_cancel = binding.searchTvCancel;
        search_tv_cancel.setOnClickListener(v->{
            this.finish();
        });
    }
}