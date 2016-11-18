package p000;

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
    public static final String[] f16214d = new String[]{"service_esmobile", "service_googleme"};
    public final Context f16215a;
    final Handler f16216b;
    public AtomicInteger f16217c = new AtomicInteger(0);
    private int f16218e;
    private long f16219f;
    private long f16220g;
    private int f16221h;
    private long f16222i;
    private final Looper f16223j;
    private final gwj f16224k;
    private final gtq f16225l;
    private final Object f16226m = new Object();
    private final Object f16227n = new Object();
    private gxb f16228o;
    private gvu f16229p;
    private T f16230q;
    private final ArrayList<gvt<?>> f16231r = new ArrayList();
    private gvw f16232s;
    private int f16233t = 1;
    private final gvq f16234u;
    private final gvr f16235v;
    private final int f16236w;
    private final String f16237x;

    protected gvo(Context context, Looper looper, gwj gwj, gtq gtq, int i, gvq gvq, gvr gvr, String str) {
        this.f16215a = (Context) gwb.m2195f((Object) context, (Object) "Context must not be null");
        this.f16223j = (Looper) gwb.m2195f((Object) looper, (Object) "Looper must not be null");
        this.f16224k = (gwj) gwb.m2195f((Object) gwj, (Object) "Supervisor must not be null");
        this.f16225l = (gtq) gwb.m2195f((Object) gtq, (Object) "API availability must not be null");
        this.f16216b = new gvs(this, looper);
        this.f16236w = i;
        this.f16234u = gvq;
        this.f16235v = gvr;
        this.f16237x = str;
    }

    private void m18683a(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        gwb.m2047b(z);
        synchronized (this.f16226m) {
            this.f16233t = i;
            this.f16230q = t;
            switch (i) {
                case 1:
                    if (this.f16232s != null) {
                        this.f16224k.mo2359b(mo2346g(), P_(), this.f16232s, mo2348i());
                        this.f16232s = null;
                        break;
                    }
                    break;
                case 2:
                    String valueOf;
                    String valueOf2;
                    if (this.f16232s != null) {
                        valueOf = String.valueOf(mo2346g());
                        valueOf2 = String.valueOf(P_());
                        Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
                        this.f16224k.mo2359b(mo2346g(), P_(), this.f16232s, mo2348i());
                        this.f16217c.incrementAndGet();
                    }
                    this.f16232s = new gvw(this, this.f16217c.get());
                    if (!this.f16224k.mo2357a(mo2346g(), P_(), this.f16232s, mo2348i())) {
                        valueOf = String.valueOf(mo2346g());
                        valueOf2 = String.valueOf(P_());
                        Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("unable to connect to service: ").append(valueOf).append(" on ").append(valueOf2).toString());
                        m18695a(16, null, this.f16217c.get());
                        break;
                    }
                    break;
                case 3:
                    m18709k();
                    break;
            }
        }
    }

    private boolean m18685a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f16226m) {
            if (this.f16233t != i) {
                z = false;
            } else {
                m18683a(i2, (IInterface) t);
                z = true;
            }
        }
        return z;
    }

    private String mo2348i() {
        return this.f16237x == null ? this.f16215a.getClass().getName() : this.f16237x;
    }

    protected String P_() {
        return "com.google.android.gms";
    }

    public abstract T mo2345a(IBinder iBinder);

    public void mo2600a() {
        this.f16217c.incrementAndGet();
        synchronized (this.f16231r) {
            int size = this.f16231r.size();
            for (int i = 0; i < size; i++) {
                ((gvt) this.f16231r.get(i)).m18727d();
            }
            this.f16231r.clear();
        }
        synchronized (this.f16227n) {
            this.f16228o = null;
        }
        m18683a(1, null);
    }

    protected void m18694a(int i) {
        this.f16218e = i;
        this.f16219f = System.currentTimeMillis();
    }

    protected void m18695a(int i, Bundle bundle, int i2) {
        this.f16216b.sendMessage(this.f16216b.obtainMessage(5, i2, -1, new gvz(this, i, null)));
    }

    public void mo3023a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f16216b.sendMessage(this.f16216b.obtainMessage(1, i2, -1, new gvy(this, i, iBinder, bundle)));
    }

    protected void m18697a(ConnectionResult connectionResult) {
        this.f16221h = connectionResult.m9654c();
        this.f16222i = System.currentTimeMillis();
    }

    public void m18698a(gvu gvu) {
        this.f16229p = (gvu) gwb.m2195f((Object) gvu, (Object) "Connection progress callbacks cannot be null.");
        m18683a(2, null);
    }

    public void m18699a(gwp gwp, Set<Scope> set) {
        try {
            GetServiceRequest a = new GetServiceRequest(this.f16236w).m9689a(this.f16215a.getPackageName()).m9687a(mo2560m());
            if (set != null) {
                a.m9690a((Collection) set);
            }
            if (mo3043d()) {
                a.m9686a(mo2343l() != null ? mo2343l() : new Account("<<default account>>", "com.google")).m9688a(gwp);
            }
            synchronized (this.f16227n) {
                if (this.f16228o != null) {
                    this.f16228o.mo2376a(new gvv(this, this.f16217c.get()), a);
                }
            }
        } catch (DeadObjectException e) {
            m18701b(1);
        } catch (RemoteException e2) {
        }
    }

    public void m18700a(String str, PrintWriter printWriter) {
        synchronized (this.f16226m) {
            int i = this.f16233t;
            IInterface iInterface = this.f16230q;
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
            printWriter.append(mo2347h()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f16220g > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f16220g;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f16220g)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f16219f > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f16218e) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f16218e));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f16219f;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f16219f)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f16222i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(gwb.m2385x(this.f16221h));
            append = printWriter.append(" lastFailedTime=");
            j = this.f16222i;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.f16222i)));
            append.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j).append(" ").append(valueOf2).toString());
        }
    }

    public void m18701b(int i) {
        this.f16216b.sendMessage(this.f16216b.obtainMessage(4, this.f16217c.get(), 1));
    }

    public boolean m18702b() {
        boolean z;
        synchronized (this.f16226m) {
            z = this.f16233t == 3;
        }
        return z;
    }

    public boolean m18703c() {
        boolean z;
        synchronized (this.f16226m) {
            z = this.f16233t == 2;
        }
        return z;
    }

    public boolean mo3043d() {
        return false;
    }

    public Intent m18705e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public IBinder m18706f() {
        IBinder iBinder;
        synchronized (this.f16227n) {
            if (this.f16228o == null) {
                iBinder = null;
            } else {
                iBinder = this.f16228o.asBinder();
            }
        }
        return iBinder;
    }

    public abstract String mo2346g();

    public abstract String mo2347h();

    protected void m18709k() {
        this.f16220g = System.currentTimeMillis();
    }

    public Account mo2343l() {
        return null;
    }

    public Bundle mo2560m() {
        return new Bundle();
    }

    public final void m18712n() {
        if (!m18702b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Bundle m18713o() {
        return null;
    }

    public final T m18714p() {
        T t;
        synchronized (this.f16226m) {
            if (this.f16233t == 4) {
                throw new DeadObjectException();
            }
            m18712n();
            gwb.m1886a(this.f16230q != null, (Object) "Client is connected but service is null");
            t = this.f16230q;
        }
        return t;
    }

    protected Set<Scope> mo2344q() {
        return Collections.EMPTY_SET;
    }
}
