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

public class dq extends dr implements OnCancelListener, OnDismissListener {
    int a = 0;
    int b = 0;
    boolean c = true;
    boolean d = true;
    int e = -1;
    Dialog f;
    boolean g;
    boolean h;
    boolean i;

    public void a(int i, int i2) {
        this.a = 1;
        if (this.a == 2 || this.a == 3) {
            this.b = 16973913;
        }
        if (i2 != 0) {
            this.b = i2;
        }
    }

    public void a(ed edVar, String str) {
        this.h = false;
        this.i = true;
        ew a = edVar.a();
        a.a((dr) this, str);
        a.a();
    }

    public int a(ew ewVar, String str) {
        this.h = false;
        this.i = true;
        ewVar.a((dr) this, str);
        this.g = false;
        this.e = ewVar.a();
        return this.e;
    }

    public void a() {
        a(false);
    }

    public void b() {
        a(true);
    }

    void a(boolean z) {
        if (!this.h) {
            this.h = true;
            this.i = false;
            if (this.f != null) {
                this.f.dismiss();
                this.f = null;
            }
            this.g = true;
            if (this.e >= 0) {
                getFragmentManager().a(this.e, 1);
                this.e = -1;
                return;
            }
            ew a = getFragmentManager().a();
            a.a((dr) this);
            if (z) {
                a.b();
            } else {
                a.a();
            }
        }
    }

    public Dialog c() {
        return this.f;
    }

    public int d() {
        return this.b;
    }

    public void b(boolean z) {
        this.c = z;
        if (this.f != null) {
            this.f.setCancelable(z);
        }
    }

    public boolean e() {
        return this.c;
    }

    public void c(boolean z) {
        this.d = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.i) {
            this.h = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.i && !this.h) {
            this.h = true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = this.H == 0;
        if (bundle != null) {
            this.a = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.c = bundle.getBoolean("android:cancelable", true);
            this.d = bundle.getBoolean("android:showsDialog", this.d);
            this.e = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        if (!this.d) {
            return super.getLayoutInflater(bundle);
        }
        this.f = a(bundle);
        if (this.f == null) {
            return (LayoutInflater) this.C.i().getSystemService("layout_inflater");
        }
        a(this.f, this.a);
        return (LayoutInflater) this.f.getContext().getSystemService("layout_inflater");
    }

    public void a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog a(Bundle bundle) {
        return new Dialog(getActivity(), d());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.g) {
            a(true);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.d) {
            View view = getView();
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f.setContentView(view);
            }
            Activity activity = getActivity();
            if (activity != null) {
                this.f.setOwnerActivity(activity);
            }
            this.f.setCancelable(this.c);
            this.f.setOnCancelListener(this);
            this.f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f != null) {
            this.g = false;
            this.f.show();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f != null) {
            Bundle onSaveInstanceState = this.f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.a != 0) {
            bundle.putInt("android:style", this.a);
        }
        if (this.b != 0) {
            bundle.putInt("android:theme", this.b);
        }
        if (!this.c) {
            bundle.putBoolean("android:cancelable", this.c);
        }
        if (!this.d) {
            bundle.putBoolean("android:showsDialog", this.d);
        }
        if (this.e != -1) {
            bundle.putInt("android:backStackId", this.e);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f != null) {
            this.f.hide();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f != null) {
            this.g = true;
            this.f.dismiss();
            this.f = null;
        }
    }
}
