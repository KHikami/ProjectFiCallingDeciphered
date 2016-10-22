package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import bhl;
import com.google.android.apps.hangouts.service.NoConfirmationSmsSendService;
import fde;
import fyw;
import gae;
import glk;
import gwb;
import java.util.regex.Pattern;
import jyn;

public final class SmsReceiver extends BroadcastReceiver {
    private static Pattern[] a;

    public static void a() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        Context H = gwb.H();
        boolean z4;
        if (VERSION.SDK_INT >= 19) {
            if (jyn.b(H, gae.class) == null) {
                int i = 1;
            } else {
                z4 = false;
            }
            z = false;
            z2 = false;
        } else {
            z3 = fde.i();
            z4 = z3;
            z = z3;
            z2 = z3;
        }
        PackageManager packageManager = H.getPackageManager();
        if (z2) {
            packageManager.setComponentEnabledSetting(new ComponentName(H, SmsReceiver.class), 1, 1);
        } else {
            packageManager.setComponentEnabledSetting(new ComponentName(H, SmsReceiver.class), 2, 1);
        }
        if (z) {
            packageManager.setComponentEnabledSetting(new ComponentName(H, MmsWapPushReceiver.class), 1, 1);
        } else {
            packageManager.setComponentEnabledSetting(new ComponentName(H, MmsWapPushReceiver.class), 2, 1);
        }
        if (z3) {
            packageManager.setComponentEnabledSetting(new ComponentName(H, AbortSmsReceiver.class), 1, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(H, AbortMmsWapPushReceiver.class), 1, 1);
        } else {
            packageManager.setComponentEnabledSetting(new ComponentName(H, AbortSmsReceiver.class), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(H, AbortMmsWapPushReceiver.class), 2, 1);
        }
        if (i != 0) {
            packageManager.setComponentEnabledSetting(new ComponentName(H, NoConfirmationSmsSendService.class), 1, 1);
        } else {
            packageManager.setComponentEnabledSetting(new ComponentName(H, NoConfirmationSmsSendService.class), 2, 1);
        }
    }

    public static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object[] objArr = (Object[]) extras.get("pdus");
        if (objArr.length <= 0) {
            return false;
        }
        SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) objArr[0]);
        if (createFromPdu == null) {
            return false;
        }
        CharSequence messageBody;
        CharSequence charSequence = null;
        try {
            messageBody = createFromPdu.getMessageBody();
        } catch (Throwable e) {
            glk.d("Babel_SMS", "SmsReceiver: failed to get message body ", e);
            messageBody = charSequence;
        }
        if (messageBody == null) {
            return false;
        }
        int i;
        if (a == null) {
            String b = gwb.b(gwb.H(), "babel_sms_ignore_message_regex", "VZWNMN:\\d+\n//wma::\\d+\\s//.*\nActivate:dt=\\d+\n//ANDROID:.*//CM\n\\S+\\.attwireless\\.net:\\d+\\?.*\nvvm\\.mobile\\.att\\.net:\\d+\\?.*\n");
            if (b != null) {
                String[] split = b.split("\n");
                if (split.length != 0) {
                    a = new Pattern[split.length];
                    for (i = 0; i < split.length; i++) {
                        a[i] = Pattern.compile(split[i]);
                    }
                }
            }
        }
        for (Pattern matcher : a) {
            if (matcher.matcher(messageBody).matches()) {
                return true;
            }
        }
        return false;
    }

    public void onReceive(Context context, Intent intent) {
        if (VERSION.SDK_INT < 19 && fde.i() && !a(intent)) {
            ((bhl) jyn.a(context, bhl.class)).a(new fyw(fde.k(), intent));
        }
    }
}
