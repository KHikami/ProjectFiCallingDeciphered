package android.support.design.internal;

import acw;
import aeo;
import ajk;
import android.content.Context;
import android.content.res.ColorStateList;
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
import com.google.android.apps.hangouts.hangout.StressMode;
import gwb;
import jb;
import lt;
import oa;
import p;
import q;
import tg;
import tz;
import yc;
import yq;

public class NavigationMenuItemView extends p implements yq {
    private static final int[] d;
    public boolean c;
    private final int e;
    private boolean f;
    private final CheckedTextView g;
    private FrameLayout h;
    private yc i;
    private ColorStateList j;
    private boolean k;
    private Drawable l;
    private final lt m;

    static {
        d = new int[]{16842912};
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new q(this);
        e(0);
        LayoutInflater.from(context).inflate(StressMode.g, this, true);
        this.e = context.getResources().getDimensionPixelSize(tz.f);
        this.g = (CheckedTextView) findViewById(ajk.d);
        this.g.setDuplicateParentStateEnabled(true);
        oa.a(this.g, this.m);
    }

    public void a(yc ycVar, int i) {
        boolean z;
        this.i = ycVar;
        setVisibility(ycVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            Drawable stateListDrawable;
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(gwb.L, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackgroundDrawable(stateListDrawable);
        }
        a(ycVar.isCheckable());
        b(ycVar.isChecked());
        setEnabled(ycVar.isEnabled());
        a(ycVar.getTitle());
        a(ycVar.getIcon());
        View actionView = ycVar.getActionView();
        if (actionView != null) {
            if (this.h == null) {
                this.h = (FrameLayout) ((ViewStub) findViewById(ajk.c)).inflate();
            }
            this.h.removeAllViews();
            this.h.addView(actionView);
        }
        if (this.i.getTitle() == null && this.i.getIcon() == null && this.i.getActionView() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.g.setVisibility(8);
            if (this.h != null) {
                acw acw = (acw) this.h.getLayoutParams();
                acw.width = -1;
                this.h.setLayoutParams(acw);
                return;
            }
            return;
        }
        this.g.setVisibility(0);
        if (this.h != null) {
            acw = (acw) this.h.getLayoutParams();
            acw.width = -2;
            this.h.setLayoutParams(acw);
        }
    }

    public yc a() {
        return this.i;
    }

    public void a(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    public void a(boolean z) {
        refreshDrawableState();
        if (this.c != z) {
            this.c = z;
            this.m.a(this.g, 2048);
        }
    }

    public void b(boolean z) {
        refreshDrawableState();
        this.g.setChecked(z);
    }

    public void a(Drawable drawable) {
        Drawable drawable2;
        if (drawable != null) {
            if (this.k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = jb.e(drawable).mutate();
                jb.a(drawable, this.j);
            }
            drawable.setBounds(0, 0, this.e, this.e);
            drawable2 = drawable;
        } else if (this.f) {
            if (this.l == null) {
                this.l = gwb.a(getResources(), aeo.h, getContext().getTheme());
                if (this.l != null) {
                    this.l.setBounds(0, 0, this.e, this.e);
                }
            }
            drawable2 = this.l;
        } else {
            drawable2 = drawable;
        }
        tg.a.a(this.g, drawable2, null, null, null);
    }

    public boolean b() {
        return false;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.i != null && this.i.isCheckable() && this.i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }
}
