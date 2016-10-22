import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
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

public final class ca extends bz {
    static final Mode a;
    private cg c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getLayoutDirection() {
        return super.getLayoutDirection();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    static {
        a = Mode.SRC_IN;
    }

    ca() {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = new cg();
    }

    ca(cg cgVar) {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = cgVar;
        this.d = a(cgVar.c, cgVar.d);
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.f && super.mutate() == this) {
            this.c = new cg(this.c);
            this.f = true;
        }
        return this;
    }

    Object a(String str) {
        return this.c.b.j.get(str);
    }

    public ConstantState getConstantState() {
        if (this.b != null) {
            return new ch(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    public void draw(Canvas canvas) {
        float f = 1.0f;
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() > 0 && this.k.height() > 0) {
            ColorFilter colorFilter = this.e == null ? this.d : this.e;
            canvas.getMatrix(this.j);
            this.j.getValues(this.i);
            float abs = Math.abs(this.i[0]);
            float abs2 = Math.abs(this.i[4]);
            float abs3 = Math.abs(this.i[1]);
            float abs4 = Math.abs(this.i[3]);
            if (abs3 == 0.0f && abs4 == 0.0f) {
                f = abs;
            } else {
                abs2 = 1.0f;
            }
            int height = (int) (abs2 * ((float) this.k.height()));
            int min = Math.min(2048, (int) (f * ((float) this.k.width())));
            height = Math.min(2048, height);
            if (min > 0 && height > 0) {
                int save = canvas.save();
                canvas.translate((float) this.k.left, (float) this.k.top);
                this.k.offsetTo(0, 0);
                this.c.b(min, height);
                if (!this.g) {
                    this.c.a(min, height);
                } else if (!this.c.a()) {
                    this.c.a(min, height);
                    this.c.b();
                }
                this.c.a(canvas, colorFilter, this.k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.b != null) {
            return jb.c(this.b);
        }
        return this.c.b.a();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.c.b.a() != i) {
            this.c.b.a(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.b != null) {
            jb.a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            jb.a(this.b, colorStateList);
            return;
        }
        cg cgVar = this.c;
        if (cgVar.c != colorStateList) {
            cgVar.c = colorStateList;
            this.d = a(colorStateList, cgVar.d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            jb.a(this.b, mode);
            return;
        }
        cg cgVar = this.c;
        if (cgVar.d != mode) {
            cgVar.d = mode;
            this.d = a(cgVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return super.isStateful() || !(this.c == null || this.c.c == null || !this.c.c.isStateful());
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        cg cgVar = this.c;
        if (cgVar.c == null || cgVar.d == null) {
            return false;
        }
        this.d = a(cgVar.c, cgVar.d);
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.c.b.d;
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.c.b.e;
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            jb.d(this.b);
        }
        return false;
    }

    public static ca a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            ca caVar = new ca();
            caVar.b = gwb.a(resources, i, theme);
            caVar.h = new ch(caVar.b.getConstantState());
            return caVar;
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
                return a(resources, xml, asAttributeSet, theme);
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

    public static ca a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        ca caVar = new ca();
        caVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return caVar;
    }

    static int a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            jb.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        cg cgVar = this.c;
        cgVar.b = new cf();
        TypedArray a = bz.a(resources, theme, attributeSet, bs.a);
        cg cgVar2 = this.c;
        cf cfVar = cgVar2.b;
        int a2 = gwb.a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (a2) {
            case wi.z /*3*/:
                mode = Mode.SRC_OVER;
                break;
            case wi.p /*5*/:
                mode = Mode.SRC_IN;
                break;
            case wi.n /*9*/:
                mode = Mode.SRC_ATOP;
                break;
            case wi.g /*14*/:
                mode = Mode.MULTIPLY;
                break;
            case wi.dJ /*15*/:
                mode = Mode.SCREEN;
                break;
            case wi.dI /*16*/:
                mode = Mode.ADD;
                break;
        }
        cgVar2.d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            cgVar2.c = colorStateList;
        }
        cgVar2.e = gwb.a(a, xmlPullParser, "autoMirrored", 5, cgVar2.e);
        cfVar.f = gwb.a(a, xmlPullParser, "viewportWidth", 7, cfVar.f);
        cfVar.g = gwb.a(a, xmlPullParser, "viewportHeight", 8, cfVar.g);
        if (cfVar.f <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (cfVar.g <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            cfVar.d = a.getDimension(3, cfVar.d);
            cfVar.e = a.getDimension(2, cfVar.e);
            if (cfVar.d <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (cfVar.e <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                cfVar.a(gwb.a(a, xmlPullParser, "alpha", 4, cfVar.b()));
                String string = a.getString(0);
                if (string != null) {
                    cfVar.i = string;
                    cfVar.j.put(string, cfVar);
                }
                a.recycle();
                cgVar.a = getChangingConfigurations();
                cgVar.k = true;
                b(resources, xmlPullParser, attributeSet, theme);
                this.d = a(cgVar.c, cgVar.d);
            }
        }
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        cg cgVar = this.c;
        cf cfVar = cgVar.b;
        Stack stack = new Stack();
        stack.push(cfVar.c);
        int eventType = xmlPullParser.getEventType();
        Object obj = 1;
        while (eventType != 1) {
            Object obj2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                cd cdVar = (cd) stack.peek();
                if ("path".equals(name)) {
                    cc ccVar = new cc();
                    ccVar.a(resources, attributeSet, theme, xmlPullParser);
                    cdVar.b.add(ccVar);
                    if (ccVar.b() != null) {
                        cfVar.j.put(ccVar.b(), ccVar);
                    }
                    obj2 = null;
                    cgVar.a = ccVar.o | cgVar.a;
                } else if ("clip-path".equals(name)) {
                    cb cbVar = new cb();
                    cbVar.a(resources, attributeSet, theme, xmlPullParser);
                    cdVar.b.add(cbVar);
                    if (cbVar.b() != null) {
                        cfVar.j.put(cbVar.b(), cbVar);
                    }
                    cgVar.a |= cbVar.o;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        cd cdVar2 = new cd();
                        cdVar2.a(resources, attributeSet, theme, xmlPullParser);
                        cdVar.b.add(cdVar2);
                        stack.push(cdVar2);
                        if (cdVar2.a() != null) {
                            cfVar.j.put(cdVar2.a(), cdVar2);
                        }
                        cgVar.a |= cdVar2.d;
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

    void a(boolean z) {
        this.g = false;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
