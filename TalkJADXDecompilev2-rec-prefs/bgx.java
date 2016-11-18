package p000;

import android.content.Context;
import android.preference.PreferenceManager;

public final class bgx implements bgr {
    public ery mo497a() {
        return new bgw();
    }

    public boolean mo498a(Context context) {
        bko e = fde.m15018e(((jca) jyn.m25426a(context, jca.class)).mo2317a());
        if (e != null) {
            boolean z;
            fbx fbx = (fbx) jyn.m25426a(context.getApplicationContext(), fbx.class);
            if (!gwb.m1923a(e, bnc.GOOGLE_VOICE) || PreferenceManager.getDefaultSharedPreferences(context).getBoolean("call_promo_shown", false) || ((glq.m18018d(context) && !fbx.mo1967a(context)) || e.m5627N() || !fbx.mo1973b(e))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int mo499b() {
        return ba.gS;
    }
}
