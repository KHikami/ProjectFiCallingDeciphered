package android.support.v7.widget;

import aaa;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import buf;
import gn;
import oe;
import rl;
import rv;
import vc;
import xp;
import zx;
import zy;

/* compiled from: PG */
public final class SearchView extends xp implements rv {
    static final zx a;
    private static final boolean b;
    private aaa c;
    private boolean d;
    private boolean e;
    private CharSequence h;
    private boolean i;
    private int j;

    /* compiled from: PG */
    public class SearchAutoComplete extends vc {
        private int a;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, buf.E);
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
            int b = gn.b(getResources());
            int a = gn.a(getResources());
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
            if (z) {
                SearchView searchView = null;
                if (searchView.hasFocus() && getVisibility() == 0) {
                    ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                    if (SearchView.a(getContext())) {
                        zx zxVar = SearchView.a;
                        if (zxVar.c != null) {
                            try {
                                zxVar.c.invoke(this, new Object[]{Boolean.valueOf(true)});
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = null;
            searchView.c();
        }

        public boolean enoughToFilter() {
            return this.a <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            SearchView searchView = null;
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
                        searchView.clearFocus();
                        searchView.a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 8) {
            z = true;
        } else {
            z = false;
        }
        b = z;
        a = new zx();
    }

    public final boolean requestFocus(int i, Rect rect) {
        if (this.e || !isFocusable()) {
            return false;
        }
        if (this.d) {
            return super.requestFocus(i, rect);
        }
        SearchAutoComplete searchAutoComplete = null;
        boolean requestFocus = searchAutoComplete.requestFocus(i, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public final void clearFocus() {
        this.e = true;
        a(false);
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = null;
        searchAutoComplete.clearFocus();
        this.e = false;
    }

    protected final void onMeasure(int i, int i2) {
        if (this.d) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case oe.INVALID_ID /*-2147483648*/:
                size = Math.min(e(), size);
                break;
            case rl.c /*0*/:
                size = e();
                break;
        }
        int mode2 = MeasureSpec.getMode(i2);
        mode = MeasureSpec.getSize(i2);
        switch (mode2) {
            case oe.INVALID_ID /*-2147483648*/:
            case rl.c /*0*/:
                mode = Math.min(getContext().getResources().getDimensionPixelSize(buf.ao), mode);
                break;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(mode, 1073741824));
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = null;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            rect.getLocationInWindow(rect);
            getLocationInWindow(rect);
            int i5 = rect[1] - rect[1];
            int i6 = rect[0] - rect[0];
            rect.set(i6, i5, rect.getWidth() + i6, rect.getHeight() + i5);
            rect.set(rect.left, 0, rect.right, i4 - i2);
            if (this.c == null) {
                this.c = new aaa(rect, rect, rect);
                setTouchDelegate(this.c);
                return;
            }
            this.c.a(rect, rect);
        }
    }

    private final int e() {
        return getContext().getResources().getDimensionPixelSize(buf.ap);
    }

    private final void b(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        View view = null;
        this.d = z;
        int i4 = z ? 0 : 8;
        if (TextUtils.isEmpty(view.getText())) {
            i = 0;
        } else {
            i = 1;
        }
        view.setVisibility(i4);
        view.setVisibility(8);
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        view.setVisibility(i4);
        if (view.getDrawable() == null) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        view.setVisibility(i4);
        i4 = !TextUtils.isEmpty(view.getText()) ? 1 : 0;
        if (i4 == 0) {
            i2 = 0;
        }
        if (i2 == 0) {
            i3 = 8;
        }
        view.setVisibility(i3);
        Drawable drawable = view.getDrawable();
        if (drawable != null) {
            int[] iArr;
            if (i4 != 0) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
        if (i == 0) {
            view.setVisibility(8);
            view.setVisibility(8);
        } else {
            view.setVisibility(8);
            view.setVisibility(8);
        }
    }

    protected final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    final void a(boolean z) {
        if (z) {
            post(null);
            return;
        }
        removeCallbacks(null);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    final void c() {
        AutoCompleteTextView autoCompleteTextView = null;
        b(this.d);
        post(autoCompleteTextView);
        if (autoCompleteTextView.hasFocus()) {
            a.a(autoCompleteTextView);
            a.b(autoCompleteTextView);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(null);
    }

    public final void b() {
        SearchAutoComplete searchAutoComplete = null;
        CharSequence charSequence = "";
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.h = charSequence;
        clearFocus();
        b(true);
        searchAutoComplete.setImeOptions(this.j);
        this.i = false;
    }

    public final void a() {
        SearchAutoComplete searchAutoComplete = null;
        if (!this.i) {
            this.i = true;
            this.j = searchAutoComplete.getImeOptions();
            searchAutoComplete.setImeOptions(this.j | 33554432);
            searchAutoComplete.setText("");
            b(false);
            searchAutoComplete.requestFocus();
            a(true);
        }
    }

    protected final Parcelable onSaveInstanceState() {
        Parcelable zyVar = new zy(super.onSaveInstanceState());
        zyVar.a = this.d;
        return zyVar;
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof zy) {
            zy zyVar = (zy) parcelable;
            super.onRestoreInstanceState(zyVar.e);
            b(zyVar.a);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
