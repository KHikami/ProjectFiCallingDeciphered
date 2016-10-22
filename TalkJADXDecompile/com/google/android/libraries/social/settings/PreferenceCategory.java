package com.google.android.libraries.social.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.common.proguard.UsedByReflection;
import gwb;
import jwi;
import jwu;

@UsedByReflection
public final class PreferenceCategory extends jwu {
    private PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @UsedByReflection
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.zJ);
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }

    protected boolean b(jwi jwi) {
        if (!(jwi instanceof PreferenceCategory)) {
            return super.b(jwi);
        }
        throw new IllegalArgumentException("Cannot add a PreferenceCategory directly to a PreferenceCategory");
    }

    public boolean p() {
        return false;
    }

    public boolean D() {
        return !super.p();
    }
}
