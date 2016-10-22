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
    kbu am;
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
    private final bpu ay;
    private iih az;

    public edv() {
        this.ay = new edw(this);
        this.am = new kbu();
    }

    protected /* synthetic */ ListAdapter t() {
        return v();
    }

    public static dq a(bjg bjg, gou gou, String str, long j, int i, int i2) {
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
            this.ao = ((bpv) this.al.a(bpv.class)).a(this.ak, this.am, 0, this, this.ap, this.at);
        } else if (this.aC.equals(gou.PEOPLE_OPTIONS)) {
            a(3235);
        } else {
            a(2504);
        }
        this.am.c(bundle);
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
        this.am.d(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.ak = new jyr(activity, jyn.a((Context) activity, getParentFragment()));
        this.al = this.ak.getBinder();
        this.am.a(new edx(this));
        this.al.a(bpu.class, this.ay);
        this.an = fde.e(((jca) this.al.a(jca.class)).a());
        this.az = (iih) this.al.a(iih.class);
        this.aB = (cbt) this.al.b(cbt.class);
        this.aq = (fit) this.al.a(fit.class);
        this.ar = (fmf) this.al.a(fmf.class);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.at == null) {
            a(2505);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.am.c();
    }

    private edr v() {
        Object obj;
        Object obj2;
        Object obj3;
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
        boolean d = ((bbm) this.al.a(bbm.class)).d(this.an.g());
        boolean b = gmd.b();
        Object obj4 = (b || gmd.a()) ? 1 : null;
        Object obj5 = (d && this.as.z()) ? 1 : null;
        Object obj6 = (b && (this.aC.equals(gou.PEOPLE_OPTIONS) || this.aC.equals(gou.PEOPLE_OPTIONS_GUEST))) ? 1 : null;
        if (this.aC.equals(gou.PEOPLE_OPTIONS)) {
            if (fdq.i.b(this.an.g())) {
                if (this.aw == 2 && this.ax == 1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj = 1;
                    if (this.aB == null) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    obj3 = (obj2 != null || (!(this.aC.equals(gou.PEOPLE_OPTIONS) || this.aC.equals(gou.PEOPLE_OPTIONS_GUEST)) || this.as.u())) ? null : 1;
                    Object obj7 = (b || b || obj4 != null || obj5 != null) ? 1 : null;
                    obj2 = (obj6 != null && obj == null && obj3 == null) ? null : 1;
                    obj2 = (obj7 != null || obj2 == null) ? null : 1;
                    if (b) {
                        this.aA.add(new jbt(eee.a - 1, resources.getString(ba.mf)).a(drawable));
                    }
                    if (b) {
                        this.aA.add(new jbt(eee.d - 1, resources.getString(ba.mj)).a(drawable3));
                    }
                    if (obj4 != null) {
                        this.aA.add(new jbt(eee.c - 1, resources.getString(ba.ml)).a(drawable2));
                    }
                    if (obj5 != null) {
                        this.aA.add(new jbt(eee.b - 1, resources.getString(ba.mh)).a(drawable4));
                    }
                    if (obj2 != null) {
                        this.aA.add(new jbu());
                    }
                    if (obj6 != null) {
                        this.aA.add(new jbt(eee.e - 1, resources.getString(ba.mk)).a(drawable5));
                    }
                    if (obj != null) {
                        this.aA.add(new jbt(eee.f - 1, resources.getString(ba.mg)).a(drawable6));
                    }
                    if (obj3 != null) {
                        this.aA.add(new jbt(eee.g - 1, resources.getString(this.as.t() ? ba.mi : ba.me)).a(drawable7));
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
        if (obj6 != null) {
        }
        if (obj7 != null) {
        }
        if (b) {
            this.aA.add(new jbt(eee.a - 1, resources.getString(ba.mf)).a(drawable));
        }
        if (b) {
            this.aA.add(new jbt(eee.d - 1, resources.getString(ba.mj)).a(drawable3));
        }
        if (obj4 != null) {
            this.aA.add(new jbt(eee.c - 1, resources.getString(ba.ml)).a(drawable2));
        }
        if (obj5 != null) {
            this.aA.add(new jbt(eee.b - 1, resources.getString(ba.mh)).a(drawable4));
        }
        if (obj2 != null) {
            this.aA.add(new jbu());
        }
        if (obj6 != null) {
            this.aA.add(new jbt(eee.e - 1, resources.getString(ba.mk)).a(drawable5));
        }
        if (obj != null) {
            this.aA.add(new jbt(eee.f - 1, resources.getString(ba.mg)).a(drawable6));
        }
        if (obj3 != null) {
            if (this.as.t()) {
            }
            this.aA.add(new jbt(eee.g - 1, resources.getString(this.as.t() ? ba.mi : ba.me)).a(drawable7));
        }
        return this.aA;
    }

    protected OnItemClickListener s() {
        return new edy(this);
    }

    void a(int i) {
        this.az.a(this.an.g()).b().c(i);
    }

    protected int r() {
        return 0;
    }

    protected String q() {
        return null;
    }

    void b(String str) {
        gwb.a(new eec(this, str));
    }
}
