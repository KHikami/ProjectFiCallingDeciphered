package android.support.v7.view.menu;

import abh;
import acm;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import ix;
import nzf;
import oa;
import wi;
import xl;
import xm;
import ya;
import yc;
import yq;
import zo;

public class ActionMenuItemView extends abh implements OnClickListener, OnLongClickListener, yq, zo {
    public yc a;
    public ya b;
    public xm c;
    private CharSequence d;
    private Drawable e;
    private acm f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.v, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(wi.w, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = h();
        i();
    }

    private boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int b = ix.b(getResources());
        return b >= 480 || ((b >= 640 && ix.a(getResources()) >= 480) || configuration.orientation == 2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public yc a() {
        return this.a;
    }

    public void a(yc ycVar, int i) {
        this.a = ycVar;
        a(ycVar.getIcon());
        a(ycVar.a(this));
        setId(ycVar.getItemId());
        setVisibility(ycVar.isVisible() ? 0 : 8);
        setEnabled(ycVar.isEnabled());
        if (ycVar.hasSubMenu() && this.f == null) {
            this.f = new xl(this);
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

    public void a(ya yaVar) {
        this.b = yaVar;
    }

    public void a(xm xmVar) {
        this.c = xmVar;
    }

    public boolean b() {
        return true;
    }

    private void i() {
        int i = 0;
        int i2 = !TextUtils.isEmpty(this.d) ? 1 : 0;
        if (this.e == null || (this.a.l() && (this.g || this.h))) {
            i = 1;
        }
        setText((i2 & i) != 0 ? this.d : null);
    }

    public void a(Drawable drawable) {
        this.e = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                f = ((float) this.k) / ((float) intrinsicWidth);
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.k) {
                f = ((float) this.k) / ((float) intrinsicHeight);
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    public void a(CharSequence charSequence) {
        this.d = charSequence;
        setContentDescription(this.d);
        i();
    }

    public boolean f() {
        return e() && this.a.getIcon() == null;
    }

    public boolean g() {
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
        if (oa.d(view) == 0) {
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
        if (e && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == nzf.UNSET_ENUM_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < size) {
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
