package com.google.android.apps.hangouts.hangout;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.api.client.http.ExponentialBackOffPolicy;
import dgg;
import dhz;
import did;
import gks;
import glj;
import gwb;
import hg;
import iil;
import java.util.ArrayList;
import java.util.Random;
import wi;

public class StressMode {
    static StressMode a = null;
    public static final int f = 2130968702;
    public static final int g = 2130968711;
    final dgg b;
    final Context c;
    final Random d;
    int e;
    public final String[] h;
    public final hg i;
    public final PendingIntent j;
    public final PendingIntent k;
    public final String[] l;
    public final long m;
    private final Intent n;
    private AlarmManager o;

    public class StressReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if ("start_next_hangout".equals(intent.getAction())) {
                if (StressMode.a == null) {
                    intent.getParcelableExtra("hangout_intent");
                    return;
                }
                StressMode stressMode = StressMode.a;
                iil.b("Expected non-null", StressMode.a);
                switch (stressMode.e) {
                    case wi.w /*0*/:
                        stressMode.b();
                    case wi.j /*1*/:
                        if (((double) stressMode.d.nextFloat()) < 0.3d) {
                            Intent intent2 = new Intent("android.intent.action.MAIN");
                            intent2.addCategory("android.intent.category.HOME");
                            intent2.setFlags(268435456);
                            stressMode.c.startActivity(intent2);
                            stressMode.e = 2;
                            stressMode.a();
                        } else if (stressMode.b.s() == null) {
                            stressMode.a();
                        } else {
                            stressMode.c();
                        }
                    case wi.l /*2*/:
                        if (((double) stressMode.d.nextFloat()) < ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) {
                            stressMode.b();
                        } else {
                            stressMode.c();
                        }
                    default:
                }
            } else if ("stop_stress".equals(intent.getAction())) {
                if (StressMode.a != null) {
                    StressMode.a.c();
                }
                StressMode.a = null;
                Context H = gwb.H();
                ((AlarmManager) H.getSystemService("alarm")).cancel(StressMode.a(null));
                ((NotificationManager) H.getSystemService("notification")).cancel(14);
            }
        }
    }

    static PendingIntent a(Intent intent) {
        Context H = gwb.H();
        Intent intent2 = new Intent("start_next_hangout");
        intent2.setComponent(new ComponentName(H, StressReceiver.class));
        if (intent != null) {
            intent2.putExtra("hangout_intent", intent);
        }
        return PendingIntent.getBroadcast(H, gks.a(113), intent2, 134217728);
    }

    void a() {
        iil.b("Expected non-null", a);
        int min = Math.min((int) (Math.abs(this.d.nextGaussian()) * 10000.0d), ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS);
        if (VERSION.SDK_INT >= 19) {
            this.o.setExact(2, glj.b() + ((long) min), a(this.n));
        } else {
            this.o.set(2, glj.b() + ((long) min), a(this.n));
        }
        float f = ((float) min) / 1000.0f;
        new StringBuilder(49).append("State change from ").append(this.e).append(" in ").append(f).append("s");
    }

    void b() {
        Intent a = gwb.a((dhz) this.n.getParcelableExtra("hangout_room_info"), (ArrayList) this.n.getSerializableExtra("hangout_invitee_users"), true, 51, glj.b());
        a.addFlags(268435456);
        this.c.startActivity(a);
        this.e = 1;
        a();
    }

    void c() {
        did s = this.b.s();
        if (s != null) {
            s.b(11004);
        }
    }

    public StressMode(String[] strArr, hg hgVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
        this.h = strArr;
        this.i = hgVar;
        this.k = pendingIntent2;
        this.j = pendingIntent;
        this.l = strArr2;
        this.m = j;
    }

    public String d() {
        return this.l.length == 1 ? this.l[0] : null;
    }

    public static Bundle a(StressMode stressMode) {
        if (stressMode == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        String d = stressMode.d();
        Parcelable[] parcelableArr = new Parcelable[stressMode.h.length];
        for (int i = 0; i < parcelableArr.length; i++) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("text", stressMode.h[i]);
            bundle2.putString("author", d);
            parcelableArr[i] = bundle2;
        }
        bundle.putParcelableArray("messages", parcelableArr);
        bundle.putParcelable("remote_input", a(stressMode.i));
        bundle.putParcelable("on_reply", stressMode.j);
        bundle.putParcelable("on_read", stressMode.k);
        bundle.putStringArray("participants", stressMode.l);
        bundle.putLong("timestamp", stressMode.m);
        return bundle;
    }

    public static RemoteInput a(hg hgVar) {
        return new Builder(hgVar.a()).setLabel(hgVar.b()).setChoices(hgVar.c()).setAllowFreeFormInput(hgVar.d()).addExtras(hgVar.e()).build();
    }
}
