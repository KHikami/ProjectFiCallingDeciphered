package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ba;
import dyg;
import gwb;

public class SystemMessageListItemView extends RelativeLayout implements dyg {
    private static boolean a;
    private static int b;
    private static int c;
    private ImageView d;
    private TextView e;
    private CharSequence f;
    private long g;

    static {
        a = false;
    }

    public SystemMessageListItemView(Context context) {
        this(context, null);
    }

    public SystemMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!a) {
            Resources resources = context.getApplicationContext().getResources();
            b = resources.getColor(gwb.em);
            c = resources.getColor(gwb.el);
            a = true;
        }
    }

    public void onFinishInflate() {
        this.e = (TextView) findViewById(ba.fC);
        this.d = (ImageView) findViewById(ba.cr);
    }

    public void a(CharSequence charSequence) {
        this.f = charSequence;
        d();
    }

    public void a(int i) {
        this.d.setImageResource(i);
    }

    public void a(long j) {
        b(j);
        d();
    }

    private void d() {
        this.e.setText(Html.fromHtml(this.f.toString()));
    }

    public void c() {
        setContentDescription(this.e.getText());
    }

    public void b(long j) {
        this.g = j;
    }

    public void a(boolean z) {
        this.d.setColorFilter(z ? c : b);
    }

    public long a() {
        return this.g;
    }

    public View b() {
        return this;
    }
}
