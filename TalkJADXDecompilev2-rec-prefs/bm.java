package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

public class bm implements bl {
    public static final int f3799A = 2131559141;
    public static final int f3800B = 2131559139;
    public static final int f3801C = 2131558796;
    public static final int f3802D = 2131559451;
    public static final int f3803E = 2131559414;
    public static final int f3804F = 2131558408;
    public static final int f3805G = 2131558771;
    public static final int f3806H = 2131559268;
    public static final int f3807I = 2131559269;
    public static final int f3808J = 2131362317;
    public static final int f3809K = 2131559207;
    public static final int f3810L = 2131558403;
    public static final int f3811M = 2131559206;
    public static final int f3812N = 2131559198;
    public static final int f3813O = 2131559197;
    public static final int f3814P = 2131558404;
    public static final int f3815Q = 2131558716;
    public static final int f3816R = 2131558406;
    public static final int f3817S = 2131558405;
    public static final int f3818T = 2131558922;
    public static final int f3819U = 2131558920;
    public static final int f3820V = 2131558918;
    public static final int f3821W = 2131559214;
    public static final int f3822X = 2131559213;
    public static final int f3823Y = 2131559215;
    public static final int f3824Z = 2131558921;
    public static final int f3825a = 2131559085;
    public static final int aa = 2131559260;
    public static final int ab = 2131558407;
    public static final int ac = 2131559092;
    public static final int ad = 2131559199;
    public static final int ae = 2131559218;
    public static final int af = 2131559200;
    public static final int ag = 2131558599;
    public static final int ah = 2131558768;
    public static final int ai = 2131558766;
    public static final int aj = 2131558767;
    public static final int ak = 2131624226;
    public static final int al = 2131364711;
    public static final int am = 2131364710;
    public static final int an = 2131364713;
    public static final int ao = 2131364709;
    public static final int f3826b = 2131558654;
    public static final int f3827c = 2131558998;
    public static final int f3828d = 2131559444;
    public static final int f3829e = 2131559083;
    public static final int f3830f = 2131559448;
    public static final int f3831g = 2131559449;
    public static final int f3832h = 2131559447;
    public static final int f3833i = 2131558824;
    public static final int f3834j = 2131559140;
    public static final int f3835k = 2131559446;
    public static final int f3836l = 2131559000;
    public static final int f3837m = 2131558598;
    public static final int f3838n = 2131558424;
    public static final int f3839o = 2131558425;
    public static final int f3840p = 2131558427;
    public static final int f3841q = 2131559086;
    public static final int f3842r = 2131559143;
    public static final int f3843s = 2131559084;
    public static final int f3844t = 2131559156;
    public static final int f3845u = 2131559087;
    public static final int f3846v = 2131558428;
    public static final int f3847w = 2131559082;
    public static final int f3848x = 2131558426;
    public static final int f3849y = 2131558429;
    public static final int f3850z = 2131559445;

    bm() {
    }

    public void mo612a(ViewGroup viewGroup, View view, Rect rect) {
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        rect.offset(view.getScrollX(), view.getScrollY());
    }

    public static void m6128a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void m6130a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void m6129a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void m6131a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void m6134a(Drawable drawable, Mode mode) {
        drawable.setTintMode(mode);
    }

    public static Drawable m6121a(Drawable drawable) {
        if (drawable instanceof js) {
            return drawable;
        }
        return new jq(drawable);
    }

    public static void m6132a(Drawable drawable, Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean m6154b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter m6156c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void m6133a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void m6136a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static void m6135a(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void m6149b(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public static void m6137a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m6138a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m6145a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, objArr));
        }
    }

    public static void m6139a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, Character.valueOf(c)));
        }
    }

    public static void m6141a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, Integer.valueOf(i)));
        }
    }

    public static void m6142a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, Long.valueOf(j)));
        }
    }

    public static void m6143a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, obj));
        }
    }

    public static void m6140a(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, Character.valueOf(c), obj));
        }
    }

    public static void m6144a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(bm.m6126a(str, obj, obj2));
        }
    }

    public static void m6150b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m6151b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m6152b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(bm.m6126a(str, obj));
        }
    }

    public static void m6153b(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(bm.m6126a(str, obj, obj2));
        }
    }

    public static <T> T m6122a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T m6123a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T m6125a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(bm.m6126a(str, objArr));
    }

    public static <T> T m6124a(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(bm.m6126a(str, obj));
    }

    public static int m6119a(int i, int i2) {
        return bm.m6120a(i, i2, "index");
    }

    public static int m6120a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(bm.m6148b(i, i2, str));
    }

    public static String m6148b(int i, int i2, String str) {
        if (i < 0) {
            return bm.m6126a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return bm.m6126a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static int m6146b(int i, int i2) {
        return bm.m6155c(i, i2, "index");
    }

    public static int m6155c(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(bm.m6157d(i, i2, str));
    }

    public static String m6157d(int i, int i2, String str) {
        if (i < 0) {
            return bm.m6126a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return bm.m6126a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static void m6127a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(bm.m6147b(i, i2, i3));
        }
    }

    public static String m6147b(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return bm.m6157d(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return bm.m6157d(i2, i3, "end index");
        }
        return bm.m6126a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static String m6126a(String str, Object... objArr) {
        int i = 0;
        CharSequence valueOf = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf, i2, indexOf);
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            stringBuilder.append(" [");
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            i = i2;
            while (i < objArr.length) {
                stringBuilder.append(", ");
                i2 = i + 1;
                stringBuilder.append(objArr[i]);
                i = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}
