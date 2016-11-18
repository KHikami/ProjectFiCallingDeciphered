package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class cxf implements cxd {
    String f9258a;
    String f9259b;
    boolean f9260c;

    cxf(String str, String str2, boolean z) {
        this.f9258a = str;
        this.f9259b = str2;
        this.f9260c = z;
    }

    public String mo1449a() {
        return this.f9258a;
    }

    private String m11193b() {
        String valueOf = String.valueOf("FEATURE_ENABLED.");
        String valueOf2 = String.valueOf(this.f9258a);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean mo1450a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(m11193b())) {
            return defaultSharedPreferences.getBoolean(m11193b(), false);
        }
        return this.f9260c;
    }

    public <T> Object mo1448a(Context context, Object obj) {
        return mo1450a(context) ? obj : null;
    }

    public <T> T[] mo1451a(Context context, Class<T> cls, T t) {
        if (!mo1450a(context)) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        Object[] objArr = (Object[]) Array.newInstance(cls, 1);
        objArr[0] = t;
        return objArr;
    }

    public <T> T[] mo1452a(Context context, Class<T> cls, T... tArr) {
        if (mo1450a(context)) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        return (Object[]) Array.newInstance(cls, 0);
    }

    public <T> T mo1447a(Context context, Class<? extends T> cls, Class<? extends T> cls2) {
        T b = mo1450a(context) ? jyn.m25433b(context, (Class) cls2) : null;
        return b != null ? b : jyn.m25426a(context, (Class) cls);
    }
}
