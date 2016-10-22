package android.support.design.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import b;
import buf;
import gr;
import pc;
import sy;
import tm;

/* compiled from: PG */
public class NavigationMenuItemView extends b implements tm {
    private static final int[] a;
    private final int b;
    private final CheckedTextView c;
    private FrameLayout d;
    private sy e;

    static {
        a = new int[]{16842912};
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(0);
        LayoutInflater.from(context).inflate(2130968651, this, true);
        this.b = context.getResources().getDimensionPixelSize(2131427527);
        this.c = (CheckedTextView) findViewById(2131493147);
        this.c.setDuplicateParentStateEnabled(true);
    }

    public final void a(sy syVar, int i) {
        Drawable stateListDrawable;
        Drawable mutate;
        this.e = syVar;
        setVisibility(syVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(buf.K, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(a, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackgroundDrawable(stateListDrawable);
        }
        syVar.isCheckable();
        refreshDrawableState();
        boolean isChecked = syVar.isChecked();
        refreshDrawableState();
        this.c.setChecked(isChecked);
        setEnabled(syVar.isEnabled());
        this.c.setText(syVar.getTitle());
        stateListDrawable = syVar.getIcon();
        if (stateListDrawable != null) {
            ConstantState constantState = stateListDrawable.getConstantState();
            if (constantState != null) {
                stateListDrawable = constantState.newDrawable();
            }
            mutate = gr.e(stateListDrawable).mutate();
            mutate.setBounds(0, 0, this.b, this.b);
            gr.a(mutate, null);
        } else {
            mutate = stateListDrawable;
        }
        pc.a.a(this.c, mutate, null, null, null);
        View actionView = syVar.getActionView();
        if (this.d == null) {
            this.d = (FrameLayout) ((ViewStub) findViewById(2131493148)).inflate();
        }
        this.d.removeAllViews();
        if (actionView != null) {
            this.d.addView(actionView);
        }
    }

    public final sy a() {
        return this.e;
    }

    public final boolean b() {
        return false;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.e != null && this.e.isCheckable() && this.e.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }
}
