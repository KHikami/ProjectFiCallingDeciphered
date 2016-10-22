package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Flag;

/* renamed from: crm */
public abstract class crm {
    public static final Object a;
    public static Context b;
    public static boolean c;
    public static cme d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final crj j;
    public final Object k;
    private Object l;

    static {
        a = new Object();
        b = null;
        c = false;
        d = cme.a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false);
    }

    public crm(String str, String str2, String str3, int i, String str4, crj crj, Object obj) {
        this.l = null;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = str4;
        this.j = crj;
        this.k = obj;
    }

    public abstract Object a(SharedPreferences sharedPreferences);

    public abstract Object a(Flag flag);

    public abstract Object a(String str);
}
