package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantOverlays;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;

/* renamed from: dkf */
public abstract class dkf extends LinearLayout implements bnq, dht, ita {
    private me A;
    private dex B;
    private dey C;
    public itl a;
    public final dgg b;
    public dhu c;
    public final djd d;
    public final ParticipantTrayView e;
    public final FocusedParticipantView f;
    public int g;
    final ImageView h;
    public final ImageButton i;
    final RemoteParticipantPopupMenu j;
    boolean k;
    boolean l;
    public Bitmap m;
    Bitmap n;
    boolean o;
    private final ViewGroup p;
    private final TextView q;
    private final ParticipantOverlays r;
    private final dlg s;
    private final azx<Bitmap> t;
    private boolean u;
    private boolean v;
    private String w;
    private String x;
    private bnn y;
    private boolean z;

    abstract String m();

    dkf(djd djd, itl itl, ParticipantTrayView participantTrayView, FocusedParticipantView focusedParticipantView) {
        super(participantTrayView.getContext(), null);
        this.b = dgg.a();
        this.g = 0;
        this.t = new dkg(this);
        this.o = true;
        iil.b("Expected non-null", (Object) itl);
        this.d = djd;
        this.a = itl;
        this.e = participantTrayView;
        this.f = focusedParticipantView;
        dkf.inflate(getContext(), gwb.gE, this);
        this.p = (ViewGroup) findViewById(ba.bW);
        this.h = (ImageView) findViewById(ba.bY);
        this.i = (ImageButton) findViewById(ba.bV);
        this.i.setOnClickListener(new dkh(this));
        this.i.setOnLongClickListener(new dki(this));
        this.j = (RemoteParticipantPopupMenu) findViewById(ba.ee);
        this.q = (TextView) findViewById(ba.bZ);
        this.s = new dlg(getContext(), this.p);
        this.r = (ParticipantOverlays) findViewById(ba.dT);
        this.A = new me(getContext(), new dkk(this));
        this.B = (dex) jyn.a(getContext(), dex.class);
        this.C = (dey) jyn.a(getContext(), dey.class);
    }

    public void a(dhu dhu) {
        this.c = dhu;
        n();
        if (this.l && dhu.n() != null) {
            dhu.n().b(m());
        }
        j();
        g();
        this.r.a(this.a);
        this.r.setVisibility(0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return this.A.a(motionEvent);
    }

    public void c() {
        if (this.c.n() != null) {
            this.c.n().a(m());
        }
        if (this.y != null) {
            this.y.b();
            this.y = null;
        }
        if (this.j.a()) {
            this.j.b();
        }
    }

    public void y_() {
        this.r.a();
        c();
    }

    public void a(int i) {
        if (i == 2) {
            n();
        }
    }

    private void n() {
        if (this.c.n() != null) {
            this.c.n().a(m(), findViewById(ba.ca), -1, new dkl(this));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        g();
    }

    public itl d() {
        return this.a;
    }

    protected void e() {
        boolean z = this.l;
        if (this.c.n() != null) {
            this.c.n().b(z ? null : m());
        }
        this.d.j();
        this.l = !z;
        j();
    }

    void b(int i) {
        this.s.a(i);
    }

    public void onWindowVisibilityChanged(int i) {
        if (i != 0) {
            f();
        }
    }

    public void f() {
        if (this.j.a()) {
            this.j.b();
            this.j.setVisibility(8);
        }
    }

    void g() {
        LayoutParams layoutParams = this.p.getLayoutParams();
        Resources resources = this.i.getResources();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        TypedValue typedValue = new TypedValue();
        resources.getValue(gwb.eT, typedValue, true);
        float f = typedValue.getFloat();
        int dimensionPixelSize = resources.getDimensionPixelSize(gwb.eS);
        layoutParams.height = Math.min(Math.min((int) (f * ((float) (point.y - (dimensionPixelSize << 1)))), (point.x - (dimensionPixelSize << 1)) / resources.getInteger(gwb.fz)), resources.getDimensionPixelSize(gwb.eU));
        layoutParams.width = c(layoutParams.height);
        this.p.setLayoutParams(layoutParams);
    }

    protected int c(int i) {
        return i;
    }

    void a(String str) {
        this.w = str;
        o();
    }

    String h() {
        return this.w;
    }

    void b(String str) {
        this.x = str;
        o();
    }

    private void o() {
        a(this.l);
        CharSequence charSequence = this.x != null ? this.x : this.w;
        TextView textView = this.q;
        if (this.a.j()) {
            charSequence = glq.i(gwb.H(), charSequence);
        }
        textView.setText(charSequence);
    }

    boolean i() {
        return this.u;
    }

    public void j() {
        ImageView imageView;
        int i = 4;
        if (this.z) {
            d(3);
        } else {
            d(1);
        }
        this.v = this.a.l();
        this.h.setImageBitmap(k());
        if (this.k || this.v) {
            this.q.setVisibility(0);
            this.i.setBackgroundResource(R$drawable.aA);
            imageView = this.h;
        } else {
            this.q.setVisibility(4);
            this.i.setBackgroundResource(R$drawable.aC);
            imageView = this.h;
            if (!this.z) {
                i = 0;
            }
        }
        imageView.setVisibility(i);
        if (this.k) {
            if (this.z) {
                this.f.d();
            } else {
                this.f.e();
            }
        }
        if (this.v) {
            this.i.setImageResource(R$drawable.bj);
        } else if (this.l) {
            this.i.setImageResource(R$drawable.aB);
        } else {
            this.i.setImageResource(0);
        }
        a(this.l);
    }

    protected void d(int i) {
        iil.a(i, 1, 3);
        if (this.g != i) {
            String valueOf = String.valueOf(this.a.a());
            new StringBuilder(String.valueOf(valueOf).length() + 56).append("ParticipantView: switch ").append(valueOf).append(" from ").append(this.g).append(" to ").append(i);
            this.g = i;
        }
    }

    Bitmap k() {
        if (this.m != null) {
            return this.m;
        }
        if (this.a.j()) {
            return blc.c();
        }
        return blc.c();
    }

    public Bitmap l() {
        if (this.n != null) {
            return this.n;
        }
        if (this.a.j()) {
            return blc.b();
        }
        return blc.b();
    }

    protected void a(boolean z) {
        int i;
        if (z) {
            if (this.a.d()) {
                i = bc.tE;
            } else {
                i = bc.tD;
            }
        } else if (this.a.d()) {
            i = bc.in;
        } else {
            i = bc.im;
        }
        this.i.setContentDescription(getResources().getString(i, new Object[]{h()}));
    }

    public boolean isFocused() {
        return this.k;
    }

    public void a() {
        glk.a("Babel_calls", "onVideoFramesStarted for %s", m());
        this.z = true;
        j();
    }

    public void b() {
        glk.a("Babel_calls", "onVideoFramesStopped for %s", m());
        this.z = false;
        j();
    }

    protected void c(String str) {
        iil.b("Expected non-null", (Object) str);
        bko a = this.c.a();
        if (this.B.c()) {
            this.B.a(str, this.t, this.C.d(blc.a()), (iic) this.C.b().a());
            return;
        }
        fsi fsi = (fsi) jyn.a(getContext(), fsi.class);
        if (this.y != null) {
            fsi.b(this.y);
        }
        this.y = new bnn(new gkc(str, a.a()).a(blc.a()).d(true), this, true, null);
        if (fsi.a(this.y)) {
            this.y = null;
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        if (z) {
            this.m = gkt.d();
            this.n = gkd.a(this.m);
            this.h.setImageBitmap(this.m);
            this.f.a(this.a.a());
        }
    }
}
