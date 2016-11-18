package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class hbf {
    private static final ComponentName f16507a = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    private final gwj f16508b = gwj.m18777a(this.f16513g);
    private ServiceConnection f16509c = new hbg(this);
    private volatile hbh f16510d;
    private int f16511e = 0;
    private CountDownLatch f16512f = new CountDownLatch(1);
    private Context f16513g;
    private boolean f16514h = false;

    public hbf(Context context) {
        this.f16513g = context;
    }

    private synchronized boolean m19132a() {
        int i = this.f16511e;
        this.f16511e = i + 1;
        if (i == 0) {
            this.f16514h = this.f16508b.mo2356a(f16507a, this.f16509c, "GoogleHttpServiceClient");
        }
        return this.f16514h;
    }

    private synchronized void m19133b() {
        int i = this.f16511e - 1;
        this.f16511e = i;
        if (i == 0) {
            this.f16508b.mo2358b(f16507a, this.f16509c, "GoogleHttpServiceClient");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Bundle m19134a(String str) {
        Bundle bundle = null;
        if (m19132a()) {
            try {
                if (!(this.f16510d != null || Looper.getMainLooper().getThread() == Thread.currentThread() || this.f16512f.await(500, TimeUnit.MILLISECONDS))) {
                    Throwable th = new Throwable();
                    this.f16512f.countDown();
                }
                if (this.f16510d != null) {
                    bundle = this.f16510d.mo2445a(str);
                }
                m19133b();
            } catch (RemoteException e) {
            } catch (InterruptedException e2) {
                String valueOf = String.valueOf(e2);
                new StringBuilder(String.valueOf(valueOf).length() + 32).append("Interrupted waiting for binder: ").append(valueOf);
            } catch (Throwable th2) {
                bundle = th2;
                m19133b();
            }
        } else {
            m19133b();
        }
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19135a(String str, int i) {
        if (m19132a()) {
            try {
                if (this.f16510d != null && i > 0) {
                    this.f16510d.mo2446a(str, i);
                }
                m19133b();
            } catch (RemoteException e) {
            } catch (Throwable th) {
                m19133b();
            }
        } else {
            m19133b();
        }
    }
}
