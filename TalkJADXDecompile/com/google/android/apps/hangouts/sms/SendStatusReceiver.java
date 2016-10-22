package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import bhl;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import fyn;
import fyo;
import fyp;
import glk;
import jyn;
import kae;

public class SendStatusReceiver extends BroadcastReceiver {
    public static final boolean a;

    static {
        kae kae = glk.r;
        a = false;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int resultCode = getResultCode();
        if (a) {
            new StringBuilder(String.valueOf(action).length() + 28).append("Action: ").append(action).append(" result: ").append(resultCode);
            if (resultCode == 1 && intent.hasExtra("errorCode")) {
                new StringBuilder(23).append("Error code: ").append(intent.getIntExtra("errorCode", 0));
            }
        }
        if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_SENT".equals(action)) {
            long parseId = ContentUris.parseId(intent.getData());
            if (a) {
                new StringBuilder(32).append("Request ID: ").append(parseId);
            }
            ((bhl) jyn.a(context, bhl.class)).a(new fyp(parseId, resultCode));
        } else if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_SENT".equals(action)) {
            ((bhl) jyn.a(context, bhl.class)).a(new fyo(ContentUris.parseId(intent.getData()), resultCode, intent.getIntExtra("android.telephony.extra.MMS_HTTP_STATUS", 0), intent.getByteArrayExtra("android.telephony.extra.MMS_DATA")));
        } else if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_DOWNLOADED".equals(action)) {
            ((bhl) jyn.a(context, bhl.class)).a(new fyn(ContentUris.parseId(intent.getData()), resultCode, intent.getIntExtra("android.telephony.extra.MMS_HTTP_STATUS", 0)));
        } else if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_DELIVERED".equals(action)) {
            RealTimeChatService.d(intent);
        }
    }
}
