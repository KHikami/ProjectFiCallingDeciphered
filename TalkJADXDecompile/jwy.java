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
    private Activity a;
    private jwp b;
    private Context c;
    private long d;
    private int e;
    private SharedPreferences f;
    private Editor g;
    private boolean h;
    private String i;
    private int j;
    private PreferenceScreen k;
    private List<jxa> l;
    private List<a> m;
    private List<jwz> n;
    private List<DialogInterface> o;
    private jxb p;

    public jwy(Activity activity, int i) {
        this.d = 0;
        this.a = activity;
        this.e = 100;
        this.c = activity;
        a(c(activity));
    }

    void a(jwp jwp) {
        this.b = jwp;
    }

    jwp a() {
        return this.b;
    }

    public PreferenceScreen a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.a(this);
        return preferenceScreen;
    }

    long b() {
        long j;
        synchronized (this) {
            j = this.d;
            this.d = 1 + j;
        }
        return j;
    }

    private void a(String str) {
        this.i = str;
        this.f = null;
    }

    public SharedPreferences c() {
        if (this.f == null) {
            this.f = this.c.getSharedPreferences(this.i, this.j);
        }
        return this.f;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(c(context), 0);
    }

    private static String c(Context context) {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    PreferenceScreen d() {
        return this.k;
    }

    boolean a(PreferenceScreen preferenceScreen) {
        if (preferenceScreen == this.k) {
            return false;
        }
        this.k = preferenceScreen;
        return true;
    }

    public jwi a(CharSequence charSequence) {
        if (this.k == null) {
            return null;
        }
        return this.k.a(charSequence);
    }

    Editor e() {
        if (!this.h) {
            return c().edit();
        }
        if (this.g == null) {
            this.g = c().edit();
        }
        return this.g;
    }

    boolean f() {
        return !this.h;
    }

    Activity g() {
        return this.a;
    }

    public void a(jxa jxa) {
        synchronized (this) {
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (!this.l.contains(jxa)) {
                this.l.add(jxa);
            }
        }
    }

    void a(int i, int i2, Intent intent) {
        synchronized (this) {
            if (this.l == null) {
                return;
            }
            List arrayList = new ArrayList(this.l);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size && !((jxa) arrayList.get(i3)).a(i, i2, intent)) {
                i3++;
            }
        }
    }

    void h() {
        synchronized (this) {
            if (this.m == null) {
                return;
            }
            List arrayList = new ArrayList(this.m);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i);
            }
        }
    }

    void a(jwz jwz) {
        synchronized (this) {
            if (this.n == null) {
                this.n = new ArrayList();
            }
            if (!this.n.contains(jwz)) {
                this.n.add(jwz);
            }
        }
    }

    void b(jwz jwz) {
        synchronized (this) {
            if (this.n != null) {
                this.n.remove(jwz);
            }
        }
    }

    void i() {
        List arrayList;
        synchronized (this) {
            if (this.n != null) {
                arrayList = new ArrayList(this.n);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jwz) arrayList.get(i)).d();
            }
        }
        l();
    }

    int j() {
        int i;
        synchronized (this) {
            i = this.e;
            this.e = i + 1;
        }
        return i;
    }

    public void a(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(dialogInterface);
        }
    }

    public void b(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.o == null) {
                return;
            }
            this.o.remove(dialogInterface);
        }
    }

    private void l() {
        synchronized (this) {
            if (this.o == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.o);
            this.o.clear();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((DialogInterface) arrayList.get(size)).dismiss();
            }
        }
    }

    void a(jxb jxb) {
        this.p = jxb;
    }

    jxb k() {
        return this.p;
    }
}
