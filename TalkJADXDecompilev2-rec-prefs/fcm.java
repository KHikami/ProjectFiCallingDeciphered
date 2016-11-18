package p000;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.text.TextUtils;

public class fcm {
    public final boolean f12693a;
    public final boolean f12694b;
    public final String f12695c;
    public final fco f12696d;

    public boolean m14964a() {
        return this.f12693a;
    }

    public void m14963a(Context context, OnCancelListener onCancelListener, boolean z) {
        if (!this.f12693a) {
            if (this.f12694b) {
                int d = ((fzw) jyn.m25426a(context, fzw.class)).mo2153d(((jca) jyn.m25426a(context, jca.class)).mo2317a());
                Intent d2 = gwb.m2123d(context, "", this.f12695c);
                Object obj = d2 != null ? 1 : null;
                if (d == fzx.f14514b || obj == null) {
                    m14965b(context, onCancelListener, z);
                    return;
                } else {
                    context.startActivity(d2);
                    return;
                }
            }
            this.f12696d.m14968a(context, onCancelListener);
        }
    }

    public fcm(boolean z, boolean z2, String str) {
        this.f12693a = z;
        this.f12694b = z2;
        this.f12695c = str;
        this.f12696d = null;
        String str2 = "Must either be reachable or an emergency number";
        boolean z3 = z || z2;
        iil.m21874a(str2, z3);
        if (z2) {
            iil.m21879b("Phone number must be specified for emergency number", TextUtils.isEmpty(str));
        }
    }

    public fcm(boolean z, fco fco) {
        this.f12693a = z;
        this.f12694b = false;
        this.f12695c = fco.f12699c;
        this.f12696d = fco;
    }

    public void m14965b(Context context, OnCancelListener onCancelListener, boolean z) {
        if (z) {
            fcm.m14961a(context, this.f12695c, onCancelListener);
        } else {
            fcm.m14962b(context, this.f12695c, onCancelListener);
        }
    }

    public static void m14961a(Context context, String str, OnCancelListener onCancelListener) {
        glk.m17970a("Babel_Reachability", "Showing warning dialog for trying to invite an emergency number to Hangouts", new Object[0]);
        fcm.m14960a(context, onCancelListener, context.getString(gwb.uE), context.getString(gwb.uD, new Object[]{glq.m18038i(gwb.m1400H(), str)}));
    }

    public static void m14962b(Context context, String str, OnCancelListener onCancelListener) {
        glk.m17970a("Babel_Reachability", "Showing warning dialog for trying to SMS emergency number", new Object[0]);
        fcm.m14960a(context, onCancelListener, context.getString(gwb.uB), context.getString(gwb.uA, new Object[]{glq.m18038i(gwb.m1400H(), str)}));
    }

    public static void m14960a(Context context, OnCancelListener onCancelListener, String str, String str2) {
        Builder positiveButton = new Builder(context).setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(17039370, new fcr());
        if (onCancelListener != null) {
            positiveButton.setOnCancelListener(onCancelListener);
        }
        positiveButton.create().show();
    }
}
