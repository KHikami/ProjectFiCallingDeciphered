package com.google.android.apps.hangouts.requestwriter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import biw;
import dzs;
import dzv;
import dzx;
import dzy;
import dzz;
import ead;
import eah;
import eaj;
import fdq;
import fiw;
import fnx;
import fny;
import fnz;
import fob;
import foc;
import foe;
import foh;
import gks;
import gld;
import glj;
import glk;
import gtt;
import gwb;
import hwu;
import iil;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import jyn;
import kae;

public class RequestWriter extends fiw implements dzy, fny {
    public static final boolean e;
    public static volatile long f;
    public static volatile boolean g;
    private static volatile int m;
    private static volatile int n;
    private static volatile long o;
    private static volatile int p;
    private static volatile boolean q;
    private final Map<String, dzx> h;
    private volatile boolean i;
    private ConnectivityManager j;
    private fnx k;
    private final Random l;
    private final IBinder r;
    private foc s;

    public RequestWriter() {
        this.h = new ConcurrentHashMap();
        this.l = new Random();
        this.r = new fob(this);
    }

    static {
        kae kae = glk.p;
        e = false;
        g = false;
        gwb.a(new fnz());
    }

    public static void l() {
        biw biw = (biw) jyn.a(gwb.H(), biw.class);
        m = biw.a("babel_max_unexpected_error_retries", 2);
        n = biw.a("babel_max_upload_error_retries", 10);
        long a = biw.a("babel_request_writer_failure_injection_percent", 0);
        o = a;
        if (a > 0) {
            glk.d("Babel_RequestWriter", "******************************************************", new Object[0]);
            glk.d("Babel_RequestWriter", "failureInjectionPercent set to " + o, new Object[0]);
            glk.d("Babel_RequestWriter", "******************************************************", new Object[0]);
        }
        q = gld.a();
        p = biw.a("babel_requestwriter_ms", 5000);
        f = biw.a("babel_maximum_request_writer_intent_extra_size", 0);
    }

    protected int g() {
        return p;
    }

