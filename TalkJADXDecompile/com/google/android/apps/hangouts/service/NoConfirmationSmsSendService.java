package com.google.android.apps.hangouts.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bcn;
import bko;
import blo;
import boy;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import fbt;
import fbw;
import fde;
import fei;
import fme;
import fmf;
import for;
import fsv;
import fyi;
import glk;
import gwb;
import iil;
import juh;
import jyn;
import kae;

public class NoConfirmationSmsSendService extends IntentService {
    private static final boolean a;

    static {
        kae kae = glk.q;
        a = false;
    }

    public NoConfirmationSmsSendService() {
        super(NoConfirmationSmsSendService.class.getName());
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.RESPOND_VIA_MESSAGE".equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                CharSequence string = extras.getString("android.intent.extra.TEXT");
                String string2 = extras.getString("android.intent.extra.SUBJECT");
                String b = fyi.b(intent.getData());
                if (!TextUtils.isEmpty(b) && fde.i()) {
                    bko k = fde.k();
                    if (extras.getBoolean("showUI", false)) {
                        intent.setClassName(this, "com.google.android.talk.SigningInActivity");
                        intent.addFlags(268435456);
                        intent.putExtra("account_id", k.g());
                        startActivity(intent);
                    } else if (!TextUtils.isEmpty(string)) {
                        if (k.D()) {
                            boolean z;
                            if (b.split(";").length == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            iil.a("Expected condition to be true", z);
                            action = b.split(";")[0];
                            fbw a = fbw.a(gwb.H(), action);
                            a.a(fbt.b(action));
                            juh a2 = juh.newBuilder().a(bcn.newBuilder().a(a).a()).a();
                            fme a3 = ((fmf) jyn.a(gwb.H(), fmf.class)).a();
                            RealTimeChatService.a(new fsv(this, getApplicationContext(), a3.a(), string2, string));
                            RealTimeChatService.a(a3, new fei(getApplicationContext()).a(k.g()).a(a2).a(boy.LOCAL_AND_SERVER).b(2).a());
                            return;
                        }
                        ((for) jyn.a(getApplicationContext(), for.class)).a(k, fyi.a(new blo(this, k.g()), null, b), string, null, 0, null, 0, 0, null, string2, false, null, 0, blo.a(k.g(), 7));
                    }
                }
            }
        } else if (a) {
            String str = "NoConfirmationSmsSendService onHandleIntent wrong action: ";
            action = String.valueOf(action);
            if (action.length() != 0) {
                str.concat(action);
            } else {
                action = new String(str);
            }
        }
    }
}
