package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import gn;
import kn;
import oe;
import rk;
import sh;
import si;
import sw;
import sy;
import tm;
import uk;
import wi;
import xm;

/* compiled from: PG */
public class ActionMenuItemView extends wi implements OnClickListener, OnLongClickListener, tm, uk {
    public sy a;
    public sw b;
    public si c;
    private CharSequence d;
    private Drawable e;
    private xm f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.v, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(rk.w, 0);
        obtainStyledAttributes.recycle();
        this.j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.i = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.g = h();
        i();
    }

    private final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int b = gn.b(getResources());
        return b >= 480 || ((b >= 640 && gn.a(getResources()) >= 480) || configuration.orientation == 2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public final sy a() {
        return this.a;
    }

    public final void a(sy syVar, int i) {
        this.a = syVar;
        Drawable icon = syVar.getIcon();
        this.e = icon;
        if (icon != null) {
            float f;
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            if (intrinsicWidth > this.j) {
                f = ((float) this.j) / ((float) intrinsicWidth);
                intrinsicWidth = this.j;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.j) {
                f = ((float) this.j) / ((float) intrinsicHeight);
                intrinsicHeight = this.j;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        i();
        this.d = syVar.a((tm) this);
        setContentDescription(this.d);
        i();
        setId(syVar.getItemId());
        setVisibility(syVar.isVisible() ? 0 : 8);
        setEnabled(syVar.isEnabled());
        if (syVar.hasSubMenu() && this.f == null) {
            this.f = new sh(this);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.hasSubMenu() && this.f != null && this.f.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onClick(View view) {
        if (this.b != null) {
            this.b.a(this.a);
        }
    }

    public final boolean b() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
        r5 = this;
        r1 = 1;
        r2 = 0;
        r0 = r5.d;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0029;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        r3 = r5.e;
        if (r3 == 0) goto L_0x001f;
    L_0x000f:
        r3 = r5.a;
        r3 = r3.c;
        r3 = r3 & 4;
        r4 = 4;
        if (r3 != r4) goto L_0x002b;
    L_0x0018:
        r3 = r1;
    L_0x0019:
        if (r3 == 0) goto L_0x0020;
    L_0x001b:
        r3 = r5.g;
        if (r3 == 0) goto L_0x0020;
    L_0x001f:
        r2 = r1;
    L_0x0020:
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x002d;
    L_0x0023:
        r0 = r5.d;
    L_0x0025:
        r5.setText(r0);
        return;
    L_0x0029:
        r0 = r2;
        goto L_0x000b;
    L_0x002b:
        r3 = r2;
        goto L_0x0019;
    L_0x002d:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ActionMenuItemView.i():void");
    }

    public final boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean f() {
        return e() && this.a.getIcon() == null;
    }

    public final boolean g() {
        return e();
    }

    public boolean onLongClick(View view) {
        if (e()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        width = (width / 2) + iArr[0];
        if (kn.f(view) == 0) {
            width = context.getResources().getDisplayMetrics().widthPixels - width;
        }
        Toast makeText = Toast.makeText(context, this.a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, width, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    protected void onMeasure(int i, int i2) {
        boolean e = e();
        if (e && this.i >= 0) {
            super.setPadding(this.i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == oe.INVALID_ID ? Math.min(size, this.h) : this.h;
        if (mode != 1073741824 && this.h > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!e && this.e != null) {
            super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
