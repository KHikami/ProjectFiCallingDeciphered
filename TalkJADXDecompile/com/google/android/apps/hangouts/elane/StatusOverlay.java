package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import com.google.android.apps.hangouts.views.AvatarView;
import ctn;
import cug;
import cuj;
import cuk;
import cuq;
import cvh;
import cvm;
import cwi;
import cwj;
import cwk;
import cwl;
import cwm;
import edk;
import glk;
import gwb;
import itg;
import java.util.ArrayList;
import java.util.List;
import jyn;
import wi;

public final class StatusOverlay extends LinearLayout {
    private static final int[] g;
    public LinearLayout a;
    public TextView b;
    public Button c;
    public final Context d;
    public ctn e;
    public cuk f;
    private cvh h;
    private boolean i;
    private boolean j;
    private final Handler k;
    private final Runnable l;
    private final cvm m;
    private final itg n;
    private final cuq o;
    private final cug p;

    static {
        g = new int[]{ba.jp};
    }

    public StatusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Handler();
        this.l = new cwi(this);
        this.m = new cwj(this);
        this.n = new cwk(this);
        this.o = new cwl(this);
        this.p = new cug(this);
        this.d = context;
    }

    protected void onFinishInflate() {
        int i = 0;
        super.onFinishInflate();
        setVisibility(8);
        TypedArray obtainStyledAttributes = this.d.getTheme().obtainStyledAttributes(g);
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
        }
        setPadding(getPaddingLeft(), i + dimension, getPaddingRight(), getPaddingBottom());
        this.a = (LinearLayout) findViewById(gwb.oS);
        this.b = (TextView) findViewById(gwb.oU);
        this.c = (Button) findViewById(gwb.oT);
        this.c.setOnClickListener(new cwm(this));
        this.e = ((cuj) jyn.a(this.d, cuj.class)).a();
        this.h = this.e.h();
        this.f = this.e.j();
        a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a(this.n);
        this.h.a(this.m);
        this.f.a(this.o);
    }

    protected void onDetachedFromWindow() {
        this.e.b(this.n);
        this.h.b(this.m);
        this.f.b(this.o);
        super.onDetachedFromWindow();
    }

    public void a() {
        if (!this.e.o()) {
            glk.c("Babel_explane", "Showing green room", new Object[0]);
            gwb.i(this.d, 1588);
            this.j = true;
            c();
            this.e.a(this.p);
            setBackground(getResources().getDrawable(gwb.on));
            setVisibility(0);
        } else if (this.e.t()) {
            glk.c("Babel_explane", "Showing calling status overlay", new Object[0]);
            c();
            Resources resources = this.d.getResources();
            int size = this.f.a().a().size();
            ArrayList arrayList = new ArrayList();
            for (edk edk : this.f.a().a()) {
                Object obj = !TextUtils.isEmpty(edk.f) ? edk.f : edk.e;
                if (TextUtils.isEmpty(obj)) {
                    obj = resources.getString(ba.kv);
                }
                arrayList.add(obj);
            }
            switch (size) {
                case wi.w /*0*/:
                    glk.d("Babel_explane", "Calling but there are no invitees", new Object[0]);
                    this.b.setText("");
                    break;
                case wi.j /*1*/:
                    this.b.setText(resources.getString(ba.kj, new Object[]{arrayList.get(0)}));
                    break;
                case wi.l /*2*/:
                    this.b.setText(resources.getString(ba.kk, new Object[]{arrayList.get(0), arrayList.get(1)}));
                    break;
                case wi.z /*3*/:
                    this.b.setText(resources.getString(ba.kl, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)}));
                    break;
                case wi.h /*4*/:
                    this.b.setText(resources.getString(ba.km, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3)}));
                    break;
                default:
                    this.b.setText(resources.getString(ba.kn, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.valueOf(size - 3)}));
                    break;
            }
            a(new ArrayList(this.f.a().a()));
            d();
            setVisibility(0);
            this.b.setVisibility(0);
            this.a.setVisibility(0);
            this.c.setVisibility(8);
        } else if (this.e.s()) {
            glk.c("Babel_explane", "Not showing any status overlay", new Object[0]);
            c();
            setVisibility(8);
            this.b.setVisibility(8);
            this.a.setVisibility(8);
            this.c.setVisibility(8);
        } else if (this.j) {
            b();
        } else if (!this.i) {
            glk.c("Babel_explane", "Posting runnable to show connecting status overlay", new Object[0]);
            this.i = true;
            d();
            setVisibility(0);
            this.b.setVisibility(8);
            this.a.setVisibility(8);
            this.c.setVisibility(8);
            this.k.postDelayed(this.l, (long) this.d.getResources().getInteger(gwb.pc));
        }
    }

    public void b() {
        glk.c("Babel_explane", "Showing connecting status overlay", new Object[0]);
        this.b.setText(this.d.getResources().getString(ba.ko));
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
    }

    private void c() {
        this.i = false;
        this.k.removeCallbacks(this.l);
    }

    private void d() {
        setBackground(getResources().getDrawable(gwb.oo));
    }

    public void a(List<edk> list) {
        AvatarView[] avatarViewArr = new AvatarView[]{(AvatarView) this.a.findViewById(gwb.or), (AvatarView) this.a.findViewById(gwb.os), (AvatarView) this.a.findViewById(gwb.ot), (AvatarView) this.a.findViewById(gwb.ou)};
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (i != 3 || size <= 4) {
                edk edk = (edk) list.get(i);
                avatarViewArr[i].setVisibility(0);
                avatarViewArr[i].a(edk.h, edk.e != null ? edk.e : edk.g, this.e.c());
                i++;
            } else {
                TextView textView = (TextView) this.a.findViewById(gwb.oP);
                textView.setText(Integer.toString(size - 3));
                textView.setVisibility(0);
                return;
            }
        }
    }
}
