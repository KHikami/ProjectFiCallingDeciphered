import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class bui implements bra, bus {
    public final Context a;
    public final Handler b;
    public final ArrayList c;
    public AtomicInteger d;
    private int e;
    private long f;
    private long g;
    private int h;
    private long i;
    private final bue j;
    private final but k;
    private final bqp l;
    private final Object m;
    private final Object n;
    private bvg o;
    private brh p;
    private IInterface q;
    private bun r;
    private int s;
    private final Set t;
    private final Account u;
    private final brf v;
    private final brg w;
    private final int x;

    static {
        String[] strArr = new String[]{"service_esmobile", "service_googleme"};
    }

    public bui(Context context, Looper looper, int i, bue bue) {
        this(context, looper, but.a(context), bqp.c, 25, bue, null, null);
    }

    public bui(Context context, Looper looper, int i, bue bue, brf brf, brg brg) {
        this(context, looper, but.a(context), bqp.c, i, bue, (brf) buf.A((Object) brf), (brg) buf.A((Object) brg));
    }

    private bui(Context context, Looper looper, but but, bqp bqp, int i, bue bue, brf brf, brg brg) {
        this.m = new Object();
        this.n = new Object();
        this.p = new buo(this);
        this.c = new ArrayList();
        this.s = 1;
        this.d = new AtomicInteger(0);
        this.a = (Context) buf.d((Object) context, (Object) "Context must not be null");
        buf.d((Object) looper, (Object) "Looper must not be null");
        this.k = (but) buf.d((Object) but, (Object) "Supervisor must not be null");
        this.l = (bqp) buf.d((Object) bqp, (Object) "API availability must not be null");
        this.b = new buk(this, looper);
        this.x = i;
        this.j = (bue) buf.A((Object) bue);
        this.u = bue.a;
        this.t = a(bue.c);
        this.v = brf;
        this.w = brg;
    }

    private final Set a(Set set) {
        if (set != null) {
            for (Scope contains : set) {
                if (!set.contains(contains)) {
                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                }
            }
        }
        return set;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r6, android.os.IInterface r7) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r2 = 3;
        if (r6 != r2) goto L_0x001a;
    L_0x0005:
        r3 = r0;
    L_0x0006:
        if (r7 == 0) goto L_0x001c;
    L_0x0008:
        r2 = r0;
    L_0x0009:
        if (r3 != r2) goto L_0x001e;
    L_0x000b:
        buf.b(r0);
        r1 = r5.m;
        monitor-enter(r1);
        r5.s = r6;	 Catch:{ all -> 0x0093 }
        r5.q = r7;	 Catch:{ all -> 0x0093 }
        switch(r6) {
            case 1: goto L_0x009b;
            case 2: goto L_0x0020;
            case 3: goto L_0x0096;
            default: goto L_0x0018;
        };	 Catch:{ all -> 0x0093 }
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x0093 }
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
        r0 = r5.r;	 Catch:{ all -> 0x0093 }
        if (r0 == 0) goto L_0x0050;
    L_0x0024:
        r0 = "GmsClient";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0093 }
        r3 = "Calling connect() while still connected, missing disconnect() for ";
        r2.<init>(r3);	 Catch:{ all -> 0x0093 }
        r3 = r5.f();	 Catch:{ all -> 0x0093 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0093 }
        r2 = r2.toString();	 Catch:{ all -> 0x0093 }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x0093 }
        r0 = r5.k;	 Catch:{ all -> 0x0093 }
        r2 = r5.f();	 Catch:{ all -> 0x0093 }
        r3 = r5.r;	 Catch:{ all -> 0x0093 }
        r4 = r5.m();	 Catch:{ all -> 0x0093 }
        r0.b(r2, r3, r4);	 Catch:{ all -> 0x0093 }
        r0 = r5.d;	 Catch:{ all -> 0x0093 }
        r0.incrementAndGet();	 Catch:{ all -> 0x0093 }
    L_0x0050:
        r0 = new bun;	 Catch:{ all -> 0x0093 }
        r2 = r5.d;	 Catch:{ all -> 0x0093 }
        r2 = r2.get();	 Catch:{ all -> 0x0093 }
        r0.<init>(r5, r2);	 Catch:{ all -> 0x0093 }
        r5.r = r0;	 Catch:{ all -> 0x0093 }
        r0 = r5.k;	 Catch:{ all -> 0x0093 }
        r2 = r5.f();	 Catch:{ all -> 0x0093 }
        r3 = r5.r;	 Catch:{ all -> 0x0093 }
        r4 = r5.m();	 Catch:{ all -> 0x0093 }
        r0 = r0.a(r2, r3, r4);	 Catch:{ all -> 0x0093 }
        if (r0 != 0) goto L_0x0018;
    L_0x006f:
        r0 = "GmsClient";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0093 }
        r3 = "unable to connect to service: ";
        r2.<init>(r3);	 Catch:{ all -> 0x0093 }
        r3 = r5.f();	 Catch:{ all -> 0x0093 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0093 }
        r2 = r2.toString();	 Catch:{ all -> 0x0093 }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x0093 }
        r0 = 8;
        r2 = r5.d;	 Catch:{ all -> 0x0093 }
        r2 = r2.get();	 Catch:{ all -> 0x0093 }
        r5.a(r0, r2);	 Catch:{ all -> 0x0093 }
        goto L_0x0018;
    L_0x0093:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0093 }
        throw r0;
    L_0x0096:
        r5.a(r7);	 Catch:{ all -> 0x0093 }
        goto L_0x0018;
    L_0x009b:
        r0 = r5.r;	 Catch:{ all -> 0x0093 }
        if (r0 == 0) goto L_0x0018;
    L_0x009f:
        r0 = r5.k;	 Catch:{ all -> 0x0093 }
        r2 = r5.f();	 Catch:{ all -> 0x0093 }
        r3 = r5.r;	 Catch:{ all -> 0x0093 }
        r4 = r5.m();	 Catch:{ all -> 0x0093 }
        r0.b(r2, r3, r4);	 Catch:{ all -> 0x0093 }
        r0 = 0;
        r5.r = r0;	 Catch:{ all -> 0x0093 }
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: bui.a(int, android.os.IInterface):void");
    }

    private final boolean a(int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (this.m) {
            if (this.s != i) {
                z = false;
            } else {
                a(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    private String m() {
        return this.j.f;
    }

    public abstract IInterface a(IBinder iBinder);

    public void a() {
        this.d.incrementAndGet();
        synchronized (this.c) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((bul) this.c.get(i)).d();
            }
            this.c.clear();
        }
        synchronized (this.n) {
            this.o = null;
        }
        a(1, null);
    }

    public void a(int i) {
        this.e = i;
        this.f = System.currentTimeMillis();
    }

    protected final void a(int i, int i2) {
        this.b.sendMessage(this.b.obtainMessage(5, i2, -1, new buq(this, i)));
    }

    public void a(IInterface iInterface) {
        this.g = System.currentTimeMillis();
    }

    public final void a(brh brh) {
        this.p = (brh) buf.d((Object) brh, (Object) "Connection progress callbacks cannot be null.");
        a(2, null);
    }

    public final void a(buz buz, Set set) {
        try {
            Bundle j = j();
            GetServiceRequest getServiceRequest = new GetServiceRequest(this.x);
            getServiceRequest.d = this.a.getPackageName();
            getServiceRequest.g = j;
            if (set != null) {
                getServiceRequest.f = (Scope[]) set.toArray(new Scope[set.size()]);
            }
            if (c()) {
                getServiceRequest.h = this.u != null ? this.u : new Account("<<default account>>", "com.google");
                if (buz != null) {
                    getServiceRequest.e = buz.asBinder();
                }
            }
            synchronized (this.n) {
                if (this.o != null) {
                    this.o.a(new bum(this, this.d.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            this.b.sendMessage(this.b.obtainMessage(4, this.d.get(), 1));
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    public final void a(String str, PrintWriter printWriter) {
        synchronized (this.m) {
            int i = this.s;
            IInterface iInterface = this.q;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case rq.b /*1*/:
                printWriter.print("DISCONNECTED");
                break;
            case rq.c /*2*/:
                printWriter.print("CONNECTING");
                break;
            case rl.e /*3*/:
                printWriter.print("CONNECTED");
                break;
            case rl.f /*4*/:
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
            printWriter.append(g()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.g > 0) {
            printWriter.append(str).append("lastConnectedTime=").println(this.g + " " + simpleDateFormat.format(new Date(this.g)));
        }
        if (this.f > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.e) {
                case rq.b /*1*/:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case rq.c /*2*/:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.e));
                    break;
            }
            printWriter.append(" lastSuspendedTime=").println(this.f + " " + simpleDateFormat.format(new Date(this.f)));
        }
        if (this.i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(buf.y(this.h));
            printWriter.append(" lastFailedTime=").println(this.i + " " + simpleDateFormat.format(new Date(this.i)));
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.m) {
            z = this.s == 3;
        }
        return z;
    }

    public boolean c() {
        return false;
    }

    public final Intent d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final IBinder e() {
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

    public abstract String f();

    public abstract String g();

    public void i_() {
        int a = this.l.a(this.a);
        if (a != 0) {
            a(1, null);
            this.p = new buo(this);
            this.b.sendMessage(this.b.obtainMessage(3, this.d.get(), a));
            return;
        }
        a(new buo(this));
    }

    public Bundle j() {
        return new Bundle();
    }

    public final boolean j_() {
        boolean z;
        synchronized (this.m) {
            z = this.s == 2;
        }
        return z;
    }

    public final void k() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.m) {
            if (this.s == 4) {
                throw new DeadObjectException();
            }
            k();
            buf.a(this.q != null, (Object) "Client is connected but service is null");
            iInterface = this.q;
        }
        return iInterface;
    }

    public void a(ConnectionResult connectionResult) {
        this.h = connectionResult.c;
        this.i = System.currentTimeMillis();
    }
}
