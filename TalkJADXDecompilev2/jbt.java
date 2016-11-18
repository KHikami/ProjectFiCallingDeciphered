package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class jbt implements jbq {
    private final int a;
    private String b;
    private ColorStateList c = null;
    private Drawable d = null;
    private Drawable e = null;

    public jbt(int i, String str) {
        this.a = i;
        this.b = str;
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
