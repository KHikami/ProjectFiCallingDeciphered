package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fti extends BroadcastReceiver {
    public fti() {
        gwb.m1445R();
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(intent.getAction())) {
            RealTimeChatService.m9109f();
        } else if ("android.intent.action.DEVICE_STORAGE_OK".equals(intent.getAction())) {
            RealTimeChatService.m9115g();
        }
    }
}
