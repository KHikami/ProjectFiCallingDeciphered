package p000;

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
    static final Mode f4883a = Mode.SRC_IN;
    private cg f4884c;
    private PorterDuffColorFilter f4885d;
    private ColorFilter f4886e;
    private boolean f4887f;
    private boolean f4888g;
    private ConstantState f4889h;
    private final float[] f4890i;
    private final Matrix f4891j;
    private final Rect f4892k;

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

    ca() {
        this.f4888g = true;
        this.f4890i = new float[9];
        this.f4891j = new Matrix();
        this.f4892k = new Rect();
        this.f4884c = new cg();
    }

    ca(cg cgVar) {
        this.f4888g = true;
        this.f4890i = new float[9];
        this.f4891j = new Matrix();
        this.f4892k = new Rect();
        this.f4884c = cgVar;
        this.f4885d = m7064a(cgVar.f5219c, cgVar.f5220d);
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.f4887f && super.mutate() == this) {
            this.f4884c = new cg(this.f4884c);
            this.f4887f = true;
        }
        return this;
    }

    Object m7068a(String str) {
        return this.f4884c.f5218b.f5154j.get(str);
    }

    public ConstantState getConstantState() {
        if (this.b != null) {
            return new ch(this.b.getConstantState());
        }
        this.f4884c.f5217a = getChangingConfigurations();
        return this.f4884c;
    }

    public void draw(Canvas canvas) {
        float f = 1.0f;
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.f4892k);
        if (this.f4892k.width() > 0 && this.f4892k.height() > 0) {
            ColorFilter colorFilter = this.f4886e == null ? this.f4885d : this.f4886e;
            canvas.getMatrix(this.f4891j);
            this.f4891j.getValues(this.f4890i);
            float abs = Math.abs(this.f4890i[0]);
            float abs2 = Math.abs(this.f4890i[4]);
            float abs3 = Math.abs(this.f4890i[1]);
            float abs4 = Math.abs(this.f4890i[3]);
            if (abs3 == 0.0f && abs4 == 0.0f) {
                f = abs;
            } else {
                abs2 = 1.0f;
            }
            int height = (int) (abs2 * ((float) this.f4892k.height()));
            int min = Math.min(2048, (int) (f * ((float) this.f4892k.width())));
            height = Math.min(2048, height);
            if (min > 0 && height > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f4892k.left, (float) this.f4892k.top);
                this.f4892k.offsetTo(0, 0);
                this.f4884c.m7506b(min, height);
                if (!this.f4888g) {
                    this.f4884c.m7502a(min, height);
                } else if (!this.f4884c.m7504a()) {
                    this.f4884c.m7502a(min, height);
                    this.f4884c.m7505b();
                }
                this.f4884c.m7503a(canvas, colorFilter, this.f4892k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.b != null) {
            return jb.m23753c(this.b);
        }
        return this.f4884c.f5218b.m7479a();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.f4884c.f5218b.m7479a() != i) {
            this.f4884c.f5218b.m7481a(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f4886e = colorFilter;
        invalidateSelf();
    }

    private PorterDuffColorFilter m7064a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.b != null) {
            jb.m23744a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            jb.m23746a(this.b, colorStateList);
            return;
        }
        cg cgVar = this.f4884c;
        if (cgVar.f5219c != colorStateList) {
            cgVar.f5219c = colorStateList;
            this.f4885d = m7064a(colorStateList, cgVar.f5220d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            jb.m23749a(this.b, mode);
            return;
        }
        cg cgVar = this.f4884c;
        if (cgVar.f5220d != mode) {
            cgVar.f5220d = mode;
            this.f4885d = m7064a(cgVar.f5219c, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return super.isStateful() || !(this.f4884c == null || this.f4884c.f5219c == null || !this.f4884c.f5219c.isStateful());
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        cg cgVar = this.f4884c;
        if (cgVar.f5219c == null || cgVar.f5220d == null) {
            return false;
        }
        this.f4885d = m7064a(cgVar.f5219c, cgVar.f5220d);
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
        return (int) this.f4884c.f5218b.f5148d;
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.f4884c.f5218b.f5149e;
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            jb.m23754d(this.b);
        }
        return false;
    }

    public static ca m7065a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            ca caVar = new ca();
            caVar.b = gwb.m1570a(resources, i, theme);
            caVar.f4889h = new ch(caVar.b.getConstantState());
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
                return ca.m7066a(resources, xml, asAttributeSet, theme);
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

    public static ca m7066a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        ca caVar = new ca();
        caVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return caVar;
    }

    static int m7063a(int i, float f) {
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
            jb.m23748a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        cg cgVar = this.f4884c;
        cgVar.f5218b = new cf();
        TypedArray a = bz.m6570a(resources, theme, attributeSet, bs.f4300a);
        cg cgVar2 = this.f4884c;
        cf cfVar = cgVar2.f5218b;
        int a2 = gwb.m1496a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (a2) {
            case 3:
                mode = Mode.SRC_OVER;
                break;
            case 5:
                mode = Mode.SRC_IN;
                break;
            case 9:
                mode = Mode.SRC_ATOP;
                break;
            case 14:
                mode = Mode.MULTIPLY;
                break;
            case 15:
                mode = Mode.SCREEN;
                break;
            case 16:
                mode = Mode.ADD;
                break;
        }
        cgVar2.f5220d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            cgVar2.f5219c = colorStateList;
        }
        cgVar2.f5221e = gwb.m1907a(a, xmlPullParser, "autoMirrored", 5, cgVar2.f5221e);
        cfVar.f5150f = gwb.m1476a(a, xmlPullParser, "viewportWidth", 7, cfVar.f5150f);
        cfVar.f5151g = gwb.m1476a(a, xmlPullParser, "viewportHeight", 8, cfVar.f5151g);
        if (cfVar.f5150f <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (cfVar.f5151g <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            cfVar.f5148d = a.getDimension(3, cfVar.f5148d);
            cfVar.f5149e = a.getDimension(2, cfVar.f5149e);
            if (cfVar.f5148d <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (cfVar.f5149e <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                cfVar.m7480a(gwb.m1476a(a, xmlPullParser, "alpha", 4, cfVar.m7483b()));
                String string = a.getString(0);
                if (string != null) {
                    cfVar.f5153i = string;
                    cfVar.f5154j.put(string, cfVar);
                }
                a.recycle();
                cgVar.f5217a = getChangingConfigurations();
                cgVar.f5227k = true;
                m7067b(resources, xmlPullParser, attributeSet, theme);
                this.f4885d = m7064a(cgVar.f5219c, cgVar.f5220d);
            }
        }
    }

    private void m7067b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        cg cgVar = this.f4884c;
        cf cfVar = cgVar.f5218b;
        Stack stack = new Stack();
        stack.push(cfVar.f5147c);
        int eventType = xmlPullParser.getEventType();
        Object obj = 1;
        while (eventType != 1) {
            Object obj2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                cd cdVar = (cd) stack.peek();
                if ("path".equals(name)) {
                    cc ccVar = new cc();
                    ccVar.m7175a(resources, attributeSet, theme, xmlPullParser);
                    cdVar.f5039b.add(ccVar);
                    if (ccVar.m7132b() != null) {
                        cfVar.f5154j.put(ccVar.m7132b(), ccVar);
                    }
                    obj2 = null;
                    cgVar.f5217a = ccVar.o | cgVar.f5217a;
                } else if ("clip-path".equals(name)) {
                    cb cbVar = new cb();
                    cbVar.m7133a(resources, attributeSet, theme, xmlPullParser);
                    cdVar.f5039b.add(cbVar);
                    if (cbVar.m7132b() != null) {
                        cfVar.f5154j.put(cbVar.m7132b(), cbVar);
                    }
                    cgVar.f5217a |= cbVar.o;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        cd cdVar2 = new cd();
                        cdVar2.m7249a(resources, attributeSet, theme, xmlPullParser);
                        cdVar.f5039b.add(cdVar2);
                        stack.push(cdVar2);
                        if (cdVar2.m7248a() != null) {
                            cfVar.f5154j.put(cdVar2.m7248a(), cdVar2);
                        }
                        cgVar.f5217a |= cdVar2.f5041d;
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

    void m7069a(boolean z) {
        this.f4888g = false;
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
        return super.getChangingConfigurations() | this.f4884c.getChangingConfigurations();
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
