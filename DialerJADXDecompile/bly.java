import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.io.IOException;

public final class bly {
    private bwg a;
    private cll b;
    private boolean c;
    private Object d;
    private bma e;
    private final Context f;
    private long g;

    private bly(Context context, long j) {
        this.d = new Object();
        buf.A((Object) context);
        this.f = context;
        this.c = false;
        this.g = -1;
    }

    public static blz a(Context context) {
        bly bly = new bly(context, -1);
        try {
            bly.a(false);
            blz b = bly.b();
            return b;
        } finally {
            bly.a();
        }
    }

    private static cll a(bwg bwg) {
        try {
            IBinder a = bwg.a();
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof cll)) ? new cln(a) : (cll) queryLocalInterface;
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    private void a(boolean z) {
        buf.p("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                a();
            }
            this.a = b(this.f);
            this.b = a(this.a);
            this.c = true;
        }
    }

    private blz b() {
        blz blz;
        buf.p("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            buf.A(this.a);
            buf.A(this.b);
            blz = new blz(this.b.a(), this.b.a(true));
        }
        synchronized (this.d) {
            if (this.e != null) {
                this.e.a.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException e3) {
                }
            }
            if (this.g > 0) {
                this.e = new bma(this, this.g);
            }
        }
        return blz;
    }

    private static bwg b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (bqp.c.a(context)) {
                case rl.c /*0*/:
                case rq.c /*2*/:
                    Object bwg = new bwg();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (bvr.a().a(context, intent, bwg, 1)) {
                            return bwg;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        IOException iOException = new IOException(th);
                    }
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException e) {
            throw new bqq(9);
        }
    }

    public final void a() {
        buf.p("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.a == null) {
                return;
            }
            try {
                if (this.c) {
                    bvr.a().a(this.f, this.a);
                }
            } catch (IllegalArgumentException e) {
            }
            this.c = false;
            this.b = null;
            this.a = null;
        }
    }

    protected final void finalize() {
        a();
        super.finalize();
    }
}
