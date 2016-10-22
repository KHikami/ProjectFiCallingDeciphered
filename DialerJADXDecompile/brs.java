import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class brs extends db implements OnCancelListener {
    public boolean W;
    public btd X;
    public final SparseArray Y;
    private int Z;
    public boolean a;
    private ConnectionResult aa;
    private final Handler ab;

    public brs() {
        this.Z = -1;
        this.ab = new Handler(Looper.getMainLooper());
        this.Y = new SparseArray();
    }

    public static brs a(de deVar) {
        buf.o("Must be called from main thread of process");
        try {
            brs brs = (brs) deVar.d().a("GmsSupportLifecycleFrag");
            return (brs == null || brs.o) ? null : brs;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFrag is not a SupportLifecycleFragment", e);
        }
    }

    public static brs b(de deVar) {
        brs a = a(deVar);
        dl d = deVar.d();
        if (a == null) {
            a = s();
            if (a == null) {
                Log.w("GmsSupportLifecycleFrag", "Unable to find connection error message resources (Did you include play-services-base and the proper proguard rules?); error dialogs may be unavailable.");
                a = new brs();
            }
            d.a().a(a, "GmsSupportLifecycleFrag").b();
            d.b();
        }
        return a;
    }

    private final void c(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Unresolved error while connecting client. Stopping auto-manage.");
        brt brt = (brt) this.Y.get(i);
        if (brt != null) {
            brg brg = (brt) this.Y.get(i);
            this.Y.remove(i);
            if (brg != null) {
                brg.b.b(brg);
                brg.b.c();
            }
            brg brg2 = brt.c;
            if (brg2 != null) {
                brg2.a(connectionResult);
            }
        }
        r();
    }

    private static brs s() {
        Class cls;
        try {
            cls = Class.forName("bro");
        } catch (ClassNotFoundException e) {
            cls = null;
            if (cls != null) {
                try {
                    return (brs) cls.newInstance();
                } catch (IllegalAccessException e2) {
                } catch (InstantiationException e3) {
                } catch (ExceptionInInitializerError e4) {
                } catch (RuntimeException e5) {
                }
            }
            return null;
        } catch (LinkageError e6) {
            cls = null;
            if (cls != null) {
                return (brs) cls.newInstance();
            }
            return null;
        } catch (SecurityException e7) {
            cls = null;
            if (cls != null) {
                return (brs) cls.newInstance();
            }
            return null;
        }
        if (cls != null) {
            return (brs) cls.newInstance();
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, int r6) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        switch(r5) {
            case 1: goto L_0x001b;
            case 2: goto L_0x000c;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = r1;
    L_0x0006:
        if (r0 == 0) goto L_0x002b;
    L_0x0008:
        r4.r();
    L_0x000b:
        return;
    L_0x000c:
        r2 = r4.q();
        r3 = r4.e();
        r2 = r2.a(r3);
        if (r2 != 0) goto L_0x0005;
    L_0x001a:
        goto L_0x0006;
    L_0x001b:
        r2 = -1;
        if (r6 == r2) goto L_0x0006;
    L_0x001e:
        if (r6 != 0) goto L_0x0005;
    L_0x0020:
        r0 = new com.google.android.gms.common.ConnectionResult;
        r2 = 13;
        r3 = 0;
        r0.<init>(r2, r3);
        r4.aa = r0;
        goto L_0x0005;
    L_0x002b:
        r0 = r4.Z;
        r1 = r4.aa;
        r4.c(r0, r1);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: brs.a(int, int):void");
    }

    protected void a(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Failed to connect due to user resolvable error " + (connectionResult.e + " (" + connectionResult.c + ": " + bqu.b(connectionResult.c) + ')'));
        c(i, connectionResult);
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.W = bundle.getBoolean("resolving_error", false);
            this.Z = bundle.getInt("failed_client_id", -1);
            if (this.Z >= 0) {
                this.aa = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (int i = 0; i < this.Y.size(); i++) {
            brt brt = (brt) this.Y.valueAt(i);
            printWriter.append(str).append("GoogleApiClient #").print(brt.a);
            printWriter.println(":");
            brt.b.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public final void b() {
        super.b();
        this.a = true;
        if (!this.W) {
            for (int i = 0; i < this.Y.size(); i++) {
                ((brt) this.Y.valueAt(i)).b.b();
            }
        }
    }

    protected void b(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Unable to connect, GooglePlayServices is updating.");
        c(i, connectionResult);
    }

    public final void c() {
        super.c();
        this.a = false;
        for (int i = 0; i < this.Y.size(); i++) {
            ((brt) this.Y.valueAt(i)).b.c();
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("resolving_error", this.W);
        if (this.Z >= 0) {
            bundle.putInt("failed_client_id", this.Z);
            bundle.putInt("failed_status", this.aa.c);
            bundle.putParcelable("failed_resolution", this.aa.d);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        c(this.Z, new ConnectionResult(13, null));
    }

    protected final void r() {
        this.W = false;
        this.Z = -1;
        this.aa = null;
        if (this.X != null) {
            this.X.b();
            this.X = null;
        }
        for (int i = 0; i < this.Y.size(); i++) {
            ((brt) this.Y.valueAt(i)).b.b();
        }
    }

    protected bqp q() {
        return bqp.c;
    }
}
