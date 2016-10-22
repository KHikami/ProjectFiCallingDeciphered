package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: fcm */
public class fcm {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final fco d;

    public boolean a() {
        return this.a;
    }

    public void a(Context context, OnCancelListener onCancelListener, boolean z) {
        if (!this.a) {
            if (this.b) {
                int d = ((fzw) jyn.a(context, fzw.class)).d(((jca) jyn.a(context, jca.class)).a());
                Intent d2 = gwb.d(context, "", this.c);
                Object obj = d2 != null ? 1 : null;
                if (d == fzx.b || obj == null) {
                    b(context, onCancelListener, z);
                    return;
                } else {
                    context.startActivity(d2);
                    return;
                }
            }
            this.d.a(context, onCancelListener);
        }
    }

    public fcm(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = null;
        String str2 = "Must either be reachable or an emergency number";
        boolean z3 = z || z2;
        iil.a(str2, z3);
        if (z2) {
            iil.b("Phone number must be specified for emergency number", TextUtils.isEmpty(str));
        }
    }

    public fcm(boolean z, fco fco) {
        this.a = z;
        this.b = false;
        this.c = fco.c;
        this.d = fco;
    }

    public void b(Context context, OnCancelListener onCancelListener, boolean z) {
        if (z) {
            fcm.a(context, this.c, onCancelListener);
        } else {
            fcm.b(context, this.c, onCancelListener);
        }
    }

    public static void a(Context context, String str, OnCancelListener onCancelListener) {
        glk.a("Babel_Reachability", "Showing warning dialog for trying to invite an emergency number to Hangouts", new Object[0]);
        fcm.a(context, onCancelListener, context.getString(gwb.uE), context.getString(gwb.uD, new Object[]{glq.i(gwb.H(), str)}));
    }

    public static void b(Context context, String str, OnCancelListener onCancelListener) {
        glk.a("Babel_Reachability", "Showing warning dialog for trying to SMS emergency number", new Object[0]);
        fcm.a(context, onCancelListener, context.getString(gwb.uB), context.getString(gwb.uA, new Object[]{glq.i(gwb.H(), str)}));
    }

    public static void a(Context context, OnCancelListener onCancelListener, String str, String str2) {
        Builder positiveButton = new Builder(context).setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(17039370, new fcr());
        if (onCancelListener != null) {
            positiveButton.setOnCancelListener(onCancelListener);
        }
        positiveButton.create().show();
    }
}
