package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: cxf */
public final class cxf implements cxd {
    String a;
    String b;
    boolean c;

    cxf(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public String a() {
        return this.a;
    }

    private String b() {
        String valueOf = String.valueOf("FEATURE_ENABLED.");
        String valueOf2 = String.valueOf(this.a);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(b())) {
            return defaultSharedPreferences.getBoolean(b(), false);
        }
        return this.c;
    }

    public <T> Object a(Context context, Object obj) {
        return a(context) ? obj : null;
    }

    public <T> T[] a(Context context, Class<T> cls, T t) {
        if (!a(context)) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        Object[] objArr = (Object[]) Array.newInstance(cls, 1);
        objArr[0] = t;
        return objArr;
    }

    public <T> T[] a(Context context, Class<T> cls, T... tArr) {
        if (a(context)) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        return (Object[]) Array.newInstance(cls, 0);
    }

    public <T> T a(Context context, Class<? extends T> cls, Class<? extends T> cls2) {
        T b = a(context) ? jyn.b(context, (Class) cls2) : null;
        return b != null ? b : jyn.a(context, (Class) cls);
    }
}
