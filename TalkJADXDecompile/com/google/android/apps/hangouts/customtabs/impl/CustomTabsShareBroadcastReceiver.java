package com.google.android.apps.hangouts.customtabs.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gwb;

public final class CustomTabsShareBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        Intent intent2 = new Intent("android.intent.action.SEND");
        CharSequence string = context.getResources().getString(gwb.nG);
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", dataString);
        Intent createChooser = Intent.createChooser(intent2, string);
        createChooser.setFlags(268435456);
        if (intent2.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(createChooser);
        }
    }
}
