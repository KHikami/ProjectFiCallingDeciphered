package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fte */
public final class fte extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        RealTimeChatService.b();
    }
}
