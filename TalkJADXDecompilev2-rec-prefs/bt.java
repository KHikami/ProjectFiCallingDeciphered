package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class bt extends bz implements Animatable {
    final Callback f4354a;
    private bv f4355c;
    private Context f4356d;
    private ArgbEvaluator f4357e;

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

    bt() {
        this(null, null, null);
    }

    public bt(Context context) {
        this(context, null, null);
    }

    private bt(Context context, bv bvVar, Resources resources) {
        this.f4357e = null;
        this.f4354a = new bu(this);
        this.f4356d = context;
        this.f4355c = new bv(null, this.f4354a, null);
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        throw new IllegalStateException("Mutate() is not supported for older platform");
    }

    public ConstantState getConstantState() {
        if (this.b != null) {
            return new bw(this.b.getConstantState());
        }
        return null;
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4355c.f4550a;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f4355c.f4551b.draw(canvas);
        if (m6572a()) {
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f4355c.f4551b.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return this.f4355c.f4551b.setState(iArr);
    }

    protected boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return this.f4355c.f4551b.setLevel(i);
    }

    public int getAlpha() {
        if (this.b != null) {
            return jb.m23753c(this.b);
        }
        return this.f4355c.f4551b.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f4355c.f4551b.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f4355c.f4551b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.b != null) {
            jb.m23744a(this.b, i);
        } else {
            this.f4355c.f4551b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            jb.m23746a(this.b, colorStateList);
        } else {
            this.f4355c.f4551b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            jb.m23749a(this.b, mode);
        } else {
            this.f4355c.f4551b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f4355c.f4551b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return this.f4355c.f4551b.isStateful();
    }

    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return this.f4355c.f4551b.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return this.f4355c.f4551b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return this.f4355c.f4551b.getIntrinsicHeight();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            jb.m23748a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                TypedArray obtainAttributes;
                if ("animated-vector".equals(name)) {
                    int[] iArr = bs.f4304e;
                    if (theme == null) {
                        obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        ca a = ca.m7065a(resources, resourceId, theme);
                        a.m7069a(false);
                        a.setCallback(this.f4354a);
                        if (this.f4355c.f4551b != null) {
                            this.f4355c.f4551b.setCallback(null);
                        }
                        this.f4355c.f4551b = a;
                    }
                    obtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, bs.f4305f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f4356d != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(this.f4356d, resourceId2);
                            loadAnimator.setTarget(this.f4355c.f4551b.m7068a(string));
                            if (VERSION.SDK_INT < 21) {
                                m6571a(loadAnimator);
                            }
                            if (this.f4355c.f4552c == null) {
                                this.f4355c.f4552c = new ArrayList();
                                this.f4355c.f4553d = new ky();
                            }
                            this.f4355c.f4552c.add(loadAnimator);
                            this.f4355c.f4553d.put(loadAnimator, string);
                        } else {
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            jb.m23747a(this.b, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            return jb.m23754d(this.b);
        }
        return false;
    }

    private void m6571a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m6571a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4357e == null) {
                    this.f4357e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4357e);
            }
        }
    }

    public boolean isRunning() {
        if (this.b != null) {
            return ((AnimatedVectorDrawable) this.b).isRunning();
        }
        ArrayList arrayList = this.f4355c.f4552c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Animator) arrayList.get(i)).isRunning()) {
                return true;
            }
        }
        return false;
    }

    private boolean m6572a() {
        ArrayList arrayList = this.f4355c.f4552c;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Animator) arrayList.get(i)).isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!m6572a()) {
            ArrayList arrayList = this.f4355c.f4552c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animator) arrayList.get(i)).start();
            }
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
            return;
        }
        ArrayList arrayList = this.f4355c.f4552c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animator) arrayList.get(i)).end();
        }
    }
}
