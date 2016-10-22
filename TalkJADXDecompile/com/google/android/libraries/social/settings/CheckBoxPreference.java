package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import co;
import com.google.android.apps.common.proguard.UsedByReflection;
import gwb;
import jxi;
import jxm;

@UsedByReflection
public class CheckBoxPreference extends jxm {
    private CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.ap, i, 0);
        e(obtainStyledAttributes.getString(jxi.as));
        f(obtainStyledAttributes.getString(jxi.ar));
        i(obtainStyledAttributes.getBoolean(jxi.aq, false));
        obtainStyledAttributes.recycle();
    }

    @UsedByReflection
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.zH);
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }

    protected void a(View view) {
        super.a(view);
        View findViewById = view.findViewById(co.a);
        if (findViewById instanceof Checkable) {
            ((Checkable) findViewById).setChecked(this.a);
            b(findViewById);
        }
        c(view);
    }
}
