import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.CountDownLatch;

public final class hbf {
    private static final ComponentName a;
    private final gwj b;
    private ServiceConnection c;
    private volatile hbh d;
    private int e;
    private CountDownLatch f;
    private Context g;
    private boolean h;

    static {
        a = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    }

    public hbf(Context context) {
        this.g = context;
        this.f = new CountDownLatch(1);
        this.b = gwj.a(this.g);
        this.e = 0;
        this.h = false;
        this.c = new hbg(this);
    }

    private synchronized boolean a() {
        int i = this.e;
        this.e = i + 1;
        if (i == 0) {
            this.h = this.b.a(a, this.c, "GoogleHttpServiceClient");
        }
        return this.h;
    }

    private synchronized void b() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.b.b(a, this.c, "GoogleHttpServiceClient");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle a(java.lang.String r6) {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.a();
        if (r1 != 0) goto L_0x000b;
    L_0x0007:
        r5.b();
    L_0x000a:
        return r0;
    L_0x000b:
        r1 = r5.d;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        if (r1 != 0) goto L_0x0033;
    L_0x000f:
        r1 = android.os.Looper.getMainLooper();	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r1 = r1.getThread();	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r2 = java.lang.Thread.currentThread();	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        if (r1 == r2) goto L_0x0033;
    L_0x001d:
        r1 = r5.f;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r1 = r1.await(r2, r4);	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        if (r1 != 0) goto L_0x0033;
    L_0x0029:
        r1 = new java.lang.Throwable;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r1.<init>();	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r1 = r5.f;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r1.countDown();	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
    L_0x0033:
        r1 = r5.d;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        if (r1 == 0) goto L_0x003d;
    L_0x0037:
        r1 = r5.d;	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
        r0 = r1.a(r6);	 Catch:{ RemoteException -> 0x0041, InterruptedException -> 0x0046 }
    L_0x003d:
        r5.b();
        goto L_0x000a;
    L_0x0041:
        r1 = move-exception;
        r5.b();
        goto L_0x000a;
    L_0x0046:
        r1 = move-exception;
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0067 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0067 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0067 }
        r3 = r3.length();	 Catch:{ all -> 0x0067 }
        r3 = r3 + 32;
        r2.<init>(r3);	 Catch:{ all -> 0x0067 }
        r3 = "Interrupted waiting for binder: ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0067 }
        r2.append(r1);	 Catch:{ all -> 0x0067 }
        r5.b();
        goto L_0x000a;
    L_0x0067:
        r0 = move-exception;
        r5.b();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hbf.a(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r2, int r3) {
        /*
        r1 = this;
        r0 = r1.a();
        if (r0 != 0) goto L_0x000a;
    L_0x0006:
        r1.b();
    L_0x0009:
        return;
    L_0x000a:
        r0 = r1.d;	 Catch:{ RemoteException -> 0x0019, all -> 0x001e }
        if (r0 == 0) goto L_0x0015;
    L_0x000e:
        if (r3 <= 0) goto L_0x0015;
    L_0x0010:
        r0 = r1.d;	 Catch:{ RemoteException -> 0x0019, all -> 0x001e }
        r0.a(r2, r3);	 Catch:{ RemoteException -> 0x0019, all -> 0x001e }
    L_0x0015:
        r1.b();
        goto L_0x0009;
    L_0x0019:
        r0 = move-exception;
        r1.b();
        goto L_0x0009;
    L_0x001e:
        r0 = move-exception;
        r1.b();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hbf.a(java.lang.String, int):void");
    }
}
