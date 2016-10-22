package defpackage;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bn */
public final class bn extends bm {
    static final Mode a;
    boolean c;
    private bt d;
    private PorterDuffColorFilter e;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ int getLayoutDirection() {
        return super.getLayoutDirection();
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    static {
        a = Mode.SRC_IN;
    }

    bn() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.d = new bt();
    }

    bn(bt btVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.d = btVar;
        this.e = a(btVar.c, btVar.d);
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.g && super.mutate() == this) {
            this.d = new bt(this.d);
            this.g = true;
        }
        return this;
    }

    final Object a(String str) {
        return this.d.b.j.get(str);
    }

    public final ConstantState getConstantState() {
        if (this.b != null) {
            return new bu(this.b.getConstantState());
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
        r11 = this;
        r10 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = 0;
        r4 = 1;
        r5 = 0;
        r0 = r11.b;
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = r11.b;
        r0.draw(r12);
    L_0x0010:
        return;
    L_0x0011:
        r0 = r11.j;
        r11.copyBounds(r0);
        r0 = r11.j;
        r0 = r0.width();
        if (r0 <= 0) goto L_0x0010;
    L_0x001e:
        r0 = r11.j;
        r0 = r0.height();
        if (r0 <= 0) goto L_0x0010;
    L_0x0026:
        r0 = r11.f;
        if (r0 != 0) goto L_0x00e0;
    L_0x002a:
        r0 = r11.e;
    L_0x002c:
        r1 = r11.i;
        r12.getMatrix(r1);
        r1 = r11.i;
        r3 = r11.h;
        r1.getValues(r3);
        r1 = r11.h;
        r1 = r1[r5];
        r3 = java.lang.Math.abs(r1);
        r1 = r11.h;
        r6 = 4;
        r1 = r1[r6];
        r1 = java.lang.Math.abs(r1);
        r6 = r11.h;
        r6 = r6[r4];
        r6 = java.lang.Math.abs(r6);
        r7 = r11.h;
        r8 = 3;
        r7 = r7[r8];
        r7 = java.lang.Math.abs(r7);
        r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r6 != 0) goto L_0x0062;
    L_0x005e:
        r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r6 == 0) goto L_0x014a;
    L_0x0062:
        r1 = r2;
    L_0x0063:
        r3 = r11.j;
        r3 = r3.width();
        r3 = (float) r3;
        r2 = r2 * r3;
        r2 = (int) r2;
        r3 = r11.j;
        r3 = r3.height();
        r3 = (float) r3;
        r1 = r1 * r3;
        r1 = (int) r1;
        r2 = java.lang.Math.min(r10, r2);
        r3 = java.lang.Math.min(r10, r1);
        if (r2 <= 0) goto L_0x0010;
    L_0x007f:
        if (r3 <= 0) goto L_0x0010;
    L_0x0081:
        r6 = r12.save();
        r1 = r11.j;
        r1 = r1.left;
        r1 = (float) r1;
        r7 = r11.j;
        r7 = r7.top;
        r7 = (float) r7;
        r12.translate(r1, r7);
        r1 = r11.j;
        r1.offsetTo(r5, r5);
        r7 = r11.d;
        r1 = r7.f;
        if (r1 == 0) goto L_0x00b0;
    L_0x009d:
        r1 = r7.f;
        r1 = r1.getWidth();
        if (r2 != r1) goto L_0x00e4;
    L_0x00a5:
        r1 = r7.f;
        r1 = r1.getHeight();
        if (r3 != r1) goto L_0x00e4;
    L_0x00ad:
        r1 = r4;
    L_0x00ae:
        if (r1 != 0) goto L_0x00ba;
    L_0x00b0:
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r2, r3, r1);
        r7.f = r1;
        r7.k = r4;
    L_0x00ba:
        r1 = r11.c;
        if (r1 != 0) goto L_0x00e6;
    L_0x00be:
        r1 = r11.d;
        r1.a(r2, r3);
    L_0x00c3:
        r2 = r11.d;
        r3 = r11.j;
        r1 = r2.b;
        r1 = r1.h;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 >= r7) goto L_0x0127;
    L_0x00cf:
        r1 = r4;
    L_0x00d0:
        if (r1 != 0) goto L_0x0129;
    L_0x00d2:
        if (r0 != 0) goto L_0x0129;
    L_0x00d4:
        r0 = 0;
    L_0x00d5:
        r1 = r2.f;
        r2 = 0;
        r12.drawBitmap(r1, r2, r3, r0);
        r12.restoreToCount(r6);
        goto L_0x0010;
    L_0x00e0:
        r0 = r11.f;
        goto L_0x002c;
    L_0x00e4:
        r1 = r5;
        goto L_0x00ae;
    L_0x00e6:
        r1 = r11.d;
        r7 = r1.k;
        if (r7 != 0) goto L_0x0125;
    L_0x00ec:
        r7 = r1.g;
        r8 = r1.c;
        if (r7 != r8) goto L_0x0125;
    L_0x00f2:
        r7 = r1.h;
        r8 = r1.d;
        if (r7 != r8) goto L_0x0125;
    L_0x00f8:
        r7 = r1.j;
        r8 = r1.e;
        if (r7 != r8) goto L_0x0125;
    L_0x00fe:
        r7 = r1.i;
        r1 = r1.b;
        r1 = r1.h;
        if (r7 != r1) goto L_0x0125;
    L_0x0106:
        r1 = r4;
    L_0x0107:
        if (r1 != 0) goto L_0x00c3;
    L_0x0109:
        r1 = r11.d;
        r1.a(r2, r3);
        r1 = r11.d;
        r2 = r1.c;
        r1.g = r2;
        r2 = r1.d;
        r1.h = r2;
        r2 = r1.b;
        r2 = r2.h;
        r1.i = r2;
        r2 = r1.e;
        r1.j = r2;
        r1.k = r5;
        goto L_0x00c3;
    L_0x0125:
        r1 = r5;
        goto L_0x0107;
    L_0x0127:
        r1 = r5;
        goto L_0x00d0;
    L_0x0129:
        r1 = r2.l;
        if (r1 != 0) goto L_0x0139;
    L_0x012d:
        r1 = new android.graphics.Paint;
        r1.<init>();
        r2.l = r1;
        r1 = r2.l;
        r1.setFilterBitmap(r4);
    L_0x0139:
        r1 = r2.l;
        r4 = r2.b;
        r4 = r4.h;
        r1.setAlpha(r4);
        r1 = r2.l;
        r1.setColorFilter(r0);
        r0 = r2.l;
        goto L_0x00d5;
    L_0x014a:
        r2 = r3;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        if (this.b != null) {
            return gr.c(this.b);
        }
        return this.d.b.h;
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.d.b.h != i) {
            this.d.b.h = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void setTint(int i) {
        if (this.b != null) {
            gr.a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            gr.a(this.b, colorStateList);
            return;
        }
        bt btVar = this.d;
        if (btVar.c != colorStateList) {
            btVar.c = colorStateList;
            this.e = a(colorStateList, btVar.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            gr.a(this.b, mode);
            return;
        }
        bt btVar = this.d;
        if (btVar.d != mode) {
            btVar.d = mode;
            this.e = a(btVar.c, mode);
            invalidateSelf();
        }
    }

    public final boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return super.isStateful() || !(this.d == null || this.d.c == null || !this.d.c.isStateful());
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        bt btVar = this.d;
        if (btVar.c == null || btVar.d == null) {
            return false;
        }
        this.e = a(btVar.c, btVar.d);
        invalidateSelf();
        return true;
    }

    public final int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    public final int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.d.b.d;
    }

    public final int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.d.b.e;
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            gr.d(this.b);
        }
        return false;
    }

    public static bn a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            bn bnVar = new bn();
            bnVar.b = buf.a(resources, i, theme);
            bu buVar = new bu(bnVar.b.getConstantState());
            return bnVar;
        }
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
            if (next == 2) {
                return bn.a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (Throwable e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static bn a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        bn bnVar = new bn();
        bnVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bnVar;
    }

    static int a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            gr.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        bt btVar = this.d;
        btVar.b = new bs();
        TypedArray a = bm.a(resources, theme, attributeSet, bf.a);
        bt btVar2 = this.d;
        bs bsVar = btVar2.b;
        int a2 = buf.a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (a2) {
            case rl.e /*3*/:
                mode = Mode.SRC_OVER;
                break;
            case rl.g /*5*/:
                mode = Mode.SRC_IN;
                break;
            case rl.l /*9*/:
                mode = Mode.SRC_ATOP;
                break;
            case rk.bV /*14*/:
                mode = Mode.MULTIPLY;
                break;
            case rk.bY /*15*/:
                mode = Mode.SCREEN;
                break;
            case rk.bX /*16*/:
                mode = Mode.ADD;
                break;
        }
        btVar2.d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            btVar2.c = colorStateList;
        }
        btVar2.e = buf.a(a, xmlPullParser, "autoMirrored", 5, btVar2.e);
        bsVar.f = buf.a(a, xmlPullParser, "viewportWidth", 7, bsVar.f);
        bsVar.g = buf.a(a, xmlPullParser, "viewportHeight", 8, bsVar.g);
        if (bsVar.f <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (bsVar.g <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            bsVar.d = a.getDimension(3, bsVar.d);
            bsVar.e = a.getDimension(2, bsVar.e);
            if (bsVar.d <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (bsVar.e <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                bsVar.h = (int) (buf.a(a, xmlPullParser, "alpha", 4, ((float) bsVar.h) / 255.0f) * 255.0f);
                String string = a.getString(0);
                if (string != null) {
                    bsVar.i = string;
                    bsVar.j.put(string, bsVar);
                }
                a.recycle();
                btVar.a = getChangingConfigurations();
                btVar.k = true;
                b(resources, xmlPullParser, attributeSet, theme);
                this.e = a(btVar.c, btVar.d);
            }
        }
    }

    private final void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        bt btVar = this.d;
        bs bsVar = btVar.b;
        Object obj = 1;
        Stack stack = new Stack();
        stack.push(bsVar.c);
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            Object obj2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                bq bqVar = (bq) stack.peek();
                br bpVar;
                TypedArray a;
                if ("path".equals(name)) {
                    bpVar = new bp();
                    a = bm.a(resources, theme, attributeSet, bf.c);
                    bpVar.a = null;
                    if (buf.a(xmlPullParser, "pathData")) {
                        String string = a.getString(0);
                        if (string != null) {
                            bpVar.n = string;
                        }
                        string = a.getString(2);
                        if (string != null) {
                            bpVar.m = buf.a(string);
                        }
                        bpVar.d = buf.b(a, xmlPullParser, "fillColor", 1, bpVar.d);
                        bpVar.f = buf.a(a, xmlPullParser, "fillAlpha", 12, bpVar.f);
                        int a2 = buf.a(a, xmlPullParser, "strokeLineCap", 8, -1);
                        Cap cap = bpVar.j;
                        switch (a2) {
                            case rl.c /*0*/:
                                cap = Cap.BUTT;
                                break;
                            case rq.b /*1*/:
                                cap = Cap.ROUND;
                                break;
                            case rq.c /*2*/:
                                cap = Cap.SQUARE;
                                break;
                        }
                        bpVar.j = cap;
                        a2 = buf.a(a, xmlPullParser, "strokeLineJoin", 9, -1);
                        Join join = bpVar.k;
                        switch (a2) {
                            case rl.c /*0*/:
                                join = Join.MITER;
                                break;
                            case rq.b /*1*/:
                                join = Join.ROUND;
                                break;
                            case rq.c /*2*/:
                                join = Join.BEVEL;
                                break;
                        }
                        bpVar.k = join;
                        bpVar.l = buf.a(a, xmlPullParser, "strokeMiterLimit", 10, bpVar.l);
                        bpVar.b = buf.b(a, xmlPullParser, "strokeColor", 3, bpVar.b);
                        bpVar.e = buf.a(a, xmlPullParser, "strokeAlpha", 11, bpVar.e);
                        bpVar.c = buf.a(a, xmlPullParser, "strokeWidth", 4, bpVar.c);
                        bpVar.h = buf.a(a, xmlPullParser, "trimPathEnd", 6, bpVar.h);
                        bpVar.i = buf.a(a, xmlPullParser, "trimPathOffset", 7, bpVar.i);
                        bpVar.g = buf.a(a, xmlPullParser, "trimPathStart", 5, bpVar.g);
                    }
                    a.recycle();
                    bqVar.b.add(bpVar);
                    if (bpVar.n != null) {
                        bsVar.j.put(bpVar.n, bpVar);
                    }
                    obj2 = null;
                    btVar.a |= bpVar.o;
                } else if ("clip-path".equals(name)) {
                    bpVar = new bo();
                    if (buf.a(xmlPullParser, "pathData")) {
                        a = bm.a(resources, theme, attributeSet, bf.d);
                        r9 = a.getString(0);
                        if (r9 != null) {
                            bpVar.n = r9;
                        }
                        r9 = a.getString(1);
                        if (r9 != null) {
                            bpVar.m = buf.a(r9);
                        }
                        a.recycle();
                    }
                    bqVar.b.add(bpVar);
                    if (bpVar.n != null) {
                        bsVar.j.put(bpVar.n, bpVar);
                    }
                    btVar.a |= bpVar.o;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        bq bqVar2 = new bq();
                        a = bm.a(resources, theme, attributeSet, bf.b);
                        bqVar2.l = null;
                        bqVar2.c = buf.a(a, xmlPullParser, "rotation", 5, bqVar2.c);
                        bqVar2.d = a.getFloat(1, bqVar2.d);
                        bqVar2.e = a.getFloat(2, bqVar2.e);
                        bqVar2.f = buf.a(a, xmlPullParser, "scaleX", 3, bqVar2.f);
                        bqVar2.g = buf.a(a, xmlPullParser, "scaleY", 4, bqVar2.g);
                        bqVar2.h = buf.a(a, xmlPullParser, "translateX", 6, bqVar2.h);
                        bqVar2.i = buf.a(a, xmlPullParser, "translateY", 7, bqVar2.i);
                        r9 = a.getString(0);
                        if (r9 != null) {
                            bqVar2.m = r9;
                        }
                        bqVar2.j.reset();
                        bqVar2.j.postTranslate(-bqVar2.d, -bqVar2.e);
                        bqVar2.j.postScale(bqVar2.f, bqVar2.g);
                        bqVar2.j.postRotate(bqVar2.c, 0.0f, 0.0f);
                        bqVar2.j.postTranslate(bqVar2.h + bqVar2.d, bqVar2.i + bqVar2.e);
                        a.recycle();
                        bqVar.b.add(bqVar2);
                        stack.push(bqVar2);
                        if (bqVar2.m != null) {
                            bsVar.j.put(bqVar2.m, bqVar2);
                        }
                        btVar.a |= bqVar2.k;
                    }
                    obj2 = obj;
                }
            } else {
                if (eventType == 3) {
                    if ("group".equals(xmlPullParser.getName())) {
                        stack.pop();
                    }
                }
                obj2 = obj;
            }
            obj = obj2;
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    public final int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    public final void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
