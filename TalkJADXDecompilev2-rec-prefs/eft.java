package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class eft extends dbn {
    jca f11383a;
    String aj;
    int ak;
    Set<bjg> al = new HashSet();
    private dth am;
    private egr an;
    private bcm ao = new efx(this);
    private fit ap;
    private iih aq;
    private String ar;
    private final bpu as = new efu(this);
    private final gov at = new efv(this);
    dbo f11384b;
    bck f11385c;
    public egv f11386d;
    ehl f11387e;
    fip f11388f = new efy(this);
    bpt f11389g;
    public dvq f11390h;
    bxt f11391i;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.am.mo1670a("edit_participants_fragment_open");
        this.am.mo1670a("edit_participants_fragment_full_load");
        Intent intent = getActivity().getIntent();
        this.f11391i = (bxt) intent.getSerializableExtra("conversation_type");
        this.ar = intent.getStringExtra("conversation_id");
        this.f11389g = ((bpv) this.binder.m25443a(bpv.class)).mo664a(this.context, this.lifecycle, 0, this, this.f11385c, this.f11391i);
        this.aq = (iih) this.binder.m25443a(iih.class);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (gld.m17937a(getContext()) && m13824c()) {
            SubMenu addSubMenu = menu.addSubMenu(0, bm.ab, 0, gwb.tk);
            addSubMenu.setIcon(R$drawable.bS);
            gwb.m1790a(addSubMenu.getItem(), 1);
        }
        m13816r();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.m25444a(bpu.class, this.as);
        this.binder.m25444a(efz.class, new efz(this));
        if (bundle != null) {
            this.f11391i = (bxt) bundle.getSerializable("EditParticipantsFragmentImpl.conversationType");
            this.f11385c = (bck) bundle.getSerializable("EditParticipantsFragmentImpl.model");
        }
        if (this.f11385c == null) {
            Intent intent = getActivity().getIntent();
            this.f11391i = (bxt) intent.getSerializableExtra("conversation_type");
            this.f11385c = (bck) intent.getSerializableExtra("edit_participants_model");
        }
        this.f11385c.m4864a(this.ao);
        this.binder.m25444a(bck.class, this.f11385c);
        this.binder.m25444a(bxt.class, this.f11391i);
        this.f11383a = (jca) this.binder.m25443a(jca.class);
        this.ap = (fit) this.binder.m25443a(fit.class);
        this.am = ((dti) this.binder.m25443a(dti.class)).mo1673a(17);
        this.f11390h = ((dvs) this.binder.m25443a(dvs.class)).mo1728a(this.f11383a.mo2317a());
        this.binder.m25444a(dvq.class, this.f11390h);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("EditParticipantsFragmentImpl.conversationType", this.f11391i);
        bundle.putSerializable("EditParticipantsFragmentImpl.model", this.f11385c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View inflate = layoutInflater.inflate(gwb.sA, viewGroup, false);
        ViewGroup l = ((dek) getActivity()).m8319l();
        l.setPadding(l.getPaddingLeft(), 0, l.getPaddingRight(), 0);
        if (m13818t()) {
            view = (EditParticipantsView) layoutInflater.inflate(gwb.sC, l, false);
        } else {
            View view2 = (EditParticipantsView) layoutInflater.inflate(gwb.sB, l, false);
            l.setBackgroundColor(getActivity().getResources().getColor(bc.uR));
            if (VERSION.SDK_INT >= 21) {
                m13815a(getActivity(), bcj.CREATE_NEW_GROUP_CONVERSATION);
            }
            view2.m8768a(this.f11385c);
            view = view2;
        }
        view.m8769a(fde.m15018e(this.f11383a.mo2317a()));
        view.m8770a(this.f11391i);
        this.an = (egr) getChildFragmentManager().mo1844a(egr.class.getName());
        if (m13818t()) {
            m13820a(this.f11385c.m4877f());
            if (this.f11386d == null) {
                this.an = new egr();
                getChildFragmentManager().mo1845a().mo1526a(bm.f3820V, this.an, egr.class.getName()).mo1522a();
            }
        } else {
            l.mo1259b((CharSequence) "");
            l.addView(view);
        }
        m13816r();
        this.f11386d = (egv) getChildFragmentManager().mo1844a(egv.class.getName());
        if (this.f11386d == null) {
            this.f11386d = new egv();
            getChildFragmentManager().mo1845a().mo1526a(bm.f3820V, this.f11386d, egv.class.getName()).mo1522a();
        }
        if (this.f11384b != null) {
            m13817s();
        }
        if (m13826e()) {
            this.f11386d.m13902a(new ehk());
            this.f11386d.m13903a(new gnl());
        }
        this.f11386d.m13904a("edit_participants_fragment_full_load", 1016);
        if (this.f11385c.m4877f() == bcj.INVITE_MORE_TO_GROUPCHAT) {
            ((gai) this.binder.m25443a(gai.class)).m7655a(new gah(this.context).m16814a(getString(gwb.sO)).m16812a(TimeUnit.SECONDS.toMillis(10)).m16811a());
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!fdq.f12794j.m14370b(this.f11383a.mo2317a())) {
            ((ScrollViewCustom) ((dek) getActivity()).m8319l().findViewById(bm.f3819U)).m8772a(getResources().getDimensionPixelSize(gwb.st));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        setHasOptionsMenu(true);
        this.binder.m25444a(gov.class, this.at);
    }

    public void onResume() {
        super.onResume();
        this.am.mo1668a(this.f11383a.mo2317a(), "edit_participants_fragment_open", 1015);
        getActivity().invalidateOptionsMenu();
    }

    private void m13816r() {
        boolean z = true;
        if (this.f11387e != null) {
            if (!m13824c() || gld.m17937a(this.context)) {
                z = false;
            }
            this.f11387e.m13925a(z);
            return;
        }
        bcj f = this.f11385c.m4877f();
        boolean z2 = f == bcj.CREATE_NEW_HANGOUT || f == bcj.INVITE_MORE_TO_HANGOUT || f == bcj.INVITE_GAIA_IDS_TO_HANGOUT;
        boolean u = m13819u();
        if (m13824c()) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("PeopleListProceedButton.key_creating_video_call", z2);
        bundle.putBoolean("PeopleListProceedButton.key_show_element", u);
        bundle.putBoolean("PeopleListProceedButton.key_render_off_screen", z);
        ehl ehl = new ehl();
        ehl.setArguments(bundle);
        this.f11387e = ehl;
        getChildFragmentManager().mo1845a().mo1526a(bm.f3820V, this.f11387e, ehl.class.getName()).mo1522a();
    }

    private void m13815a(Activity activity, bcj bcj) {
        if (bcj.m4857a()) {
            activity.getWindow().setStatusBarColor(getResources().getColor(bc.uP));
        } else {
            activity.getWindow().setStatusBarColor(getResources().getColor(bc.uQ));
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        if (gld.m17937a(getContext()) || !m13827q()) {
            super.onPrepareOptionsMenu(menu);
        } else {
            menu.clear();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != bm.ab) {
            return super.onOptionsItemSelected(menuItem);
        }
        m13825d();
        return true;
    }

    public void mo1866a(dbo dbo) {
        this.f11384b = dbo;
        m13817s();
    }

    public boolean mo495a() {
        boolean z = false;
        for (bjg c : this.al) {
            boolean z2;
            if (this.f11385c.m4872c(this.context, c)) {
                z2 = true;
            } else {
                z2 = z;
            }
            z = z2;
        }
        return z;
    }

    private void m13817s() {
        if (this.f11386d != null) {
            this.f11386d.m13906b(m13827q());
        }
    }

    private boolean m13818t() {
        return fdq.f12794j.m14370b(this.f11383a.mo2317a()) && this.f11391i == bxt.HANGOUTS_MESSAGE;
    }

    private boolean m13819u() {
        if (this.f11391i == bxt.SMS_MESSAGE) {
            boolean z;
            bko e = fde.m15018e(this.f11383a.mo2317a());
            fzw fzw = (fzw) jyn.m25426a(this.context, fzw.class);
            boolean z2 = fzw.mo2170r() && !gwb.m2291l(e.m5620G());
            if (!gwb.m2237h(e.m5620G()) && fzw.mo2171s()) {
                if (fdq.f12759A.m14370b(e.m5638g())) {
                    z = true;
                    if (!z2 || r0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            if (z2) {
            }
            z = true;
            if (z) {
                return false;
            }
        }
        return true;
    }

    protected boolean isEmpty() {
        return false;
    }

    boolean m13823b() {
        return this.f11385c.m4877f() == bcj.INVITE_MORE_TO_GROUPCHAT;
    }

    void m13820a(bcj bcj) {
        tp g = ((dek) getActivity()).m8308g();
        if (g != null) {
            Toolbar l = ((dek) getActivity()).m8319l();
            switch (efw.f11395b[bcj.ordinal()]) {
                case 1:
                    g.a(getResources().getString(gwb.sU));
                    l.setBackgroundColor(getResources().getColor(bc.uR));
                    break;
                case 2:
                    g.a(getResources().getString(gwb.sY));
                    l.setBackgroundColor(getResources().getColor(bc.uS));
                    break;
                case 3:
                case 4:
                case 5:
                    g.a(getResources().getString(gwb.sR));
                    l.setBackgroundColor(getResources().getColor(bc.uR));
                    break;
            }
            if (VERSION.SDK_INT >= 21) {
                m13815a(getActivity(), bcj);
            }
        }
    }

    boolean m13824c() {
        if (!m13818t()) {
            return TextUtils.isEmpty(this.f11385c.m4881j()) && !this.f11385c.m4879h() && m13827q();
        } else {
            if (m13823b()) {
                return this.f11385c.m4880i();
            }
            return m13827q();
        }
    }

    void m13825d() {
        boolean z = true;
        if (this.f11391i == bxt.SMS_MESSAGE && this.f11385c.m4861a().m25222g().size() <= 1) {
            this.f11385c.m4863a(bcj.CREATE_NEW_ONE_ON_ONE);
        }
        if (m13826e()) {
            this.f11390h.mo1723a(this.context);
        }
        bcj f = this.f11385c.m4877f();
        switch (efw.f11395b[f.ordinal()]) {
            case 1:
                RealTimeChatService.m9025a(fde.m15018e(this.f11383a.mo2317a()), this.ar, this.f11385c.m4861a());
                this.f11384b.mo1178a(null);
                return;
            case 2:
            case 3:
            case 5:
            case 8:
                int i = (this.f11391i == bxt.VIDEO_CALL || this.f11391i == bxt.AUDIO_CALL) ? true : 0;
                bcj f2 = this.f11385c.m4877f();
                if (fdq.f12794j.m14370b(this.f11383a.mo2317a())) {
                    if (f2 == bcj.FORK_CONVERSATION || f2 == bcj.CREATE_NEW_GROUP_CONVERSATION || f2 == bcj.UPGRADE_TO_GROUPCHAT || i != 0) {
                        i = true;
                    } else {
                        i = 0;
                    }
                    if (f2 != bcj.CREATE_NEW_GROUP_CONVERSATION) {
                        z = false;
                    }
                    if (TextUtils.isEmpty(this.aj)) {
                        this.aq.mo1979a(this.f11383a.mo2317a()).mo1693b().mo1714c(3334);
                    } else {
                        this.aq.mo1979a(this.f11383a.mo2317a()).mo1693b().mo1714c(3334);
                    }
                    if (f2 == bcj.CREATE_NEW_GROUP_CONVERSATION && this.f11385c.m4867b() == 0) {
                        this.aq.mo1979a(this.f11383a.mo2317a()).mo1693b().mo1714c(3331);
                    }
                } else {
                    if (f2 != bcj.FORK_CONVERSATION && i == 0) {
                        z = false;
                    }
                    boolean z2 = z;
                    z = false;
                }
                this.f11389g.mo654a(i != 0 ? boy.NONE : boy.LOCAL_AND_SERVER, z, this.aj, null, 1635);
                if (!this.f11385c.m4882k()) {
                    ((iih) this.binder.m25443a(iih.class)).mo1979a(this.f11383a.mo2317a()).mo1693b().mo1714c(3316);
                    return;
                }
                return;
            case 4:
                String str = this.ar;
                bko e = fde.m15018e(this.f11383a.mo2317a());
                RealTimeChatService.m9040a(this.f11388f);
                fme a = ((fmf) this.binder.m25443a(fmf.class)).mo2035a();
                this.ak = a.m15674a();
                this.ap.mo2011a(a, e, this.f11385c.m4861a(), str);
                return;
            case 6:
            case 7:
                Intent intent = new Intent();
                bcf newBuilder = juh.newBuilder();
                newBuilder.m4842a(this.f11385c.m4871c());
                intent.putExtra("audience", newBuilder.m4843a());
                this.f11384b.mo1178a(intent);
                return;
            default:
                String valueOf = String.valueOf(f);
                glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 14).append("Audience mode ").append(valueOf).toString(), new Object[0]);
                iil.m21870a("Unknown audience mode");
                return;
        }
    }

    boolean m13826e() {
        bcj f = this.f11385c.m4877f();
        return f == bcj.UPGRADE_TO_GROUPCHAT || f == bcj.INVITE_MORE_TO_GROUPCHAT || f == bcj.CREATE_NEW_GROUP_CONVERSATION || f == bcj.CREATE_NEW_ONE_ON_ONE || f == bcj.CREATE_NEW_HANGOUT;
    }

    boolean m13827q() {
        return this.f11385c.m4877f().m4857a() && m13819u();
    }
}
