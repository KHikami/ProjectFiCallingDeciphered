package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: afv */
public abstract class afv {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    Map h;
    private ArrayList i;

    public abstract boolean b();

    public abstract boolean g();

    public afv() {
        this.a = null;
        this.b = null;
        this.i = new ArrayList();
        this.h = new ArrayMap();
    }

    static {
        afw afw = new afw();
    }

    public boolean a() {
        return true;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }

    public String e() {
        return this.d;
    }

    public final CharSequence a(Context context) {
        String str = this.d;
        int i = this.e;
        CharSequence charSequence = this.a;
        if (i == -1 || str == null) {
            return i != -1 ? context.getText(i) : charSequence;
        } else {
            return context.getPackageManager().getText(str, i, null);
        }
    }

    public List f() {
        return new ArrayList();
    }

    public final Drawable b(Context context) {
        int i = this.e;
        int i2 = this.f;
        String str = this.d;
        if (i != -1 && str != null) {
            return context.getPackageManager().getDrawable(str, i2, null);
        }
        if (i != -1) {
            return context.getResources().getDrawable(i2);
        }
        return null;
    }

    public final ahm a(ahm ahm) {
        if (ahm.b == null) {
            throw new afx("null is not a valid mime type");
        } else if (this.h.get(ahm.b) != null) {
            String str = ahm.b;
            throw new afx(new StringBuilder(String.valueOf(str).length() + 34).append("mime type '").append(str).append("' is already registered").toString());
        } else {
            ahm.a = this.c;
            this.i.add(ahm);
            this.h.put(ahm.b, ahm);
            return ahm;
        }
    }
}
