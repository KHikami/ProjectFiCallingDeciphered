package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

/* renamed from: jop */
public final class jop extends jzl {
    private jmo aj;
    private ljp ak;

    public static void a(ed edVar, String str, boolean z) {
        if (jop.b(edVar)) {
            throw new IllegalStateException("Progress dialog is already showing");
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putBoolean("cancelable", z);
        jop jop = new jop();
        jop.setArguments(bundle);
        jop.a(edVar, "login.progress");
    }

    public static void a(ed edVar) {
        dq dqVar = (dq) edVar.a("login.progress");
        if (dqVar != null) {
            try {
                dqVar.a();
            } catch (Exception e) {
            }
        }
    }

    public static boolean b(ed edVar) {
        return edVar.a("login.progress") != null;
    }

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.aj = (jmo) this.an.a(jmo.class);
        this.ak = (ljp) this.an.b(ljp.class);
    }

    public Dialog a(Bundle bundle) {
        Dialog progressDialog = new ProgressDialog(new ContextThemeWrapper(getActivity(), gwb.zx));
        progressDialog.setMessage(getArguments().getString("message"));
        progressDialog.setProgressStyle(0);
        progressDialog.setCancelable(getArguments().getBoolean("cancelable"));
        return progressDialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Object obj;
        if (this.ak != null) {
            this.ak.b("LoginProgressDialogFragment$onCancel");
            obj = 1;
        } else {
            obj = null;
        }
        try {
            super.onCancel(dialogInterface);
            this.aj.c();
            if (obj != null) {
                lkb.b("LoginProgressDialogFragment$onCancel");
            }
        } catch (Throwable th) {
            if (obj != null) {
                lkb.b("LoginProgressDialogFragment$onCancel");
            }
        }
    }
}
