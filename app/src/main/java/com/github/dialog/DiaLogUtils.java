package com.github.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by zhanggang on 2017/10/17.
 */

public class DiaLogUtils {
    public static void showMyDiaLog(final Context context, String title, String message) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "点击了确定！", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "点击了取消！", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

    public static void showIconDiaLog(final Context context, String title, String message) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setIcon(R.mipmap.a2)
                .setMessage(message)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "点击了确定...", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "点击了取消...", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }


}

