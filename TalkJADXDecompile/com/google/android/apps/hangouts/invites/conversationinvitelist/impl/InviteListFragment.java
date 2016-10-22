package com.google.android.apps.hangouts.invites.conversationinvitelist.impl;

import android.animation.LayoutTransition;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import ba;
import bbm;
import bc;
import com.google.android.apps.hangouts.listui.SwipeableListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dci;
import dqq;
import dqs;
import dqt;
import dqu;
import dqv;
import dr;
import drx;
import fh;
import gah;
import gai;
import gis;
import glk;
import gma;
import gwb;
import iih;
import java.util.concurrent.TimeUnit;
import jca;
import jcf;
import jcm;
import jxz;
import kae;

public class InviteListFragment extends dci<SwipeableListView, dqq> implements OnItemClickListener, jxz {
    public static final boolean a;
    private static final gma g;
    private iih aj;
    private gai ak;
    private boolean al;
    private View am;
    private LinearLayout an;
    private ImageView ao;
    private TextView ap;
    private boolean aq;
    private final jcm ar;
    public final Handler b;
    public jca c;
    public jcf d;
    public dqs e;
    public final Runnable f;
    private bbm h;
    private drx i;

    public InviteListFragment() {
        this.b = new Handler();
        this.ak = new gai((dr) this, this.lifecycle).b(this.binder);
        this.f = new dqt(this);
        this.ar = new dqu(this);
    }

    static {
        kae kae = glk.f;
        a = false;
        g = gma.a("InviteListFragment");
    }

    public ListView e() {
        return (ListView) this.bI;
    }

    public void onCreate(Bundle bundle) {
        String b = g.b("onCreate");
        try {
            super.onCreate(bundle);
            this.al = false;
        } finally {
            g.c(b);
        }
    }

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.c = (jca) this.binder.a(jca.class);
        this.h = (bbm) this.binder.a(bbm.class);
        this.d = (jcf) this.binder.a(jcf.class);
        this.aj = (iih) this.binder.a(iih.class);
        this.i = (drx) this.binder.b(drx.class);
    }

    public void onStart() {
        super.onStart();
        ((dqq) this.bH).d();
        this.f.run();
        if (isEmpty()) {
            ((dqq) this.bH).k();
        }
        ((jcf) this.binder.a(jcf.class)).a(this.ar);
        if (this.aq) {
            this.ak.a(new gah(getActivity()).a(getString(bc.kY, this.h.c(this.c.a()))).a(TimeUnit.SECONDS.toMillis(5)).a());
        }
        a(getView());
    }

    public void onStop() {
        super.onStop();
        this.b.removeCallbacks(this.f);
        ((dqq) this.bH).c();
        ((jcf) this.binder.a(jcf.class)).b(this.ar);
    }

    public void a(View view) {
        if (a) {
            boolean o = ((dqq) this.bH).o();
            new StringBuilder(40).append("updateView isLoading=").append(o).append(" isEmpty=").append(isEmpty());
        }
        if (isEmpty() && ((dqq) this.bH).o()) {
            showEmptyViewProgress(view);
            this.am.setVisibility(8);
        } else if (isEmpty()) {
            showEmptyView(view);
        } else {
            showContent(view);
            if (((dqq) this.bH).l()) {
                this.am.setVisibility(8);
            } else {
                this.am.setVisibility(0);
            }
            if (!this.al) {
                a(1548);
                this.al = true;
            }
        }
    }

    protected void showEmptyView(View view) {
        int i = ba.lJ;
        int i2 = ba.lt;
        if (!this.al) {
            a(1549);
            this.al = true;
        }
        this.ap.setText(i);
        if (this.ao == null) {
            this.ao = new ImageView(this.an.getContext());
            this.ao.setImageResource(i2);
            this.an.addView(this.ao, 0);
        }
        super.showEmptyView(view);
    }

    protected void doShowEmptyViewProgress(View view) {
        boolean isEmpty = isEmpty();
        if (a) {
            new StringBuilder(43).append("doShowEmptyViewProgress cursorIsEmpty=").append(isEmpty);
        }
        if (isEmpty) {
            view.findViewById(16908292).setVisibility(8);
            view.findViewById(gwb.qI).setVisibility(0);
        }
    }

    public void showContent(View view) {
        if (this.ao != null) {
            this.an.removeView(this.ao);
            this.ao = null;
        }
        super.showContent(view);
        view.findViewById(gwb.qI).setVisibility(8);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(gwb.qQ, viewGroup, false);
        this.bI = (SwipeableListView) viewGroup2.findViewById(16908298);
        ((SwipeableListView) this.bI).a(false);
        ((SwipeableListView) this.bI).setAccessibilityDelegate(new gis());
        ((SwipeableListView) this.bI).addHeaderView(layoutInflater.inflate(gwb.qU, this.bI, false));
        View inflate = layoutInflater.inflate(gwb.qS, this.bI, false);
        this.am = inflate.findViewById(gwb.qJ);
        ((SwipeableListView) this.bI).addFooterView(inflate);
        this.am.setVisibility(8);
        ((SwipeableListView) this.bI).setOnItemClickListener(this);
        this.bH = new dqq(getActivity(), null, this);
        if (bundle == null) {
            ((dqq) this.bH).p();
        }
        this.an = (LinearLayout) viewGroup2.findViewById(gwb.qL);
        this.ap = (TextView) viewGroup2.findViewById(gwb.qM);
        ((SwipeableListView) this.bI).setAdapter(((dqq) this.bH).o);
        ((SwipeableListView) this.bI).setOnScrollListener(new dqv(this));
        viewGroup2.setLayoutTransition(new LayoutTransition());
        if (bundle == null && this.i != null) {
            this.i.a(getFragmentManager(), this.c.a());
        }
        return viewGroup2;
    }

    public void a(boolean z) {
        this.aq = z;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().b(1, null, (fh) this.bH);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item = ((SwipeableListView) this.bI).getAdapter().getItem(i);
        if (item != null && (item instanceof Cursor)) {
            ((dqq) this.bH).d((Cursor) item);
        }
    }

    public View b(View view) {
        return view.findViewById(gwb.qx);
    }

    public void an() {
        super.an();
    }

    public void a(int i) {
        this.aj.a(this.c.a()).b().c(i);
    }

    public void c_(String str) {
        if ("dismiss_high_affinity".equals(str)) {
            RealTimeChatService.a(this.c.a(), 1);
            a(2727);
        } else if (!"dismiss_low_affinity".equals(str)) {
            glk.e("Babel_InviteListFrag", "Attempted to decline all invites of an unknown affinity.", new Object[0]);
        } else if (this.c != null) {
            RealTimeChatService.a(this.c.a(), 2);
            a(2728);
            ((dqq) this.bH).p();
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }
}
