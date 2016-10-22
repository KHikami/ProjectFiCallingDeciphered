package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* renamed from: jbt */
public final class jbt implements jbq {
    private final int a;
    private String b;
    private ColorStateList c;
    private Drawable d;
    private Drawable e;

    public jbt(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public boolean a() {
        return true;
    }

    public int b() {
        return gwb.yb;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public jbt a(ColorStateList colorStateList) {
        this.c = colorStateList;
        return this;
    }

    public ColorStateList e() {
        return this.c;
    }

    public jbt a(Drawable drawable) {
        this.d = drawable;
        return this;
    }

    public Drawable f() {
        return this.d;
    }

    public jbt b(Drawable drawable) {
        this.e = drawable;
        return this;
    }

    public Drawable g() {
        return this.e;
    }
}
