package com.example.webview2;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by 潘硕 on 2017/11/15.
 */

public class MyObject {
    private Context context;
    public MyObject(Context context){
        this.context=context;
    }

    public void showToast(String name){
        Toast.makeText(context,name,Toast.LENGTH_SHORT).show();
    }

    public void showDialog(){
        new AlertDialog.Builder(context)
                .setTitle("联系人列表").setIcon(R.mipmap.ic_launcher)
                .setItems(new String[]{"A","B","C","D","E"},null)
                .setPositiveButton("确定",null).create().show();
    }
}
