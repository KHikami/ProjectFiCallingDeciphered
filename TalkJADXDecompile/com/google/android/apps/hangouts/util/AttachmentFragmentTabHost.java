package com.google.android.apps.hangouts.util;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import er;
import glk;

public class AttachmentFragmentTabHost extends er {
    private boolean a;

    public AttachmentFragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttachmentFragmentTabHost(Context context) {
        super(context);
    }

    public void onTouchModeChanged(boolean z) {
    }

    protected void onAttachedToWindow() {
        if (!this.a) {
            try {
                super.onAttachedToWindow();
            } catch (Throwable e) {
                glk.d("Babel", "Ignoring exception", e);
            }
        }
    }

    protected Parcelable onSaveInstanceState() {
        this.a = true;
        return super.onSaveInstanceState();
    }
}
