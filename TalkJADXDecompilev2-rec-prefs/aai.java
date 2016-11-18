package p000;

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
    private static final Mode f32a = Mode.SRC_IN;
    private static aai f33b;
    private static final ld f34c = new ld(6, (byte) 0);
    private static final int[] f35d = new int[]{gwb.bg, gwb.be, gwb.au};
    private static final int[] f36e = new int[]{gwb.aF, gwb.aS, gwb.aK, gwb.aG, gwb.aH, gwb.aJ, gwb.aI};
    private static final int[] f37f = new int[]{gwb.bd, gwb.bf, gwb.aC, gwb.aZ, gwb.ba, gwb.bb, gwb.bc};
    private static final int[] f38g = new int[]{gwb.aN, gwb.aA, gwb.aM};
    private static final int[] f39h = new int[]{gwb.aY, gwb.bh};
    private static final int[] f40i = new int[]{gwb.aw, gwb.az};
    private WeakHashMap<Context, SparseArray<ColorStateList>> f41j;
    private ky<String, aak> f42k;
    private SparseArray<String> f43l;
    private final Object f44m = new Object();
    private final WeakHashMap<Context, lc<WeakReference<ConstantState>>> f45n = new WeakHashMap(0);
    private TypedValue f46o;
    private boolean f47p;

    public static aai m66a() {
        if (f33b == null) {
            aai aai = new aai();
            f33b = aai;
            int i = VERSION.SDK_INT;
            if (i < 23) {
                aai.m72a("vector", new aal());
                if (i >= 11) {
                    aai.m72a("animated-vector", new aaj());
                }
            }
        }
        return f33b;
    }

    public Drawable m79a(Context context, int i) {
        return m80a(context, i, false);
    }

    public void m82a(Context context) {
        synchronized (this.f44m) {
            lc lcVar = (lc) this.f45n.get(context);
            if (lcVar != null) {
                lcVar.m28555b();
            }
        }
    }

    private static long m65a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable m68a(Context context, int i, boolean z, Drawable drawable) {
        Mode mode = null;
        ColorStateList b = m83b(context, i);
        if (b != null) {
            if (aci.m379c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = jb.m23755e(drawable);
            jb.m23746a(drawable, b);
            if (i == gwb.aW) {
                mode = Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            jb.m23749a(drawable, mode);
            return drawable;
        } else if (i == gwb.aT) {
            r0 = (LayerDrawable) drawable;
            aai.m70a(r0.findDrawableByLayerId(16908288), afl.m921a(context, gwb.f867M), f32a);
            aai.m70a(r0.findDrawableByLayerId(16908303), afl.m921a(context, gwb.f867M), f32a);
            aai.m70a(r0.findDrawableByLayerId(16908301), afl.m921a(context, gwb.f865K), f32a);
            return drawable;
        } else if (i == gwb.aP || i == gwb.aO || i == gwb.aQ) {
            r0 = (LayerDrawable) drawable;
            aai.m70a(r0.findDrawableByLayerId(16908288), afl.m923c(context, gwb.f867M), f32a);
            aai.m70a(r0.findDrawableByLayerId(16908303), afl.m921a(context, gwb.f865K), f32a);
            aai.m70a(r0.findDrawableByLayerId(16908301), afl.m921a(context, gwb.f865K), f32a);
            return drawable;
        } else if (aai.m73a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    private Drawable m77c(Context context, int i) {
        if (this.f42k == null || this.f42k.isEmpty()) {
            return null;
        }
        String str;
        if (this.f43l != null) {
            str = (String) this.f43l.get(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f42k.get(str) == null)) {
                return null;
            }
        }
        this.f43l = new SparseArray();
        if (this.f46o == null) {
            this.f46o = new TypedValue();
        }
        TypedValue typedValue = this.f46o;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = aai.m65a(typedValue);
        Drawable a2 = m69a(context, a);
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
                this.f43l.append(i, str);
                aak aak = (aak) this.f42k.get(str);
                if (aak != null) {
                    a2 = aak.mo8a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a2 != null) {
                    a2.setChangingConfigurations(typedValue.changingConfigurations);
                    m74a(context, a, a2);
                }
                drawable = a2;
                if (drawable == null) {
                    return drawable;
                }
                this.f43l.append(i, "appcompat_skip_skip");
                return drawable;
            } catch (Throwable e) {
                Log.e("AppCompatDrawableManager", "Exception while inflating drawable", e);
            }
        }
        drawable = a2;
        if (drawable == null) {
            return drawable;
        }
        this.f43l.append(i, "appcompat_skip_skip");
        return drawable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Drawable m69a(Context context, long j) {
        synchronized (this.f44m) {
            lc lcVar = (lc) this.f45n.get(context);
            if (lcVar == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) lcVar.m28551a(j);
            if (weakReference != null) {
                ConstantState constantState = (ConstantState) weakReference.get();
                if (constantState != null) {
                    Drawable newDrawable = constantState.newDrawable(context.getResources());
                    return newDrawable;
                }
                lcVar.m28556b(j);
            }
        }
    }

    private boolean m74a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f44m) {
            lc lcVar = (lc) this.f45n.get(context);
            if (lcVar == null) {
                lcVar = new lc();
                this.f45n.put(context, lcVar);
            }
            lcVar.m28557b(j, new WeakReference(constantState));
        }
        return true;
    }

    Drawable m81a(Context context, aga aga, int i) {
        Drawable c = m77c(context, i);
        if (c == null) {
            c = aga.m1000a(i);
        }
        if (c != null) {
            return m68a(context, i, false, c);
        }
        return null;
    }

    static boolean m73a(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = f32a;
        if (aai.m75a(f35d, i)) {
            i2 = gwb.f867M;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (aai.m75a(f37f, i)) {
            i2 = gwb.f865K;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (aai.m75a(f38g, i)) {
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
        if (aci.m379c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(aai.m67a(afl.m921a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private void m72a(String str, aak aak) {
        if (this.f42k == null) {
            this.f42k = new ky();
        }
        this.f42k.put(str, aak);
    }

    private static boolean m75a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    ColorStateList m83b(Context context, int i) {
        return m78a(context, i, null);
    }

    ColorStateList m78a(Context context, int i, ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        int i2 = colorStateList == null ? 1 : 0;
        if (i2 == 0) {
            colorStateList2 = null;
        } else if (this.f41j != null) {
            SparseArray sparseArray = (SparseArray) this.f41j.get(context);
            colorStateList2 = sparseArray != null ? (ColorStateList) sparseArray.get(i) : null;
        } else {
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ColorStateList a = i == gwb.aE ? wk.a(context, gwb.aj) : i == gwb.aX ? wk.a(context, gwb.an) : i == gwb.aW ? wk.a(context, gwb.am) : i == gwb.ay ? aai.m76b(context, afl.m921a(context, gwb.f864J), colorStateList) : i == gwb.av ? aai.m76b(context, 0, null) : i == gwb.ax ? aai.m76b(context, afl.m921a(context, gwb.f863I), colorStateList) : (i == gwb.aU || i == gwb.aV) ? wk.a(context, gwb.al) : aai.m75a(f36e, i) ? afl.m922b(context, gwb.f867M) : aai.m75a(f39h, i) ? wk.a(context, gwb.ai) : aai.m75a(f40i, i) ? wk.a(context, gwb.ah) : i == gwb.aR ? wk.a(context, gwb.ak) : colorStateList2;
        if (!(i2 == 0 || a == null)) {
            if (this.f41j == null) {
                this.f41j = new WeakHashMap();
            }
            sparseArray = (SparseArray) this.f41j.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                this.f41j.put(context, sparseArray);
            }
            sparseArray.append(i, a);
        }
        return a;
    }

    private static ColorStateList m76b(Context context, int i, ColorStateList colorStateList) {
        r1 = new int[4][];
        int[] iArr = new int[4];
        int a = afl.m921a(context, gwb.f866L);
        int c = afl.m923c(context, gwb.f864J);
        r1[0] = afl.f534a;
        if (colorStateList != null) {
            c = colorStateList.getColorForState(r1[0], 0);
        }
        iArr[0] = c;
        r1[1] = afl.f537d;
        if (colorStateList == null) {
            c = i;
        } else {
            c = colorStateList.getColorForState(r1[1], 0);
        }
        iArr[1] = ja.m23624a(a, c);
        r1[2] = afl.f535b;
        if (colorStateList == null) {
            c = i;
        } else {
            c = colorStateList.getColorForState(r1[2], 0);
        }
        iArr[2] = ja.m23624a(a, c);
        r1[3] = afl.f541h;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(r1[3], 0);
        }
        iArr[3] = i;
        return new ColorStateList(r1, iArr);
    }

    static void m71a(Drawable drawable, afn afn, int[] iArr) {
        ColorFilter colorFilter = null;
        if (!aci.m379c(drawable) || drawable.mutate() == drawable) {
            if (afn.f19e || afn.f18d) {
                ColorStateList colorStateList;
                Mode mode;
                if (afn.f19e) {
                    colorStateList = afn.f16b;
                } else {
                    colorStateList = null;
                }
                if (afn.f18d) {
                    mode = afn.f17c;
                } else {
                    mode = f32a;
                }
                if (!(colorStateList == null || mode == null)) {
                    colorFilter = aai.m67a(colorStateList.getColorForState(iArr, 0), mode);
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

    private static PorterDuffColorFilter m67a(int i, Mode mode) {
        PorterDuffColorFilter a = f34c.m1198a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        f34c.m1199a(i, mode, a);
        return a;
    }

    private static void m70a(Drawable drawable, int i, Mode mode) {
        if (aci.m379c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f32a;
        }
        drawable.setColorFilter(aai.m67a(i, mode));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Drawable m80a(Context context, int i, boolean z) {
        Drawable a;
        if (!this.f47p) {
            this.f47p = true;
            a = m79a(context, gwb.bi);
            if (a != null) {
                boolean z2;
                if ((a instanceof ca) || "android.graphics.drawable.VectorDrawable".equals(a.getClass().getName())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f47p = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        a = m77c(context, i);
        if (a == null) {
            if (this.f46o == null) {
                this.f46o = new TypedValue();
            }
            TypedValue typedValue = this.f46o;
            context.getResources().getValue(i, typedValue, true);
            long a2 = aai.m65a(typedValue);
            a = m69a(context, a2);
            if (a == null) {
                if (i == gwb.aB) {
                    a = new LayerDrawable(new Drawable[]{m79a(context, gwb.aA), m79a(context, gwb.aC)});
                }
                if (a != null) {
                    a.setChangingConfigurations(typedValue.changingConfigurations);
                    m74a(context, a2, a);
                }
            }
        }
        if (a == null) {
            a = ia.m10675a(context, i);
        }
        if (a != null) {
            a = m68a(context, i, z, a);
        }
        if (a != null) {
            aci.m378b(a);
        }
        return a;
    }
}
