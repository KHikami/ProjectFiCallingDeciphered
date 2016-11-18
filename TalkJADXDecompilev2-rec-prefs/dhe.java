package p000;

import android.content.Context;
import android.content.SharedPreferences.Editor;

public class dhe {
    private final int f9748a;
    private final boolean f9749b;

    public dhe(int i, boolean z) {
        this.f9748a = i;
        this.f9749b = z;
    }

    public int m11808a() {
        return this.f9748a;
    }

    public boolean m11809b() {
        return this.f9749b;
    }

    public static void m11807a(Context context, dhz dhz, int i, boolean z) {
        Editor edit = context.getSharedPreferences(dhe.class.getName(), 0).edit();
        edit.putBoolean("HISTORY_HAS_EVENT", true);
        dhz.m11886a(edit);
        edit.putInt("HISTORY_ERROR", i);
        edit.putBoolean("HISTORY_EXIT_REPORTED", z);
        edit.apply();
    }

    public static void m11806a(Context context, dhz dhz) {
        dhe.m11807a(context, dhz, 11004, true);
    }
}
