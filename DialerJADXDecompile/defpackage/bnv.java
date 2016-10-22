package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: bnv */
public final class bnv implements ServiceConnection {
    final /* synthetic */ bnt a;
    private volatile bpj b;
    private volatile boolean c;

    protected bnv(bnt bnt) {
        this.a = bnt;
    }

    public final bpj a() {
        bpj bpj = null;
        bnt bnt = this.a;
        cqn.b();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context g = this.a.g();
        intent.putExtra("app_package_name", g.getPackageName());
        bvr a = bvr.a();
        synchronized (this) {
            this.b = null;
            this.c = true;
            boolean a2 = a.a(g, intent, this.a.a, 129);
            this.a.a("Bind to service requested", Boolean.valueOf(a2));
            if (a2) {
                try {
                    wait(((Long) boq.B.a()).longValue());
                } catch (InterruptedException e) {
                    this.a.e("Wait for service connect was interrupted");
                }
                this.c = false;
                bpj = this.b;
                this.b = null;
                if (bpj == null) {
                    this.a.f("Successfully bound to service but never got onServiceConnected callback");
                }
            } else {
                this.c = false;
            }
        }
        return bpj;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        buf.o("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                try {
                    this.a.f("Service connected with null binder");
                } finally {
                    notifyAll();
                }
            } else {
                bpj bpj;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        if (iBinder == null) {
                            bpj = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                            bpj = (queryLocalInterface == null || !(queryLocalInterface instanceof bpj)) ? new bpl(iBinder) : (bpj) queryLocalInterface;
                        }
                        try {
                            this.a.b("Bound to IAnalyticsService interface");
                        } catch (RemoteException e) {
                            this.a.f("Service connect failed to get IAnalyticsService");
                            if (bpj != null) {
                                try {
                                    bvr.a().a(this.a.g(), this.a.a);
                                } catch (IllegalArgumentException e2) {
                                }
                            } else if (this.c) {
                                this.a.e("onServiceConnected received after the timeout limit");
                                this.a.f.b().a(new bnw(this, bpj));
                            } else {
                                this.b = bpj;
                            }
                            notifyAll();
                            return;
                        }
                        if (bpj != null) {
                            bvr.a().a(this.a.g(), this.a.a);
                        } else if (this.c) {
                            this.a.e("onServiceConnected received after the timeout limit");
                            this.a.f.b().a(new bnw(this, bpj));
                        } else {
                            this.b = bpj;
                        }
                        notifyAll();
                        return;
                    }
                    this.a.e("Got binder with a wrong descriptor", interfaceDescriptor);
                    bpj = null;
                    if (bpj != null) {
                        bvr.a().a(this.a.g(), this.a.a);
                    } else if (this.c) {
                        this.b = bpj;
                    } else {
                        this.a.e("onServiceConnected received after the timeout limit");
                        this.a.f.b().a(new bnw(this, bpj));
                    }
                    notifyAll();
                    return;
                } catch (RemoteException e3) {
                    bpj = null;
                    this.a.f("Service connect failed to get IAnalyticsService");
                    if (bpj != null) {
                        bvr.a().a(this.a.g(), this.a.a);
                    } else if (this.c) {
                        this.b = bpj;
                    } else {
                        this.a.e("onServiceConnected received after the timeout limit");
                        this.a.f.b().a(new bnw(this, bpj));
                    }
                    notifyAll();
                    return;
                }
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        buf.o("AnalyticsServiceConnection.onServiceDisconnected");
        this.a.f.b().a(new bnx(this, componentName));
    }
}
