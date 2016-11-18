package p000;

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
    private final uh f35299a;
    private final int f35300b;

    public up(Context context) {
        this(context, uo.m40902a(context, 0));
    }

    public up(Context context, int i) {
        this.f35299a = new uh(new ContextThemeWrapper(context, uo.m40902a(context, i)));
        this.f35300b = i;
    }

    public Context m40903a() {
        return this.f35299a.f35258a;
    }

    public up m40909a(CharSequence charSequence) {
        this.f35299a.f35263f = charSequence;
        return this;
    }

    public up m40907a(View view) {
        this.f35299a.f35264g = view;
        return this;
    }

    public up m40918b(CharSequence charSequence) {
        this.f35299a.f35265h = charSequence;
        return this;
    }

    public up m40904a(int i) {
        this.f35299a.f35260c = i;
        return this;
    }

    public up m40906a(Drawable drawable) {
        this.f35299a.f35261d = drawable;
        return this;
    }

    public up m40916b(int i) {
        TypedValue typedValue = new TypedValue();
        this.f35299a.f35258a.getTheme().resolveAttribute(i, typedValue, true);
        this.f35299a.f35260c = typedValue.resourceId;
        return this;
    }

    public up m40910a(CharSequence charSequence, OnClickListener onClickListener) {
        this.f35299a.f35266i = charSequence;
        this.f35299a.f35267j = onClickListener;
        return this;
    }

    public up m40919b(CharSequence charSequence, OnClickListener onClickListener) {
        this.f35299a.f35268k = charSequence;
        this.f35299a.f35269l = onClickListener;
        return this;
    }

    public up m40911a(boolean z) {
        this.f35299a.f35272o = false;
        return this;
    }

    public up m40905a(OnKeyListener onKeyListener) {
        this.f35299a.f35275r = onKeyListener;
        return this;
    }

    public up m40913a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
        this.f35299a.f35276s = charSequenceArr;
        this.f35299a.f35278u = onClickListener;
        return this;
    }

    public up m40908a(ListAdapter listAdapter, OnClickListener onClickListener) {
        this.f35299a.f35277t = listAdapter;
        this.f35299a.f35278u = onClickListener;
        return this;
    }

    public up m40914a(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f35299a.f35276s = charSequenceArr;
        this.f35299a.f35252G = onMultiChoiceClickListener;
        this.f35299a.f35248C = zArr;
        this.f35299a.f35249D = true;
        return this;
    }

    public up m40912a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
        this.f35299a.f35276s = charSequenceArr;
        this.f35299a.f35278u = onClickListener;
        this.f35299a.f35251F = i;
        this.f35299a.f35250E = true;
        return this;
    }

    public up m40917b(View view) {
        this.f35299a.f35280w = view;
        this.f35299a.f35279v = 0;
        this.f35299a.f35247B = false;
        return this;
    }

    public uo m40915b() {
        uo uoVar = new uo(this.f35299a.f35258a, this.f35300b);
        this.f35299a.m40897a(uoVar.f35298a);
        uoVar.setCancelable(this.f35299a.f35272o);
        if (this.f35299a.f35272o) {
            uoVar.setCanceledOnTouchOutside(true);
        }
        uoVar.setOnCancelListener(this.f35299a.f35273p);
        uoVar.setOnDismissListener(this.f35299a.f35274q);
        if (this.f35299a.f35275r != null) {
            uoVar.setOnKeyListener(this.f35299a.f35275r);
        }
        return uoVar;
    }
}
