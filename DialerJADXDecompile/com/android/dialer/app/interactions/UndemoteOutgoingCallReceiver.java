package com.android.dialer.app.interactions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.PhoneLookup;
import android.provider.ContactsContract.PinnedPositions;
import android.text.TextUtils;
import apq;
import buf;

/* compiled from: PG */
public class UndemoteOutgoingCallReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (buf.c(context, "android.permission.READ_CONTACTS") && buf.c(context, "android.permission.WRITE_CONTACTS") && intent != null && "android.intent.action.NEW_OUTGOING_CALL".equals(intent.getAction())) {
            Object stringExtra = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
            if (!TextUtils.isEmpty(stringExtra)) {
                new apq(this, context, stringExtra).start();
            }
        }
    }

    public static void a(Context context, long j) {
        if (buf.c(context, "android.permission.WRITE_CONTACTS")) {
            try {
                PinnedPositions.undemote(context.getContentResolver(), j);
            } catch (SecurityException e) {
            }
        }
    }

    public static long a(Context context, String str) {
        if (!buf.c(context, "android.permission.READ_CONTACTS")) {
            return -1;
        }
        Uri withAppendedPath = Uri.withAppendedPath(PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str));
        try {
            Cursor query = context.getContentResolver().query(withAppendedPath, new String[]{"_id"}, null, null, null);
            if (query == null) {
                return -1;
            }
            try {
                if (query.moveToFirst()) {
                    long j = query.getLong(0);
                    return j;
                }
                query.close();
                return -1;
            } finally {
                query.close();
            }
        } catch (SecurityException e) {
            return -1;
        }
    }
}
