package com.android.dialer.app.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import aq;
import ath;
import buf;

/* compiled from: PG */
public class EmptyContentView extends LinearLayout implements OnClickListener {
    public ImageView a;
    public TextView b;
    public TextView c;
    public ath d;

    public EmptyContentView(Context context) {
        this(context, null);
    }

    public EmptyContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmptyContentView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EmptyContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(1);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(buf.hH, this);
        setClickable(true);
        this.a = (ImageView) findViewById(aq.ao);
        this.b = (TextView) findViewById(aq.ap);
        this.c = (TextView) findViewById(aq.an);
        this.c.setOnClickListener(this);
    }

    public final void a(int i) {
        if (i == 0) {
            this.b.setText(null);
            this.b.setVisibility(8);
            return;
        }
        this.b.setText(i);
        this.b.setVisibility(0);
    }

    public final void b(int i) {
        if (i == 0) {
            this.a.setImageDrawable(null);
            this.a.setVisibility(8);
            return;
        }
        this.a.setImageResource(i);
        this.a.setVisibility(0);
    }

    public final void c(int i) {
        if (i == 0) {
            this.c.setText(null);
            this.c.setVisibility(8);
            return;
        }
        this.c.setText(i);
        this.c.setVisibility(0);
    }

    public void onClick(View view) {
        if (this.d != null) {
            this.d.e_();
        }
    }
}
