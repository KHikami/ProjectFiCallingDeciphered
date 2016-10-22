package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import ba;
import bc;
import bko;
import com.google.android.apps.hangouts.R$drawable;
import gld;
import glj;
import glk;
import gmu;
import gmv;
import gmw;
import gmx;
import gnb;
import gpv;
import gwb;
import kae;
import wi;

public class AudioAttachmentView extends LinearLayout implements OnSeekBarChangeListener, gpv {
    public static final boolean a;
    public SeekBar b;
    public gnb c;
    public gmx d;
    private long e;
    private TextView f;
    private TextView g;
    private String h;
    private ImageView i;
    private ImageView j;
    private int k;

    static {
        kae kae = glk.a;
        a = false;
    }

    public AudioAttachmentView(Context context) {
        this(context, null);
    }

    public AudioAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(gnb gnb) {
        this.c = gnb;
    }

    public void onFinishInflate() {
        this.f = (TextView) findViewById(ba.x);
        this.g = (TextView) findViewById(ba.w);
        this.i = (ImageView) findViewById(ba.ed);
        this.j = (ImageView) findViewById(ba.fq);
        this.b = (SeekBar) findViewById(ba.ec);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new gmu(this, getResources().getDimension(gwb.eA)));
        k();
        if (VERSION.SDK_INT < 21 && gld.a(getContext())) {
            this.g.setVisibility(8);
        }
        this.i.setOnClickListener(new gmv(this));
        this.j.setOnClickListener(new gmw(this));
        this.b.setOnSeekBarChangeListener(this);
    }

    protected void onMeasure(int i, int i2) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(gwb.fa);
        if (MeasureSpec.getSize(i) > dimensionPixelSize) {
            i = MeasureSpec.makeMeasureSpec(dimensionPixelSize, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    private void h() {
        this.i.setImageResource(R$drawable.cj);
        this.i.setContentDescription(getResources().getString(bc.ip));
    }

    private void i() {
        this.i.setImageResource(R$drawable.cf);
        this.i.setContentDescription(getResources().getString(bc.id));
    }

    public void e() {
        int b = this.d.b();
        if ("speaker".equals(this.d.c())) {
            this.j.setImageResource(R$drawable.cn);
            this.j.setContentDescription(getResources().getString(bc.la));
        } else {
            this.j.setImageResource(R$drawable.cb);
            this.j.setContentDescription(getResources().getString(bc.kZ));
        }
        if (this.d.f() || b == 0 || b == 1) {
            this.j.setVisibility(4);
        } else {
            this.j.setVisibility(0);
        }
        switch (b) {
            case wi.w /*0*/:
            case wi.j /*1*/:
                h();
                this.b.setProgress(0);
                j();
            case wi.l /*2*/:
            case wi.z /*3*/:
                i();
                this.b.setProgress(0);
                this.g.setText(getResources().getString(bc.w));
            case wi.h /*4*/:
                i();
                f();
            case wi.p /*5*/:
                h();
                f();
            default:
        }
    }

    private void a(TextView textView, int i) {
        StringBuilder stringBuilder = new StringBuilder(DateUtils.formatElapsedTime((long) (i / 1000)));
        int h = this.d.h();
        if (h > 0) {
            stringBuilder.append(" / ");
            stringBuilder.append(DateUtils.formatElapsedTime((long) (h / 1000)));
        }
        textView.setText(stringBuilder.toString());
    }

    void f() {
        int i = this.d.i();
        int h = this.d.h();
        if (this.d.b() != 4 || i != 0) {
            a(this.g, i);
            if (h != 0) {
                this.b.setProgress((i * 100) / h);
            } else {
                this.b.setProgress(0);
            }
        }
    }

    public void a(bko bko, String str, long j, String str2, String str3, String str4, String str5, long j2, int i) {
        this.e = j2;
        setLongClickable(true);
        a(new gnb(this, bko, str2, str4));
        gmx gmx = gmx.a;
        if (gmx != null && gmx.a().equals(str3)) {
            this.d = gmx;
            this.d.a(str, j);
        } else if (this.d == null) {
            this.d = new gmx(this, str3, str, j);
        } else if (!this.d.a().equals(str3)) {
            this.d.a(null);
            this.d = new gmx(this, str3, str, j);
        }
        this.d.a(this);
        this.d.a(this.c);
        this.f.setText(str5);
        j();
        this.k = i;
        k();
        e();
    }

    private void j() {
        if (this.e != 0) {
            StringBuilder stringBuilder = new StringBuilder(glj.a(this.e, false, true));
            StringBuilder stringBuilder2 = new StringBuilder(glj.a(this.e, true, true));
            this.g.setText(stringBuilder.toString());
            this.h = stringBuilder2.toString();
            return;
        }
        this.g.setText("");
        this.h = "";
    }

    private void k() {
        this.f.setTextColor(this.k);
        this.g.setTextColor(this.k);
        this.i.setColorFilter(this.k);
        this.j.setColorFilter(this.k);
        a(R$drawable.cx, R$drawable.cw);
    }

    public String g() {
        return this.h;
    }

    public void p_() {
        if (this.d != null) {
            this.d.a(null);
            this.d = null;
        }
    }

    public void b_() {
    }

    public void c_() {
    }

    public void d_() {
    }

    public void a(String str) {
    }

    public void a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            if (this.d != null) {
                this.d.a(str, j);
            } else {
                glk.d("Babel", "updateUrl: audioPlaybackController is null", new Object[0]);
            }
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z) {
            return;
        }
        if (this.d != null) {
            a(this.g, (this.d.h() * i) / 100);
            return;
        }
        glk.d("Babel", "onProgressChanged: audioPlaybackController is null", new Object[0]);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (this.d != null) {
            this.d.l();
        } else {
            glk.d("Babel", "onStartTrackingTouch: audioPlaybackController is null", new Object[0]);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.d != null) {
            gmx gmx = this.d;
            int progress = (seekBar.getProgress() * this.d.h()) / 100;
            if (a) {
                gmx.a("sendSeek", "new position is " + progress);
            }
            int b = gmx.b();
            if (b == 4 || b == 5) {
                Intent a = gmx.a(4);
                a.putExtra("position_in_milliseconds", progress);
                gmx.c.startService(a);
            }
            this.d.k();
            return;
        }
        glk.d("Babel", "onStopTrackingTouch: audioPlaybackController is null", new Object[0]);
    }

    public void a(int i, int i2) {
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(i);
        drawable.setColorFilter(this.k, Mode.SRC_ATOP);
        this.b.setThumb(drawable);
        Drawable drawable2 = resources.getDrawable(i2);
        drawable2.setColorFilter(this.k, Mode.SRC_ATOP);
        this.b.setProgressDrawable(drawable2);
    }
}
