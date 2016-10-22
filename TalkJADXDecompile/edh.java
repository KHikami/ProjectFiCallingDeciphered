import android.content.Context;
import android.preference.PreferenceManager;

public final class edh implements ede {
    public ery a() {
        return new edf();
    }

    public boolean a(Context context) {
        boolean z;
        ehz ehz = (ehz) jyn.a(context, ehz.class);
        for (String a : edf.a) {
            if (!ehz.a(a)) {
                z = true;
                break;
            }
        }
        z = false;
        return z && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("contacts_rationale_shown", false);
    }

    public int b() {
        return gwb.rT;
    }
}
