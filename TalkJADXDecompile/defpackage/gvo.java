package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gvo */
public abstract class gvo<T extends IInterface> {
    public static final String[] d;
    public final Context a;
    final Handler b;
    public AtomicInteger c;
    private int e;
    private long f;
    private long g;
    private int h;
    private long i;
    private final Looper j;
    private final gwj k;
    private final gtq l;
    private final Object m;
    private final Object n;
    private gxb o;
    private gvu p;
    private T q;
    private final ArrayList<gvt<?>> r;
    private gvw s;
    private int t;
    private final gvq u;
    private final gvr v;
    private final int w;
    private final String x;

    static {
        d = new String[]{"service_esmobile", "service_googleme"};
    }

    protected gvo(Context context, Looper looper, gwj gwj, gtq gtq, int i, gvq gvq, gvr gvr, String str) {
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.c = new AtomicInteger(0);
        this.a = (Context) gwb.f((Object) context, (Object) "Context must not be null");
        this.j = (Looper) gwb.f((Object) looper, (Object) "Looper must not be null");
        this.k = (gwj) gwb.f((Object) gwj, (Object) "Supervisor must not be null");
        this.l = (gtq) gwb.f((Object) gtq, (Object) "API availability must not be null");
        this.b = new gvs(this, looper);
        this.w = i;
        this.u = gvq;
        this.v = gvr;
        this.x = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r8, T r9) {
        /*
        r7 = this;
        r0 = 1;
        r1 = 0;
        r2 = 3;
        if (r8 != r2) goto L_0x001a;
    L_0x0005:
        r3 = r0;
    L_0x0006:
        if (r9 == 0) goto L_0x001c;
    L_0x0008:
        r2 = r0;
    L_0x0009:
        if (r3 != r2) goto L_0x001e;
    L_0x000b:
        defpackage.gwb.b(r0);
        r1 = r7.m;
        monitor-enter(r1);
        r7.t = r8;	 Catch:{ all -> 0x00f7 }
        r7.q = r9;	 Catch:{ all -> 0x00f7 }
        switch(r8) {
            case 1: goto L_0x00ff;
            case 2: goto L_0x0020;
            case 3: goto L_0x00fa;
            default: goto L_0x0018;
        };	 Catch:{ all -> 0x00f7 }
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x00f7 }
        return;
    L_0x001a:
        r3 = r1;
        goto L_0x0006;
    L_0x001c:
        r2 = r1;
        goto L_0x0009;
    L_0x001e:
        r0 = r1;
        goto L_0x000b;
    L_0x0020:
        r0 = r7.s;	 Catch:{ all -> 0x00f7 }
        if (r0 == 0) goto L_0x0081;
    L_0x0024:
        r0 = "GmsClient";
        r2 = r7.g();	 Catch:{ all -> 0x00f7 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00f7 }
        r3 = r7.P_();	 Catch:{ all -> 0x00f7 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00f7 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f7 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00f7 }
        r5 = r5.length();	 Catch:{ all -> 0x00f7 }
        r5 = r5 + 70;
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00f7 }
        r6 = r6.length();	 Catch:{ all -> 0x00f7 }
        r5 = r5 + r6;
        r4.<init>(r5);	 Catch:{ all -> 0x00f7 }
        r5 = "Calling connect() while still connected, missing disconnect() for ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00f7 }
        r2 = r4.append(r2);	 Catch:{ all -> 0x00f7 }
        r4 = " on ";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00f7 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00f7 }
        r2 = r2.toString();	 Catch:{ all -> 0x00f7 }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x00f7 }
        r0 = r7.k;	 Catch:{ all -> 0x00f7 }
        r2 = r7.g();	 Catch:{ all -> 0x00f7 }
        r3 = r7.P_();	 Catch:{ all -> 0x00f7 }
        r4 = r7.s;	 Catch:{ all -> 0x00f7 }
        r5 = r7.i();	 Catch:{ all -> 0x00f7 }
        r0.b(r2, r3, r4, r5);	 Catch:{ all -> 0x00f7 }
        r0 = r7.c;	 Catch:{ all -> 0x00f7 }
        r0.incrementAndGet();	 Catch:{ all -> 0x00f7 }
    L_0x0081:
        r0 = new gvw;	 Catch:{ all -> 0x00f7 }
        r2 = r7.c;	 Catch:{ all -> 0x00f7 }
        r2 = r2.get();	 Catch:{ all -> 0x00f7 }
        r0.<init>(r7, r2);	 Catch:{ all -> 0x00f7 }
        r7.s = r0;	 Catch:{ all -> 0x00f7 }
        r0 = r7.k;	 Catch:{ all -> 0x00f7 }
        r2 = r7.g();	 Catch:{ all -> 0x00f7 }
        r3 = r7.P_();	 Catch:{ all -> 0x00f7 }
        r4 = r7.s;	 Catch:{ all -> 0x00f7 }
        r5 = r7.i();	 Catch:{ all -> 0x00f7 }
        r0 = r0.a(r2, r3, r4, r5);	 Catch:{ all -> 0x00f7 }
        if (r0 != 0) goto L_0x0018;
    L_0x00a4:
        r0 = "GmsClient";
        r2 = r7.g();	 Catch:{ all -> 0x00f7 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00f7 }
        r3 = r7.P_();	 Catch:{ all -> 0x00f7 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00f7 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f7 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00f7 }
        r5 = r5.length();	 Catch:{ all -> 0x00f7 }
        r5 = r5 + 34;
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00f7 }
        r6 = r6.length();	 Catch:{ all -> 0x00f7 }
        r5 = r5 + r6;
        r4.<init>(r5);	 Catch:{ all -> 0x00f7 }
        r5 = "unable to connect to service: ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00f7 }
        r2 = r4.append(r2);	 Catch:{ all -> 0x00f7 }
        r4 = " on ";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00f7 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00f7 }
        r2 = r2.toString();	 Catch:{ all -> 0x00f7 }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x00f7 }
        r0 = 16;
        r2 = 0;
        r3 = r7.c;	 Catch:{ all -> 0x00f7 }
        r3 = r3.get();	 Catch:{ all -> 0x00f7 }
        r7.a(r0, r2, r3);	 Catch:{ all -> 0x00f7 }
        goto L_0x0018;
    L_0x00f7:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f7 }
        throw r0;
    L_0x00fa:
        r7.k();	 Catch:{ all -> 0x00f7 }
        goto L_0x0018;
    L_0x00ff:
        r0 = r7.s;	 Catch:{ all -> 0x00f7 }
        if (r0 == 0) goto L_0x0018;
    L_0x0103:
        r0 = r7.k;	 Catch:{ all -> 0x00f7 }
        r2 = r7.g();	 Catch:{ all -> 0x00f7 }
        r3 = r7.P_();	 Catch:{ all -> 0x00f7 }
        r4 = r7.s;	 Catch:{ all -> 0x00f7 }
        r5 = r7.i();	 Catch:{ all -> 0x00f7 }
        r0.b(r2, r3, r4, r5);	 Catch:{ all -> 0x00f7 }
        r0 = 0;
        r7.s = r0;	 Catch:{ all -> 0x00f7 }
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: gvo.a(int, android.os.IInterface):void");
    }

    private boolean a(int i, int i2, T t) {
        boolean z;
        synchronized (this.m) {
            if (this.t != i) {
                z = false;
            } else {
                a(i2, (IInterface) t);
                z = true;
            }
        }
        return z;
    }

    private String i() {
        return this.x == null ? this.a.getClass().getName() : this.x;
    }

    protected String P_() {
        return "com.google.android.gms";
    }

    public abstract T a(IBinder iBinder);

    public void a() {
        this.c.incrementAndGet();
        synchronized (this.r) {
            int size = this.r.size();
            for (int i = 0; i < size; i++) {
                ((gvt) this.r.get(i)).d();
            }
            this.r.clear();
        }
        synchronized (this.n) {
            this.o = null;
        }
        a(1, null);
    }

    protected void a(int i) {
        this.e = i;
        this.f = System.currentTimeMillis();
    }

    protected void a(int i, Bundle bundle, int i2) {
        this.b.sendMessage(this.b.obtainMessage(5, i2, -1, new gvz(this, i, null)));
    }

    public void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.b.sendMessage(this.b.obtainMessage(1, i2, -1, new gvy(this, i, iBinder, bundle)));
    }

    protected void a(ConnectionResult connectionResult) {
        this.h = connectionResult.c();
        this.i = System.currentTimeMillis();
    }

    public void a(gvu gvu) {
        this.p = (gvu) gwb.f((Object) gvu, (Object) "Connection progress callbacks cannot be null.");
        a(2, null);
    }

    public void a(gwp gwp, Set<Scope> set) {
        try {
            GetServiceRequest a = new GetServiceRequest(this.w).a(this.a.getPackageName()).a(m());
            if (set != null) {
                a.a((Collection) set);
            }
            if (d()) {
                a.a(l() != null ? l() : new Account("<<default account>>", "com.google")).a(gwp);
            }
            synchronized (this.n) {
                if (this.o != null) {
                    this.o.a(new gvv(this, this.c.get()), a);
                }
            }
        } catch (DeadObjectException e) {
            b(1);
        } catch (RemoteException e2) {
        }
    }

    public void a(String str, PrintWriter printWriter) {
        synchronized (this.m) {
            int i = this.t;
            IInterface iInterface = this.q;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case wi.j /*1*/:
                printWriter.print("DISCONNECTED");
                break;
            case wi.l /*2*/:
                printWriter.print("CONNECTING");
                break;
            case wi.z /*3*/:
                printWriter.print("CONNECTED");
                break;
            case wi.h /*4*/:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println("null");
        } else {
            printWriter.append(h()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.g > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.g;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.g)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.e) {
                case wi.j /*1*/:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case wi.l /*2*/:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.e));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(gwb.x(this.h));
            append = printWriter.append(" lastFailedTime=");
            j = this.i;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.i)));
            append.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j).append(" ").append(valueOf2).toString());
        }
    }

    public void b(int i) {
        this.b.sendMessage(this.b.obtainMessage(4, this.c.get(), 1));
    }

    public boolean b() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 3;
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 2;
        }
        return z;
    }

    public boolean d() {
        return false;
    }

    public Intent e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public IBinder f() {
        IBinder iBinder;
        synchronized (this.n) {
            if (this.o == null) {
                iBinder = null;
            } else {
                iBinder = this.o.asBinder();
            }
        }
        return iBinder;
    }

    public abstract String g();

    public abstract String h();

    protected void k() {
        this.g = System.currentTimeMillis();
    }

    public Account l() {
        return null;
    }

    public Bundle m() {
        return new Bundle();
    }

    public final void n() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Bundle o() {
        return null;
    }

    public final T p() {
        T t;
        synchronized (this.m) {
            if (this.t == 4) {
                throw new DeadObjectException();
            }
            n();
            gwb.a(this.q != null, (Object) "Client is connected but service is null");
            t = this.q;
        }
        return t;
    }

    protected Set<Scope> q() {
        return Collections.EMPTY_SET;
    }
}
