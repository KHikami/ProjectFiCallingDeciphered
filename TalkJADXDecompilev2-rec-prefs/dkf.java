package p000;

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

public abstract class dkf extends LinearLayout implements bnq, dht, ita {
    private me f9989A;
    private dex f9990B;
    private dey f9991C;
    public itl f9992a;
    public final dgg f9993b = dgg.m11692a();
    public dhu f9994c;
    public final djd f9995d;
    public final ParticipantTrayView f9996e;
    public final FocusedParticipantView f9997f;
    public int f9998g = 0;
    final ImageView f9999h;
    public final ImageButton f10000i;
    final RemoteParticipantPopupMenu f10001j;
    boolean f10002k;
    boolean f10003l;
    public Bitmap f10004m;
    Bitmap f10005n;
    boolean f10006o = true;
    private final ViewGroup f10007p;
    private final TextView f10008q;
    private final ParticipantOverlays f10009r;
    private final dlg f10010s;
    private final azx<Bitmap> f10011t = new dkg(this);
    private boolean f10012u;
    private boolean f10013v;
    private String f10014w;
    private String f10015x;
    private bnn f10016y;
    private boolean f10017z;

    abstract String mo1588m();

    dkf(djd djd, itl itl, ParticipantTrayView participantTrayView, FocusedParticipantView focusedParticipantView) {
        super(participantTrayView.getContext(), null);
        iil.m21875b("Expected non-null", (Object) itl);
        this.f9995d = djd;
        this.f9992a = itl;
        this.f9996e = participantTrayView;
        this.f9997f = focusedParticipantView;
        dkf.inflate(getContext(), gwb.gE, this);
        this.f10007p = (ViewGroup) findViewById(ba.bW);
        this.f9999h = (ImageView) findViewById(ba.bY);
        this.f10000i = (ImageButton) findViewById(ba.bV);
        this.f10000i.setOnClickListener(new dkh(this));
        this.f10000i.setOnLongClickListener(new dki(this));
        this.f10001j = (RemoteParticipantPopupMenu) findViewById(ba.ee);
        this.f10008q = (TextView) findViewById(ba.bZ);
        this.f10010s = new dlg(getContext(), this.f10007p);
        this.f10009r = (ParticipantOverlays) findViewById(ba.dT);
        this.f9989A = new me(getContext(), new dkk(this));
        this.f9990B = (dex) jyn.m25426a(getContext(), dex.class);
        this.f9991C = (dey) jyn.m25426a(getContext(), dey.class);
    }

