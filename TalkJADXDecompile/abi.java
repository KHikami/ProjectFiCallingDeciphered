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
    private static final int[] e;
    private static final abn f;
    int a;
    int b;
    final Rect c;
    final Rect d;
    private boolean g;
    private boolean h;
    private final abk i;

    static {
        e = new int[]{16842801};
        if (VERSION.SDK_INT >= 21) {
            f = new abj();
        } else if (VERSION.SDK_INT >= 17) {
            f = new abo();
        } else {
            f = new abl();
        }
        f.a();
    }

    public abi(Context context) {
        super(context);
        this.c = new Rect();
        this.d = new Rect();
        this.i = new abk(this);
        a(context, null, 0);
    }

    public abi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.i = new abk(this);
        a(context, attributeSet, 0);
    }

    public abi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = new Rect();
        this.i = new abk(this);
        a(context, attributeSet, i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public boolean a() {
        return this.g;
    }

    protected void onMeasure(int i, int i2) {
        if (f instanceof abj) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
            case 1073741824:
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f.a(this.i)), MeasureSpec.getSize(i)), mode);
                break;
        }
        mode = MeasureSpec.getMode(i2);
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
            case 1073741824:
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f.b(this.i)), MeasureSpec.getSize(i2)), mode);
                break;
        }
        super.onMeasure(i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wj.t, i, gwb.co);
        if (obtainStyledAttributes.hasValue(wj.w)) {
            colorStateList = obtainStyledAttributes.getColorStateList(wj.w);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(e);
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
        this.g = obtainStyledAttributes.getBoolean(wj.B, false);
        this.h = obtainStyledAttributes.getBoolean(wj.A, true);
        color = obtainStyledAttributes.getDimensionPixelSize(wj.C, 0);
        this.c.left = obtainStyledAttributes.getDimensionPixelSize(wj.E, color);
        this.c.top = obtainStyledAttributes.getDimensionPixelSize(wj.G, color);
        this.c.right = obtainStyledAttributes.getDimensionPixelSize(wj.F, color);
        this.c.bottom = obtainStyledAttributes.getDimensionPixelSize(wj.D, color);
        if (dimension2 > dimension3) {
            dimension3 = dimension2;
        }
        this.a = obtainStyledAttributes.getDimensionPixelSize(wj.v, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(wj.u, 0);
        obtainStyledAttributes.recycle();
        f.a(this.i, context, colorStateList, dimension, dimension2, dimension3);
    }

    public void setMinimumWidth(int i) {
        this.a = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.b = i;
        super.setMinimumHeight(i);
    }

    public boolean b() {
        return this.h;
    }
}
