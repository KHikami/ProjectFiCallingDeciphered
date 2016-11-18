package p000;

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
    int f4817a = 0;
    int f4818b = 0;
    boolean f4819c = true;
    boolean f4820d = true;
    int f4821e = -1;
    Dialog f4822f;
    boolean f4823g;
    boolean f4824h;
    boolean f4825i;

    public void m7003a(int i, int i2) {
        this.f4817a = 1;
        if (this.f4817a == 2 || this.f4817a == 3) {
            this.f4818b = 16973913;
        }
        if (i2 != 0) {
            this.f4818b = i2;
        }
    }

    public void mo2341a(ed edVar, String str) {
        this.f4824h = false;
        this.f4825i = true;
        ew a = edVar.mo1845a();
        a.mo1528a((dr) this, str);
        a.mo1522a();
    }

    public int m7000a(ew ewVar, String str) {
        this.f4824h = false;
        this.f4825i = true;
        ewVar.mo1528a((dr) this, str);
        this.f4823g = false;
        this.f4821e = ewVar.mo1522a();
        return this.f4821e;
    }

    public void m7002a() {
        m7006a(false);
    }

    public void m7007b() {
        m7006a(true);
    }

    void m7006a(boolean z) {
        if (!this.f4824h) {
            this.f4824h = true;
            this.f4825i = false;
            if (this.f4822f != null) {
                this.f4822f.dismiss();
                this.f4822f = null;
            }
            this.f4823g = true;
            if (this.f4821e >= 0) {
                getFragmentManager().mo1846a(this.f4821e, 1);
                this.f4821e = -1;
                return;
            }
            ew a = getFragmentManager().mo1845a();
            a.mo1527a((dr) this);
            if (z) {
                a.mo1529b();
            } else {
                a.mo1522a();
            }
        }
    }

    public Dialog m7009c() {
        return this.f4822f;
    }

    public int m7011d() {
        return this.f4818b;
    }

    public void m7008b(boolean z) {
        this.f4819c = z;
        if (this.f4822f != null) {
            this.f4822f.setCancelable(z);
        }
    }

    public boolean m7012e() {
        return this.f4819c;
    }

    public void m7010c(boolean z) {
        this.f4820d = false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.f4825i) {
            this.f4824h = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f4825i && !this.f4824h) {
            this.f4824h = true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4820d = this.H == 0;
        if (bundle != null) {
            this.f4817a = bundle.getInt("android:style", 0);
            this.f4818b = bundle.getInt("android:theme", 0);
            this.f4819c = bundle.getBoolean("android:cancelable", true);
            this.f4820d = bundle.getBoolean("android:showsDialog", this.f4820d);
            this.f4821e = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        if (!this.f4820d) {
            return super.getLayoutInflater(bundle);
        }
        this.f4822f = mo792a(bundle);
        if (this.f4822f == null) {
            return (LayoutInflater) this.C.m13033i().getSystemService("layout_inflater");
        }
        m7004a(this.f4822f, this.f4817a);
        return (LayoutInflater) this.f4822f.getContext().getSystemService("layout_inflater");
    }

    public void m7004a(Dialog dialog, int i) {
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

    public Dialog mo792a(Bundle bundle) {
        return new Dialog(getActivity(), m7011d());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f4823g) {
            m7006a(true);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f4820d) {
            View view = getView();
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f4822f.setContentView(view);
            }
            Activity activity = getActivity();
            if (activity != null) {
                this.f4822f.setOwnerActivity(activity);
            }
            this.f4822f.setCancelable(this.f4819c);
            this.f4822f.setOnCancelListener(this);
            this.f4822f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f4822f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f4822f != null) {
            this.f4823g = false;
            this.f4822f.show();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f4822f != null) {
            Bundle onSaveInstanceState = this.f4822f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f4817a != 0) {
            bundle.putInt("android:style", this.f4817a);
        }
        if (this.f4818b != 0) {
            bundle.putInt("android:theme", this.f4818b);
        }
        if (!this.f4819c) {
            bundle.putBoolean("android:cancelable", this.f4819c);
        }
        if (!this.f4820d) {
            bundle.putBoolean("android:showsDialog", this.f4820d);
        }
        if (this.f4821e != -1) {
            bundle.putInt("android:backStackId", this.f4821e);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f4822f != null) {
            this.f4822f.hide();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f4822f != null) {
            this.f4823g = true;
            this.f4822f.dismiss();
            this.f4822f = null;
        }
    }
}
