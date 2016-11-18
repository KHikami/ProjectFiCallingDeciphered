package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class abi extends FrameLayout {
    private static final int[] f155e = new int[]{16842801};
    private static final abn f156f;
    int f157a;
    int f158b;
    final Rect f159c = new Rect();
    final Rect f160d = new Rect();
    private boolean f161g;
    private boolean f162h;
    private final abk f163i = new abk(this);

    static {
        if (VERSION.SDK_INT >= 21) {
            f156f = new abj();
        } else if (VERSION.SDK_INT >= 17) {
            f156f = new abo();
        } else {
            f156f = new abl();
        }
        f156f.mo19a();
    }

    public abi(Context context) {
        super(context);
        m193a(context, null, 0);
    }

    public abi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m193a(context, attributeSet, 0);
    }

    public abi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m193a(context, attributeSet, i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public boolean m195a() {
        return this.f161g;
    }

    protected void onMeasure(int i, int i2) {
        if (f156f instanceof abj) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
            case 1073741824:
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f156f.mo18a(this.f163i)), MeasureSpec.getSize(i)), mode);
                break;
        }
        mode = MeasureSpec.getMode(i2);
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
            case 1073741824:
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f156f.mo21b(this.f163i)), MeasureSpec.getSize(i2)), mode);
                break;
        }
        super.onMeasure(i, i2);
    }

    private void m193a(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wj.t, i, gwb.co);
        if (obtainStyledAttributes.hasValue(wj.w)) {
            colorStateList = obtainStyledAttributes.getColorStateList(wj.w);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f155e);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(gwb.ck);
            } else {
                color = getResources().getColor(gwb.cj);
            }
            colorStateList = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(wj.x, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(wj.y, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(wj.z, 0.0f);
        this.f161g = obtainStyledAttributes.getBoolean(wj.B, false);
        this.f162h = obtainStyledAttributes.getBoolean(wj.A, true);
        color = obtainStyledAttributes.getDimensionPixelSize(wj.C, 0);
        this.f159c.left = obtainStyledAttributes.getDimensionPixelSize(wj.E, color);
        this.f159c.top = obtainStyledAttributes.getDimensionPixelSize(wj.G, color);
        this.f159c.right = obtainStyledAttributes.getDimensionPixelSize(wj.F, color);
        this.f159c.bottom = obtainStyledAttributes.getDimensionPixelSize(wj.D, color);
        if (dimension2 > dimension3) {
            dimension3 = dimension2;
        }
        this.f157a = obtainStyledAttributes.getDimensionPixelSize(wj.v, 0);
        this.f158b = obtainStyledAttributes.getDimensionPixelSize(wj.u, 0);
        obtainStyledAttributes.recycle();
        f156f.mo20a(this.f163i, context, colorStateList, dimension, dimension2, dimension3);
    }

    public void setMinimumWidth(int i) {
        this.f157a = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.f158b = i;
        super.setMinimumHeight(i);
    }

    public boolean m196b() {
        return this.f162h;
    }
}
