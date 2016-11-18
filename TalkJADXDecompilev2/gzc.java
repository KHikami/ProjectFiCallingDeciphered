package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;

public class gzc extends Service {
    private final Object a = new Object();
    private int b;
    private int c = 0;

    private void b() {
        synchronized (this.a) {
            this.c--;
            if (this.c == 0) {
                a(this.b);
            }
        }
    }

    static void b(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    public void a() {
    }

    public void a(Bundle bundle) {
    }

    boolean a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.a) {
            this.b = i2;
            this.c++;
        }
        if (intent == null) {
            b();
            return 2;
        }
        if (VERSION.SDK_INT >= 11) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new gzd(this, intent));
        } else {
            new gze(this, intent).execute(new Void[0]);
        }
        return 3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.gzc r7, android.content.Intent r8) {
        /*
        r0 = -1;
        r1 = 1;
        r2 = 0;
        r3 = r8.getAction();	 Catch:{ all -> 0x005a }
        r4 = r3.hashCode();	 Catch:{ all -> 0x005a }
        switch(r4) {
            case 366519424: goto L_0x002c;
            default: goto L_0x000e;
        };	 Catch:{ all -> 0x005a }
    L_0x000e:
        r3 = r0;
    L_0x000f:
        switch(r3) {
            case 0: goto L_0x0036;
            default: goto L_0x0012;
        };	 Catch:{ all -> 0x005a }
    L_0x0012:
        r0 = "Unknown intent action: ";
        r1 = r8.getAction();	 Catch:{ all -> 0x005a }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x005a }
        r2 = r1.length();	 Catch:{ all -> 0x005a }
        if (r2 == 0) goto L_0x0191;
    L_0x0022:
        r0.concat(r1);	 Catch:{ all -> 0x005a }
    L_0x0025:
        r7.b();	 Catch:{ all -> 0x005a }
        defpackage.iw.a(r8);
        return;
    L_0x002c:
        r4 = "com.google.android.c2dm.intent.RECEIVE";
        r3 = r3.equals(r4);	 Catch:{ all -> 0x005a }
        if (r3 == 0) goto L_0x000e;
    L_0x0034:
        r3 = r2;
        goto L_0x000f;
    L_0x0036:
        r3 = "message_type";
        r3 = r8.getStringExtra(r3);	 Catch:{ all -> 0x005a }
        if (r3 != 0) goto L_0x0040;
    L_0x003e:
        r3 = "gcm";
    L_0x0040:
        r4 = r3.hashCode();	 Catch:{ all -> 0x005a }
        switch(r4) {
            case -2062414158: goto L_0x0069;
            case 102161: goto L_0x005f;
            case 814694033: goto L_0x007d;
            case 814800675: goto L_0x0073;
            default: goto L_0x0047;
        };	 Catch:{ all -> 0x005a }
    L_0x0047:
        switch(r0) {
            case 0: goto L_0x0087;
            case 1: goto L_0x0172;
            case 2: goto L_0x0177;
            case 3: goto L_0x017e;
            default: goto L_0x004a;
        };	 Catch:{ all -> 0x005a }
    L_0x004a:
        r0 = "Received message with unknown type: ";
        r1 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x005a }
        r2 = r1.length();	 Catch:{ all -> 0x005a }
        if (r2 == 0) goto L_0x018a;
    L_0x0056:
        r0.concat(r1);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x005a:
        r0 = move-exception;
        defpackage.iw.a(r8);
        throw r0;
    L_0x005f:
        r4 = "gcm";
        r4 = r3.equals(r4);	 Catch:{ all -> 0x005a }
        if (r4 == 0) goto L_0x0047;
    L_0x0067:
        r0 = r2;
        goto L_0x0047;
    L_0x0069:
        r4 = "deleted_messages";
        r4 = r3.equals(r4);	 Catch:{ all -> 0x005a }
        if (r4 == 0) goto L_0x0047;
    L_0x0071:
        r0 = r1;
        goto L_0x0047;
    L_0x0073:
        r4 = "send_event";
        r4 = r3.equals(r4);	 Catch:{ all -> 0x005a }
        if (r4 == 0) goto L_0x0047;
    L_0x007b:
        r0 = 2;
        goto L_0x0047;
    L_0x007d:
        r4 = "send_error";
        r4 = r3.equals(r4);	 Catch:{ all -> 0x005a }
        if (r4 == 0) goto L_0x0047;
    L_0x0085:
        r0 = 3;
        goto L_0x0047;
    L_0x0087:
        r3 = r8.getExtras();	 Catch:{ all -> 0x005a }
        r0 = "message_type";
        r3.remove(r0);	 Catch:{ all -> 0x005a }
        r0 = "android.support.content.wakelockid";
        r3.remove(r0);	 Catch:{ all -> 0x005a }
        r0 = "1";
        r4 = "gcm.n.e";
        r4 = defpackage.gzt.a(r3, r4);	 Catch:{ all -> 0x005a }
        r0 = r0.equals(r4);	 Catch:{ all -> 0x005a }
        if (r0 != 0) goto L_0x00ab;
    L_0x00a3:
        r0 = "gcm.n.icon";
        r0 = defpackage.gzt.a(r3, r0);	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x00f4;
    L_0x00ab:
        r0 = r1;
    L_0x00ac:
        if (r0 == 0) goto L_0x0160;
    L_0x00ae:
        r0 = "keyguard";
        r0 = r7.getSystemService(r0);	 Catch:{ all -> 0x005a }
        r0 = (android.app.KeyguardManager) r0;	 Catch:{ all -> 0x005a }
        r0 = r0.inKeyguardRestrictedInputMode();	 Catch:{ all -> 0x005a }
        if (r0 != 0) goto L_0x00f8;
    L_0x00bc:
        r4 = android.os.Process.myPid();	 Catch:{ all -> 0x005a }
        r0 = "activity";
        r0 = r7.getSystemService(r0);	 Catch:{ all -> 0x005a }
        r0 = (android.app.ActivityManager) r0;	 Catch:{ all -> 0x005a }
        r0 = r0.getRunningAppProcesses();	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x00f8;
    L_0x00ce:
        r5 = r0.iterator();	 Catch:{ all -> 0x005a }
    L_0x00d2:
        r0 = r5.hasNext();	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x00f8;
    L_0x00d8:
        r0 = r5.next();	 Catch:{ all -> 0x005a }
        r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0;	 Catch:{ all -> 0x005a }
        r6 = r0.pid;	 Catch:{ all -> 0x005a }
        if (r6 != r4) goto L_0x00d2;
    L_0x00e2:
        r0 = r0.importance;	 Catch:{ all -> 0x005a }
        r4 = 100;
        if (r0 != r4) goto L_0x00f6;
    L_0x00e8:
        r0 = r1;
    L_0x00e9:
        if (r0 != 0) goto L_0x00fa;
    L_0x00eb:
        r0 = defpackage.gzt.a(r7);	 Catch:{ all -> 0x005a }
        r0.a(r3);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x00f4:
        r0 = r2;
        goto L_0x00ac;
    L_0x00f6:
        r0 = r2;
        goto L_0x00e9;
    L_0x00f8:
        r0 = r2;
        goto L_0x00e9;
    L_0x00fa:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x005a }
        r1.<init>();	 Catch:{ all -> 0x005a }
        r0 = r3.keySet();	 Catch:{ all -> 0x005a }
        r2 = r0.iterator();	 Catch:{ all -> 0x005a }
    L_0x0107:
        r0 = r2.hasNext();	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x0143;
    L_0x010d:
        r0 = r2.next();	 Catch:{ all -> 0x005a }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x005a }
        r4 = r3.getString(r0);	 Catch:{ all -> 0x005a }
        r5 = "gcm.notification.";
        r5 = r0.startsWith(r5);	 Catch:{ all -> 0x005a }
        if (r5 == 0) goto L_0x0127;
    L_0x011f:
        r5 = "gcm.notification.";
        r6 = "gcm.n.";
        r0 = r0.replace(r5, r6);	 Catch:{ all -> 0x005a }
    L_0x0127:
        r5 = "gcm.n.";
        r5 = r0.startsWith(r5);	 Catch:{ all -> 0x005a }
        if (r5 == 0) goto L_0x0107;
    L_0x012f:
        r5 = "gcm.n.e";
        r5 = r5.equals(r0);	 Catch:{ all -> 0x005a }
        if (r5 != 0) goto L_0x013f;
    L_0x0137:
        r5 = 6;
        r0 = r0.substring(r5);	 Catch:{ all -> 0x005a }
        r1.putString(r0, r4);	 Catch:{ all -> 0x005a }
    L_0x013f:
        r2.remove();	 Catch:{ all -> 0x005a }
        goto L_0x0107;
    L_0x0143:
        r0 = "sound2";
        r0 = r1.getString(r0);	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x0155;
    L_0x014b:
        r2 = "sound2";
        r1.remove(r2);	 Catch:{ all -> 0x005a }
        r2 = "sound";
        r1.putString(r2, r0);	 Catch:{ all -> 0x005a }
    L_0x0155:
        r0 = r1.isEmpty();	 Catch:{ all -> 0x005a }
        if (r0 != 0) goto L_0x0160;
    L_0x015b:
        r0 = "notification";
        r3.putBundle(r0, r1);	 Catch:{ all -> 0x005a }
    L_0x0160:
        r0 = "from";
        r3.getString(r0);	 Catch:{ all -> 0x005a }
        r0 = "from";
        r3.remove(r0);	 Catch:{ all -> 0x005a }
        defpackage.gzc.b(r3);	 Catch:{ all -> 0x005a }
        r7.a(r3);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x0172:
        r7.a();	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x0177:
        r0 = "google.message_id";
        r8.getStringExtra(r0);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x017e:
        r0 = "google.message_id";
        r8.getStringExtra(r0);	 Catch:{ all -> 0x005a }
        r0 = "error";
        r8.getStringExtra(r0);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x018a:
        r1 = new java.lang.String;	 Catch:{ all -> 0x005a }
        r1.<init>(r0);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
    L_0x0191:
        r1 = new java.lang.String;	 Catch:{ all -> 0x005a }
        r1.<init>(r0);	 Catch:{ all -> 0x005a }
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: gzc.a(gzc, android.content.Intent):void");
    }
}
