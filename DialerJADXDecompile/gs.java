import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
public class gs {
    public void a(Drawable drawable) {
    }

    public void a(Drawable drawable, boolean z) {
    }

    public boolean b(Drawable drawable) {
        return false;
    }

    public void a(Drawable drawable, float f, float f2) {
    }

    public void a(Drawable drawable, int i, int i2, int i3, int i4) {
    }

    public void a(Drawable drawable, int i) {
        buf.b(drawable, i);
    }

    public void a(Drawable drawable, ColorStateList colorStateList) {
        buf.a(drawable, colorStateList);
    }

    public void a(Drawable drawable, Mode mode) {
        buf.a(drawable, mode);
    }

    public Drawable c(Drawable drawable) {
        return buf.b(drawable);
    }

    public boolean b(Drawable drawable, int i) {
        return false;
    }

    public int d(Drawable drawable) {
        return 0;
    }

    public int e(Drawable drawable) {
        return 0;
    }

    public void a(Drawable drawable, Theme theme) {
    }

    public boolean f(Drawable drawable) {
        return false;
    }

    public ColorFilter g(Drawable drawable) {
        return null;
    }

    public void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        buf.a(drawable, resources, xmlPullParser, attributeSet);
    }

    gs() {
    }
}
