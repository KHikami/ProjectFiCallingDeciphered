package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* renamed from: da */
public class da extends db implements OnCancelListener, OnDismissListener {
    private int W;
    private int X;
    private boolean Y;
    private int Z;
    public boolean a;
    private Dialog aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;

    public da() {
        this.W = 0;
        this.X = 0;
        this.Y = true;
        this.a = true;
        this.Z = -1;
    }

    public void a(dl dlVar, String str) {
        this.ac = false;
        this.ad = true;
        dy a = dlVar.a();
        a.a(this, str);
        a.a();
    }

    public final void a(boolean z) {
        if (!this.ac) {
            this.ac = true;
            this.ad = false;
            if (this.aa != null) {
                this.aa.dismiss();
                this.aa = null;
            }
            this.ab = true;
            if (this.Z >= 0) {
                this.t.a(this.Z, 1);
                this.Z = -1;
                return;
            }
            dy a = this.t.a();
            a.a(this);
            if (z) {
                a.b();
            } else {
                a.a();
            }
        }
    }

    public void a(Context context) {
        super.a(context);
        if (!this.ad) {
            this.ac = false;
        }
    }

    public final void a() {
        super.a();
        if (!this.ad && !this.ac) {
            this.ac = true;
        }
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        this.a = this.z == 0;
        if (bundle != null) {
            this.W = bundle.getInt("android:style", 0);
            this.X = bundle.getInt("android:theme", 0);
            this.Y = bundle.getBoolean("android:cancelable", true);
            this.a = bundle.getBoolean("android:showsDialog", this.a);
            this.Z = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater b(Bundle bundle) {
        if (!this.a) {
            return super.b(bundle);
        }
        this.aa = c(bundle);
        if (this.aa == null) {
            return (LayoutInflater) this.u.b.getSystemService("layout_inflater");
        }
        Dialog dialog = this.aa;
        switch (this.W) {
            case rq.b /*1*/:
            case rq.c /*2*/:
                break;
            case rl.e /*3*/:
                dialog.getWindow().addFlags(24);
                break;
        }
        dialog.requestWindowFeature(1);
        return (LayoutInflater) this.aa.getContext().getSystemService("layout_inflater");
    }

    public Dialog c(Bundle bundle) {
        return new Dialog(e(), this.X);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ab) {
            a(true);
        }
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.a) {
            View view = this.K;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.aa.setContentView(view);
            }
            Activity e = e();
            if (e != null) {
                this.aa.setOwnerActivity(e);
            }
            this.aa.setCancelable(this.Y);
            this.aa.setOnCancelListener(this);
            this.aa.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.aa.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public final void b() {
        super.b();
        if (this.aa != null) {
            this.ab = false;
            this.aa.show();
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.aa != null) {
            Bundle onSaveInstanceState = this.aa.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.W != 0) {
            bundle.putInt("android:style", this.W);
        }
        if (this.X != 0) {
            bundle.putInt("android:theme", this.X);
        }
        if (!this.Y) {
            bundle.putBoolean("android:cancelable", this.Y);
        }
        if (!this.a) {
            bundle.putBoolean("android:showsDialog", this.a);
        }
        if (this.Z != -1) {
            bundle.putInt("android:backStackId", this.Z);
        }
    }

    public final void c() {
        super.c();
        if (this.aa != null) {
            this.aa.hide();
        }
    }

    public final void d() {
        super.d();
        if (this.aa != null) {
            this.ab = true;
            this.aa.dismiss();
            this.aa = null;
        }
    }
}
