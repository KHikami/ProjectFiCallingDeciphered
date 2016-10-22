import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
class gx extends gw {
    gx() {
    }

    public final void a(Drawable drawable, float f, float f2) {
        ba.a(drawable, f, f2);
    }

    public final void a(Drawable drawable, int i, int i2, int i3, int i4) {
        ba.a(drawable, i, i2, i3, i4);
    }

    public final void a(Drawable drawable, int i) {
        ba.a(drawable, i);
    }

    public final void a(Drawable drawable, ColorStateList colorStateList) {
        ba.a(drawable, colorStateList);
    }

    public final void a(Drawable drawable, Mode mode) {
        ba.a(drawable, mode);
    }

    public Drawable c(Drawable drawable) {
        return ba.a(drawable);
    }

    public final void a(Drawable drawable, Theme theme) {
        ba.a(drawable, theme);
    }

    public final boolean f(Drawable drawable) {
        return ba.b(drawable);
    }

    public final ColorFilter g(Drawable drawable) {
        return ba.c(drawable);
    }

    public final void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        ba.a(drawable, resources, xmlPullParser, attributeSet, theme);
    }
}
