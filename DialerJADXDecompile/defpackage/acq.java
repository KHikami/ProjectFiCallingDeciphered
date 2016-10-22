package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: acq */
public class acq extends DialogFragment {
    static final String a;
    CharSequence b;
    CharSequence c;
    long d;
    long e;
    private final Handler f;
    private boolean g;
    private Dialog h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public acq() {
        this.f = new Handler();
        this.e = 0;
        this.g = false;
        this.i = false;
        this.k = new acr(this);
    }

    static {
        a = acq.class.getSimpleName();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setIndeterminate(true);
        progressDialog.setIndeterminateDrawable(null);
        progressDialog.setTitle(this.b);
        progressDialog.setMessage(this.c);
        return progressDialog;
    }

    public void onStart() {
        super.onStart();
        this.g = true;
        if (this.i) {
            a();
        }
    }

    public void onStop() {
        super.onStop();
        this.g = false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.h == null || this.h != dialogInterface) {
            super.onDismiss(dialogInterface);
        }
    }

    public void onDestroyView() {
        this.h = getDialog();
        super.onDestroyView();
    }

    public void dismiss() {
        this.j = false;
        b();
    }

    public void dismissAllowingStateLoss() {
        this.j = true;
        b();
    }

    private final void b() {
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        if (currentTimeMillis >= this.d) {
            this.f.post(this.k);
            return;
        }
        this.f.postDelayed(this.k, this.d - currentTimeMillis);
    }

    final void a() {
        this.i = true;
        if (!this.g) {
            return;
        }
        if (this.j) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }
}
