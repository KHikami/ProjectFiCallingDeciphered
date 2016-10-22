import android.os.Process;
import com.google.api.client.http.HttpStatusCodes;

public final class itz {
    private final iin<iua> a;
    private final Object b;

    public itz(int i) {
        this.b = new Object();
        this.a = new iin(HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
    }

    public void a(int i, String str, String str2) {
        synchronized (this.b) {
            Object iua;
            iua iua2 = (iua) this.a.b();
            if (iua2 == null) {
                iua = new iua();
            } else {
                iua iua3 = iua2;
            }
            iua.a(Process.myTid(), i, System.currentTimeMillis(), str, str2);
            this.a.a(iua);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.PrintWriter r11) {
        /*
        r10 = this;
        r0 = 0;
        r2 = new java.text.SimpleDateFormat;
        r1 = "MM-dd HH:mm:ss.SSS";
        r3 = java.util.Locale.US;
        r2.<init>(r1, r3);
        r3 = android.os.Process.myPid();
        r4 = r10.b;
        monitor-enter(r4);
        r1 = r0;
    L_0x0012:
        r0 = r10.a;	 Catch:{ all -> 0x0060 }
        r0 = r0.a();	 Catch:{ all -> 0x0060 }
        if (r1 >= r0) goto L_0x005e;
    L_0x001a:
        r0 = r10.a;	 Catch:{ all -> 0x0060 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0060 }
        r0 = (iua) r0;	 Catch:{ all -> 0x0060 }
        r5 = "%s %5d %5d %s %s: %s";
        r6 = 6;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0060 }
        r7 = 0;
        r8 = r0.c;	 Catch:{ all -> 0x0060 }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0060 }
        r8 = r2.format(r8);	 Catch:{ all -> 0x0060 }
        r6[r7] = r8;	 Catch:{ all -> 0x0060 }
        r7 = 1;
        r8 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0060 }
        r6[r7] = r8;	 Catch:{ all -> 0x0060 }
        r7 = 2;
        r8 = r0.a;	 Catch:{ all -> 0x0060 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0060 }
        r6[r7] = r8;	 Catch:{ all -> 0x0060 }
        r7 = 3;
        r8 = r0.b;	 Catch:{ all -> 0x0060 }
        r6[r7] = r8;	 Catch:{ all -> 0x0060 }
        r7 = 4;
        r8 = r0.d;	 Catch:{ all -> 0x0060 }
        r6[r7] = r8;	 Catch:{ all -> 0x0060 }
        r7 = 5;
        r0 = r0.e;	 Catch:{ all -> 0x0060 }
        r6[r7] = r0;	 Catch:{ all -> 0x0060 }
        r0 = java.lang.String.format(r5, r6);	 Catch:{ all -> 0x0060 }
        r11.println(r0);	 Catch:{ all -> 0x0060 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0012;
    L_0x005e:
        monitor-exit(r4);	 Catch:{ all -> 0x0060 }
        return;
    L_0x0060:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0060 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: itz.a(java.io.PrintWriter):void");
    }
}
