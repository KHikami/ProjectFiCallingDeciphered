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
    static final boolean a;
    private static final boolean e;
    private static final int[] f;
    abb b;
    int c;
    final Rect d;
    private aac g;
    private Context h;
    private acm i;
    private SpinnerAdapter j;
    private boolean k;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        if (VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        e = z;
        f = new int[]{16843505};
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
        this.d = new Rect();
        afp a2 = afp.a(context, attributeSet, wi.cw, i, 0);
        this.g = new aac(this);
        int g = a2.g(wi.cB, 0);
        if (g != 0) {
            xaVar = new xa(context, g);
            aay = this;
        } else if (a) {
            xaVar = null;
            aay = this;
        } else {
            xaVar = context;
            aay = this;
        }
        aay.h = xaVar;
        if (this.h != null) {
            if (i2 == -1) {
                if (VERSION.SDK_INT >= 11) {
                    TypedArray obtainStyledAttributes;
                    try {
                        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f, i, 0);
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
                                abb = new abb(this, this.h, attributeSet, i);
                                a = afp.a(this.h, attributeSet, wi.cw, i, 0);
                                this.c = a.f(wi.cx, -2);
                                abb.a(a.a(wi.cz));
                                abb.a(a2.d(wi.cA));
                                a.a();
                                this.b = abb;
                                this.i = new aaz(this, this, abb);
                            }
                            f = a2.f(wi.cy);
                            if (f != null) {
                                arrayAdapter = new ArrayAdapter(context, 17367048, f);
                                arrayAdapter.setDropDownViewResource(gwb.cc);
                                setAdapter(arrayAdapter);
                            }
                            a2.a();
                            this.k = true;
                            if (this.j != null) {
                                setAdapter(this.j);
                                this.j = null;
                            }
                            this.g.a(attributeSet, i);
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
                            abb = new abb(this, this.h, attributeSet, i);
                            a = afp.a(this.h, attributeSet, wi.cw, i, 0);
                            this.c = a.f(wi.cx, -2);
                            abb.a(a.a(wi.cz));
                            abb.a(a2.d(wi.cA));
                            a.a();
                            this.b = abb;
                            this.i = new aaz(this, this, abb);
                        }
                        f = a2.f(wi.cy);
                        if (f != null) {
                            arrayAdapter = new ArrayAdapter(context, 17367048, f);
                            arrayAdapter.setDropDownViewResource(gwb.cc);
                            setAdapter(arrayAdapter);
                        }
                        a2.a();
                        this.k = true;
                        if (this.j != null) {
                            setAdapter(this.j);
                            this.j = null;
                        }
                        this.g.a(attributeSet, i);
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
                abb = new abb(this, this.h, attributeSet, i);
                a = afp.a(this.h, attributeSet, wi.cw, i, 0);
                this.c = a.f(wi.cx, -2);
                abb.a(a.a(wi.cz));
                abb.a(a2.d(wi.cA));
                a.a();
                this.b = abb;
                this.i = new aaz(this, this, abb);
            }
        }
        f = a2.f(wi.cy);
        if (f != null) {
            arrayAdapter = new ArrayAdapter(context, 17367048, f);
            arrayAdapter.setDropDownViewResource(gwb.cc);
            setAdapter(arrayAdapter);
        }
        a2.a();
        this.k = true;
        if (this.j != null) {
            setAdapter(this.j);
            this.j = null;
        }
        this.g.a(attributeSet, i);
    }

    public Context getPopupContext() {
        if (this.b != null) {
            return this.h;
        }
        if (a) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.b != null) {
            this.b.a(drawable);
        } else if (e) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(wk.b(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        if (this.b != null) {
            return this.b.h();
        }
        if (e) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.b != null) {
            this.b.d(i);
        } else if (e) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        if (this.b != null) {
            return this.b.k();
        }
        if (e) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.b != null) {
            this.b.c(i);
        } else if (e) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.b != null) {
            return this.b.j();
        }
        if (e) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else if (e) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        if (e) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.k) {
            super.setAdapter(spinnerAdapter);
            if (this.b != null) {
                this.b.a(new aba(spinnerAdapter, (this.h == null ? getContext() : this.h).getTheme()));
                return;
            }
            return;
        }
        this.j = spinnerAdapter;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null && this.b.d()) {
            this.b.c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i == null || !this.i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b != null && MeasureSpec.getMode(i) == nzf.UNSET_ENUM_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        if (this.b == null) {
            return super.performClick();
        }
        if (!this.b.d()) {
            this.b.a();
        }
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.b != null) {
            this.b.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        return this.b != null ? this.b.b() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.g != null) {
            this.g.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.g != null) {
            this.g.a();
        }
    }

    public void a(ColorStateList colorStateList) {
        if (this.g != null) {
            this.g.a(colorStateList);
        }
    }

    public ColorStateList c() {
        return this.g != null ? this.g.b() : null;
    }

    public void a(Mode mode) {
        if (this.g != null) {
            this.g.a(mode);
        }
    }

    public Mode d() {
        return this.g != null ? this.g.c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.g != null) {
            this.g.d();
        }
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        drawable.getPadding(this.d);
        return (this.d.left + this.d.right) + i;
    }
}
