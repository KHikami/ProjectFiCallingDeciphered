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

/* compiled from: PG */
public final class vz extends Spinner implements ki {
    static final boolean a;
    private static final boolean e;
    private static final int[] f;
    wc b;
    int c;
    final Rect d;
    private vi g;
    private vd h;
    private Context i;
    private xm j;
    private SpinnerAdapter k;
    private boolean l;

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

    public vz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.X);
    }

    public vz(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private vz(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    private vz(Context context, AttributeSet attributeSet, int i, int i2, Theme theme) {
        Context rwVar;
        vz vzVar;
        TypedArray obtainStyledAttributes;
        wc wcVar;
        aah a;
        CharSequence[] textArray;
        SpinnerAdapter arrayAdapter;
        Throwable th;
        TypedArray typedArray = null;
        super(context, attributeSet, i);
        this.d = new Rect();
        aah a2 = aah.a(context, attributeSet, rk.bq, i, 0);
        this.g = vi.a();
        this.h = new vd(this, this.g);
        int g = a2.g(rk.bv, 0);
        if (g != 0) {
            rwVar = new rw(context, g);
            vzVar = this;
        } else if (a) {
            rwVar = null;
            vzVar = this;
        } else {
            rwVar = context;
            vzVar = this;
        }
        vzVar.i = rwVar;
        if (this.i != null) {
            if (i2 == -1) {
                if (VERSION.SDK_INT >= 11) {
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
                                wcVar = new wc(this, this.i, attributeSet, i);
                                a = aah.a(this.i, attributeSet, rk.bq, i, 0);
                                this.c = a.f(rk.br, -2);
                                wcVar.a(a.a(rk.bt));
                                wcVar.a = a2.a.getString(rk.bu);
                                a.a.recycle();
                                this.b = wcVar;
                                this.j = new wa(this, this, wcVar);
                            }
                            textArray = a2.a.getTextArray(rk.bs);
                            if (textArray != null) {
                                arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                                arrayAdapter.setDropDownViewResource(buf.bZ);
                                setAdapter(arrayAdapter);
                            }
                            a2.a.recycle();
                            this.l = true;
                            if (this.k != null) {
                                setAdapter(this.k);
                                this.k = null;
                            }
                            this.h.a(attributeSet, i);
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
                            wcVar = new wc(this, this.i, attributeSet, i);
                            a = aah.a(this.i, attributeSet, rk.bq, i, 0);
                            this.c = a.f(rk.br, -2);
                            wcVar.a(a.a(rk.bt));
                            wcVar.a = a2.a.getString(rk.bu);
                            a.a.recycle();
                            this.b = wcVar;
                            this.j = new wa(this, this, wcVar);
                        }
                        textArray = a2.a.getTextArray(rk.bs);
                        if (textArray != null) {
                            arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                            arrayAdapter.setDropDownViewResource(buf.bZ);
                            setAdapter(arrayAdapter);
                        }
                        a2.a.recycle();
                        this.l = true;
                        if (this.k != null) {
                            setAdapter(this.k);
                            this.k = null;
                        }
                        this.h.a(attributeSet, i);
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
                wcVar = new wc(this, this.i, attributeSet, i);
                a = aah.a(this.i, attributeSet, rk.bq, i, 0);
                this.c = a.f(rk.br, -2);
                wcVar.a(a.a(rk.bt));
                wcVar.a = a2.a.getString(rk.bu);
                a.a.recycle();
                this.b = wcVar;
                this.j = new wa(this, this, wcVar);
            }
        }
        textArray = a2.a.getTextArray(rk.bs);
        if (textArray != null) {
            arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(buf.bZ);
            setAdapter(arrayAdapter);
        }
        a2.a.recycle();
        this.l = true;
        if (this.k != null) {
            setAdapter(this.k);
            this.k = null;
        }
        this.h.a(attributeSet, i);
    }

    public final Context getPopupContext() {
        if (this.b != null) {
            return this.i;
        }
        if (a) {
            return super.getPopupContext();
        }
        return null;
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.b != null) {
            this.b.a(drawable);
        } else if (e) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(gd.a(getPopupContext(), i));
    }

    public final Drawable getPopupBackground() {
        if (this.b != null) {
            return this.b.q.getBackground();
        }
        if (e) {
            return super.getPopupBackground();
        }
        return null;
    }

    public final void setDropDownVerticalOffset(int i) {
        if (this.b != null) {
            this.b.a(i);
        } else if (e) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public final int getDropDownVerticalOffset() {
        if (this.b != null) {
            return this.b.f();
        }
        if (e) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public final void setDropDownHorizontalOffset(int i) {
        if (this.b != null) {
            this.b.g = i;
        } else if (e) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public final int getDropDownHorizontalOffset() {
        if (this.b != null) {
            return this.b.g;
        }
        if (e) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else if (e) {
            super.setDropDownWidth(i);
        }
    }

    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        if (e) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.l) {
            super.setAdapter(spinnerAdapter);
            if (this.b != null) {
                this.b.a(new wb(spinnerAdapter, (this.i == null ? getContext() : this.i).getTheme()));
                return;
            }
            return;
        }
        this.k = spinnerAdapter;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null && this.b.q.isShowing()) {
            this.b.c();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j == null || !this.j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b != null && MeasureSpec.getMode(i) == oe.INVALID_ID) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final boolean performClick() {
        if (this.b == null) {
            return super.performClick();
        }
        if (!this.b.q.isShowing()) {
            this.b.b();
        }
        return true;
    }

    public final void setPrompt(CharSequence charSequence) {
        if (this.b != null) {
            this.b.a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public final CharSequence getPrompt() {
        if (this.b != null) {
            return this.b.a;
        }
        return super.getPrompt();
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.h != null) {
            this.h.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.h != null) {
            this.h.b(null);
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.h != null) {
            this.h.a(colorStateList);
        }
    }

    public final ColorStateList c() {
        return this.h != null ? this.h.a() : null;
    }

    public final void a(Mode mode) {
        if (this.h != null) {
            this.h.a(mode);
        }
    }

    public final Mode d() {
        return this.h != null ? this.h.b() : null;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            this.h.c();
        }
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
