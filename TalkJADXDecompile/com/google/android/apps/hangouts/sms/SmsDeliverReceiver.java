package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bhl;
import fde;
import fyw;
import jyn;

public final class SmsDeliverReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (fde.i() && !SmsReceiver.a(intent)) {
            ((bhl) jyn.a(context, bhl.class)).a(new fyw(fde.k(), intent));
        }
    }
}
