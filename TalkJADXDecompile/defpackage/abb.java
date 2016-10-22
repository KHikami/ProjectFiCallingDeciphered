package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: abb */
final class abb extends add {
    ListAdapter a;
    final Rect b;
    final /* synthetic */ aay c;
    private CharSequence i;

    public abb(aay aay, Context context, AttributeSet attributeSet, int i) {
        this.c = aay;
        super(context, attributeSet, i);
        this.b = new Rect();
        a((View) aay);
        a(true);
        a(0);
        a(new abc(this, aay));
    }

    public void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.a = listAdapter;
    }

    public CharSequence b() {
        return this.i;
    }

    public void a(CharSequence charSequence) {
        this.i = charSequence;
    }

    void f() {
        int i;
        int i2;
        Drawable h = h();
        if (h != null) {
            h.getPadding(this.c.d);
            if (age.a(this.c)) {
                i = this.c.d.right;
            } else {
                i = -this.c.d.left;
            }
            i2 = i;
        } else {
            Rect rect = this.c.d;
            this.c.d.right = 0;
            rect.left = 0;
            i2 = 0;
        }
        int paddingLeft = this.c.getPaddingLeft();
        int paddingRight = this.c.getPaddingRight();
        int width = this.c.getWidth();
        if (this.c.c == -2) {
            int a = this.c.a((SpinnerAdapter) this.a, h());
            i = (this.c.getContext().getResources().getDisplayMetrics().widthPixels - this.c.d.left) - this.c.d.right;
            if (a <= i) {
                i = a;
            }
            g(Math.max(i, (width - paddingLeft) - paddingRight));
        } else if (this.c.c == -1) {
            g((width - paddingLeft) - paddingRight);
        } else {
            g(this.c.c);
        }
        if (age.a(this.c)) {
            i = ((width - paddingRight) - l()) + i2;
        } else {
            i = i2 + paddingLeft;
        }
        c(i);
    }

    public void a() {
        boolean d = d();
        f();
        h(2);
        super.a();
        e().setChoiceMode(1);
        i(this.c.getSelectedItemPosition());
        if (!d) {
            ViewTreeObserver viewTreeObserver = this.c.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener abd = new abd(this);
                viewTreeObserver.addOnGlobalLayoutListener(abd);
                a(new abe(this, abd));
            }
        }
    }
}
