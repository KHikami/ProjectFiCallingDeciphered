package com.android.dialer.app;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import buf;

@UsedByReflection
/* compiled from: PG */
public class FloatingActionButtonBehavior extends buf {
    public final /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ((FrameLayout) view).setTranslationY(Math.min(0.0f, view2.getTranslationY() - ((float) view2.getHeight())));
        return true;
    }

    @UsedByReflection
    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
    }

    public final /* synthetic */ boolean c(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof SnackbarLayout;
    }
}
