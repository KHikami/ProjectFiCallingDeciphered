package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;

/* renamed from: fcb */
public final class fcb implements fbx {
    private final fzw a;

    fcb(Context context) {
        this.a = (fzw) jyn.a(context, fzw.class);
    }

    public boolean a(Context context, bko bko) {
        if (bko == null) {
            glk.a("Babel", "PstnUtilImpl: account is null", new Object[0]);
            return false;
        }
        boolean a = gwb.a(bko, bnc.GOOGLE_VOICE);
        boolean a2 = a(context);
        boolean b = b(bko);
        glk.a("Babel", "PstnUtilImpl: featureAllowed = " + a + " isVoipEnabled = " + a2 + " isGvServiceAvailable = " + b, new Object[0]);
        if (a && a2 && b) {
            return true;
        }
        return false;
    }

    public boolean a(bko bko) {
        return (bko == null || !gwb.a(bko, bnc.GOOGLE_VOICE) || this.a.a(bko.g()) || bko.I() == 3) ? false : true;
    }

    public boolean a(Context context) {
        return b(context);
    }

    public boolean b(Context context) {
        return gkw.a(context, "com.google.android.apps.hangoutsdialer");
    }

    public boolean b(bko bko) {
        return (bko == null || this.a.a(bko.g()) || !bko.J()) ? false : true;
    }

    public boolean b(Context context, bko bko) {
        boolean s = bko.s();
        boolean a = a(context, bko);
        glk.a("Babel", "getIncomingPhoneCallsWantedByHangouts: accountHasGvNumber: " + s + " isGvEnabled: " + a, new Object[0]);
        if (!s || !a) {
            return false;
        }
        String string = context.getResources().getString(bc.cU);
        jch a2 = ((jcf) jyn.a(context, jcf.class)).a(bko.g());
        glk.a("Babel", "getIncomingPhoneCallsWantedByHangouts: has phoneCallsSettingsKey = " + a2.a(string), new Object[0]);
        s = a2.a(string, !glq.d(context));
        glk.a("Babel", "getIncomingPhoneCallsWantedByHangouts: phoneCallsSetting: " + s, new Object[0]);
        return s;
    }

    public boolean c(Context context, bko bko) {
        return ((jcf) jyn.a(context, jcf.class)).a(bko.g()).c("registered_for_incoming_pstn_calls");
    }

    public boolean a(Context context, String str) {
        ArrayList a;
        Intent g = gwb.g(context, str);
        ArrayList e = ba.e();
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(g, 0)) {
            if (!(resolveInfo.activityInfo == null || "com.google.android.apps.hangoutsdialer".equals(resolveInfo.activityInfo.packageName))) {
                e.add(((Intent) g.clone()).setPackage(resolveInfo.activityInfo.packageName).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                if (resolveInfo.activityInfo.packageName.contains("com.android")) {
                    a = ba.a((Intent) e.get(e.size() - 1));
                    break;
                }
            }
        }
        a = e;
        switch (a.size()) {
            case wi.w /*0*/:
                return false;
            case wi.j /*1*/:
                context.startActivity((Intent) a.get(0));
                return true;
            default:
                context.startActivity(Intent.createChooser((Intent) a.remove(a.size() - 1), context.getString(gwb.ud)).putExtra("android.intent.extra.INITIAL_INTENTS", a.toArray()));
                return true;
        }
    }
}
