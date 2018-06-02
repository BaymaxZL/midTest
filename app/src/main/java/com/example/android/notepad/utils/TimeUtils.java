package com.example.android.notepad.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhoupf on 2018/5/24.
 */

public class TimeUtils {

    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

}
