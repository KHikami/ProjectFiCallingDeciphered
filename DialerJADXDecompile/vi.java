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

/* compiled from: PG */
public final class vi {
    private static final Mode a;
    private static vi b;
    private static final vk c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private WeakHashMap j;
    private hv k;
    private SparseArray l;
    private final Object m;
    private final WeakHashMap n;
    private TypedValue o;
    private boolean p;

    public vi() {
        this.m = new Object();
        this.n = new WeakHashMap(0);
    }

    static {
        a = Mode.SRC_IN;
        c = new vk(6);
        d = new int[]{buf.ba, buf.aY, buf.aq};
        e = new int[]{buf.aC, buf.aP, buf.aH, buf.aD, buf.aE, buf.aG, buf.aF};
        f = new int[]{buf.aX, buf.aZ, buf.ay, buf.aW};
        g = new int[]{buf.aK, buf.aw, buf.aJ};
        h = new int[]{buf.aV, buf.bb};
        i = new int[]{buf.as, buf.av};
    }

    public static vi a() {
        if (b == null) {
            vi viVar = new vi();
            b = viVar;
            int i = VERSION.SDK_INT;
            if (i < 23) {
                viVar.a("vector", new vm());
                if (i >= 11) {
                    viVar.a("animated-vector", new vj());
                }
            }
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(android.content.Context r9, int r10, boolean r11) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r0 = r8.p;
        if (r0 != 0) goto L_0x0033;
    L_0x0006:
        r8.p = r2;
        r0 = buf.aB;
        r0 = r8.a(r9, r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0010:
        r3 = r0 instanceof bn;
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
        r0 = r8.a(r9, r10);
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
        r4 = a(r3);
        r0 = r8.a(r9, r4);
        if (r0 != 0) goto L_0x007d;
    L_0x0057:
        r6 = buf.ax;
        if (r10 != r6) goto L_0x0073;
    L_0x005b:
        r0 = new android.graphics.drawable.LayerDrawable;
        r6 = 2;
        r6 = new android.graphics.drawable.Drawable[r6];
        r7 = buf.aw;
        r7 = r8.a(r9, r7, r1);
        r6[r1] = r7;
        r7 = buf.ay;
        r1 = r8.a(r9, r7, r1);
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
        r0 = gd.a(r9, r10);
    L_0x0083:
        if (r0 == 0) goto L_0x0089;
    L_0x0085:
        r0 = r8.a(r9, r10, r11, r0);
    L_0x0089:
        if (r0 == 0) goto L_0x008e;
    L_0x008b:
        xi.a(r0);
    L_0x008e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    final Drawable a(Context context, int i, boolean z, Drawable drawable) {
        Mode mode = null;
        ColorStateList b = b(context, i);
        if (b != null) {
            if (xi.b(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = gr.e(drawable);
            gr.a(drawable, b);
            if (i == buf.aT) {
                mode = Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            gr.a(drawable, mode);
            return drawable;
        } else if (i == buf.aQ) {
            r0 = (LayerDrawable) drawable;
            a(r0.findDrawableByLayerId(16908288), aad.a(context, buf.L), a);
            a(r0.findDrawableByLayerId(16908303), aad.a(context, buf.L), a);
            a(r0.findDrawableByLayerId(16908301), aad.a(context, buf.J), a);
            return drawable;
        } else if (i == buf.aM || i == buf.aL || i == buf.aN) {
            r0 = (LayerDrawable) drawable;
            a(r0.findDrawableByLayerId(16908288), aad.c(context, buf.L), a);
            a(r0.findDrawableByLayerId(16908303), aad.a(context, buf.J), a);
            a(r0.findDrawableByLayerId(16908301), aad.a(context, buf.J), a);
            return drawable;
        } else if (a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    final Drawable a(Context context, int i) {
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
        long a = a(typedValue);
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
                vl vlVar = (vl) this.k.get(str);
                if (vlVar != null) {
                    a2 = vlVar.a(context, xml, asAttributeSet, context.getTheme());
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

    private final Drawable a(Context context, long j) {
        synchronized (this.m) {
            hz hzVar = (hz) this.n.get(context);
            if (hzVar == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) hzVar.a(j);
            if (weakReference != null) {
                ConstantState constantState = (ConstantState) weakReference.get();
                if (constantState != null) {
                    Drawable newDrawable = constantState.newDrawable(context.getResources());
                    return newDrawable;
                }
                int a = hx.a(hzVar.c, hzVar.e, j);
                if (a >= 0 && hzVar.d[a] != hz.a) {
                    hzVar.d[a] = hz.a;
                    hzVar.b = true;
                }
            }
            return null;
        }
    }

    private final boolean a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.m) {
            hz hzVar = (hz) this.n.get(context);
            if (hzVar == null) {
                hzVar = new hz();
                this.n.put(context, hzVar);
            }
            hzVar.a(j, new WeakReference(constantState));
        }
        return true;
    }

    static boolean a(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = a;
        if (a(d, i)) {
            i2 = buf.L;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(f, i)) {
            i2 = buf.J;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(g, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == buf.aI) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == buf.az) {
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
        if (xi.b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(aad.a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private final void a(String str, vl vlVar) {
        if (this.k == null) {
            this.k = new hv();
        }
        this.k.put(str, vlVar);
    }

    private static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final ColorStateList b(Context context, int i) {
        ColorStateList colorStateList;
        if (this.j != null) {
            SparseArray sparseArray = (SparseArray) this.j.get(context);
            colorStateList = sparseArray != null ? (ColorStateList) sparseArray.get(i) : null;
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList a = i == buf.aA ? rm.a(context, buf.af) : i == buf.aU ? rm.a(context, buf.aj) : i == buf.aT ? rm.a(context, buf.ai) : i == buf.au ? c(context, aad.a(context, buf.I)) : i == buf.ar ? c(context, 0) : i == buf.at ? c(context, aad.a(context, buf.H)) : (i == buf.aR || i == buf.aS) ? rm.a(context, buf.ah) : a(e, i) ? aad.b(context, buf.L) : a(h, i) ? rm.a(context, buf.ae) : a(i, i) ? rm.a(context, buf.ad) : i == buf.aO ? rm.a(context, buf.ag) : colorStateList;
        if (a != null) {
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

    private static ColorStateList c(Context context, int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int a = aad.a(context, buf.K);
        r0[0] = aad.a;
        r1[0] = aad.c(context, buf.I);
        r0[1] = aad.c;
        r1[1] = gq.a(a, i);
        r0[2] = aad.b;
        r1[2] = gq.a(a, i);
        r0[3] = aad.e;
        r1[3] = i;
        return new ColorStateList(r0, r1);
    }

    public static void a(Drawable drawable, aaf aaf, int[] iArr) {
        ColorFilter colorFilter = null;
        if (!xi.b(drawable) || drawable.mutate() == drawable) {
            if (aaf.d || aaf.c) {
                ColorStateList colorStateList;
                Mode mode;
                if (aaf.d) {
                    colorStateList = aaf.a;
                } else {
                    colorStateList = null;
                }
                if (aaf.c) {
                    mode = aaf.b;
                } else {
                    mode = a;
                }
                if (!(colorStateList == null || mode == null)) {
                    colorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
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
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) c.a((Object) Integer.valueOf(vk.a(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        porterDuffColorFilter = (PorterDuffColorFilter) c.a(Integer.valueOf(vk.a(i, mode)), porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    private static void a(Drawable drawable, int i, Mode mode) {
        if (xi.b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter(a(i, mode));
    }
}
