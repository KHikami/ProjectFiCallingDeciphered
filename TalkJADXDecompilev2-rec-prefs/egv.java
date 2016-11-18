package p000;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpStatusCodes;

public class egv extends dcj implements eer {
    static final int f11467a = bm.f3810L;
    static final int f11468b = bm.f3814P;
    static final int f11469c = bm.f3817S;
    static final int f11470d = bm.f3816R;
    private final ehj aA = new ehj();
    private final ehh aB = new ehh(this);
    private final eha aC = new eha(this);
    private final egz aD = new egz(this);
    private final OnClickListener aE = new ehc(this);
    private gnl aF;
    private ehe aG;
    bck aj;
    bxt ak;
    boolean al;
    boolean am;
    final ehi an = new ehi(this);
    ehk ao;
    SparseArray<String> ap;
    bjg aq;
    boolean ar;
    final ehb as = new ehb(this);
    final ehd at = new ehd(this);
    dth au;
    Parcelable av;
    private final lo<Integer, fh<Cursor>> aw = new lo();
    private final jiu ax = new jiu(this.lifecycle);
    private RecyclerView ay;
    private final ehf az = new ehf(this);
    jca f11471e;
    egj f11472f;
    boolean f11473g;
    boolean f11474h;
    bko f11475i;

    public egv() {
        gji gji = new gji(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        Object obj;
        super.onAttachBinder(bundle);
        this.f11471e = (jca) this.binder.m25443a(jca.class);
        ((eia) this.binder.m25443a(eia.class)).mo1884a(bm.ai, new egw(this));
        this.aj = (bck) this.binder.m25443a(bck.class);
        this.aj.m4864a(this.aC);
        bcj f = this.aj.m4877f();
        if (f == null || !(f == bcj.CREATE_NEW_GROUP_CONVERSATION || f == bcj.CREATE_NEW_HANGOUT || f == bcj.CREATE_NEW_ONE_ON_ONE)) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            eez eez = (eez) this.binder.m25454b(eez.class);
            if (eez != null) {
                obj = eez.mo1856a(this.context, this.f11471e.mo2317a(), this);
                if (obj != null) {
                    this.binder.m25455b(eeq.class, obj);
                    lk a = obj.mo1859a();
                    this.aw.put((Integer) a.f25131a, (fh) a.f25132b);
                }
            }
        }
        this.au = ((dti) this.binder.m25443a(dti.class)).mo1673a(17);
    }

