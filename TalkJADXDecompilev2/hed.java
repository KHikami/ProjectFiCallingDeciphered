package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;

public abstract class hed extends hga implements OnCancelListener {
    public boolean a;
    public boolean b;
    ConnectionResult c;
    int d;
    public final gtp e;
    private final Handler g;

    private hed(hgb hgb, gtp gtp) {
        super(hgb);
        this.d = -1;
        this.g = new Handler(Looper.getMainLooper());
        this.e = gtp;
    }

    public void a() {
        super.a();
        this.a = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6, int r7, android.content.Intent r8) {
        /*
        r5 = this;
        r4 = 18;
        r2 = 13;
        r0 = 1;
        r1 = 0;
        switch(r6) {
            case 1: goto L_0x0027;
            case 2: goto L_0x0010;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = r1;
    L_0x000a:
        if (r0 == 0) goto L_0x003d;
    L_0x000c:
        r5.d();
    L_0x000f:
        return;
    L_0x0010:
        r2 = r5.e;
        r3 = r5.e();
        r2 = r2.a(r3);
        if (r2 != 0) goto L_0x0047;
    L_0x001c:
        r1 = r5.c;
        r1 = r1.c();
        if (r1 != r4) goto L_0x000a;
    L_0x0024:
        if (r2 != r4) goto L_0x000a;
    L_0x0026:
        goto L_0x000f;
    L_0x0027:
        r3 = -1;
        if (r7 == r3) goto L_0x000a;
    L_0x002a:
        if (r7 != 0) goto L_0x0009;
    L_0x002c:
        if (r8 == 0) goto L_0x0045;
    L_0x002e:
        r0 = "<<ResolutionFailureErrorDetail>>";
        r0 = r8.getIntExtra(r0, r2);
    L_0x0034:
        r2 = new com.google.android.gms.common.ConnectionResult;
        r3 = 0;
        r2.<init>(r0, r3);
        r5.c = r2;
        goto L_0x0009;
    L_0x003d:
        r0 = r5.c;
        r1 = r5.d;
        r5.a(r0, r1);
        goto L_0x000f;
    L_0x0045:
        r0 = r2;
        goto L_0x0034;
    L_0x0047:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: hed.a(int, int, android.content.Intent):void");
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.b = bundle.getBoolean("resolving_error", false);
            if (this.b) {
                this.d = bundle.getInt("failed_client_id", -1);
                this.c = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    protected abstract void a(ConnectionResult connectionResult, int i);

    public void b() {
        super.b();
        this.a = false;
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putBoolean("resolving_error", this.b);
        if (this.b) {
            bundle.putInt("failed_client_id", this.d);
            bundle.putInt("failed_status", this.c.c());
            bundle.putParcelable("failed_resolution", this.c.d());
        }
    }

    public void b(ConnectionResult connectionResult, int i) {
        if (!this.b) {
            this.b = true;
            this.d = i;
            this.c = connectionResult;
            this.g.post(new hee(this));
        }
    }

    protected abstract void c();

    protected void d() {
        this.d = -1;
        this.b = false;
        this.c = null;
        c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), this.d);
        d();
    }

    protected hed(hgb hgb) {
        this(hgb, gtp.a);
    }
}
