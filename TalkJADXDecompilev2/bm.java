package defpackage;

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
    public static final int A = 2131559141;
    public static final int B = 2131559139;
    public static final int C = 2131558796;
    public static final int D = 2131559451;
    public static final int E = 2131559414;
    public static final int F = 2131558408;
    public static final int G = 2131558771;
    public static final int H = 2131559268;
    public static final int I = 2131559269;
    public static final int J = 2131362317;
    public static final int K = 2131559207;
    public static final int L = 2131558403;
    public static final int M = 2131559206;
    public static final int N = 2131559198;
    public static final int O = 2131559197;
    public static final int P = 2131558404;
    public static final int Q = 2131558716;
    public static final int R = 2131558406;
    public static final int S = 2131558405;
    public static final int T = 2131558922;
    public static final int U = 2131558920;
    public static final int V = 2131558918;
    public static final int W = 2131559214;
    public static final int X = 2131559213;
    public static final int Y = 2131559215;
    public static final int Z = 2131558921;
    public static final int a = 2131559085;
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
    public static final int b = 2131558654;
    public static final int c = 2131558998;
    public static final int d = 2131559444;
    public static final int e = 2131559083;
    public static final int f = 2131559448;
    public static final int g = 2131559449;
    public static final int h = 2131559447;
    public static final int i = 2131558824;
    public static final int j = 2131559140;
    public static final int k = 2131559446;
    public static final int l = 2131559000;
    public static final int m = 2131558598;
    public static final int n = 2131558424;
    public static final int o = 2131558425;
    public static final int p = 2131558427;
    public static final int q = 2131559086;
    public static final int r = 2131559143;
    public static final int s = 2131559084;
    public static final int t = 2131559156;
    public static final int u = 2131559087;
    public static final int v = 2131558428;
    public static final int w = 2131559082;
    public static final int x = 2131558426;
    public static final int y = 2131558429;
    public static final int z = 2131559445;

    bm() {
    }

    public void a(ViewGroup viewGroup, View view, Rect rect) {
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        rect.offset(view.getScrollX(), view.getScrollY());
    }

    public static void a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void a(Drawable drawable, Mode mode) {
        drawable.setTintMode(mode);
    }

    public static Drawable a(Drawable drawable) {
        if (drawable instanceof js) {
            return drawable;
        }
        return new jq(drawable);
    }

    public static void a(Drawable drawable, Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static void a(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void b(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, objArr));
        }
    }

    public static void a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, Character.valueOf(c)));
        }
    }

    public static void a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, Integer.valueOf(i)));
        }
    }

    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, Long.valueOf(j)));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, obj));
        }
    }

    public static void a(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, Character.valueOf(c), obj));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(bm.a(str, obj, obj2));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(bm.a(str, obj));
        }
    }

    public static void b(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(bm.a(str, obj, obj2));
        }
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(bm.a(str, objArr));
    }

    public static <T> T a(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(bm.a(str, obj));
    }

    public static int a(int i, int i2) {
        return bm.a(i, i2, "index");
    }

    public static int a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(bm.b(i, i2, str));
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return bm.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return bm.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static int b(int i, int i2) {
        return bm.c(i, i2, "index");
    }

    public static int c(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(bm.d(i, i2, str));
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return bm.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return bm.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(bm.b(i, i2, i3));
        }
    }

    public static String b(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return bm.d(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return bm.d(i2, i3, "end index");
        }
        return bm.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static String a(String str, Object... objArr) {
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
