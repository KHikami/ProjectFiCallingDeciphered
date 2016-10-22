import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.text.TextUtils;

/* compiled from: PG */
public final class aic implements OnSharedPreferenceChangeListener {
    public final SharedPreferences a;
    public int b;
    public int c;
    public String d;
    public aie e;
    private final Context f;
    private Handler g;
    private String h;
    private String i;

    public aic(Context context) {
        int e;
        this.b = -1;
        this.c = -1;
        this.d = null;
        this.e = null;
        this.f = context;
        this.g = new Handler();
        this.a = this.f.getSharedPreferences(context.getPackageName(), 0);
        this.h = this.f.getResources().getString(buf.ev);
        this.i = this.f.getResources().getString(buf.eu);
        if (!this.a.contains("android.contacts.SORT_ORDER")) {
            e = e();
            try {
                e = System.getInt(this.f.getContentResolver(), "android.contacts.SORT_ORDER");
            } catch (SettingNotFoundException e2) {
            }
            a(e);
        }
        if (!this.a.contains("android.contacts.DISPLAY_ORDER")) {
            e = f();
            try {
                e = System.getInt(this.f.getContentResolver(), "android.contacts.DISPLAY_ORDER");
            } catch (SettingNotFoundException e3) {
            }
            b(e);
        }
        if (!this.a.contains(this.h)) {
            Object string = PreferenceManager.getDefaultSharedPreferences(this.f).getString(this.h, null);
            if (!TextUtils.isEmpty(string)) {
                a(agd.a(string));
            }
        }
    }

    private int e() {
        if (this.f.getResources().getBoolean(buf.cw)) {
            return 1;
        }
        return 2;
    }

    public final void a(int i) {
        this.b = i;
        Editor edit = this.a.edit();
        edit.putInt("android.contacts.SORT_ORDER", i);
        edit.commit();
    }

    private int f() {
        if (this.f.getResources().getBoolean(buf.cv)) {
            return 1;
        }
        return 2;
    }

    public final void b(int i) {
        this.c = i;
        Editor edit = this.a.edit();
        edit.putInt("android.contacts.DISPLAY_ORDER", i);
        edit.commit();
    }

    public final void a(agd agd) {
        this.d = agd == null ? null : agd.a;
        Editor edit = this.a.edit();
        if (TextUtils.isEmpty(this.d)) {
            edit.remove(this.h);
        } else {
            String str = this.h;
            StringBuilder stringBuilder = new StringBuilder();
            if (!TextUtils.isEmpty(agd.a)) {
                stringBuilder.append(agd.a);
            }
            stringBuilder.append("\u0001");
            if (!TextUtils.isEmpty(agd.b)) {
                stringBuilder.append(agd.b);
            }
            stringBuilder.append("\u0001");
            if (!TextUtils.isEmpty(agd.c)) {
                stringBuilder.append(agd.c);
            }
            edit.putString(str, stringBuilder.toString());
        }
        edit.putBoolean(this.i, true);
        edit.commit();
    }

    public final void d() {
        if (this.e != null) {
            this.e = null;
        }
        this.a.unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.g.post(new aid(this, str));
    }

    public final void a(String str) {
        if ("android.contacts.DISPLAY_ORDER".equals(str)) {
            this.c = -1;
            this.c = b();
        } else if ("android.contacts.SORT_ORDER".equals(str)) {
            this.b = -1;
            this.b = a();
        } else if (this.h.equals(str)) {
            this.d = null;
            this.d = c();
        }
        if (this.e != null) {
            this.e.a();
        }
    }

    public final int a() {
        if (!this.f.getResources().getBoolean(buf.cz)) {
            return e();
        }
        if (this.b == -1) {
            this.b = this.a.getInt("android.contacts.SORT_ORDER", e());
        }
        return this.b;
    }

    public final int b() {
        if (!this.f.getResources().getBoolean(buf.cx)) {
            return f();
        }
        if (this.c == -1) {
            this.c = this.a.getInt("android.contacts.DISPLAY_ORDER", f());
        }
        return this.c;
    }

    public final String c() {
        if (!this.f.getResources().getBoolean(buf.cu)) {
            return this.d;
        }
        if (TextUtils.isEmpty(this.d)) {
            Object string = this.a.getString(this.h, this.d);
            if (!TextUtils.isEmpty(string)) {
                this.d = agd.a(string).a;
            }
        }
        return this.d;
    }
}
