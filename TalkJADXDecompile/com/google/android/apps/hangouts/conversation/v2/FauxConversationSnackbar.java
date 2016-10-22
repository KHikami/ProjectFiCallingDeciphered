package com.google.android.apps.hangouts.conversation.v2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import chl;
import chm;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import gwb;
import jbn;

public class FauxConversationSnackbar extends Snackbar {
    public FauxConversationSnackbar(Context context) {
        this(context, null);
    }

    public FauxConversationSnackbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.yj);
    }

    public FauxConversationSnackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a() {
        jbn jbn = this.a;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat});
        ofPropertyValuesHolder.addListener(new chl(this));
        jbn.a(ofPropertyValuesHolder);
    }

    public void b() {
        jbn jbn = this.a;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat});
        ofPropertyValuesHolder.setStartDelay(700);
        ofPropertyValuesHolder.addListener(new chm(this));
        jbn.b(ofPropertyValuesHolder);
    }
}
