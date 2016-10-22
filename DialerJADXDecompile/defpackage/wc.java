package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* renamed from: wc */
final class wc extends xx {
    CharSequence a;
    ListAdapter b;
    final Rect c;
    final /* synthetic */ vz d;

    public wc(vz vzVar, Context context, AttributeSet attributeSet, int i) {
        this.d = vzVar;
        super(context, attributeSet, i);
        this.c = new Rect();
        this.k = vzVar;
        a(true);
        this.j = 0;
        this.l = new wd(this, vzVar);
    }

    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }

    final void a() {
        int i;
        int i2;
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.d.d);
            if (aav.a(this.d)) {
                i = this.d.d.right;
            } else {
                i = -this.d.d.left;
            }
            i2 = i;
        } else {
            Rect rect = this.d.d;
            this.d.d.right = 0;
            rect.left = 0;
            i2 = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        if (this.d.c == -2) {
            int a = this.d.a((SpinnerAdapter) this.b, this.q.getBackground());
            i = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a <= i) {
                i = a;
            }
            b(Math.max(i, (width - paddingLeft) - paddingRight));
        } else if (this.d.c == -1) {
            b((width - paddingLeft) - paddingRight);
        } else {
            b(this.d.c);
        }
        if (aav.a(this.d)) {
            i = ((width - paddingRight) - this.f) + i2;
        } else {
            i = i2 + paddingLeft;
        }
        this.g = i;
    }

    public final void b() {
        boolean isShowing = this.q.isShowing();
        a();
        c(2);
        super.b();
        this.e.setChoiceMode(1);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        xj xjVar = this.e;
        if (this.q.isShowing() && xjVar != null) {
            xjVar.a = false;
            xjVar.setSelection(selectedItemPosition);
            if (VERSION.SDK_INT >= 11 && xjVar.getChoiceMode() != 0) {
                xjVar.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing) {
            ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener weVar = new we(this);
                viewTreeObserver.addOnGlobalLayoutListener(weVar);
                a(new wf(this, weVar));
            }
        }
    }
}
