package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ba;
import bc;
import bnq;
import com.google.android.apps.hangouts.R$drawable;
import gld;
import gnm;
import gno;
import java.util.List;
import wi;

public final class ConversationListItemView extends gno implements bnq {
    private FadeImageView n;
    private ConversationNameView o;
    private TextView p;
    private ImageView q;
    private TextView r;
    private ImageView s;
    private View t;
    private View u;
    private View v;
    private View w;
    private ImageView x;
    private TextView y;

    public ConversationListItemView(Context context) {
        this(context, null);
    }

    public ConversationListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        this.n = (FadeImageView) findViewById(ba.B);
        this.o = (ConversationNameView) findViewById(ba.al);
        this.p = (TextView) findViewById(ba.dv);
        this.q = (ImageView) findViewById(ba.cw);
        this.r = (TextView) findViewById(ba.fK);
        this.y = (TextView) findViewById(ba.gk);
        this.s = (ImageView) findViewById(ba.bx);
        this.s.setOnClickListener(new gnm(this));
        this.t = findViewById(ba.aq);
        this.u = findViewById(ba.ao);
        this.v = findViewById(ba.ge);
        this.w = findViewById(ba.bh);
        this.x = (ImageView) findViewById(ba.bw);
        super.onFinishInflate();
    }

    protected void a(int i, Cursor cursor) {
        Object obj = null;
        if (this.h != i) {
            this.h = i;
            l();
            int i2 = (!q() || this.h == 5) ? 8 : 0;
            g(i2);
            this.t.setVisibility(8);
            this.u.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            this.x.setVisibility(8);
            if (this.i == 1) {
                obj = 1;
            }
            switch (this.h) {
                case wi.j /*1*/:
                    ImageView imageView = this.s;
                    Resources resources = getResources();
                    if (obj != null) {
                        i2 = bc.au;
                    } else {
                        i2 = bc.at;
                    }
                    imageView.setContentDescription(resources.getString(i2));
                    this.s.setImageResource(obj != null ? R$drawable.be : R$drawable.bf);
                    break;
                case wi.l /*2*/:
                    this.s.setContentDescription(getResources().getString(bc.ar));
                    this.s.setImageResource(R$drawable.bf);
                    break;
                case wi.p /*5*/:
                    this.s.setContentDescription(getResources().getString(bc.as));
                    this.s.setImageResource(R$drawable.be);
                    break;
            }
        }
        super.a(i, cursor);
    }

    public void a(boolean z, Bitmap bitmap, boolean z2, Object obj) {
        this.n.a(z, bitmap);
    }

    public void a(List<String> list) {
        this.o.a((List) list);
    }

    public void b(String str) {
        this.o.a(str);
    }

    public void a(int i, int i2, int i3) {
        this.o.a(i);
        this.o.a(null, i3);
        this.p.setTextColor(i2);
        this.p.setTypeface(null, i3);
        this.r.setTextColor(i2);
        this.r.setTypeface(null, i3);
    }

    public CharSequence b() {
        return this.o.getContentDescription();
    }

    public void a(int i) {
        if (this.q.getVisibility() == 0) {
            i = 8;
        }
        this.p.setVisibility(i);
    }

    public void a(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    public void b(int i) {
        gld.a((View) this);
        this.p.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public void a(Drawable drawable) {
        if (gld.a((View) this)) {
            this.p.setCompoundDrawables(null, null, drawable, null);
        } else {
            this.p.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public void a(boolean z) {
        this.p.setSingleLine(z);
    }

    public void c(int i) {
        this.p.setMaxLines(i);
    }

    public CharSequence c() {
        return this.p.getText();
    }

    public TextView d() {
        return this.p;
    }

    public void d(int i) {
        if (i == 0) {
            this.p.setVisibility(8);
        }
        this.q.setVisibility(i);
    }

    public void a(Bitmap bitmap) {
        this.q.setImageBitmap(bitmap);
    }

    public void b(Drawable drawable) {
        this.q.setImageDrawable(drawable);
    }

    public void e(int i) {
        this.q.getLayoutParams().height = i;
    }

    public void f(int i) {
        this.q.setAlpha(i);
    }

    public void b(CharSequence charSequence) {
        this.r.setText(charSequence);
    }

    public void g(int i) {
        this.r.setVisibility(i);
    }

    public int e() {
        return this.r.getVisibility();
    }

    public CharSequence f() {
        return this.r.getText();
    }

    public CharSequence g() {
        return this.r.getContentDescription();
    }

    public void c(CharSequence charSequence) {
        this.r.setContentDescription(charSequence);
    }

    public int h() {
        return this.t.getVisibility();
    }

    public void h(int i) {
        this.t.setVisibility(i);
    }

    public int i() {
        return this.u.getVisibility();
    }

    public void i(int i) {
        this.u.setVisibility(i);
    }

    public int j() {
        return this.v.getVisibility();
    }

    public void j(int i) {
        this.v.setVisibility(i);
    }

    public void k(int i) {
        this.w.setVisibility(i);
    }

    public int k() {
        return this.x.getVisibility();
    }

    public void l(int i) {
        this.x.setVisibility(i);
    }

    public void m(int i) {
        this.y.setVisibility(i);
    }

    public void d(CharSequence charSequence) {
        this.y.setText(charSequence);
    }

    public void n(int i) {
        this.s.setImageResource(i);
    }

    public void c(Drawable drawable) {
        this.s.setImageDrawable(drawable);
    }

    protected void l() {
        boolean z;
        int i = 0;
        if (o() || p()) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.s;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.s.setEnabled(z);
    }

    public boolean m() {
        return true;
    }
}
