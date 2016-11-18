package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class jb {
    public static final jc f19667a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f19667a = new jh();
        } else if (i >= 21) {
            f19667a = new jg();
        } else if (i >= 19) {
            f19667a = new jf();
        } else if (i >= 17) {
            f19667a = new je();
        } else if (i >= 11) {
            f19667a = new jd();
        } else {
            f19667a = new jc();
        }
    }

    public static void m23742a(Drawable drawable) {
        f19667a.mo3472a(drawable);
    }

    public static void m23750a(Drawable drawable, boolean z) {
        f19667a.mo3489a(drawable, z);
    }

    public static boolean m23751b(Drawable drawable) {
        return f19667a.mo3490b(drawable);
    }

    public static void m23743a(Drawable drawable, float f, float f2) {
        f19667a.mo3494a(drawable, f, f2);
    }

    public static void m23745a(Drawable drawable, int i, int i2, int i3, int i4) {
        f19667a.mo3496a(drawable, i, i2, i3, i4);
    }

    public static void m23744a(Drawable drawable, int i) {
        f19667a.mo3495a(drawable, i);
    }

    public static void m23746a(Drawable drawable, ColorStateList colorStateList) {
        f19667a.mo3497a(drawable, colorStateList);
    }

    public static void m23749a(Drawable drawable, Mode mode) {
        f19667a.mo3500a(drawable, mode);
    }

    public static int m23753c(Drawable drawable) {
        return f19667a.mo3491e(drawable);
    }

    public static void m23747a(Drawable drawable, Theme theme) {
        f19667a.mo3498a(drawable, theme);
    }

    public static boolean m23754d(Drawable drawable) {
        return f19667a.mo3501f(drawable);
    }

    public static void m23748a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        f19667a.mo3499a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static Drawable m23755e(Drawable drawable) {
        return f19667a.mo3473c(drawable);
    }

    public static <T extends Drawable> T m23756f(Drawable drawable) {
        if (drawable instanceof ji) {
            return ((ji) drawable).mo3525a();
        }
        return drawable;
    }

    public static boolean m23752b(Drawable drawable, int i) {
        return f19667a.mo3480b(drawable, i);
    }

    public static int m23757g(Drawable drawable) {
        return f19667a.mo3481d(drawable);
    }
}
