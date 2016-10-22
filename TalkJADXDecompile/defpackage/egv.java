package defpackage;

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

/* renamed from: egv */
public class egv extends dcj implements eer {
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    private final ehj aA;
    private final ehh aB;
    private final eha aC;
    private final egz aD;
    private final OnClickListener aE;
    private gnl aF;
    private ehe aG;
    bck aj;
    bxt ak;
    boolean al;
    boolean am;
    final ehi an;
    ehk ao;
    SparseArray<String> ap;
    bjg aq;
    boolean ar;
    final ehb as;
    final ehd at;
    dth au;
    Parcelable av;
    private final lo<Integer, fh<Cursor>> aw;
    private final jiu ax;
    private RecyclerView ay;
    private final ehf az;
    jca e;
    egj f;
    boolean g;
    boolean h;
    bko i;

    public egv() {
        this.aw = new lo();
        this.ax = new jiu(this.lifecycle);
        this.az = new ehf(this);
        this.aA = new ehj();
        this.aB = new ehh(this);
        this.an = new ehi(this);
        this.aC = new eha(this);
        this.aD = new egz(this);
        this.aE = new ehc(this);
        this.as = new ehb(this);
        this.at = new ehd(this);
        gji gji = new gji(this, this.lifecycle);
    }

    static {
        a = bm.L;
        b = bm.P;
        c = bm.S;
        d = bm.R;
    }

