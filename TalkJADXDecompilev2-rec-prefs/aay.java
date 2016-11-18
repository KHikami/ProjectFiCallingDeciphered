package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class aay extends Spinner implements nv {
    static final boolean f75a;
    private static final boolean f76e;
    private static final int[] f77f = new int[]{16843505};
    abb f78b;
    int f79c;
    final Rect f80d;
    private aac f81g;
    private Context f82h;
    private acm f83i;
    private SpinnerAdapter f84j;
    private boolean f85k;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f75a = z;
        if (VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        f76e = z;
    }

    public aay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.aa);
    }

    public aay(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private aay(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    private aay(Context context, AttributeSet attributeSet, int i, int i2, Theme theme) {
        Context xaVar;
        aay aay;
        abb abb;
        afp a;
        CharSequence[] f;
        SpinnerAdapter arrayAdapter;
        Throwable th;
        TypedArray typedArray = null;
        super(context, attributeSet, i);
        this.f80d = new Rect();
        afp a2 = afp.m927a(context, attributeSet, wi.cw, i, 0);
        this.f81g = new aac(this);
        int g = a2.m943g(wi.cB, 0);
        if (g != 0) {
            xaVar = new xa(context, g);
            aay = this;
        } else if (f75a) {
            xaVar = null;
            aay = this;
        } else {
            xaVar = context;
            aay = this;
        }
        aay.f82h = xaVar;
        if (this.f82h != null) {
            if (i2 == -1) {
                if (VERSION.SDK_INT >= 11) {
                    TypedArray obtainStyledAttributes;
                    try {
                        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f77f, i, 0);
                        try {
                            if (obtainStyledAttributes.hasValue(0)) {
                                i2 = obtainStyledAttributes.getInt(0, 0);
                            }
                            if (obtainStyledAttributes != null) {
                                obtainStyledAttributes.recycle();
                            }
                        } catch (Exception e) {
                            if (obtainStyledAttributes != null) {
                                obtainStyledAttributes.recycle();
                            }
                            if (i2 == 1) {
                                abb = new abb(this, this.f82h, attributeSet, i);
                                a = afp.m927a(this.f82h, attributeSet, wi.cw, i, 0);
                                this.f79c = a.m941f(wi.cx, -2);
                                abb.m147a(a.m930a(wi.cz));
                                abb.m175a(a2.m938d(wi.cA));
                                a.m931a();
                                this.f78b = abb;
                                this.f83i = new aaz(this, this, abb);
                            }
                            f = a2.m942f(wi.cy);
                            if (f != null) {
                                arrayAdapter = new ArrayAdapter(context, 17367048, f);
                                arrayAdapter.setDropDownViewResource(gwb.cc);
                                setAdapter(arrayAdapter);
                            }
                            a2.m931a();
                            this.f85k = true;
                            if (this.f84j != null) {
                                setAdapter(this.f84j);
                                this.f84j = null;
                            }
                            this.f81g.m45a(attributeSet, i);
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            typedArray = obtainStyledAttributes;
                            th = th3;
                            if (typedArray != null) {
                                typedArray.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        obtainStyledAttributes = null;
                        if (obtainStyledAttributes != null) {
                            obtainStyledAttributes.recycle();
                        }
                        if (i2 == 1) {
                            abb = new abb(this, this.f82h, attributeSet, i);
                            a = afp.m927a(this.f82h, attributeSet, wi.cw, i, 0);
                            this.f79c = a.m941f(wi.cx, -2);
                            abb.m147a(a.m930a(wi.cz));
                            abb.m175a(a2.m938d(wi.cA));
                            a.m931a();
                            this.f78b = abb;
                            this.f83i = new aaz(this, this, abb);
                        }
                        f = a2.m942f(wi.cy);
                        if (f != null) {
                            arrayAdapter = new ArrayAdapter(context, 17367048, f);
                            arrayAdapter.setDropDownViewResource(gwb.cc);
                            setAdapter(arrayAdapter);
                        }
                        a2.m931a();
                        this.f85k = true;
                        if (this.f84j != null) {
                            setAdapter(this.f84j);
                            this.f84j = null;
                        }
                        this.f81g.m45a(attributeSet, i);
                    } catch (Throwable th4) {
                        th = th4;
                        if (typedArray != null) {
                            typedArray.recycle();
                        }
                        throw th;
                    }
                }
                i2 = 1;
            }
            if (i2 == 1) {
                abb = new abb(this, this.f82h, attributeSet, i);
                a = afp.m927a(this.f82h, attributeSet, wi.cw, i, 0);
                this.f79c = a.m941f(wi.cx, -2);
                abb.m147a(a.m930a(wi.cz));
                abb.m175a(a2.m938d(wi.cA));
                a.m931a();
                this.f78b = abb;
                this.f83i = new aaz(this, this, abb);
            }
        }
        f = a2.m942f(wi.cy);
        if (f != null) {
            arrayAdapter = new ArrayAdapter(context, 17367048, f);
            arrayAdapter.setDropDownViewResource(gwb.cc);
            setAdapter(arrayAdapter);
        }
        a2.m931a();
        this.f85k = true;
        if (this.f84j != null) {
            setAdapter(this.f84j);
            this.f84j = null;
        }
        this.f81g.m45a(attributeSet, i);
    }

    public Context getPopupContext() {
        if (this.f78b != null) {
            return this.f82h;
        }
        if (f75a) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f78b != null) {
            this.f78b.m147a(drawable);
        } else if (f76e) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(wk.b(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        if (this.f78b != null) {
            return this.f78b.m163h();
        }
        if (f76e) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f78b != null) {
            this.f78b.m156d(i);
        } else if (f76e) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        if (this.f78b != null) {
            return this.f78b.m168k();
        }
        if (f76e) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f78b != null) {
            this.f78b.m155c(i);
        } else if (f76e) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f78b != null) {
            return this.f78b.m167j();
        }
        if (f76e) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.f78b != null) {
            this.f79c = i;
        } else if (f76e) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.f78b != null) {
            return this.f79c;
        }
        if (f76e) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f85k) {
            super.setAdapter(spinnerAdapter);
            if (this.f78b != null) {
                this.f78b.mo15a(new aba(spinnerAdapter, (this.f82h == null ? getContext() : this.f82h).getTheme()));
                return;
            }
            return;
        }
        this.f84j = spinnerAdapter;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f78b != null && this.f78b.m157d()) {
            this.f78b.m154c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f83i == null || !this.f83i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f78b != null && MeasureSpec.getMode(i) == nzf.UNSET_ENUM_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m119a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        if (this.f78b == null) {
            return super.performClick();
        }
        if (!this.f78b.m157d()) {
            this.f78b.mo14a();
        }
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f78b != null) {
            this.f78b.m175a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        return this.f78b != null ? this.f78b.m176b() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f81g != null) {
            this.f81g.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f81g != null) {
            this.f81g.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f81g != null) {
            this.f81g.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f81g != null ? this.f81g.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f81g != null) {
            this.f81g.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f81g != null ? this.f81g.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f81g != null) {
            this.f81g.m48d();
        }
    }

    int m119a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i = 0;
        max = 0;
        while (max2 < min) {
            View view2;
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != max) {
                view2 = null;
            } else {
                itemViewType = max;
                view2 = view;
            }
            view = spinnerAdapter.getView(max2, view2, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
            max2++;
            max = itemViewType;
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.f80d);
        return (this.f80d.left + this.f80d.right) + i;
    }
}
