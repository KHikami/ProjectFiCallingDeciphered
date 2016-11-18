package p000;

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

    public void mo3494a(Drawable drawable, float f, float f2) {
        bm.m6128a(drawable, f, f2);
    }

    public void mo3496a(Drawable drawable, int i, int i2, int i3, int i4) {
        bm.m6130a(drawable, i, i2, i3, i4);
    }

    public void mo3495a(Drawable drawable, int i) {
        bm.m6129a(drawable, i);
    }

    public void mo3497a(Drawable drawable, ColorStateList colorStateList) {
        bm.m6131a(drawable, colorStateList);
    }

    public void mo3500a(Drawable drawable, Mode mode) {
        bm.m6134a(drawable, mode);
    }

    public Drawable mo3473c(Drawable drawable) {
        return bm.m6121a(drawable);
    }

    public void mo3498a(Drawable drawable, Theme theme) {
        bm.m6132a(drawable, theme);
    }

    public boolean mo3501f(Drawable drawable) {
        return bm.m6154b(drawable);
    }

    public ColorFilter mo3502g(Drawable drawable) {
        return bm.m6156c(drawable);
    }

    public void mo3499a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        bm.m6133a(drawable, resources, xmlPullParser, attributeSet, theme);
    }
}
