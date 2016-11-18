package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class aai {
    private static final Mode a = Mode.SRC_IN;
    private static aai b;
    private static final ld c = new ld(6, (byte) 0);
    private static final int[] d = new int[]{gwb.bg, gwb.be, gwb.au};
    private static final int[] e = new int[]{gwb.aF, gwb.aS, gwb.aK, gwb.aG, gwb.aH, gwb.aJ, gwb.aI};
    private static final int[] f = new int[]{gwb.bd, gwb.bf, gwb.aC, gwb.aZ, gwb.ba, gwb.bb, gwb.bc};
    private static final int[] g = new int[]{gwb.aN, gwb.aA, gwb.aM};
    private static final int[] h = new int[]{gwb.aY, gwb.bh};
    private static final int[] i = new int[]{gwb.aw, gwb.az};
    private WeakHashMap<Context, SparseArray<ColorStateList>> j;
    private ky<String, aak> k;
    private SparseArray<String> l;
    private final Object m = new Object();
    private final WeakHashMap<Context, lc<WeakReference<ConstantState>>> n = new WeakHashMap(0);
    private TypedValue o;
    private boolean p;

    public static aai a() {
        if (b == null) {
            aai aai = new aai();
            b = aai;
            int i = VERSION.SDK_INT;
            if (i < 23) {
                aai.a("vector", new aal());
                if (i >= 11) {
                    aai.a("animated-vector", new aaj());
                }
            }
        }
        return b;
    }

    public Drawable a(Context context, int i) {
        return a(context, i, false);
    }

    public void a(Context context) {
        synchronized (this.m) {
            lc lcVar = (lc) this.n.get(context);
            if (lcVar != null) {
                lcVar.b();
            }
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable a(Context context, int i, boolean z, Drawable drawable) {
        Mode mode = null;
        ColorStateList b = b(context, i);
        if (b != null) {
            if (aci.c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = jb.e(drawable);
            jb.a(drawable, b);
            if (i == gwb.aW) {
                mode = Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            jb.a(drawable, mode);
            return drawable;
        } else if (i == gwb.aT) {
            r0 = (LayerDrawable) drawable;
            aai.a(r0.findDrawableByLayerId(16908288), afl.a(context, gwb.M), a);
            aai.a(r0.findDrawableByLayerId(16908303), afl.a(context, gwb.M), a);
            aai.a(r0.findDrawableByLayerId(16908301), afl.a(context, gwb.K), a);
            return drawable;
        } else if (i == gwb.aP || i == gwb.aO || i == gwb.aQ) {
            r0 = (LayerDrawable) drawable;
            aai.a(r0.findDrawableByLayerId(16908288), afl.c(context, gwb.M), a);
            aai.a(r0.findDrawableByLayerId(16908303), afl.a(context, gwb.K), a);
            aai.a(r0.findDrawableByLayerId(16908301), afl.a(context, gwb.K), a);
            return drawable;
        } else if (aai.a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    private Drawable c(Context context, int i) {
        if (this.k == null || this.k.isEmpty()) {
            return null;
        }
        String str;
        if (this.l != null) {
            str = (String) this.l.get(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.k.get(str) == null)) {
                return null;
            }
        }
        this.l = new SparseArray();
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = aai.a(typedValue);
        Drawable a2 = a(context, a);
        if (a2 != null) {
            return a2;
        }
        Drawable drawable;
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                str = xml.getName();
                this.l.append(i, str);
                aak aak = (aak) this.k.get(str);
                if (aak != null) {
                    a2 = aak.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a2 != null) {
                    a2.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, a, a2);
                }
                drawable = a2;
                if (drawable == null) {
                    return drawable;
                }
                this.l.append(i, "appcompat_skip_skip");
                return drawable;
            } catch (Throwable e) {
                Log.e("AppCompatDrawableManager", "Exception while inflating drawable", e);
            }
        }
        drawable = a2;
        if (drawable == null) {
            return drawable;
        }
        this.l.append(i, "appcompat_skip_skip");
        return drawable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable a(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r2 = 0;
        r3 = r4.m;
        monitor-enter(r3);
        r0 = r4.n;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002b }
        r0 = (defpackage.lc) r0;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r0.a(r6);	 Catch:{ all -> 0x002b }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0031;
    L_0x0019:
        r1 = r1.get();	 Catch:{ all -> 0x002b }
        r1 = (android.graphics.drawable.Drawable.ConstantState) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r5.getResources();	 Catch:{ all -> 0x002b }
        r0 = r1.newDrawable(r0);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0010;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r0.b(r6);	 Catch:{ all -> 0x002b }
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: aai.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private boolean a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.m) {
            lc lcVar = (lc) this.n.get(context);
            if (lcVar == null) {
                lcVar = new lc();
                this.n.put(context, lcVar);
            }
            lcVar.b(j, new WeakReference(constantState));
        }
        return true;
    }

    Drawable a(Context context, aga aga, int i) {
        Drawable c = c(context, i);
        if (c == null) {
            c = aga.a(i);
        }
        if (c != null) {
            return a(context, i, false, c);
        }
        return null;
    }

    static boolean a(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = a;
        if (aai.a(d, i)) {
            i2 = gwb.M;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (aai.a(f, i)) {
            i2 = gwb.K;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (aai.a(g, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == gwb.aL) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == gwb.aD) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (aci.c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(aai.a(afl.a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private void a(String str, aak aak) {
        if (this.k == null) {
            this.k = new ky();
        }
        this.k.put(str, aak);
    }

    private static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    ColorStateList b(Context context, int i) {
        return a(context, i, null);
    }

    ColorStateList a(Context context, int i, ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        int i2 = colorStateList == null ? 1 : 0;
        if (i2 == 0) {
            colorStateList2 = null;
        } else if (this.j != null) {
            SparseArray sparseArray = (SparseArray) this.j.get(context);
            colorStateList2 = sparseArray != null ? (ColorStateList) sparseArray.get(i) : null;
        } else {
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ColorStateList a = i == gwb.aE ? wk.a(context, gwb.aj) : i == gwb.aX ? wk.a(context, gwb.an) : i == gwb.aW ? wk.a(context, gwb.am) : i == gwb.ay ? aai.b(context, afl.a(context, gwb.J), colorStateList) : i == gwb.av ? aai.b(context, 0, null) : i == gwb.ax ? aai.b(context, afl.a(context, gwb.I), colorStateList) : (i == gwb.aU || i == gwb.aV) ? wk.a(context, gwb.al) : aai.a(e, i) ? afl.b(context, gwb.M) : aai.a(h, i) ? wk.a(context, gwb.ai) : aai.a(i, i) ? wk.a(context, gwb.ah) : i == gwb.aR ? wk.a(context, gwb.ak) : colorStateList2;
        if (!(i2 == 0 || a == null)) {
            if (this.j == null) {
                this.j = new WeakHashMap();
            }
            sparseArray = (SparseArray) this.j.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                this.j.put(context, sparseArray);
            }
            sparseArray.append(i, a);
        }
        return a;
    }

    private static ColorStateList b(Context context, int i, ColorStateList colorStateList) {
        r1 = new int[4][];
        int[] iArr = new int[4];
        int a = afl.a(context, gwb.L);
        int c = afl.c(context, gwb.J);
        r1[0] = afl.a;
        if (colorStateList != null) {
            c = colorStateList.getColorForState(r1[0], 0);
        }
        iArr[0] = c;
        r1[1] = afl.d;
        if (colorStateList == null) {
            c = i;
        } else {
            c = colorStateList.getColorForState(r1[1], 0);
        }
        iArr[1] = ja.a(a, c);
        r1[2] = afl.b;
        if (colorStateList == null) {
            c = i;
        } else {
            c = colorStateList.getColorForState(r1[2], 0);
        }
        iArr[2] = ja.a(a, c);
        r1[3] = afl.h;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(r1[3], 0);
        }
        iArr[3] = i;
        return new ColorStateList(r1, iArr);
    }

    static void a(Drawable drawable, afn afn, int[] iArr) {
        ColorFilter colorFilter = null;
        if (!aci.c(drawable) || drawable.mutate() == drawable) {
            if (afn.e || afn.d) {
                ColorStateList colorStateList;
                Mode mode;
                if (afn.e) {
                    colorStateList = afn.b;
                } else {
                    colorStateList = null;
                }
                if (afn.d) {
                    mode = afn.c;
                } else {
                    mode = a;
                }
                if (!(colorStateList == null || mode == null)) {
                    colorFilter = aai.a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(colorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    private static PorterDuffColorFilter a(int i, Mode mode) {
        PorterDuffColorFilter a = c.a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        c.a(i, mode, a);
        return a;
    }

    private static void a(Drawable drawable, int i, Mode mode) {
        if (aci.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter(aai.a(i, mode));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.graphics.drawable.Drawable a(android.content.Context r9, int r10, boolean r11) {
        /*
        r8 = this;
        r1 = 0;
        r2 = 1;
        r0 = r8.p;
        if (r0 != 0) goto L_0x0033;
    L_0x0006:
        r8.p = r2;
        r0 = defpackage.gwb.bi;
        r0 = r8.a(r9, r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0010:
        r3 = r0 instanceof defpackage.ca;
        if (r3 != 0) goto L_0x0024;
    L_0x0014:
        r3 = "android.graphics.drawable.VectorDrawable";
        r0 = r0.getClass();
        r0 = r0.getName();
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r0 = r2;
    L_0x0025:
        if (r0 != 0) goto L_0x0033;
    L_0x0027:
        r8.p = r1;
        r0 = new java.lang.IllegalStateException;
        r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.";
        r0.<init>(r1);
        throw r0;
    L_0x0031:
        r0 = r1;
        goto L_0x0025;
    L_0x0033:
        r0 = r8.c(r9, r10);
        if (r0 != 0) goto L_0x007d;
    L_0x0039:
        r0 = r8.o;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r8.o = r0;
    L_0x0044:
        r3 = r8.o;
        r0 = r9.getResources();
        r0.getValue(r10, r3, r2);
        r4 = defpackage.aai.a(r3);
        r0 = r8.a(r9, r4);
        if (r0 != 0) goto L_0x007d;
    L_0x0057:
        r6 = defpackage.gwb.aB;
        if (r10 != r6) goto L_0x0073;
    L_0x005b:
        r0 = new android.graphics.drawable.LayerDrawable;
        r6 = 2;
        r6 = new android.graphics.drawable.Drawable[r6];
        r7 = defpackage.gwb.aA;
        r7 = r8.a(r9, r7);
        r6[r1] = r7;
        r1 = defpackage.gwb.aC;
        r1 = r8.a(r9, r1);
        r6[r2] = r1;
        r0.<init>(r6);
    L_0x0073:
        if (r0 == 0) goto L_0x007d;
    L_0x0075:
        r1 = r3.changingConfigurations;
        r0.setChangingConfigurations(r1);
        r8.a(r9, r4, r0);
    L_0x007d:
        if (r0 != 0) goto L_0x0083;
    L_0x007f:
        r0 = defpackage.ia.a(r9, r10);
    L_0x0083:
        if (r0 == 0) goto L_0x0089;
    L_0x0085:
        r0 = r8.a(r9, r10, r11, r0);
    L_0x0089:
        if (r0 == 0) goto L_0x008e;
    L_0x008b:
        defpackage.aci.b(r0);
    L_0x008e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: aai.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