    public void mo1110a(dhu dhu) {
        this.f9994c = dhu;
        mo1589n();
        if (this.f10003l && dhu.m11864n() != null) {
            dhu.m11864n().m23109b(mo1588m());
        }
        m12115j();
        m12112g();
        this.f10009r.m8653a(this.f9992a);
        this.f10009r.setVisibility(0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return this.f9989A.m31932a(motionEvent);
    }

    public void mo1585c() {
        if (this.f9994c.m11864n() != null) {
            this.f9994c.m11864n().m23106a(mo1588m());
        }
        if (this.f10016y != null) {
            this.f10016y.mo607b();
            this.f10016y = null;
        }
        if (this.f10001j.m8684a()) {
            this.f10001j.m8685b();
        }
    }

    public void y_() {
        this.f10009r.m8652a();
        mo1585c();
    }

    public void mo1109a(int i) {
        if (i == 2) {
            mo1589n();
        }
    }

    private void mo1589n() {
        if (this.f9994c.m11864n() != null) {
            this.f9994c.m11864n().m23107a(mo1588m(), findViewById(ba.ca), -1, new dkl(this));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        m12112g();
    }

    public itl m12108d() {
        return this.f9992a;
    }

    protected void m12110e() {
        boolean z = this.f10003l;
        if (this.f9994c.m11864n() != null) {
            this.f9994c.m11864n().m23109b(z ? null : mo1588m());
        }
        this.f9995d.m12051j();
        this.f10003l = !z;
        m12115j();
    }

    void m12103b(int i) {
        this.f10010s.m12186a(i);
    }

    public void onWindowVisibilityChanged(int i) {
        if (i != 0) {
            m12111f();
        }
    }

    public void m12111f() {
        if (this.f10001j.m8684a()) {
            this.f10001j.m8685b();
            this.f10001j.setVisibility(8);
        }
    }

    void m12112g() {
        LayoutParams layoutParams = this.f10007p.getLayoutParams();
        Resources resources = this.f10000i.getResources();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        TypedValue typedValue = new TypedValue();
        resources.getValue(gwb.eT, typedValue, true);
        float f = typedValue.getFloat();
        int dimensionPixelSize = resources.getDimensionPixelSize(gwb.eS);
        layoutParams.height = Math.min(Math.min((int) (f * ((float) (point.y - (dimensionPixelSize << 1)))), (point.x - (dimensionPixelSize << 1)) / resources.getInteger(gwb.fz)), resources.getDimensionPixelSize(gwb.eU));
        layoutParams.width = mo1592c(layoutParams.height);
        this.f10007p.setLayoutParams(layoutParams);
    }

    protected int mo1592c(int i) {
        return i;
    }

    void m12100a(String str) {
        this.f10014w = str;
        mo1590o();
    }

    String m12113h() {
        return this.f10014w;
    }

    void m12104b(String str) {
        this.f10015x = str;
        mo1590o();
    }

    private void mo1590o() {
        m12101a(this.f10003l);
        CharSequence charSequence = this.f10015x != null ? this.f10015x : this.f10014w;
        TextView textView = this.f10008q;
        if (this.f9992a.m23249j()) {
            charSequence = glq.m18038i(gwb.m1400H(), charSequence);
        }
        textView.setText(charSequence);
    }

    boolean m12114i() {
        return this.f10012u;
    }

    public void m12115j() {
        ImageView imageView;
        int i = 4;
        if (this.f10017z) {
            mo1586d(3);
        } else {
            mo1586d(1);
        }
        this.f10013v = this.f9992a.m23251l();
        this.f9999h.setImageBitmap(mo1587k());
        if (this.f10002k || this.f10013v) {
            this.f10008q.setVisibility(0);
            this.f10000i.setBackgroundResource(R$drawable.aA);
            imageView = this.f9999h;
        } else {
            this.f10008q.setVisibility(4);
            this.f10000i.setBackgroundResource(R$drawable.aC);
            imageView = this.f9999h;
            if (!this.f10017z) {
                i = 0;
            }
        }
        imageView.setVisibility(i);
        if (this.f10002k) {
            if (this.f10017z) {
                this.f9997f.m8559d();
            } else {
                this.f9997f.m8560e();
            }
        }
        if (this.f10013v) {
            this.f10000i.setImageResource(R$drawable.bj);
        } else if (this.f10003l) {
            this.f10000i.setImageResource(R$drawable.aB);
        } else {
            this.f10000i.setImageResource(0);
        }
        m12101a(this.f10003l);
    }

    protected void mo1586d(int i) {
        iil.m21868a(i, 1, 3);
        if (this.f9998g != i) {
            String valueOf = String.valueOf(this.f9992a.m23229a());
            new StringBuilder(String.valueOf(valueOf).length() + 56).append("ParticipantView: switch ").append(valueOf).append(" from ").append(this.f9998g).append(" to ").append(i);
            this.f9998g = i;
        }
    }

    Bitmap mo1587k() {
        if (this.f10004m != null) {
            return this.f10004m;
        }
        if (this.f9992a.m23249j()) {
            return blc.m5745c();
        }
        return blc.m5745c();
    }

    public Bitmap m12117l() {
        if (this.f10005n != null) {
            return this.f10005n;
        }
        if (this.f9992a.m23249j()) {
            return blc.m5744b();
        }
        return blc.m5744b();
    }

    protected void m12101a(boolean z) {
        int i;
        if (z) {
            if (this.f9992a.m23238d()) {
                i = bc.tE;
            } else {
                i = bc.tD;
            }
        } else if (this.f9992a.m23238d()) {
            i = bc.in;
        } else {
            i = bc.im;
        }
        this.f10000i.setContentDescription(getResources().getString(i, new Object[]{m12113h()}));
    }

    public boolean isFocused() {
        return this.f10002k;
    }

    public void mo1441a() {
        glk.m17970a("Babel_calls", "onVideoFramesStarted for %s", mo1588m());
        this.f10017z = true;
        m12115j();
    }

    public void mo1442b() {
        glk.m17970a("Babel_calls", "onVideoFramesStopped for %s", mo1588m());
        this.f10017z = false;
        m12115j();
    }

    protected void m12107c(String str) {
        iil.m21875b("Expected non-null", (Object) str);
        bko a = this.f9994c.m11848a();
        if (this.f9990B.mo1511c()) {
            this.f9990B.mo1507a(str, this.f10011t, this.f9991C.mo1519d(blc.m5738a()), (iic) this.f9991C.mo1515b().m3523a());
            return;
        }
        fsi fsi = (fsi) jyn.m25426a(getContext(), fsi.class);
        if (this.f10016y != null) {
            fsi.m12714b(this.f10016y);
        }
        this.f10016y = new bnn(new gkc(str, a.m5629a()).m5547a(blc.m5738a()).m5558d(true), this, true, null);
        if (fsi.mo2072a(this.f10016y)) {
            this.f10016y = null;
        }
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.m21872a("Expected null", (Object) gjo);
        if (z) {
            this.f10004m = gkt.m17897d();
            this.f10005n = gkd.m17871a(this.f10004m);
            this.f9999h.setImageBitmap(this.f10004m);
            this.f9997f.m8556a(this.f9992a.m23229a());
        }
    }
}
