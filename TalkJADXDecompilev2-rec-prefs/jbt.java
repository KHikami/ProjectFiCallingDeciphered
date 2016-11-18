package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class jbt implements jbq {
    private final int f19731a;
    private String f19732b;
    private ColorStateList f19733c = null;
    private Drawable f19734d = null;
    private Drawable f19735e = null;

    public jbt(int i, String str) {
        this.f19731a = i;
        this.f19732b = str;
    }

    public boolean mo1852a() {
        return true;
    }

    public int mo1853b() {
        return gwb.yb;
    }

    public int m23803c() {
        return this.f19731a;
    }

    public String m23804d() {
        return this.f19732b;
    }

    public jbt m23798a(ColorStateList colorStateList) {
        this.f19733c = colorStateList;
        return this;
    }

    public ColorStateList m23805e() {
        return this.f19733c;
    }

    public jbt m23799a(Drawable drawable) {
        this.f19734d = drawable;
        return this;
    }

    public Drawable m23806f() {
        return this.f19734d;
    }

    public jbt m23802b(Drawable drawable) {
        this.f19735e = drawable;
        return this;
    }

    public Drawable m23807g() {
        return this.f19735e;
    }
}
