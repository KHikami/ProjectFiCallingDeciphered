package android.support.v7.widget;

import aab;
import acv;
import afe;
import aff;
import afh;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import gwb;
import ix;
import nzf;
import wi;
import wz;

public final class SearchView extends acv implements wz {
    static final afe a;
    private Runnable A;
    private final SearchAutoComplete b;
    private final View c;
    private final View d;
    private final ImageView e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private afh i;
    private Rect j;
    private Rect k;
    private int[] l;
    private int[] m;
    private final ImageView n;
    private OnClickListener o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private CharSequence v;
    private boolean w;
    private int x;
    private Runnable y;
    private final Runnable z;

    public class SearchAutoComplete extends aab {
        private int a;
        private SearchView b;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, gwb.F);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.a = getThreshold();
        }

        protected void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int b = ix.b(getResources());
            int a = ix.a(getResources());
            if (b >= 960 && a >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (b >= 600 || (b >= 640 && a >= 480)) {
                i = 192;
            } else {
                i = 160;
            }
            setMinWidth((int) TypedValue.applyDimension(1, (float) i, displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.a = i;
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.b.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.a(getContext())) {
                    SearchView.a.a(this, true);
                }
            }
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.b.c();
        }

        public boolean enoughToFilter() {
            return this.a <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.b.clearFocus();
                        this.b.a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    static {
        a = new afe();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.s || !isFocusable()) {
            return false;
        }
        if (d()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.b.requestFocus(i, rect);
        if (requestFocus) {
            d(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.s = true;
        a(false);
        super.clearFocus();
        this.b.clearFocus();
        this.s = false;
    }

    private void a(CharSequence charSequence, boolean z) {
        this.b.setText(charSequence);
        this.b.setSelection(this.b.length());
        this.v = charSequence;
    }

    private boolean d() {
        return this.q;
    }

    protected void onMeasure(int i, int i2) {
        if (d()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                if (this.t <= 0) {
                    size = Math.min(e(), size);
                    break;
                } else {
                    size = Math.min(this.t, size);
                    break;
                }
            case wi.w /*0*/:
                if (this.t <= 0) {
                    size = e();
                    break;
                } else {
                    size = this.t;
                    break;
                }
            case 1073741824:
                if (this.t > 0) {
                    size = Math.min(this.t, size);
                    break;
                }
                break;
        }
        int mode2 = MeasureSpec.getMode(i2);
        mode = MeasureSpec.getSize(i2);
        switch (mode2) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
            case wi.w /*0*/:
                mode = Math.min(getContext().getResources().getDimensionPixelSize(gwb.as), mode);
                break;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(mode, 1073741824));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            View view = this.b;
            Rect rect = this.j;
            view.getLocationInWindow(this.l);
            getLocationInWindow(this.m);
            int i5 = this.l[1] - this.m[1];
            int i6 = this.l[0] - this.m[0];
            rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
            this.k.set(this.j.left, 0, this.j.right, i4 - i2);
            if (this.i == null) {
                this.i = new afh(this.k, this.j, this.b);
                setTouchDelegate(this.i);
                return;
            }
            this.i.a(this.k, this.j);
        }
    }

    private int e() {
        return getContext().getResources().getDimensionPixelSize(gwb.at);
    }

    private void d(boolean z) {
        Object obj;
        Object obj2;
        Object obj3 = 1;
        int i = 8;
        this.q = z;
        int i2 = z ? 0 : 8;
        if (TextUtils.isEmpty(this.b.getText())) {
            obj = null;
        } else {
            obj = 1;
        }
        this.e.setVisibility(i2);
        if (this.r && f() && hasFocus() && (obj != null || !this.u)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.f.setVisibility(i2);
        View view = this.c;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.n.getDrawable() == null || this.p) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.n.setVisibility(i2);
        Object obj4 = !TextUtils.isEmpty(this.b.getText()) ? 1 : null;
        if (obj4 != null || (this.p && !this.w)) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        ImageView imageView = this.g;
        if (obj2 != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.g.getDrawable();
        if (drawable != null) {
            int[] iArr;
            if (obj4 != null) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
        if (obj != null) {
            obj3 = null;
        }
        if (!this.u || d() || r4 == null) {
            i2 = 8;
        } else {
            this.f.setVisibility(8);
            i2 = 0;
        }
        this.h.setVisibility(i2);
        if (f() && (this.f.getVisibility() == 0 || this.h.getVisibility() == 0)) {
            i = 0;
        }
        this.d.setVisibility(i);
    }

    private boolean f() {
        return (this.r || this.u) && !d();
    }

    private void g() {
        post(this.z);
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.z);
        post(this.A);
        super.onDetachedFromWindow();
    }

    void a(boolean z) {
        if (z) {
            post(this.y);
            return;
        }
        removeCallbacks(this.y);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    void c() {
        d(d());
        g();
        if (this.b.hasFocus()) {
            a.a(this.b);
            a.b(this.b);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        g();
    }

    public void b() {
        a("", false);
        clearFocus();
        d(true);
        this.b.setImeOptions(this.x);
        this.w = false;
    }

    public void a() {
        if (!this.w) {
            this.w = true;
            this.x = this.b.getImeOptions();
            this.b.setImeOptions(this.x | 33554432);
            this.b.setText("");
            b(false);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable aff = new aff(super.onSaveInstanceState());
        aff.a = d();
        return aff;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof aff) {
            aff aff = (aff) parcelable;
            super.onRestoreInstanceState(aff.e);
            d(aff.a);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void b(boolean z) {
        d(false);
        this.b.requestFocus();
        a(true);
        if (this.o != null) {
            this.o.onClick(this);
        }
    }
}
