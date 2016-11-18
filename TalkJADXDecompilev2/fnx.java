package defpackage;

import android.content.BroadcastReceiver;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class fnx extends BroadcastReceiver implements Runnable {
    private final fyb a;
    private long b = 0;
    private volatile long c;
    private final RequestWriter d;
    private final jyn e;

    public fnx(jyn jyn, RequestWriter requestWriter) {
        this.d = requestWriter;
        this.e = jyn;
        this.a = new fyb();
        this.c = ((biw) this.e.a(biw.class)).a("babel_retry_on_network_connectivity_ms", 300000);
        gwb.g(gwb.H()).a(this);
    }

    public void run() {
        this.c = ((biw) this.e.a(biw.class)).a("babel_retry_on_network_connectivity_ms", 300000);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
        r7 = this;
        r4 = 2;
        r2 = -1;
        r6 = 0;
        r0 = "android.net.conn.CONNECTIVITY_CHANGE";
        r1 = r9.getAction();
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r0 = "connectivity";
        r0 = r8.getSystemService(r0);
        r0 = (android.net.ConnectivityManager) r0;
        r1 = android.os.Build.VERSION.SDK_INT;
        r3 = 17;
        if (r1 < r3) goto L_0x003e;
    L_0x001e:
        r1 = "networkType";
        r1 = r9.getIntExtra(r1, r2);
    L_0x0024:
        if (r1 != r4) goto L_0x0151;
    L_0x0026:
        r1 = defpackage.fxz.b;
        monitor-enter(r1);
        r2 = defpackage.fxz.b;	 Catch:{ all -> 0x003b }
        r2 = r2.a;	 Catch:{ all -> 0x003b }
        if (r2 > 0) goto L_0x004f;
    L_0x002f:
        r0 = "Babel_SMS";
        r2 = "MmsSendReceiveManager: no sender, skip checking";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x003b }
        defpackage.glk.c(r0, r2, r3);	 Catch:{ all -> 0x003b }
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        goto L_0x000f;
    L_0x003b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        throw r0;
    L_0x003e:
        r1 = "networkInfo";
        r1 = r9.getParcelableExtra(r1);
        r1 = (android.net.NetworkInfo) r1;
        if (r1 == 0) goto L_0x004d;
    L_0x0048:
        r1 = r1.getType();
        goto L_0x0024;
    L_0x004d:
        r1 = r2;
        goto L_0x0024;
    L_0x004f:
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        r1 = r0.getNetworkInfo(r4);
        if (r1 == 0) goto L_0x000f;
    L_0x0056:
        r2 = "Babel_SMS";
        r3 = java.lang.String.valueOf(r1);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 47;
        r4.<init>(r5);
        r5 = "MmsSendReceiveManager: MMS connectivity change ";
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r3 = r3.toString();
        r4 = new java.lang.Object[r6];
        defpackage.glk.c(r2, r3, r4);
        r2 = "2GVoiceCallEnded";
        r3 = r1.getReason();
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00c1;
    L_0x008a:
        r1 = defpackage.fxz.b;	 Catch:{ ahz -> 0x0096 }
        monitor-enter(r1);	 Catch:{ ahz -> 0x0096 }
        defpackage.fxz.a(r8);	 Catch:{ all -> 0x0093 }
        monitor-exit(r1);	 Catch:{ all -> 0x0093 }
        goto L_0x000f;
    L_0x0093:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0093 }
        throw r0;	 Catch:{ ahz -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        r1 = "Babel_SMS";
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 53;
        r2.<init>(r3);
        r3 = "MmsSendReceiveManager.ConnectivityBroadcastReceiver: ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r2 = new java.lang.Object[r6];
        defpackage.glk.e(r1, r0, r2);
        goto L_0x000f;
    L_0x00c1:
        r2 = r1.getState();
        r3 = android.net.NetworkInfo.State.CONNECTED;
        if (r2 != r3) goto L_0x00e9;
    L_0x00c9:
        r0 = r1.getExtraInfo();
        r0 = defpackage.fzo.a(r8, r0);
        r1 = r0.b();
        if (r1 == 0) goto L_0x000f;
    L_0x00d7:
        r1 = defpackage.fxz.b;
        monitor-enter(r1);
        r2 = defpackage.fxz.b;	 Catch:{ all -> 0x00e6 }
        r2.b();	 Catch:{ all -> 0x00e6 }
        r2 = defpackage.fxz.b;	 Catch:{ all -> 0x00e6 }
        r2.d = r0;	 Catch:{ all -> 0x00e6 }
        monitor-exit(r1);	 Catch:{ all -> 0x00e6 }
        goto L_0x000f;
    L_0x00e6:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00e6 }
        throw r0;
    L_0x00e9:
        r2 = r1.getState();
        r3 = android.net.NetworkInfo.State.DISCONNECTED;
        if (r2 != r3) goto L_0x0114;
    L_0x00f1:
        r0 = defpackage.fxz.a(r0);
        if (r0 != 0) goto L_0x0114;
    L_0x00f7:
        r1 = defpackage.fxz.b;
        monitor-enter(r1);
        r0 = defpackage.fxz.b;	 Catch:{ all -> 0x0111 }
        r0 = 0;
        r2 = new fxy;	 Catch:{ all -> 0x0111 }
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r4 = "Mobile data is disabled and can not connect MMS";
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0111 }
        defpackage.fyc.a(r0, r2);	 Catch:{ all -> 0x0111 }
        r0 = defpackage.fxz.b;	 Catch:{ all -> 0x0111 }
        r2 = 0;
        r0.d = r2;	 Catch:{ all -> 0x0111 }
        monitor-exit(r1);	 Catch:{ all -> 0x0111 }
        goto L_0x000f;
    L_0x0111:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0111 }
        throw r0;
    L_0x0114:
        r0 = r1.isAvailable();
        if (r0 == 0) goto L_0x000f;
    L_0x011a:
        r1 = defpackage.fxz.b;	 Catch:{ ahz -> 0x0126 }
        monitor-enter(r1);	 Catch:{ ahz -> 0x0126 }
        defpackage.fxz.a(r8);	 Catch:{ all -> 0x0123 }
        monitor-exit(r1);	 Catch:{ all -> 0x0123 }
        goto L_0x000f;
    L_0x0123:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0123 }
        throw r0;	 Catch:{ ahz -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
        r1 = "Babel_SMS";
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 53;
        r2.<init>(r3);
        r3 = "MmsSendReceiveManager.ConnectivityBroadcastReceiver: ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r2 = new java.lang.Object[r6];
        defpackage.glk.e(r1, r0, r2);
        goto L_0x000f;
    L_0x0151:
        r2 = r7.b;
        r4 = r7.c;
        r2 = r2 + r4;
        r4 = defpackage.glj.b();
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x000f;
    L_0x015e:
        r0 = "networkInfo";
        r0 = r9.getParcelableExtra(r0);
        r0 = (android.net.NetworkInfo) r0;
        r2 = r0.isConnected();
        if (r2 == 0) goto L_0x000f;
    L_0x016c:
        r0 = r0.getDetailedState();
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 43;
        r2.<init>(r3);
        r3 = "Connected Type: ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = " detailedState: ";
        r1 = r1.append(r2);
        r1.append(r0);
        r0 = r7.d;
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.a(r2);
        r0 = defpackage.glj.b();
        r7.b = r0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fnx.onReceive(android.content.Context, android.content.Intent):void");
    }
}
