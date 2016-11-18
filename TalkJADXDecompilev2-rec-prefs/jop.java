package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class jop extends jzl {
    private jmo aj;
    private ljp ak;

    public static void m24858a(ed edVar, String str, boolean z) {
        if (jop.m24859b(edVar)) {
            throw new IllegalStateException("Progress dialog is already showing");
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putBoolean("cancelable", z);
        jop jop = new jop();
        jop.setArguments(bundle);
        jop.mo2341a(edVar, "login.progress");
    }

    public static void m24857a(ed edVar) {
        dq dqVar = (dq) edVar.mo1844a("login.progress");
        if (dqVar != null) {
            try {
                dqVar.m7002a();
            } catch (Exception e) {
            }
        }
    }

    public static boolean m24859b(ed edVar) {
        return edVar.mo1844a("login.progress") != null;
    }

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (jmo) this.an.m25443a(jmo.class);
        this.ak = (ljp) this.an.m25454b(ljp.class);
    }

    public Dialog mo792a(Bundle bundle) {
        Dialog progressDialog = new ProgressDialog(new ContextThemeWrapper(getActivity(), gwb.zx));
        progressDialog.setMessage(getArguments().getString("message"));
        progressDialog.setProgressStyle(0);
        progressDialog.setCancelable(getArguments().getBoolean("cancelable"));
        return progressDialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Object obj;
        if (this.ak != null) {
            this.ak.m29183b("LoginProgressDialogFragment$onCancel");
            obj = 1;
        } else {
            obj = null;
        }
        try {
            super.onCancel(dialogInterface);
            this.aj.mo3569c();
        } finally {
            if (obj != null) {
                lkb.m29210b("LoginProgressDialogFragment$onCancel");
            }
        }
    }
}
