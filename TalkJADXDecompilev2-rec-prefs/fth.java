package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class fth extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            ((eaj) jyn.m25426a(context, eaj.class)).mo1803a(context, false);
        }
    }
}
