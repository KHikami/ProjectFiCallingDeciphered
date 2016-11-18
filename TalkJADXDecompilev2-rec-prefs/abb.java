package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

final class abb extends add {
    ListAdapter f137a;
    final Rect f138b = new Rect();
    final /* synthetic */ aay f139c;
    private CharSequence f140i;

    public abb(aay aay, Context context, AttributeSet attributeSet, int i) {
        this.f139c = aay;
        super(context, attributeSet, i);
        m148a((View) aay);
        m152a(true);
        m145a(0);
        m149a(new abc(this, aay));
    }

    public void mo15a(ListAdapter listAdapter) {
        super.mo15a(listAdapter);
        this.f137a = listAdapter;
    }

    public CharSequence m176b() {
        return this.f140i;
    }

    public void m175a(CharSequence charSequence) {
        this.f140i = charSequence;
    }

    void m177f() {
        int i;
        int i2;
        Drawable h = m163h();
        if (h != null) {
            h.getPadding(this.f139c.f80d);
            if (age.m1025a(this.f139c)) {
                i = this.f139c.f80d.right;
            } else {
                i = -this.f139c.f80d.left;
            }
            i2 = i;
        } else {
            Rect rect = this.f139c.f80d;
            this.f139c.f80d.right = 0;
            rect.left = 0;
            i2 = 0;
        }
        int paddingLeft = this.f139c.getPaddingLeft();
        int paddingRight = this.f139c.getPaddingRight();
        int width = this.f139c.getWidth();
        if (this.f139c.f79c == -2) {
            int a = this.f139c.m119a((SpinnerAdapter) this.f137a, m163h());
            i = (this.f139c.getContext().getResources().getDisplayMetrics().widthPixels - this.f139c.f80d.left) - this.f139c.f80d.right;
            if (a <= i) {
                i = a;
            }
            m161g(Math.max(i, (width - paddingLeft) - paddingRight));
        } else if (this.f139c.f79c == -1) {
            m161g((width - paddingLeft) - paddingRight);
        } else {
            m161g(this.f139c.f79c);
        }
        if (age.m1025a(this.f139c)) {
            i = ((width - paddingRight) - m169l()) + i2;
        } else {
            i = i2 + paddingLeft;
        }
        m155c(i);
    }

    public void mo14a() {
        boolean d = m157d();
        m177f();
        m164h(2);
        super.mo14a();
        m158e().setChoiceMode(1);
        m166i(this.f139c.getSelectedItemPosition());
        if (!d) {
            ViewTreeObserver viewTreeObserver = this.f139c.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener abd = new abd(this);
                viewTreeObserver.addOnGlobalLayoutListener(abd);
                m151a(new abe(this, abd));
            }
        }
    }
}
