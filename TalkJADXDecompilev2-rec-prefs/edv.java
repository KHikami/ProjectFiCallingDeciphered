package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import java.util.Collections;

public final class edv extends jbp<edr> {
    private edr aA;
    private cbt aB;
    private gou aC;
    eef aj;
    jyr ak;
    jyn al;
    kbu am = new kbu();
    bko an;
    bpt ao;
    bck ap;
    fit aq;
    fmf ar;
    bjg as;
    bxt at;
    String au;
    long av;
    int aw;
    int ax;
    private final bpu ay = new edw(this);
    private iih az;

    protected /* synthetic */ ListAdapter mo1003t() {
        return m13615v();
    }

    public static dq m13614a(bjg bjg, gou gou, String str, long j, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("action_sheet_hangouts_contact", bjg);
        bundle.putSerializable("action_sheet_context", gou);
        bundle.putString("action_sheet_conversation_id", str);
        bundle.putLong("action_sheet_latest_event_timestamp", j);
        bundle.putInt("action_sheet_client_conversation_type", i);
        bundle.putInt("action_sheet_conversation_transport", i2);
        dq edv = new edv();
        edv.setArguments(bundle);
        return edv;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.as = (bjg) getArguments().getSerializable("action_sheet_hangouts_contact");
            this.aC = (gou) getArguments().getSerializable("action_sheet_context");
            this.au = getArguments().getString("action_sheet_conversation_id");
            this.av = getArguments().getLong("action_sheet_latest_event_timestamp");
            this.aw = getArguments().getInt("action_sheet_client_conversation_type");
            this.ax = getArguments().getInt("action_sheet_conversation_transport");
        } else {
            this.as = (bjg) bundle.getSerializable("action_sheet_hangouts_contact");
            this.aC = (gou) bundle.getSerializable("action_sheet_context");
            this.ap = (bck) bundle.getSerializable("action_sheet_edit_participants_model");
            this.at = (bxt) bundle.getSerializable("action_sheet_conversation_type");
            this.au = bundle.getString("action_sheet_conversation_id");
            this.av = bundle.getLong("action_sheet_latest_event_timestamp");
            this.aw = bundle.getInt("action_sheet_client_conversation_type");
            this.ax = bundle.getInt("action_sheet_conversation_transport");
        }
        if (this.at != null) {
            this.ao = ((bpv) this.al.m25443a(bpv.class)).mo664a(this.ak, this.am, 0, this, this.ap, this.at);
        } else if (this.aC.equals(gou.PEOPLE_OPTIONS)) {
            m13616a(3235);
        } else {
            m13616a(2504);
        }
        this.am.m25526c(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("action_sheet_hangouts_contact", this.as);
        bundle.putSerializable("action_sheet_context", this.aC);
        bundle.putSerializable("action_sheet_edit_participants_model", this.ap);
        bundle.putSerializable("action_sheet_conversation_type", this.at);
        bundle.putString("action_sheet_conversation_id", this.au);
        bundle.putLong("action_sheet_latest_event_timestamp", this.av);
        bundle.putInt("action_sheet_client_conversation_type", this.aw);
        bundle.putInt("action_sheet_conversation_transport", this.ax);
        this.am.m25527d(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.ak = new jyr(activity, jyn.m25429a((Context) activity, getParentFragment()));
        this.al = this.ak.getBinder();
        this.am.m25513a(new edx(this));
        this.al.m25444a(bpu.class, this.ay);
        this.an = fde.m15018e(((jca) this.al.m25443a(jca.class)).mo2317a());
        this.az = (iih) this.al.m25443a(iih.class);
        this.aB = (cbt) this.al.m25454b(cbt.class);
        this.aq = (fit) this.al.m25443a(fit.class);
        this.ar = (fmf) this.al.m25443a(fmf.class);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.at == null) {
            m13616a(2505);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.am.mo3638c();
    }

    private edr m13615v() {
        Object obj;
        Object obj2;
        Resources resources = getResources();
        this.aA = new edr(this.ak);
        gmd gmd = new gmd(this.ak, Collections.singletonList(this.as));
        Drawable drawable = resources.getDrawable(gwb.sa);
        Drawable drawable2 = resources.getDrawable(gwb.se);
        Drawable drawable3 = resources.getDrawable(gwb.sc);
        Drawable drawable4 = resources.getDrawable(gwb.sf);
        Drawable drawable5 = resources.getDrawable(gwb.sd);
        Drawable drawable6 = resources.getDrawable(gwb.sb);
        Drawable drawable7 = resources.getDrawable(gwb.rZ);
        this.aA.add(new eeg(this.as));
        boolean d = ((bbm) this.al.m25443a(bbm.class)).mo444d(this.an.m5638g());
        boolean b = gmd.m18083b();
        Object obj3 = (b || gmd.m18082a()) ? 1 : null;
        Object obj4 = (d && this.as.m5407z()) ? 1 : null;
        Object obj5 = (b && (this.aC.equals(gou.PEOPLE_OPTIONS) || this.aC.equals(gou.PEOPLE_OPTIONS_GUEST))) ? 1 : null;
        if (this.aC.equals(gou.PEOPLE_OPTIONS)) {
            if (fdq.f12793i.m14370b(this.an.m5638g())) {
                if (this.aw == 2 && this.ax == 1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Object obj6;
                    obj = 1;
                    if (this.aB == null) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    obj6 = (obj2 != null || (!(this.aC.equals(gou.PEOPLE_OPTIONS) || this.aC.equals(gou.PEOPLE_OPTIONS_GUEST)) || this.as.mo587u())) ? null : 1;
                    Object obj7 = (b || b || obj3 != null || obj4 != null) ? 1 : null;
                    obj2 = (obj5 != null && obj == null && obj6 == null) ? null : 1;
                    obj2 = (obj7 != null || obj2 == null) ? null : 1;
                    if (b) {
                        this.aA.add(new jbt(eee.f11298a - 1, resources.getString(ba.mf)).m23799a(drawable));
                    }
                    if (b) {
                        this.aA.add(new jbt(eee.f11301d - 1, resources.getString(ba.mj)).m23799a(drawable3));
                    }
                    if (obj3 != null) {
                        this.aA.add(new jbt(eee.f11300c - 1, resources.getString(ba.ml)).m23799a(drawable2));
                    }
                    if (obj4 != null) {
                        this.aA.add(new jbt(eee.f11299b - 1, resources.getString(ba.mh)).m23799a(drawable4));
                    }
                    if (obj2 != null) {
                        this.aA.add(new jbu());
                    }
                    if (obj5 != null) {
                        this.aA.add(new jbt(eee.f11302e - 1, resources.getString(ba.mk)).m23799a(drawable5));
                    }
                    if (obj != null) {
                        this.aA.add(new jbt(eee.f11303f - 1, resources.getString(ba.mg)).m23799a(drawable6));
                    }
                    if (obj6 != null) {
                        this.aA.add(new jbt(eee.f11304g - 1, resources.getString(this.as.mo586t() ? ba.mi : ba.me)).m23799a(drawable7));
                    }
                    return this.aA;
                }
            }
        }
        obj = null;
        if (this.aB == null) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (obj2 != null) {
        }
        if (!b) {
        }
        if (obj5 != null) {
        }
        if (obj7 != null) {
        }
        if (b) {
            this.aA.add(new jbt(eee.f11298a - 1, resources.getString(ba.mf)).m23799a(drawable));
        }
        if (b) {
            this.aA.add(new jbt(eee.f11301d - 1, resources.getString(ba.mj)).m23799a(drawable3));
        }
        if (obj3 != null) {
            this.aA.add(new jbt(eee.f11300c - 1, resources.getString(ba.ml)).m23799a(drawable2));
        }
        if (obj4 != null) {
            this.aA.add(new jbt(eee.f11299b - 1, resources.getString(ba.mh)).m23799a(drawable4));
        }
        if (obj2 != null) {
            this.aA.add(new jbu());
        }
        if (obj5 != null) {
            this.aA.add(new jbt(eee.f11302e - 1, resources.getString(ba.mk)).m23799a(drawable5));
        }
        if (obj != null) {
            this.aA.add(new jbt(eee.f11303f - 1, resources.getString(ba.mg)).m23799a(drawable6));
        }
        if (obj6 != null) {
            if (this.as.mo586t()) {
            }
            this.aA.add(new jbt(eee.f11304g - 1, resources.getString(this.as.mo586t() ? ba.mi : ba.me)).m23799a(drawable7));
        }
        return this.aA;
    }

    protected OnItemClickListener mo1002s() {
        return new edy(this);
    }

    void m13616a(int i) {
        this.az.mo1979a(this.an.m5638g()).mo1693b().mo1714c(i);
    }

    protected int mo1001r() {
        return 0;
    }

    protected String mo1000q() {
        return null;
    }

    void m13617b(String str) {
        gwb.m1863a(new eec(this, str));
    }
}
