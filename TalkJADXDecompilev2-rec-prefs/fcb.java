package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;

public final class fcb implements fbx {
    private final fzw f12677a;

    fcb(Context context) {
        this.f12677a = (fzw) jyn.m25426a(context, fzw.class);
    }

    public boolean mo1968a(Context context, bko bko) {
        if (bko == null) {
            glk.m17970a("Babel", "PstnUtilImpl: account is null", new Object[0]);
            return false;
        }
        boolean a = gwb.m1923a(bko, bnc.GOOGLE_VOICE);
        boolean a2 = mo1967a(context);
        boolean b = mo1973b(bko);
        glk.m17970a("Babel", "PstnUtilImpl: featureAllowed = " + a + " isVoipEnabled = " + a2 + " isGvServiceAvailable = " + b, new Object[0]);
        if (a && a2 && b) {
            return true;
        }
        return false;
    }

    public boolean mo1970a(bko bko) {
        return (bko == null || !gwb.m1923a(bko, bnc.GOOGLE_VOICE) || this.f12677a.mo2146a(bko.m5638g()) || bko.m5622I() == 3) ? false : true;
    }

    public boolean mo1967a(Context context) {
        return mo1971b(context);
    }

    public boolean mo1971b(Context context) {
        return gkw.m17915a(context, "com.google.android.apps.hangoutsdialer");
    }

    public boolean mo1973b(bko bko) {
        return (bko == null || this.f12677a.mo2146a(bko.m5638g()) || !bko.m5623J()) ? false : true;
    }

    public boolean mo1972b(Context context, bko bko) {
        boolean s = bko.m5650s();
        boolean a = mo1968a(context, bko);
        glk.m17970a("Babel", "getIncomingPhoneCallsWantedByHangouts: accountHasGvNumber: " + s + " isGvEnabled: " + a, new Object[0]);
        if (!s || !a) {
            return false;
        }
        String string = context.getResources().getString(bc.cU);
        jch a2 = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(bko.m5638g());
        glk.m17970a("Babel", "getIncomingPhoneCallsWantedByHangouts: has phoneCallsSettingsKey = " + a2.mo3438a(string), new Object[0]);
        s = a2.mo3439a(string, !glq.m18018d(context));
        glk.m17970a("Babel", "getIncomingPhoneCallsWantedByHangouts: phoneCallsSetting: " + s, new Object[0]);
        return s;
    }

    public boolean mo1974c(Context context, bko bko) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(bko.m5638g()).mo3448c("registered_for_incoming_pstn_calls");
    }

    public boolean mo1969a(Context context, String str) {
        ArrayList a;
        Intent g = gwb.m2211g(context, str);
        ArrayList e = ba.m4633e();
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(g, 0)) {
            if (!(resolveInfo.activityInfo == null || "com.google.android.apps.hangoutsdialer".equals(resolveInfo.activityInfo.packageName))) {
                e.add(((Intent) g.clone()).setPackage(resolveInfo.activityInfo.packageName).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                if (resolveInfo.activityInfo.packageName.contains("com.android")) {
                    a = ba.m4543a((Intent) e.get(e.size() - 1));
                    break;
                }
            }
        }
        a = e;
        switch (a.size()) {
            case 0:
                return false;
            case 1:
                context.startActivity((Intent) a.get(0));
                return true;
            default:
                context.startActivity(Intent.createChooser((Intent) a.remove(a.size() - 1), context.getString(gwb.ud)).putExtra("android.intent.extra.INITIAL_INTENTS", a.toArray()));
                return true;
        }
    }
}
