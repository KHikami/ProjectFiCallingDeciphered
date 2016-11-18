package p000;

import android.content.Context;
import android.preference.PreferenceManager;

public final class edh implements ede {
    public ery mo497a() {
        return new edf();
    }

    public boolean mo498a(Context context) {
        boolean z;
        ehz ehz = (ehz) jyn.m25426a(context, ehz.class);
        for (String a : edf.f11196a) {
            if (!ehz.mo1882a(a)) {
                z = true;
                break;
            }
        }
        z = false;
        return z && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("contacts_rationale_shown", false);
    }

    public int mo499b() {
        return gwb.rT;
    }
}
