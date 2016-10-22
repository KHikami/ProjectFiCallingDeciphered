package com.google.android.apps.hangouts.service.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.service.ReferrerTrackingService;

public final class ReferrerTrackingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) && stringExtra != null) {
            Intent intent2 = new Intent(context, ReferrerTrackingService.class);
            intent2.putExtra("referrer", stringExtra);
            context.startService(intent2);
        }
    }
}
