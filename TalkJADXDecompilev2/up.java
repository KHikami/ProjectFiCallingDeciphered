package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public final class up {
    private final uh a;
    private final int b;

    public up(Context context) {
        this(context, uo.a(context, 0));
    }

    public up(Context context, int i) {
        this.a = new uh(new ContextThemeWrapper(context, uo.a(context, i)));
        this.b = i;
    }

    public Context a() {
        return this.a.a;
    }

    public up a(CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    public up a(View view) {
        this.a.g = view;
        return this;
    }

    public up b(CharSequence charSequence) {
        this.a.h = charSequence;
        return this;
    }

    public up a(int i) {
        this.a.c = i;
        return this;
    }

    public up a(Drawable drawable) {
        this.a.d = drawable;
        return this;
    }

    public up b(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.a.getTheme().resolveAttribute(i, typedValue, true);
        this.a.c = typedValue.resourceId;
        return this;
    }

    public up a(CharSequence charSequence, OnClickListener onClickListener) {
        this.a.i = charSequence;
        this.a.j = onClickListener;
        return this;
    }

    public up b(CharSequence charSequence, OnClickListener onClickListener) {
        this.a.k = charSequence;
        this.a.l = onClickListener;
        return this;
    }

    public up a(boolean z) {
        this.a.o = false;
        return this;
    }

    public up a(OnKeyListener onKeyListener) {
        this.a.r = onKeyListener;
        return this;
    }

    public up a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
        this.a.s = charSequenceArr;
        this.a.u = onClickListener;
        return this;
    }

    public up a(ListAdapter listAdapter, OnClickListener onClickListener) {
        this.a.t = listAdapter;
        this.a.u = onClickListener;
        return this;
    }

    public up a(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.a.s = charSequenceArr;
        this.a.G = onMultiChoiceClickListener;
        this.a.C = zArr;
        this.a.D = true;
        return this;
    }

    public up a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
        this.a.s = charSequenceArr;
        this.a.u = onClickListener;
        this.a.F = i;
        this.a.E = true;
        return this;
    }

    public up b(View view) {
        this.a.w = view;
        this.a.v = 0;
        this.a.B = false;
        return this;
    }

    public uo b() {
        uo uoVar = new uo(this.a.a, this.b);
        this.a.a(uoVar.a);
        uoVar.setCancelable(this.a.o);
        if (this.a.o) {
            uoVar.setCanceledOnTouchOutside(true);
        }
        uoVar.setOnCancelListener(this.a.p);
        uoVar.setOnDismissListener(this.a.q);
        if (this.a.r != null) {
            uoVar.setOnKeyListener(this.a.r);
        }
        return uoVar;
    }
}