    protected void onAttachBinder(Bundle bundle) {
        Object obj;
        super.onAttachBinder(bundle);
        this.e = (jca) this.binder.a(jca.class);
        ((eia) this.binder.a(eia.class)).a(bm.ai, new egw(this));
        this.aj = (bck) this.binder.a(bck.class);
        this.aj.a(this.aC);
        bcj f = this.aj.f();
        if (f == null || !(f == bcj.CREATE_NEW_GROUP_CONVERSATION || f == bcj.CREATE_NEW_HANGOUT || f == bcj.CREATE_NEW_ONE_ON_ONE)) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            eez eez = (eez) this.binder.b(eez.class);
            if (eez != null) {
                obj = eez.a(this.context, this.e.a(), this);
                if (obj != null) {
                    this.binder.b(eeq.class, obj);
                    lk a = obj.a();
                    this.aw.put((Integer) a.a, (fh) a.b);
                }
            }
        }
        this.au = ((dti) this.binder.a(dti.class)).a(17);
    }

    boolean b() {
        if (this.al) {
            if (fdq.P.b(this.i.g())) {
                return true;
            }
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.av = bundle.getParcelable("scroll_state");
        }
        this.i = c();
        this.ak = (bxt) getActivity().getIntent().getSerializableExtra("conversation_type");
        if (this.ak == null) {
            this.ak = bxt.HANGOUTS_MESSAGE;
        }
        this.al = this.ak != bxt.SMS_MESSAGE;
        this.ap = new SparseArray();
        if (gld.a(this.context)) {
            getActivity().getWindow().setSoftInputMode(2);
        }
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle, gwb.sE);
        this.ay = (RecyclerView) onCreateView.findViewById(16908298);
        this.ay.a(null);
        this.ay.a(true);
        viewGroup.getContext();
        aef acx = new acx(1, false);
        acx.b(true);
        this.ay.a(acx);
        this.ay.setFocusable(true);
        registerForContextMenu(this.ay);
        this.ay.a(this.aA);
        this.f = new egj(this.context, c(), this.aj, this.aD, this.az, this.aE, this.aF, this.ak, this.al);
        if (this.ay != null) {
            this.ay.a(this.f);
        }
        a(false);
        ehz ehz = (ehz) jyn.a(this.context, ehz.class);
        if (!(bkq.f(this.context, this.i.g()) || (ehz.a("android.permission.READ_CONTACTS") && ehz.a("android.permission.WRITE_CONTACTS")))) {
            glk.c("Babel", "contact permission banner shown", new Object[0]);
            gwb.a(this.i, 2671);
            View findViewById = onCreateView.findViewById(bm.ai);
            findViewById.setVisibility(0);
            ((Button) onCreateView.findViewById(bm.aj)).setOnClickListener(new egx(this, findViewById));
            ((Button) onCreateView.findViewById(bm.ah)).setOnClickListener(new egy(this, findViewById));
        }
        this.h = true;
        return onCreateView;
    }

    public void a() {
        a(getView());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.av = this.ay.c().g();
        bundle.putParcelable("scroll_state", this.av);
    }

    public void onPause() {
        super.onPause();
        if (getActivity().isFinishing() && !TextUtils.isEmpty(this.aj.j()) && this.f.d(true)) {
            gwb.a(this.i, 2289);
        }
    }

    void a(boolean z) {
        this.ax.a(jix.LOADING);
        if (isAdded()) {
            fg loaderManager = getLoaderManager();
            int i;
            if (z) {
                if (this.al) {
                    loaderManager.b(a, null, this.aB);
                }
                if (b()) {
                    loaderManager.b(c, null, this.aB);
                    loaderManager.b(d, null, this.aB);
                } else {
                    loaderManager.b(b, null, this.aB);
                }
                for (i = 0; i < this.aw.size(); i++) {
                    int a = gwb.a((Integer) this.aw.b(i));
                    loaderManager.a(a);
                    if (this.aj != null && this.aj.b() == 0) {
                        loaderManager.b(a, null, (fh) this.aw.c(i));
                    }
                }
                return;
            }
            if (this.al) {
                loaderManager.a(a, null, this.aB);
            }
            if (b()) {
                loaderManager.a(c, null, this.aB);
                loaderManager.a(d, null, this.aB);
            } else {
                loaderManager.a(b, null, this.aB);
            }
            for (i = 0; i < this.aw.size(); i++) {
                loaderManager.a(gwb.a((Integer) this.aw.b(i)), null, (fh) this.aw.c(i));
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (c() != null) {
            a(getView());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.as.d();
        this.at.d();
        this.ap = null;
        RealTimeChatService.b(this.an);
    }

    void a(View view) {
        boolean z = false;
        if (view != null) {
            View findViewById = view.findViewById(ba.fd);
            View findViewById2 = view.findViewById(bm.M);
            findViewById2.setVisibility(8);
            if (this.ar) {
                this.ay.setVisibility(8);
                findViewById.setVisibility(0);
                this.ax.a(jix.LOADED);
            } else {
                boolean z2;
                if (this.f == null || !this.f.b(false)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.ay.setVisibility(8);
                    findViewById.setVisibility(8);
                    this.ax.a(jix.LOADING);
                } else if (isEmpty()) {
                    findViewById2.setVisibility(0);
                    this.ay.setVisibility(8);
                    findViewById.setVisibility(8);
                    setupEmptyView(view, gwb.te, gwb.td);
                    this.ax.a(jix.EMPTY);
                    gwb.a(this.i, 2138);
                    z = true;
                } else {
                    this.ay.setVisibility(0);
                    if (this.av != null) {
                        this.ay.c().a(this.av);
                        this.av = null;
                    }
                    findViewById.setVisibility(8);
                    this.ax.a(jix.LOADED);
                    z = true;
                }
            }
            if (z && this.aG != null) {
                this.au.a(this.e.a(), this.aG.a, this.aG.b);
                this.aG = null;
            }
        }
    }

    protected boolean isEmpty() {
        return TextUtils.isEmpty(this.aj.j()) && this.f.d(false);
    }

    public void a(String str, int i) {
        boolean z;
        boolean z2 = true;
        if (this.aG == null) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Overwriting unreported event");
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = true;
        }
        ba.a(z, (Object) "event must be valid.");
        if (i <= 0) {
            z2 = false;
        }
        ba.a(z2, (Object) "eventDetail must be valid.");
        this.aG = new ehe(str, i);
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.am = true;
    }

    public int a(gon gon) {
        int i = 0;
        aer c = this.ay.c((View) gon);
        if (c == null) {
            return -1;
        }
        int e = c.e();
        int h = this.f.h(e);
        for (int i2 = 0; i2 <= h; i2++) {
            fmz f = this.f.f(i2);
            if (!this.f.b(f)) {
                i++;
            } else if (f.d()) {
                i++;
            }
        }
        return e - i;
    }

    public void a(ehk ehk) {
        this.ao = ehk;
    }

    public void a(gnl gnl) {
        this.aF = gnl;
    }

    private bko c() {
        return fde.e(this.e.a());
    }

    private void a(bjg bjg, int i) {
        gwb.a(this.i, i);
        edv.a(bjg, gou.CONTACTS, null, 0, 0, 0).a(getFragmentManager(), null);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (this.aD != null) {
            switch (itemId) {
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    String e = this.aq.e();
                    RealTimeChatService.a(this.an);
                    fme a = ((fmf) this.binder.a(fmf.class)).a();
                    this.ap.append(a.a(), e);
                    RealTimeChatService.b(a, c(), this.aq.i());
                    ((iih) this.binder.a(iih.class)).a(this.e.a()).b().c(3313);
                    return true;
            }
        }
        return false;
    }
}
