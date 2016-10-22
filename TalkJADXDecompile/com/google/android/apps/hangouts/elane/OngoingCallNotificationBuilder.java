package com.google.android.apps.hangouts.elane;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import ba;
import com.google.android.apps.hangouts.R$drawable;
import csl;
import ctn;
import fx;
import gks;
import glj;
import gwb;
import ia;
import iil;
import jcf;
import jyn;

public final class OngoingCallNotificationBuilder {
    private final ctn a;
    private final Context b;

    public class JoinedReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            csl csl = (csl) jyn.a(context, csl.class);
            if (csl != null) {
                ctn a = csl.a();
                if (a == null) {
                    return;
                }
                if ("com.google.android.apps.hangouts.hangout.joined".equals(intent.getAction())) {
                    Intent intent2 = new Intent(context, CallActivity.class);
                    intent2.putExtra("account_id", ((jcf) jyn.a(context, jcf.class)).b(a.b()));
                    intent2.setFlags(872415232);
                    context.startActivity(intent2);
                } else if ("com.google.android.apps.hangouts.hangout.exit".equals(intent.getAction())) {
                    a.f().a(11004);
                }
            }
        }
    }

    public OngoingCallNotificationBuilder(Context context, ctn ctn) {
        iil.b("Expected non-null", (Object) ctn);
        this.a = ctn;
        this.b = context;
    }

    public Notification a() {
        int i;
        Resources resources = this.b.getResources();
        PendingIntent broadcast = PendingIntent.getBroadcast(this.b, gks.a(4), b(), 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.b, gks.a(101), c(), 134217728);
        boolean m = this.a.m();
        fx a = new fx(this.b).a(glj.a());
        if (m) {
            i = R$drawable.cu;
        } else {
            i = R$drawable.cq;
        }
        a = a.a(i);
        if (m) {
            i = ba.kc;
        } else {
            i = ba.kf;
        }
        return a.a(resources.getString(i)).b(resources.getString(ba.ke)).b(true).a(broadcast).d(2).e(ia.c(this.b, gwb.dU)).c(true).a(R$drawable.ba, resources.getString(ba.kd), broadcast2).b();
    }

    private Intent b() {
        Intent intent = new Intent("com.google.android.apps.hangouts.hangout.joined");
        intent.setComponent(new ComponentName(this.b, JoinedReceiver.class));
        intent.setFlags(268435456);
        return intent;
    }

    private Intent c() {
        Intent intent = new Intent("com.google.android.apps.hangouts.hangout.exit");
        intent.setComponent(new ComponentName(this.b, JoinedReceiver.class));
        return intent;
    }
}
