package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public final class jwy {
    private Activity f21180a;
    private jwp f21181b;
    private Context f21182c;
    private long f21183d = 0;
    private int f21184e;
    private SharedPreferences f21185f;
    private Editor f21186g;
    private boolean f21187h;
    private String f21188i;
    private int f21189j;
    private PreferenceScreen f21190k;
    private List<jxa> f21191l;
    private List<C0000a> f21192m;
    private List<jwz> f21193n;
    private List<DialogInterface> f21194o;
    private jxb f21195p;

    public jwy(Activity activity, int i) {
        this.f21180a = activity;
        this.f21184e = 100;
        this.f21182c = activity;
        m25355a(jwy.m25357c(activity));
    }

    void m25364a(jwp jwp) {
        this.f21181b = jwp;
    }

    jwp m25361a() {
        return this.f21181b;
    }

    public PreferenceScreen m25359a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.mo2094a(this);
        return preferenceScreen;
    }

    long m25369b() {
        long j;
        synchronized (this) {
            j = this.f21183d;
            this.f21183d = 1 + j;
        }
        return j;
    }

    private void m25355a(String str) {
        this.f21188i = str;
        this.f21185f = null;
    }

    public SharedPreferences m25372c() {
        if (this.f21185f == null) {
            this.f21185f = this.f21182c.getSharedPreferences(this.f21188i, this.f21189j);
        }
        return this.f21185f;
    }

    public static SharedPreferences m25356b(Context context) {
        return context.getSharedPreferences(jwy.m25357c(context), 0);
    }

    private static String m25357c(Context context) {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    PreferenceScreen m25373d() {
        return this.f21190k;
    }

    boolean m25368a(PreferenceScreen preferenceScreen) {
        if (preferenceScreen == this.f21190k) {
            return false;
        }
        this.f21190k = preferenceScreen;
        return true;
    }

    public jwi m25360a(CharSequence charSequence) {
        if (this.f21190k == null) {
            return null;
        }
        return this.f21190k.m10478a(charSequence);
    }

    Editor m25374e() {
        if (!this.f21187h) {
            return m25372c().edit();
        }
        if (this.f21186g == null) {
            this.f21186g = m25372c().edit();
        }
        return this.f21186g;
    }

    boolean m25375f() {
        return !this.f21187h;
    }

    Activity m25376g() {
        return this.f21180a;
    }

    public void m25366a(jxa jxa) {
        synchronized (this) {
            if (this.f21191l == null) {
                this.f21191l = new ArrayList();
            }
            if (!this.f21191l.contains(jxa)) {
                this.f21191l.add(jxa);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m25362a(int i, int i2, Intent intent) {
        synchronized (this) {
            if (this.f21191l == null) {
                return;
            }
            List arrayList = new ArrayList(this.f21191l);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m25377h() {
        synchronized (this) {
            if (this.f21192m == null) {
                return;
            }
            List arrayList = new ArrayList(this.f21192m);
        }
    }

    void m25365a(jwz jwz) {
        synchronized (this) {
            if (this.f21193n == null) {
                this.f21193n = new ArrayList();
            }
            if (!this.f21193n.contains(jwz)) {
                this.f21193n.add(jwz);
            }
        }
    }

    void m25371b(jwz jwz) {
        synchronized (this) {
            if (this.f21193n != null) {
                this.f21193n.remove(jwz);
            }
        }
    }

    void m25378i() {
        List arrayList;
        synchronized (this) {
            if (this.f21193n != null) {
                arrayList = new ArrayList(this.f21193n);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jwz) arrayList.get(i)).mo2099d();
            }
        }
        m25358l();
    }

    int m25379j() {
        int i;
        synchronized (this) {
            i = this.f21184e;
            this.f21184e = i + 1;
        }
        return i;
    }

    public void m25363a(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.f21194o == null) {
                this.f21194o = new ArrayList();
            }
            this.f21194o.add(dialogInterface);
        }
    }

    public void m25370b(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.f21194o == null) {
                return;
            }
            this.f21194o.remove(dialogInterface);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25358l() {
        synchronized (this) {
            if (this.f21194o == null) {
            } else {
                ArrayList arrayList = new ArrayList(this.f21194o);
                this.f21194o.clear();
            }
        }
    }

    void m25367a(jxb jxb) {
        this.f21195p = jxb;
    }

    jxb m25380k() {
        return this.f21195p;
    }
}
