import android.content.Context;
import android.preference.PreferenceManager;

public final class bgx implements bgr {
    public ery a() {
        return new bgw();
    }

    public boolean a(Context context) {
        bko e = fde.e(((jca) jyn.a(context, jca.class)).a());
        if (e != null) {
            boolean z;
            fbx fbx = (fbx) jyn.a(context.getApplicationContext(), fbx.class);
            if (!gwb.a(e, bnc.GOOGLE_VOICE) || PreferenceManager.getDefaultSharedPreferences(context).getBoolean("call_promo_shown", false) || ((glq.d(context) && !fbx.a(context)) || e.N() || !fbx.b(e))) {
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

    public int b() {
        return ba.gS;
    }
}
