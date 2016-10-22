package com.google.android.apps.dialer.phenotype;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
public final class UpdateBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.phenotype.UPDATE".equals(intent.getAction())) {
            context.startService(new Intent(context, ExperimentCommitService.class));
        }
    }
}
