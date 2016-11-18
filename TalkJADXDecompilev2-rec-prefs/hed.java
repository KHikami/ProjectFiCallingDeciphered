package p000;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;

public abstract class hed extends hga implements OnCancelListener {
    public boolean f16712a;
    public boolean f16713b;
    ConnectionResult f16714c;
    int f16715d;
    public final gtp f16716e;
    private final Handler f16717g;

    private hed(hgb hgb, gtp gtp) {
        super(hgb);
        this.f16715d = -1;
        this.f16717g = new Handler(Looper.getMainLooper());
        this.f16716e = gtp;
    }

    public void mo2470a() {
        super.mo2470a();
        this.f16712a = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2471a(int i, int i2, Intent intent) {
        Object obj = 1;
        switch (i) {
            case 1:
                if (i2 != -1) {
                    if (i2 == 0) {
                        this.f16714c = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null);
                    }
                }
                break;
            case 2:
                int a = this.f16716e.mo2334a(m19453e());
                if (a != 0) {
                    obj = null;
                }
                if (this.f16714c.m9654c() == 18 && a == 18) {
                    return;
                }
            default:
                obj = null;
                break;
        }
        if (obj != null) {
            m19462d();
        } else {
            mo2475a(this.f16714c, this.f16715d);
        }
    }

    public void mo2472a(Bundle bundle) {
        super.mo2472a(bundle);
        if (bundle != null) {
            this.f16713b = bundle.getBoolean("resolving_error", false);
            if (this.f16713b) {
                this.f16715d = bundle.getInt("failed_client_id", -1);
                this.f16714c = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    protected abstract void mo2475a(ConnectionResult connectionResult, int i);

    public void mo2473b() {
        super.mo2473b();
        this.f16712a = false;
    }

    public void mo2474b(Bundle bundle) {
        super.mo2474b(bundle);
        bundle.putBoolean("resolving_error", this.f16713b);
        if (this.f16713b) {
            bundle.putInt("failed_client_id", this.f16715d);
            bundle.putInt("failed_status", this.f16714c.m9654c());
            bundle.putParcelable("failed_resolution", this.f16714c.m9655d());
        }
    }

    public void m19460b(ConnectionResult connectionResult, int i) {
        if (!this.f16713b) {
            this.f16713b = true;
            this.f16715d = i;
            this.f16714c = connectionResult;
            this.f16717g.post(new hee(this));
        }
    }

    protected abstract void mo2477c();

    protected void m19462d() {
        this.f16715d = -1;
        this.f16713b = false;
        this.f16714c = null;
        mo2477c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo2475a(new ConnectionResult(13, null), this.f16715d);
        m19462d();
    }

    protected hed(hgb hgb) {
        this(hgb, gtp.f16131a);
    }
}
