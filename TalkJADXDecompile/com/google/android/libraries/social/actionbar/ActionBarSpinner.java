package com.google.android.libraries.social.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import jee;

public final class ActionBarSpinner extends Spinner {
    private jee a;

    public ActionBarSpinner(Context context) {
        super(context);
    }

    public ActionBarSpinner(Context context, int i) {
        super(context, i);
    }

    public ActionBarSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActionBarSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ActionBarSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected void onMeasure(int i, int i2) {
        jee jee = this.a;
        if (jee != null) {
            jee.a(getSelectedItemPosition());
        }
        super.onMeasure(i, i2);
        if (jee != null) {
            jee.a();
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (spinnerAdapter == null) {
            this.a = null;
        } else {
            this.a = new jee(this, spinnerAdapter);
        }
        super.setAdapter(this.a);
    }
}
