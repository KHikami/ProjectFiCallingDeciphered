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
import android.util.Log;
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

public abstract class gvo<T extends IInterface> {
    public static final String[] d = new String[]{"service_esmobile", "service_googleme"};
    public final Context a;
    final Handler b;
    public AtomicInteger c = new AtomicInteger(0);
    private int e;
    private long f;
    private long g;
    private int h;
    private long i;
    private final Looper j;
    private final gwj k;
    private final gtq l;
    private final Object m = new Object();
    private final Object n = new Object();
    private gxb o;
    private gvu p;
    private T q;
    private final ArrayList<gvt<?>> r = new ArrayList();
    private gvw s;
    private int t = 1;
    private final gvq u;
    private final gvr v;
    private final int w;
    private final String x;

    protected gvo(Context context, Looper looper, gwj gwj, gtq gtq, int i, gvq gvq, gvr gvr, String str) {
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

    private void a(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        gwb.b(z);
        synchronized (this.m) {
            this.t = i;
            this.q = t;
            switch (i) {
                case 1:
                    if (this.s != null) {
                        this.k.b(g(), P_(), this.s, i());
                        this.s = null;
                        break;
                    }
                    break;
                case 2:
                    String valueOf;
                    String valueOf2;
                    if (this.s != null) {
                        valueOf = String.valueOf(g());
                        valueOf2 = String.valueOf(P_());
                        Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
                        this.k.b(g(), P_(), this.s, i());
                        this.c.incrementAndGet();
                    }
                    this.s = new gvw(this, this.c.get());
                    if (!this.k.a(g(), P_(), this.s, i())) {
                        valueOf = String.valueOf(g());
                        valueOf2 = String.valueOf(P_());
                        Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("unable to connect to service: ").append(valueOf).append(" on ").append(valueOf2).toString());
                        a(16, null, this.c.get());
                        break;
                    }
                    break;
                case 3:
                    k();
                    break;
            }
        }
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
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
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
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
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
