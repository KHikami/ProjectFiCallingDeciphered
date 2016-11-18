package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class jg extends jf {
    jg() {
    }

    public void a(Drawable drawable, float f, float f2) {
        bm.a(drawable, f, f2);
    }

    public void a(Drawable drawable, int i, int i2, int i3, int i4) {
        bm.a(drawable, i, i2, i3, i4);
    }

    public void a(Drawable drawable, int i) {
        bm.a(drawable, i);
    }

    public void a(Drawable drawable, ColorStateList colorStateList) {
        bm.a(drawable, colorStateList);
    }

    public void a(Drawable drawable, Mode mode) {
        bm.a(drawable, mode);
    }

    public Drawable c(Drawable drawable) {
        return bm.a(drawable);
    }

    public void a(Drawable drawable, Theme theme) {
        bm.a(drawable, theme);
    }

    public boolean f(Drawable drawable) {
        return bm.b(drawable);
    }

    public ColorFilter g(Drawable drawable) {
        return bm.c(drawable);
    }

    public void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        bm.a(drawable, resources, xmlPullParser, attributeSet, theme);
    }
}
