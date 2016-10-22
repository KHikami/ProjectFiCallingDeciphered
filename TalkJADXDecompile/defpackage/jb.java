package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jb */
public final class jb {
    public static final jc a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new jh();
        } else if (i >= 21) {
            a = new jg();
        } else if (i >= 19) {
            a = new jf();
        } else if (i >= 17) {
            a = new je();
        } else if (i >= 11) {
            a = new jd();
        } else {
            a = new jc();
        }
    }

    public static void a(Drawable drawable) {
        a.a(drawable);
    }

    public static void a(Drawable drawable, boolean z) {
        a.a(drawable, z);
    }

    public static boolean b(Drawable drawable) {
        return a.b(drawable);
    }

    public static void a(Drawable drawable, float f, float f2) {
        a.a(drawable, f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        a.a(drawable, i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        a.a(drawable, i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        a.a(drawable, colorStateList);
    }

    public static void a(Drawable drawable, Mode mode) {
        a.a(drawable, mode);
    }

    public static int c(Drawable drawable) {
        return a.e(drawable);
    }

    public static void a(Drawable drawable, Theme theme) {
        a.a(drawable, theme);
    }

    public static boolean d(Drawable drawable) {
        return a.f(drawable);
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        a.a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static Drawable e(Drawable drawable) {
        return a.c(drawable);
    }

    public static <T extends Drawable> T f(Drawable drawable) {
        if (drawable instanceof ji) {
            return ((ji) drawable).a();
        }
        return drawable;
    }

    public static boolean b(Drawable drawable, int i) {
        return a.b(drawable, i);
    }

    public static int g(Drawable drawable) {
        return a.d(drawable);
    }
}
