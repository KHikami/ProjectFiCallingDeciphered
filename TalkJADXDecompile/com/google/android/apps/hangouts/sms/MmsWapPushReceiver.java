package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bhl;
import fde;
import fym;
import jyn;

public class MmsWapPushReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.provider.Telephony.WAP_PUSH_RECEIVED".equals(intent.getAction()) && "application/vnd.wap.mms-message".equals(intent.getType()) && fde.i()) {
            ((bhl) jyn.a(context, bhl.class)).a(new fym(fde.k(), intent.getByteArrayExtra("data")));
        }
    }
}
