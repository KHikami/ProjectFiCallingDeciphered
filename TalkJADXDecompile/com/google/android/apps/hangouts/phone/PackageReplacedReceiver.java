package com.google.android.apps.hangouts.phone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bko;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import dfm;
import fbx;
import fde;
import ffh;
import fjl;
import flt;
import fmf;
import fnc;
import fqo;
import fzw;
import glk;
import jmq;
import jmt;
import jyn;
import kae;

public class PackageReplacedReceiver extends BroadcastReceiver {
    private static final boolean a;

    static {
        kae kae = glk.k;
        a = false;
    }

    public void onReceive(Context context, Intent intent) {
        if (a) {
            String valueOf = String.valueOf(intent);
            new StringBuilder(String.valueOf(valueOf).length() + 24).append("PackageReplacedReceiver ").append(valueOf);
        }
        RealTimeChatService.a(context, intent.getAction());
    }

    public static void a(Context context, String str) {
        boolean z;
        dfm dfm = (dfm) jyn.a(context, dfm.class);
        if ("android.intent.action.BOOT_COMPLETED".equals(str)) {
            z = false;
        } else {
            z = true;
        }
        if (dfm.a(z, true)) {
            try {
                ((jmq) jyn.a(context, jmq.class)).a(new jmt().a());
            } catch (Throwable e) {
                glk.c("Babel", "Account refresh failed", e);
            }
            SmsReceiver.a();
            ffh.i();
            if (((fbx) jyn.a(context, fbx.class)).a(context)) {
                fzw fzw = (fzw) jyn.a(context, fzw.class);
                for (int i : fde.e()) {
                    bko e2 = fde.e(i);
                    if (!(e2 == null || fzw.a(i) || e2.I() != 0)) {
                        RealTimeChatService.b(((fmf) jyn.a(context, fmf.class)).a(-1), e2.g());
                    }
                }
            }
            fqo.b(context);
            fqo.a(context);
            ((fnc) jyn.a(context, fnc.class)).a();
            glk.a("Babel", "Force warm sync for all signed in accounts after package upgrades", new Object[0]);
            for (int i2 : fde.c(true)) {
                if (fde.e(i2) != null) {
                    RealTimeChatService.a(i2, false, fjl.NO_DELAY, flt.UPDATE_SYNC);
                }
            }
            return;
        }
        glk.d("Babel", "GmsCore check failed during package upgrade", new Object[0]);
    }
}
