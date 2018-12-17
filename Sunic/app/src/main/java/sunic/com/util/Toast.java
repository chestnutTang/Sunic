package sunic.com.util;

import android.content.Context;

/**
 * Sunic
 * Created by szp
 * on 2018.12.17
 * @author songzhengpeng
 */
public class Toast {
    public static void Toast(Context context, String content) {
        android.widget.Toast.makeText(context, content, android.widget.Toast.LENGTH_SHORT).show();
    }
}
