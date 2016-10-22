package defpackage;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* renamed from: bis */
public class bis extends bdj implements brf, brg, com {
    private static final String b;
    private static ConnectivityManager c;
    brc a;
    private Location d;
    private AsyncTask e;
    private AsyncTask f;

    public final /* synthetic */ void a(bdq bdq) {
        super.a((biu) bdq);
        try {
            if (this.a != null && this.a.d()) {
                coo.c.a(this.a, this);
                this.a.c();
            }
            if (this.e != null) {
                this.e.cancel(true);
            }
            if (this.f != null) {
                this.f.cancel(true);
            }
        } catch (Throwable e) {
            Log.e(b, "onUiUnready: Exception!!!", e);
        }
    }

    public final /* synthetic */ void b(bdq bdq) {
        super.b((biu) bdq);
        try {
            Context context = ((biu) this.i).getContext();
            if (buf.j(context) && bln.b(context) && bln.a(context)) {
                c = (ConnectivityManager) ((biu) this.i).getContext().getSystemService("connectivity");
                this.a = new brd(((biu) this.i).getContext()).a(coo.b).a((brf) this).a((brg) this).b();
                this.a.b();
            }
        } catch (Throwable e) {
            Log.e(b, "onUiReady: Exception!!!", e);
        }
    }

    static {
        b = bis.class.getSimpleName();
    }

    bis() {
    }

    public final void a(int i) {
    }

    public final void a(ConnectionResult connectionResult) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.location.Location r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        if (r7 == 0) goto L_0x0075;
    L_0x0004:
        r2 = r7.getTime();	 Catch:{ Exception -> 0x008e }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x008e }
        r2 = r4 - r2;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x0075;
    L_0x0015:
        r2 = r7.getAccuracy();	 Catch:{ Exception -> 0x008e }
        r3 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 > 0) goto L_0x0075;
    L_0x001f:
        r2 = r0;
    L_0x0020:
        if (r2 == 0) goto L_0x0079;
    L_0x0022:
        r2 = c;	 Catch:{ Exception -> 0x008e }
        if (r2 == 0) goto L_0x0077;
    L_0x0026:
        r2 = c;	 Catch:{ Exception -> 0x008e }
        r2 = r2.getActiveNetworkInfo();	 Catch:{ Exception -> 0x008e }
        if (r2 == 0) goto L_0x0077;
    L_0x002e:
        r2 = r2.isConnectedOrConnecting();	 Catch:{ Exception -> 0x008e }
        if (r2 == 0) goto L_0x0077;
    L_0x0034:
        if (r0 == 0) goto L_0x0079;
    L_0x0036:
        r0 = r6.d;	 Catch:{ Exception -> 0x008e }
        r0 = java.util.Objects.equals(r0, r7);	 Catch:{ Exception -> 0x008e }
        if (r0 != 0) goto L_0x0074;
    L_0x003e:
        r6.d = r7;	 Catch:{ Exception -> 0x008e }
        r1 = new biq;	 Catch:{ Exception -> 0x008e }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ Exception -> 0x008e }
        r0 = r6.i;	 Catch:{ Exception -> 0x008e }
        r0 = (defpackage.biu) r0;	 Catch:{ Exception -> 0x008e }
        r2.<init>(r0);	 Catch:{ Exception -> 0x008e }
        r1.<init>(r2);	 Catch:{ Exception -> 0x008e }
        r0 = 1;
        r0 = new android.location.Location[r0];	 Catch:{ Exception -> 0x008e }
        r2 = 0;
        r0[r2] = r7;	 Catch:{ Exception -> 0x008e }
        r0 = r1.execute(r0);	 Catch:{ Exception -> 0x008e }
        r6.e = r0;	 Catch:{ Exception -> 0x008e }
        r1 = new biw;	 Catch:{ Exception -> 0x008e }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ Exception -> 0x008e }
        r0 = r6.i;	 Catch:{ Exception -> 0x008e }
        r0 = (defpackage.biu) r0;	 Catch:{ Exception -> 0x008e }
        r2.<init>(r0);	 Catch:{ Exception -> 0x008e }
        r1.<init>(r2);	 Catch:{ Exception -> 0x008e }
        r0 = 1;
        r0 = new android.location.Location[r0];	 Catch:{ Exception -> 0x008e }
        r2 = 0;
        r0[r2] = r7;	 Catch:{ Exception -> 0x008e }
        r0 = r1.execute(r0);	 Catch:{ Exception -> 0x008e }
        r6.f = r0;	 Catch:{ Exception -> 0x008e }
    L_0x0074:
        return;
    L_0x0075:
        r2 = r1;
        goto L_0x0020;
    L_0x0077:
        r0 = r1;
        goto L_0x0034;
    L_0x0079:
        r0 = r6.i;	 Catch:{ Exception -> 0x008e }
        if (r0 == 0) goto L_0x0074;
    L_0x007d:
        r0 = r6.i;	 Catch:{ Exception -> 0x008e }
        r0 = (defpackage.biu) r0;	 Catch:{ Exception -> 0x008e }
        r1 = 0;
        r0.a(r1);	 Catch:{ Exception -> 0x008e }
        r0 = r6.i;	 Catch:{ Exception -> 0x008e }
        r0 = (defpackage.biu) r0;	 Catch:{ Exception -> 0x008e }
        r1 = 0;
        r0.a(r1);	 Catch:{ Exception -> 0x008e }
        goto L_0x0074;
    L_0x008e:
        r0 = move-exception;
        r1 = b;
        r2 = "onLocationChanged: Exception!!!";
        android.util.Log.e(r1, r2, r0);
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: bis.a(android.location.Location):void");
    }

    public final void a(Bundle bundle) {
        try {
            LocationRequest a = new LocationRequest().a(102);
            LocationRequest.a(30000);
            a.c = 30000;
            if (!a.e) {
                a.d = (long) (((double) a.c) / 6.0d);
            }
            LocationRequest.a(30000);
            a.e = true;
            a.d = 30000;
            coo.c.a(this.a, a, this).a(new bit(this));
        } catch (Throwable e) {
            Log.e(b, "onConnected: Exception!!!", e);
        }
    }
}
