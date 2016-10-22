package com.google.android.apps.dialer.settings;

import android.content.Context;
import android.preference.Preference;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import buf;

/* compiled from: PG */
public class TextViewPreference extends Preference {
    private int a;
    private CharSequence b;
    private TextView c;

    public TextViewPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0;
        setLayoutResource(buf.lv);
    }

    public TextViewPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TextViewPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842894, 0);
    }

    public TextViewPreference(Context context) {
        super(context, null);
        this.a = 0;
        setLayoutResource(buf.lv);
    }

    protected void onBindView(View view) {
        super.onBindView(view);
        this.c = (TextView) view.findViewById(buf.lo);
        if (this.a != 0) {
            setTitle(this.a);
        } else if (this.b != null) {
            setTitle(this.b);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.a = 0;
        this.b = charSequence;
        if (this.c != null) {
            this.c.setMovementMethod(LinkMovementMethod.getInstance());
            this.c.setText(charSequence);
        }
    }

    public void setTitle(int i) {
        this.a = i;
        setTitle(getContext().getString(i));
    }
}
