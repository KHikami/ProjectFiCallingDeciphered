package com.google.android.apps.hangouts.concurrent.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import bhc;
import bho;
import bhp;
import bht;
import bhu;
import bhw;
import bhy;
import bie;
import big;
import bih;
import bii;
import bij;
import bik;
import bim;
import bin;
import bio;
import bip;
import bir;
import biu;
import biw;
import fls;
import glj;
import glk;
import gma;
import gwb;
import ifw;
import igd;
import ige;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jyn;
import mtu;
import wi;

public class ConcurrentService extends Service {
    public static final ThreadPolicy a;
    public static final long b;
    private static final gma l;
    private static final bhy[] m;
    private static final bhp[] n;
    private static final Bundle[] o;
    public final Handler c;
    public bir d;
    public Context e;
    public boolean f;
    public ExecutorService g;
    ExecutorService h;
    ExecutorService i;
    ExecutorService j;
    public final Runnable k;
    private final UncaughtExceptionHandler p;
    private final IBinder q;
    private AlarmManager r;
    private biu s;
    private bhw t;
    private final Runnable u;
    private final Runnable v;

    public ConcurrentService() {
        this.p = new big(this);
        this.c = new Handler(Looper.getMainLooper());
        this.q = new bio(this);
        this.k = new bih(this);
        this.u = new bii(this);
        this.v = new bij(this);
    }

    static {
        l = gma.a("concurrent");
        m = bhy.values();
        bhp[] values = bhp.values();
        n = values;
        o = new Bundle[values.length];
        for (bhp bhp : n) {
            Bundle bundle = new Bundle();
            bundle.putInt("conc_wakeup_priority_group", bhp.ordinal());
            o[bhp.ordinal()] = bundle;
        }
        a = new Builder().detectCustomSlowCalls().penaltyLog().build();
        b = TimeUnit.MINUTES.toMillis(2);
    }

    public void a(long j) {
        synchronized (this.c) {
            this.c.removeCallbacks(this.u);
            this.c.postDelayed(this.u, j);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.e = getApplicationContext();
        this.g = Executors.newSingleThreadExecutor(a("Hangouts Concurrent Service Scheduler Thread %d", -1));
        biw biw = (biw) jyn.a(this.e, biw.class);
        long a = biw.a("babel_conc_service_thread_timeout_seconds", fls.B);
        this.h = a(4, Math.max(biw.a("babel_conc_service_default_group_max_thread_pool_size", 12), 4), a, "Hangouts Concurrent Service Default Thread %d", 0);
        this.i = a(2, Math.max(biw.a("babel_conc_service_priority_group_max_thread_pool_size", 8), 2), a, "Hangouts Concurrent Service Priority Thread %d", -1);
        this.j = a(2, Math.max(biw.a("babel_conc_service_network_group_max_thread_pool_size", 8), 2), a, "Hangouts Concurrent Service Network Thread %d", -1);
        WakeLock newWakeLock = ((PowerManager) this.e.getSystemService("power")).newWakeLock(1, "Babel_ConcService");
        this.d = bir.a(this.e, this, new bip(this.e), newWakeLock);
        this.g.submit(this.v);
    }

    private ThreadFactory a(String str, int i) {
        return new mtu().a(true).a(str).a(new bik(this, i)).a(this.p).a();
    }

    private ExecutorService a(int i, int i2, long j, String str, int i3) {
        return new ThreadPoolExecutor(i, i2, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), a(str, i3));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        glk.c("Babel_ConcService", "onStartCommand", new Object[0]);
        if (intent == null) {
            b(bhp.DEFAULT);
        } else {
            int intExtra = intent.getIntExtra("concurrent_service_command_key", -1);
            switch (bim.a[m[intExtra].ordinal()]) {
                case wi.j /*1*/:
                    b(bhp.DEFAULT);
                    break;
                case wi.l /*2*/:
                    intExtra = intent.getIntExtra("conc_wakeup_priority_group", -1);
                    if (intExtra >= 0 && intExtra < n.length) {
                        b(n[intExtra]);
                        break;
                    }
                default:
                    throw new IllegalArgumentException("Unknown command: " + intExtra);
            }
        }
        return 2;
    }

    public void onDestroy() {
        super.onDestroy();
        this.d.f();
        synchronized (this.c) {
            this.c.removeCallbacks(this.u);
            this.g.shutdown();
            this.h.shutdown();
            this.i.shutdown();
            this.j.shutdown();
        }
    }

    public IBinder onBind(Intent intent) {
        glk.c("Babel_ConcService", "Binding ConcurrentService", new Object[0]);
        this.f = true;
        this.s = new biu(this.e);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.e.registerReceiver(this.s, intentFilter);
        this.s.a(this.d);
        this.t = new bhw();
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        this.t.a(this.d);
        this.e.registerReceiver(this.t, intentFilter);
        bho bho = (bho) intent.getParcelableExtra("concurrent_process_data_key");
        if (bho != null) {
            a(bho);
        } else {
            a(b);
        }
        return this.q;
    }

