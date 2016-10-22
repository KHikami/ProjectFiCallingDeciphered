package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: dtn */
final class dtn implements dti {
    private final SharedPreferences a;

    public dtn(Context context) {
        this.a = context.getSharedPreferences("latency_preferences", 0);
    }

    public dth a(int i) {
        return new dtm(this.a, i);
    }
}
