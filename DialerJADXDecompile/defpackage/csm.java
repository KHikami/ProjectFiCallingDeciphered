package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: csm */
public final class csm {
    private static String b;
    private static String c;
    private static boolean d;
    public final WakeLock a;
    private WorkSource e;
    private final int f;
    private final String g;
    private final String h;
    private final Context i;
    private boolean j;
    private int k;
    private int l;

    static {
        b = "WakeLock";
        c = "*gcore*:";
        d = false;
    }

    public csm(Context context, int i, String str) {
        this(context, 1, str, null, context == null ? null : context.getPackageName());
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private csm(Context context, int i, String str, String str2, String str3) {
        this.j = true;
        buf.a(str, (Object) "Wake lock name can NOT be empty");
        this.f = i;
        this.h = null;
        this.i = context.getApplicationContext();
        if (bwe.a(str3) || "com.google.android.gms" == str3) {
            this.g = str;
        } else {
            this.g = c + str;
        }
        this.a = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (bwf.a(this.i)) {
            if (bwe.a(str3)) {
                if (btq.a && cme.a()) {
                    Log.e(b, "callingPackage is not supposed to be empty for wakelock " + this.g + "!", new IllegalArgumentException());
                    str3 = "com.google.android.gms";
                } else {
                    str3 = context.getPackageName();
                }
            }
            this.e = bwf.a(context, str3);
            WorkSource workSource = this.e;
            if (bwf.a(this.i) && workSource != null) {
                if (this.e != null) {
                    this.e.add(workSource);
                } else {
                    this.e = workSource;
                }
                this.a.setWorkSource(this.e);
            }
        }
    }

    private final String a(String str, boolean z) {
        return this.j ? z ? str : this.h : this.h;
    }

    private final boolean a(String str) {
        return (TextUtils.isEmpty(str) || str.equals(this.h)) ? false : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        r8 = this;
        r1 = 0;
        r0 = r8.a(r1);
        r5 = r8.a(r1, r0);
        monitor-enter(r8);
        r1 = r8.j;	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x0018;
    L_0x000e:
        r1 = r8.k;	 Catch:{ all -> 0x0047 }
        r1 = r1 + -1;
        r8.k = r1;	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x0021;
    L_0x0016:
        if (r0 != 0) goto L_0x0021;
    L_0x0018:
        r0 = r8.j;	 Catch:{ all -> 0x0047 }
        if (r0 != 0) goto L_0x0040;
    L_0x001c:
        r0 = r8.l;	 Catch:{ all -> 0x0047 }
        r1 = 1;
        if (r0 != r1) goto L_0x0040;
    L_0x0021:
        r0 = defpackage.bvz.a;	 Catch:{ all -> 0x0047 }
        r1 = r8.i;	 Catch:{ all -> 0x0047 }
        r2 = r8.a;	 Catch:{ all -> 0x0047 }
        r2 = defpackage.buf.a(r2, r5);	 Catch:{ all -> 0x0047 }
        r3 = 8;
        r4 = r8.g;	 Catch:{ all -> 0x0047 }
        r6 = r8.f;	 Catch:{ all -> 0x0047 }
        r7 = r8.e;	 Catch:{ all -> 0x0047 }
        r7 = defpackage.bwf.a(r7);	 Catch:{ all -> 0x0047 }
        r0.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0047 }
        r0 = r8.l;	 Catch:{ all -> 0x0047 }
        r0 = r0 + -1;
        r8.l = r0;	 Catch:{ all -> 0x0047 }
    L_0x0040:
        monitor-exit(r8);	 Catch:{ all -> 0x0047 }
        r0 = r8.a;
        r0.release();
        return;
    L_0x0047:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0047 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: csm.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r13) {
        /*
        r12 = this;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = 0;
        r0 = defpackage.buf.u();
        if (r0 != 0) goto L_0x0023;
    L_0x0009:
        r0 = r12.j;
        if (r0 == 0) goto L_0x0023;
    L_0x000d:
        r0 = b;
        r1 = new java.lang.StringBuilder;
        r2 = "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ";
        r1.<init>(r2);
        r2 = r12.g;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.wtf(r0, r1);
    L_0x0023:
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r12.a(r3);
        r5 = r12.a(r3, r0);
        monitor-enter(r12);
        r1 = r12.j;	 Catch:{ all -> 0x0069 }
        if (r1 == 0) goto L_0x003c;
    L_0x0032:
        r1 = r12.k;	 Catch:{ all -> 0x0069 }
        r2 = r1 + 1;
        r12.k = r2;	 Catch:{ all -> 0x0069 }
        if (r1 == 0) goto L_0x0044;
    L_0x003a:
        if (r0 != 0) goto L_0x0044;
    L_0x003c:
        r0 = r12.j;	 Catch:{ all -> 0x0069 }
        if (r0 != 0) goto L_0x0062;
    L_0x0040:
        r0 = r12.l;	 Catch:{ all -> 0x0069 }
        if (r0 != 0) goto L_0x0062;
    L_0x0044:
        r0 = defpackage.bvz.a;	 Catch:{ all -> 0x0069 }
        r1 = r12.i;	 Catch:{ all -> 0x0069 }
        r0 = r12.a;	 Catch:{ all -> 0x0069 }
        r2 = defpackage.buf.a(r0, r5);	 Catch:{ all -> 0x0069 }
        r3 = 7;
        r4 = r12.g;	 Catch:{ all -> 0x0069 }
        r6 = r12.f;	 Catch:{ all -> 0x0069 }
        r0 = r12.e;	 Catch:{ all -> 0x0069 }
        r7 = defpackage.bwf.a(r0);	 Catch:{ all -> 0x0069 }
        defpackage.bvz.a(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0069 }
        r0 = r12.l;	 Catch:{ all -> 0x0069 }
        r0 = r0 + 1;
        r12.l = r0;	 Catch:{ all -> 0x0069 }
    L_0x0062:
        monitor-exit(r12);	 Catch:{ all -> 0x0069 }
        r0 = r12.a;
        r0.acquire(r10);
        return;
    L_0x0069:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x0069 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: csm.a(long):void");
    }

    public final void a(boolean z) {
        this.a.setReferenceCounted(false);
        this.j = false;
    }
}