    public boolean onUnbind(Intent intent) {
        glk.c("Babel_ConcService", "Unbinding ConcurrentService", new Object[0]);
        this.s.b(this.d);
        this.e.unregisterReceiver(this.s);
        this.t.b(this.d);
        this.e.unregisterReceiver(this.t);
        this.f = false;
        a(b);
        return super.onUnbind(intent);
    }

    public void a(bho bho) {
        Object[] objArr = new Object[]{bho.j, bho.a()};
        if (gwb.aI()) {
            if (bho.a(this.e)) {
                String str = "Babel_ConcService";
                String str2 = "BackgroundScheduler will schedule task ";
                String valueOf = String.valueOf(bho.a());
                glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
            this.g.submit(new bin(this, bho));
            return;
        }
        b(bho);
    }

    public void b(bho bho) {
        gma gma = l;
        String valueOf = String.valueOf("SCHEDULE_");
        String valueOf2 = String.valueOf(bho.a());
        gma.c(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        this.d.e();
        this.d.a(bho);
    }

    void c(bho bho) {
        if (this.r == null) {
            this.r = (AlarmManager) this.e.getSystemService("alarm");
        }
        if (bho.d - glj.b() < gwb.a(this.e, "babel_delay_scheduling_gcm_network_mngr_threshold_ms", fls.z)) {
            d(bho);
        } else {
            e(bho);
        }
    }

    void d(bho bho) {
        new StringBuilder(59).append("******** Scheduling alarm for ").append(bho.d - glj.b()).append("ms delay.");
        Intent intent = new Intent(this.e, ConcurrentService.class);
        intent.putExtra("concurrent_service_command_key", bhy.PROCESS_DELAYED.ordinal());
        intent.putExtra("conc_wakeup_priority_group", bho.j.ordinal());
        this.r.set(3, bho.d, PendingIntent.getService(this.e, 0, intent, 0));
    }

    public void e(bho bho) {
        int i = 0;
        bho b = this.d.b(bho.e);
        if (b == null) {
            glk.d("Babel_ConcService", String.format("Requested work for %s but the TaskSet contained no waiting tasks for its tag", new Object[]{bho.a()}), new Object[0]);
            return;
        }
        boolean z;
        bht bht = b.h;
        bhu bhu = bht.c;
        long b2 = b.d - glj.b();
        boolean z2 = bhu != null && bhu.c();
        if (bhu == null || !bhu.a()) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = bht.b;
        b2 = Math.max(b2 / 1000, 0);
        igd newBuilder = ((ige) jyn.a(this.e, ige.class)).newBuilder();
        if (!z2) {
            i = 2;
        }
        newBuilder = newBuilder.a(i).a(z).c(z3).a(GcmTriggeredNotifier.class).a(b.e).a(b2, 1 + b2).b(true);
        newBuilder.a(o[bho.j.ordinal()]);
        ((ifw) jyn.a(this.e, ifw.class)).a(newBuilder.a());
        String valueOf = String.valueOf(b.e);
        new StringBuilder(String.valueOf(valueOf).length() + 71).append("Scheduling delay with GcmNetworkManager of ").append(b2).append("s, tag: ").append(valueOf);
    }

    public void f(bho bho) {
        if (bho.d > glj.b()) {
            if (bho.a(this.e)) {
                String valueOf = String.valueOf(bho.a());
                glk.c("Babel_ConcService", new StringBuilder(String.valueOf(valueOf).length() + 53).append("Scheduling task ").append(valueOf).append(" with a delay of ").append(bho.d - glj.b()).toString(), new Object[0]);
            }
            c(bho);
        }
        if (bho.a(this.e)) {
            glk.c("Babel_ConcService", "Requesting work for task %s at priority %s", bho.a(), bho.j);
        }
        a(bho.j);
        a(Math.max(0, bho.d - glj.b()) + b);
    }

    public void a(bhp bhp) {
        b(bhp);
        a(b);
    }

    public void a(String str) {
        bho b = this.d.b(str);
        if (b != null) {
            f(b);
        }
    }

    public bir a() {
        return this.d;
    }

    public void a(bhc bhc) {
        this.d.a(bhc);
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Thread pool stats:\n-- ");
        stringBuilder.append(this.h);
        stringBuilder.append("\n");
        stringBuilder.append(this.i);
        stringBuilder.append("\n");
        stringBuilder.append(this.j);
        stringBuilder.append("\n");
        stringBuilder.append("Task state:\n");
        stringBuilder.append(this.d.g());
        return stringBuilder.toString();
    }

    public void b(bhp bhp) {
        ExecutorService executorService;
        switch (bim.b[bhp.ordinal()]) {
            case wi.j /*1*/:
                executorService = this.h;
                break;
            case wi.l /*2*/:
                executorService = this.i;
                break;
            case wi.z /*3*/:
                executorService = this.j;
                break;
            default:
                throw new IllegalArgumentException(String.format("No such priority %s", new Object[]{bhp}));
        }
        executorService.submit(new bie(this.e, this.d, this, bhp));
    }
}
