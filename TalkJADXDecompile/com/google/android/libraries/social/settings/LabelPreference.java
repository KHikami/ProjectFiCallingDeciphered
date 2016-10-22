package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co;
import com.google.android.apps.common.proguard.UsedByReflection;
import gwb;
import jwi;
import jxi;

@UsedByReflection
public class LabelPreference extends jwi {
    private CharSequence a;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private View g;

    @UsedByReflection
    public LabelPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.g = null;
        d(gwb.zQ);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.M);
            this.f = obtainStyledAttributes.getDimensionPixelSize(jxi.O, -1);
            this.e = obtainStyledAttributes.getInt(jxi.N, 1);
            obtainStyledAttributes.recycle();
        }
    }

    protected View a(ViewGroup viewGroup) {
        View a = super.a(viewGroup);
        ((TextView) a.findViewById(co.g)).setAutoLinkMask(this.e);
        return a;
    }

    protected void a(View view) {
        super.a(view);
        this.g = view;
        if (this.f >= 0) {
            view.setMinimumHeight(this.f);
        }
        TextView textView = (TextView) view.findViewById(co.c);
        View findViewById = view.findViewById(co.f);
        if (textView != null) {
            if (TextUtils.isEmpty(this.a) || this.c) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(this.a);
            }
        }
        textView = (TextView) view.findViewById(co.g);
        if (this.d) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (findViewById != null) {
            int i;
            if (this.c) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }
}