    boolean m13907b() {
        if (this.al) {
            if (fdq.f12774P.m14370b(this.f11475i.m5638g())) {
                return true;
            }
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.av = bundle.getParcelable("scroll_state");
        }
        this.f11475i = m13898c();
        this.ak = (bxt) getActivity().getIntent().getSerializableExtra("conversation_type");
        if (this.ak == null) {
            this.ak = bxt.HANGOUTS_MESSAGE;
        }
        this.al = this.ak != bxt.SMS_MESSAGE;
        this.ap = new SparseArray();
        if (gld.m17937a(this.context)) {
            getActivity().getWindow().setSoftInputMode(2);
        }
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle, gwb.sE);
        this.ay = (RecyclerView) onCreateView.findViewById(16908298);
        this.ay.m3051a(null);
        this.ay.m3061a(true);
        viewGroup.getContext();
        aef acx = new acx(1, false);
        acx.m545b(true);
        this.ay.m3054a(acx);
        this.ay.setFocusable(true);
        registerForContextMenu(this.ay);
        this.ay.m3056a(this.aA);
        this.f11472f = new egj(this.context, m13898c(), this.aj, this.aD, this.az, this.aE, this.aF, this.ak, this.al);
        if (this.ay != null) {
            this.ay.m3050a(this.f11472f);
        }
        m13905a(false);
        ehz ehz = (ehz) jyn.m25426a(this.context, ehz.class);
        if (!(bkq.m5695f(this.context, this.f11475i.m5638g()) || (ehz.mo1882a("android.permission.READ_CONTACTS") && ehz.mo1882a("android.permission.WRITE_CONTACTS")))) {
            glk.m17979c("Babel", "contact permission banner shown", new Object[0]);
            gwb.m1823a(this.f11475i, 2671);
            View findViewById = onCreateView.findViewById(bm.ai);
            findViewById.setVisibility(0);
            ((Button) onCreateView.findViewById(bm.aj)).setOnClickListener(new egx(this, findViewById));
            ((Button) onCreateView.findViewById(bm.ah)).setOnClickListener(new egy(this, findViewById));
        }
        this.f11474h = true;
        return onCreateView;
    }

    public void mo495a() {
        m13901a(getView());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.av = this.ay.m3072c().mo59g();
        bundle.putParcelable("scroll_state", this.av);
    }

    public void onPause() {
        super.onPause();
        if (getActivity().isFinishing() && !TextUtils.isEmpty(this.aj.m4881j()) && this.f11472f.m13886d(true)) {
            gwb.m1823a(this.f11475i, 2289);
        }
    }

    void m13905a(boolean z) {
        this.ax.m24333a(jix.LOADING);
        if (isAdded()) {
            fg loaderManager = getLoaderManager();
            int i;
            if (z) {
                if (this.al) {
                    loaderManager.mo1998b(f11467a, null, this.aB);
                }
                if (m13907b()) {
                    loaderManager.mo1998b(f11469c, null, this.aB);
                    loaderManager.mo1998b(f11470d, null, this.aB);
                } else {
                    loaderManager.mo1998b(f11468b, null, this.aB);
                }
                for (i = 0; i < this.aw.size(); i++) {
                    int a = gwb.m1507a((Integer) this.aw.m28017b(i));
                    loaderManager.mo1995a(a);
                    if (this.aj != null && this.aj.m4867b() == 0) {
                        loaderManager.mo1998b(a, null, (fh) this.aw.m28018c(i));
                    }
                }
                return;
            }
            if (this.al) {
                loaderManager.mo1994a(f11467a, null, this.aB);
            }
            if (m13907b()) {
                loaderManager.mo1994a(f11469c, null, this.aB);
                loaderManager.mo1994a(f11470d, null, this.aB);
            } else {
                loaderManager.mo1994a(f11468b, null, this.aB);
            }
            for (i = 0; i < this.aw.size(); i++) {
                loaderManager.mo1994a(gwb.m1507a((Integer) this.aw.m28017b(i)), null, (fh) this.aw.m28018c(i));
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (m13898c() != null) {
            m13901a(getView());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.as.m6420d();
        this.at.m6420d();
        this.ap = null;
        RealTimeChatService.m9077b(this.an);
    }

    void m13901a(View view) {
        boolean z = false;
        if (view != null) {
            View findViewById = view.findViewById(ba.fd);
            View findViewById2 = view.findViewById(bm.f3811M);
            findViewById2.setVisibility(8);
            if (this.ar) {
                this.ay.setVisibility(8);
                findViewById.setVisibility(0);
                this.ax.m24333a(jix.LOADED);
            } else {
                boolean z2;
                if (this.f11472f == null || !this.f11472f.m13880b(false)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.ay.setVisibility(8);
                    findViewById.setVisibility(8);
                    this.ax.m24333a(jix.LOADING);
                } else if (isEmpty()) {
                    findViewById2.setVisibility(0);
                    this.ay.setVisibility(8);
                    findViewById.setVisibility(8);
                    setupEmptyView(view, gwb.te, gwb.td);
                    this.ax.m24333a(jix.EMPTY);
                    gwb.m1823a(this.f11475i, 2138);
                    z = true;
                } else {
                    this.ay.setVisibility(0);
                    if (this.av != null) {
                        this.ay.m3072c().mo44a(this.av);
                        this.av = null;
                    }
                    findViewById.setVisibility(8);
                    this.ax.m24333a(jix.LOADED);
                    z = true;
                }
            }
            if (z && this.aG != null) {
                this.au.mo1668a(this.f11471e.mo2317a(), this.aG.f11493a, this.aG.f11494b);
                this.aG = null;
            }
        }
    }

    protected boolean isEmpty() {
        return TextUtils.isEmpty(this.aj.m4881j()) && this.f11472f.m13886d(false);
    }

    public void m13904a(String str, int i) {
        boolean z;
        boolean z2 = true;
        if (this.aG == null) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Overwriting unreported event");
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = true;
        }
        ba.m4578a(z, (Object) "event must be valid.");
        if (i <= 0) {
            z2 = false;
        }
        ba.m4578a(z2, (Object) "eventDetail must be valid.");
        this.aG = new ehe(str, i);
    }

    public void m13906b(boolean z) {
        this.f11473g = z;
    }

    public void m13908c(boolean z) {
        this.am = true;
    }

    public int m13899a(gon gon) {
        int i = 0;
        aer c = this.ay.m3073c((View) gon);
        if (c == null) {
            return -1;
        }
        int e = c.m865e();
        int h = this.f11472f.m13861h(e);
        for (int i2 = 0; i2 <= h; i2++) {
            fmz f = this.f11472f.m13857f(i2);
            if (!this.f11472f.mo1873b(f)) {
                i++;
            } else if (f.m13778d()) {
                i++;
            }
        }
        return e - i;
    }

    public void m13902a(ehk ehk) {
        this.ao = ehk;
    }

    public void m13903a(gnl gnl) {
        this.aF = gnl;
    }

    private bko m13898c() {
        return fde.m15018e(this.f11471e.mo2317a());
    }

    private void m13896a(bjg bjg, int i) {
        gwb.m1823a(this.f11475i, i);
        edv.m13614a(bjg, gou.CONTACTS, null, 0, 0, 0).mo2341a(getFragmentManager(), null);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (this.aD != null) {
            switch (itemId) {
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    String e = this.aq.mo571e();
                    RealTimeChatService.m9040a(this.an);
                    fme a = ((fmf) this.binder.m25443a(fmf.class)).mo2035a();
                    this.ap.append(a.m15674a(), e);
                    RealTimeChatService.m9080b(a, m13898c(), this.aq.mo575i());
                    ((iih) this.binder.m25443a(iih.class)).mo1979a(this.f11471e.mo2317a()).mo1693b().mo1714c(3313);
                    return true;
            }
        }
        return false;
    }
}
