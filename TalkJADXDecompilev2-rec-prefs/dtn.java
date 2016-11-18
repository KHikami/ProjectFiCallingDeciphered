package p000;

import android.content.Context;
import android.content.SharedPreferences;

final class dtn implements dti {
    private final SharedPreferences f10514a;

    public dtn(Context context) {
        this.f10514a = context.getSharedPreferences("latency_preferences", 0);
    }

    public dth mo1673a(int i) {
        return new dtm(this.f10514a, i);
    }
}
