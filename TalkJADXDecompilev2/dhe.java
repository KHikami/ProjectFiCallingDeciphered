package defpackage;

import android.content.Context;
import android.content.SharedPreferences.Editor;

public class dhe {
    private final int a;
    private final boolean b;

    public dhe(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public static void a(Context context, dhz dhz, int i, boolean z) {
        Editor edit = context.getSharedPreferences(dhe.class.getName(), 0).edit();
        edit.putBoolean("HISTORY_HAS_EVENT", true);
        dhz.a(edit);
        edit.putInt("HISTORY_ERROR", i);
        edit.putBoolean("HISTORY_EXIT_REPORTED", z);
        edit.apply();
    }

    public static void a(Context context, dhz dhz) {
        dhe.a(context, dhz, 11004, true);
    }
}
