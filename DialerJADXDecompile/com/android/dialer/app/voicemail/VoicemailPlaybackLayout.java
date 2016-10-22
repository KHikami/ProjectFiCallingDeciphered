package com.android.dialer.app.voicemail;

import ala;
import amm;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import aq;
import asc;
import asd;
import asg;
import ash;
import asi;
import asj;
import ask;
import asl;
import asm;
import aso;
import asp;
import asy;
import avm;
import avn;
import buf;
import cob;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class VoicemailPlaybackLayout extends LinearLayout implements amm, asy {
    public static final ArrayList a;
    public Context b;
    public asp c;
    public Uri d;
    public boolean e;
    public ImageButton f;
    public Space g;
    private final avm h;
    private final OnClickListener i;
    private final OnClickListener j;
    private final OnClickListener k;
    private SeekBar l;
    private ImageButton m;
    private ImageButton n;
    private ImageButton o;
    private ImageButton p;
    private Space q;
    private TextView r;
    private TextView s;
    private TextView t;
    private final OnSeekBarChangeListener u;
    private asm v;
    private Drawable w;
    private Drawable x;
    private final OnClickListener y;
    private final OnClickListener z;

    static {
        VoicemailPlaybackLayout.class.getSimpleName();
        a = new ArrayList();
    }

    public VoicemailPlaybackLayout(Context context) {
        this(context, null);
    }

    public VoicemailPlaybackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = avn.a();
        this.i = new asc(this);
        this.j = new asd(this);
        this.e = false;
        this.k = new asg(this);
        this.u = new ash(this);
        this.y = new asi(this);
        this.z = new asj(this);
        this.b = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(buf.hP, this);
    }

    public final void a(asp asp, Uri uri) {
        this.c = asp;
        this.d = uri;
        if (buf.l(this.b).a()) {
            d(this.d);
            Uri uri2 = this.d;
            if (!(uri2 == null || !Objects.equals(uri2, this.d) || c(uri2) || Objects.equals(uri2.getAuthority(), "com.google.android.dialer.voicemail.voicemailarchiveprovider"))) {
                avm avm = this.h;
                aso aso = aso.QUERY_ARCHIVED_STATUS;
                avm.a(new asl(this, uri2), new Void[0]);
            }
        }
        if (buf.l(this.b).b()) {
            this.q.setVisibility(0);
            this.p.setVisibility(0);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.l = (SeekBar) findViewById(aq.aR);
        this.m = (ImageButton) findViewById(aq.aT);
        this.n = (ImageButton) findViewById(aq.aS);
        this.o = (ImageButton) findViewById(aq.Z);
        this.f = (ImageButton) findViewById(aq.e);
        this.p = (ImageButton) findViewById(aq.bu);
        this.g = (Space) findViewById(aq.bw);
        this.q = (Space) findViewById(aq.bx);
        this.r = (TextView) findViewById(aq.aU);
        this.s = (TextView) findViewById(aq.aQ);
        this.t = (TextView) findViewById(aq.bC);
        this.l.setOnSeekBarChangeListener(this.u);
        this.m.setOnClickListener(this.k);
        this.n.setOnClickListener(this.i);
        this.o.setOnClickListener(this.j);
        this.f.setOnClickListener(this.y);
        this.p.setOnClickListener(this.z);
        this.s.setText(b(0));
        this.t.setText(b(0));
        this.w = getResources().getDrawable(cob.aN, this.b.getTheme());
        this.x = getResources().getDrawable(cob.aO, this.b.getTheme());
    }

    public final void a(int i, ScheduledExecutorService scheduledExecutorService) {
        this.e = true;
        this.m.setImageResource(cob.az);
        if (this.v != null) {
            this.v.a();
            this.v = null;
        }
        this.v = new asm(this, i, scheduledExecutorService);
        Object obj = this.v;
        synchronized (obj.b) {
            obj.b();
            obj.d = obj.a.scheduleAtFixedRate(obj, 0, 33, TimeUnit.MILLISECONDS);
        }
    }

    public final void c() {
        this.e = false;
        this.m.setImageResource(cob.aE);
        if (this.v != null) {
            this.v.a();
            this.v = null;
        }
    }

    public final void d() {
        if (this.v != null) {
            this.v.a();
        }
        i();
        this.r.setText(a(cob.dE));
    }

    public final void a(boolean z) {
        if (z) {
            this.n.setImageResource(cob.aQ);
            this.n.setContentDescription(this.b.getString(cob.dF));
            return;
        }
        this.n.setImageResource(cob.aP);
        this.n.setContentDescription(this.b.getString(cob.dG));
    }

    public final void a(int i, int i2) {
        int max = Math.max(0, i);
        int max2 = Math.max(max, i2);
        if (this.l.getMax() != max2) {
            this.l.setMax(max2);
        }
        this.l.setProgress(max);
        this.s.setText(b(max));
        this.t.setText(b(i2));
    }

    public final void e() {
        this.r.setText(null);
    }

    public final void f() {
        i();
        this.r.setText(a(cob.dC));
    }

    public final void g() {
        this.m.setEnabled(true);
        this.r.setText(a(cob.dD));
    }

    public final int h() {
        return this.l.getProgress();
    }

    public final void i() {
        this.m.setEnabled(false);
        k();
    }

    public final void j() {
        this.o.setEnabled(true);
        this.m.setEnabled(true);
        this.l.setEnabled(true);
        this.l.setThumb(this.w);
    }

    public final void k() {
        this.l.setProgress(0);
        this.l.setEnabled(false);
        this.l.setThumb(this.x);
    }

    public final void a() {
    }

    public final void b() {
        asp asp = this.c;
        if (asp.p != null) {
            asp.p.f();
        }
    }

    public final void a(ala[] alaArr) {
    }

    private final String a(int i) {
        return this.b.getString(i);
    }

    private static String b(int i) {
        int i2 = 99;
        int i3 = i / 1000;
        int i4 = i3 / 60;
        i3 -= i4 * 60;
        if (i4 <= 99) {
            i2 = i4;
        }
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(Uri uri) {
        if (c(uri)) {
            a.remove(uri);
            if (Objects.equals(uri, this.d)) {
                m();
                l();
            }
        }
        Snackbar a = Snackbar.a((View) this, cob.cT, 0);
        a.d = 3000;
        a.a(cob.cU, new ask(this)).a(this.b.getResources().getColor(cob.ac)).a();
    }

    public final void b(Uri uri) {
        if (c(uri)) {
            a.remove(uri);
            if (Objects.equals(uri, this.d)) {
                m();
            }
        }
        Toast.makeText(this.b, this.b.getString(cob.dA), 0).show();
    }

    public final void l() {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.f.setClickable(false);
        this.f.setEnabled(false);
    }

    private final void m() {
        j();
        this.r.setText(null);
        this.f.setColorFilter(null);
    }

    public static boolean c(Uri uri) {
        return uri != null && a.contains(uri);
    }

    public final void d(Uri uri) {
        if (!Objects.equals(uri, this.d)) {
            return;
        }
        if (c(uri)) {
            i();
            this.o.setEnabled(false);
            this.f.setColorFilter(getResources().getColor(cob.ai));
            this.r.setText(a(cob.dB));
            return;
        }
        m();
    }
}