    public void onCreate() {
        if (e) {
            new StringBuilder(34).append("RequestWriter.onCreate ").append(hashCode());
        }
        super.onCreate();
        try {
            hwu.a(getApplicationContext());
        } catch (Throwable e) {
            gtt.a(e.a(), getApplicationContext());
            glk.d("Babel_RequestWriter", "GPS repairable exception when trying to installIfNeeded", e);
        } catch (Throwable e2) {
            glk.d("Babel_RequestWriter", "GPS not available when trying to installIfNeeded", e2);
        }
        this.s = new foc(this);
        this.s.start();
        this.j = (ConnectivityManager) getSystemService("connectivity");
        m();
        BroadcastReceiver fnx = new fnx(jyn.b((Context) this), this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(fnx, intentFilter);
        this.k = fnx;
        j();
        Message obtain = Message.obtain();
        obtain.arg1 = 1;
        this.s.a.sendMessage(obtain);
        ((AlarmManager) getSystemService("alarm")).cancel(b(500));
    }

    public void m() {
        boolean z;
        NetworkInfo networkInfo = null;
        try {
            networkInfo = this.j.getActiveNetworkInfo();
        } catch (IllegalArgumentException e) {
            if (e.getMessage().startsWith("Invalid network type")) {
                String valueOf = String.valueOf(e);
                glk.e("Babel_RequestWriter", new StringBuilder(String.valueOf(valueOf).length() + 49).append("ConnectivityManager#getActiveNetworkInfo failed: ").append(valueOf).toString(), new Object[0]);
            } else {
                throw e;
            }
        }
        boolean z2 = this.i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        this.i = z;
        if (this.i != z2 && e) {
            new StringBuilder(51).append("network: updateNetworkAvailable was ").append(z2).append(" now ").append(this.i);
        }
    }

    public boolean a() {
        return this.i;
    }

    public eah b() {
        return foe.a(e());
    }

    public boolean c() {
        return super.i();
    }

    public void d() {
        super.k();
    }

    public boolean f() {
        return o > 0 && ((long) this.l.nextInt(100)) < o;
    }

    public Context e() {
        return getApplicationContext();
    }

    public void a(boolean z) {
        if (!z) {
            m();
        }
        ((eaj) jyn.a(e(), eaj.class)).a(z);
    }

    public IBinder onBind(Intent intent) {
        j();
        return this.r;
    }

    public void onRebind(Intent intent) {
        j();
    }

    public boolean onUnbind(Intent intent) {
        k();
        return true;
    }

    public void a(Intent intent) {
        if (intent != null) {
            if (e) {
                String valueOf = String.valueOf(intent);
                new StringBuilder(String.valueOf(valueOf).length() + 31).append("queue network request directly ").append(valueOf);
            }
            intent.putExtra("timestamp", glj.b());
            if (i()) {
                Message obtain = Message.obtain();
                obtain.getData().putParcelable("intent", intent);
                if (!this.s.a.sendMessage(obtain)) {
                    glk.e("Babel_RequestWriter", "mHandler.sendMessage returned false", new Object[0]);
                    return;
                }
                return;
            }
            glk.e("Babel_RequestWriter", "tryRetainService failed.", new Object[0]);
            throw new IllegalStateException();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            a(i2);
            intent.putExtra("timestamp", glj.b());
            Message obtain = Message.obtain();
            obtain.getData().putParcelable("intent", intent);
            if (!this.s.a.sendMessage(obtain)) {
                glk.e("Babel_RequestWriter", "mHandler.sendMessage returned false", new Object[0]);
            }
        }
        return 2;
    }

    public void onDestroy() {
        super.onDestroy();
        this.s.a.getLooper().quit();
        long j = 500;
        long j2 = Long.MAX_VALUE;
        for (dzx dzx : this.h.values()) {
            long max;
            dzx.d();
            j2 = Math.min(j2, dzx.b());
            if (dzx.c() > 0) {
                max = Math.max(j, dzx.e());
            } else {
                max = j;
            }
            j = max;
        }
        this.h.clear();
        if (e) {
            new StringBuilder(65).append("Recycling request writer. Will restart after ").append(j2);
        }
        if (j2 < Long.MAX_VALUE) {
            ((AlarmManager) getSystemService("alarm")).set(3, j2 + glj.b(), b(j));
            g = true;
        } else {
            g = false;
        }
        BroadcastReceiver broadcastReceiver = this.k;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    private PendingIntent b(long j) {
        Intent n = n();
        n.putExtra("backoff_period", j);
        return PendingIntent.getService(this, gks.a(103), n, 0);
    }

    public static Intent n() {
        return new Intent(gwb.H(), RequestWriter.class);
    }

    private void o() {
        if (q) {
            Thread currentThread = Thread.currentThread();
            for (dzx a : this.h.values()) {
                if (a.a(currentThread)) {
                    throw new IllegalStateException("don't get RequestWriter lock from network queue thread");
                }
            }
        }
    }

    public void b(String str) {
        o();
        synchronized (this) {
            for (dzx a : this.h.values()) {
                a.a(str);
            }
        }
    }

    public void a(long j) {
        for (dzx dzx : this.h.values()) {
            dzx.a(j);
            dzx.a(true);
        }
    }

    public void a(dzz dzz) {
        dzx dzx;
        iil.a("NetworkQueueItem being queued must have a valid row ID: " + dzz.a, dzz.a > 0);
        String a = dzz.c.a();
        o();
        synchronized (this) {
            dzx = (dzx) this.h.get(a);
            if (dzx == null) {
                int b = dzz.c.b();
                e();
                if (fdq.C.b(b)) {
                    dzx = new dzs(a, this);
                } else {
                    dzx = new dzv(a, this);
                }
                this.h.put(a, dzx);
                dzx.a();
            }
        }
        dzx.a(dzz, dzz.a().c());
    }

    public static ead a(Context context, Intent intent, int i) {
        dzz a = a(intent.getExtras(), foe.a(context), i);
        if (a != null) {
            return a.a();
        }
        return null;
    }

    public static dzz a(Bundle bundle, foe foe, int i) {
        if (bundle.containsKey("server_request")) {
            ead a = foh.a(bundle.getByteArray("server_request"));
            if (a != null) {
                return a(a, i);
            }
        } else if (bundle.containsKey("database_id")) {
            long j = bundle.getLong("database_id");
            if (e) {
                new StringBuilder(72).append("Generating NetworkQueueItem from EXTRA_DATABASE_ID: ").append(j);
            }
            return foe.b(j);
        }
        return null;
    }

    public static dzz a(ead ead, int i) {
        boolean b = fdq.c.b(i);
        String K_ = ead.K_();
        if (b && !K_.equals("event_queue")) {
            K_ = "default_queue";
        }
        return new dzz(new StringBuilder(String.valueOf(K_).length() + 11).append(K_).append(i).toString(), i, ead);
    }
}
