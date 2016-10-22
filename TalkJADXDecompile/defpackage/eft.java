package defpackage;

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
import tp;

/* renamed from: eft */
public final class eft extends dbn {
    jca a;
    String aj;
    int ak;
    Set<bjg> al;
    private dth am;
    private egr an;
    private bcm ao;
    private fit ap;
    private iih aq;
    private String ar;
    private final bpu as;
    private final gov at;
    dbo b;
    bck c;
    public egv d;
    ehl e;
    fip f;
    bpt g;
    public dvq h;
    bxt i;

    public eft() {
        this.ao = new efx(this);
        this.f = new efy(this);
        this.al = new HashSet();
        this.as = new efu(this);
        this.at = new efv(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.am.a("edit_participants_fragment_open");
        this.am.a("edit_participants_fragment_full_load");
        Intent intent = getActivity().getIntent();
        this.i = (bxt) intent.getSerializableExtra("conversation_type");
        this.ar = intent.getStringExtra("conversation_id");
        this.g = ((bpv) this.binder.a(bpv.class)).a(this.context, this.lifecycle, 0, this, this.c, this.i);
        this.aq = (iih) this.binder.a(iih.class);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (gld.a(getContext()) && c()) {
            SubMenu addSubMenu = menu.addSubMenu(0, bm.ab, 0, gwb.tk);
            addSubMenu.setIcon(R$drawable.bS);
            gwb.a(addSubMenu.getItem(), 1);
        }
        r();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(bpu.class, this.as);
        this.binder.a(efz.class, new efz(this));
        if (bundle != null) {
            this.i = (bxt) bundle.getSerializable("EditParticipantsFragmentImpl.conversationType");
            this.c = (bck) bundle.getSerializable("EditParticipantsFragmentImpl.model");
        }
        if (this.c == null) {
            Intent intent = getActivity().getIntent();
            this.i = (bxt) intent.getSerializableExtra("conversation_type");
            this.c = (bck) intent.getSerializableExtra("edit_participants_model");
        }
        this.c.a(this.ao);
        this.binder.a(bck.class, this.c);
        this.binder.a(bxt.class, this.i);
        this.a = (jca) this.binder.a(jca.class);
        this.ap = (fit) this.binder.a(fit.class);
        this.am = ((dti) this.binder.a(dti.class)).a(17);
        this.h = ((dvs) this.binder.a(dvs.class)).a(this.a.a());
        this.binder.a(dvq.class, this.h);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("EditParticipantsFragmentImpl.conversationType", this.i);
        bundle.putSerializable("EditParticipantsFragmentImpl.model", this.c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View inflate = layoutInflater.inflate(gwb.sA, viewGroup, false);
        ViewGroup l = ((dek) getActivity()).l();
        l.setPadding(l.getPaddingLeft(), 0, l.getPaddingRight(), 0);
        if (t()) {
            view = (EditParticipantsView) layoutInflater.inflate(gwb.sC, l, false);
        } else {
            View view2 = (EditParticipantsView) layoutInflater.inflate(gwb.sB, l, false);
            l.setBackgroundColor(getActivity().getResources().getColor(bc.uR));
            if (VERSION.SDK_INT >= 21) {
                a(getActivity(), bcj.CREATE_NEW_GROUP_CONVERSATION);
            }
            view2.a(this.c);
            view = view2;
        }
        view.a(fde.e(this.a.a()));
        view.a(this.i);
        this.an = (egr) getChildFragmentManager().a(egr.class.getName());
        if (t()) {
            a(this.c.f());
            if (this.d == null) {
                this.an = new egr();
                getChildFragmentManager().a().a(bm.V, this.an, egr.class.getName()).a();
            }
        } else {
            l.b((CharSequence) "");
            l.addView(view);
        }
        r();
        this.d = (egv) getChildFragmentManager().a(egv.class.getName());
        if (this.d == null) {
            this.d = new egv();
            getChildFragmentManager().a().a(bm.V, this.d, egv.class.getName()).a();
        }
        if (this.b != null) {
            s();
        }
        if (e()) {
            this.d.a(new ehk());
            this.d.a(new gnl());
        }
        this.d.a("edit_participants_fragment_full_load", 1016);
        if (this.c.f() == bcj.INVITE_MORE_TO_GROUPCHAT) {
            ((gai) this.binder.a(gai.class)).a(new gah(this.context).a(getString(gwb.sO)).a(TimeUnit.SECONDS.toMillis(10)).a());
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!fdq.j.b(this.a.a())) {
            ((ScrollViewCustom) ((dek) getActivity()).l().findViewById(bm.U)).a(getResources().getDimensionPixelSize(gwb.st));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        setHasOptionsMenu(true);
        this.binder.a(gov.class, this.at);
    }

    public void onResume() {
        super.onResume();
        this.am.a(this.a.a(), "edit_participants_fragment_open", 1015);
        getActivity().invalidateOptionsMenu();
    }

    private void r() {
        boolean z = true;
        if (this.e != null) {
            if (!c() || gld.a(this.context)) {
                z = false;
            }
            this.e.a(z);
            return;
        }
        bcj f = this.c.f();
        boolean z2 = f == bcj.CREATE_NEW_HANGOUT || f == bcj.INVITE_MORE_TO_HANGOUT || f == bcj.INVITE_GAIA_IDS_TO_HANGOUT;
        boolean u = u();
        if (c()) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("PeopleListProceedButton.key_creating_video_call", z2);
        bundle.putBoolean("PeopleListProceedButton.key_show_element", u);
        bundle.putBoolean("PeopleListProceedButton.key_render_off_screen", z);
        ehl ehl = new ehl();
        ehl.setArguments(bundle);
        this.e = ehl;
        getChildFragmentManager().a().a(bm.V, this.e, ehl.class.getName()).a();
    }

    private void a(Activity activity, bcj bcj) {
        if (bcj.a()) {
            activity.getWindow().setStatusBarColor(getResources().getColor(bc.uP));
        } else {
            activity.getWindow().setStatusBarColor(getResources().getColor(bc.uQ));
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        if (gld.a(getContext()) || !q()) {
            super.onPrepareOptionsMenu(menu);
        } else {
            menu.clear();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != bm.ab) {
            return super.onOptionsItemSelected(menuItem);
        }
        d();
        return true;
    }

    public void a(dbo dbo) {
        this.b = dbo;
        s();
    }

    public boolean a() {
        boolean z = false;
        for (bjg c : this.al) {
            boolean z2;
            if (this.c.c(this.context, c)) {
                z2 = true;
            } else {
                z2 = z;
            }
            z = z2;
        }
        return z;
    }

    private void s() {
        if (this.d != null) {
            this.d.b(q());
        }
    }

    private boolean t() {
        return fdq.j.b(this.a.a()) && this.i == bxt.HANGOUTS_MESSAGE;
    }

    private boolean u() {
        if (this.i == bxt.SMS_MESSAGE) {
            boolean z;
            bko e = fde.e(this.a.a());
            fzw fzw = (fzw) jyn.a(this.context, fzw.class);
            boolean z2 = fzw.r() && !gwb.l(e.G());
            if (!gwb.h(e.G()) && fzw.s()) {
                if (fdq.A.b(e.g())) {
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

    boolean b() {
        return this.c.f() == bcj.INVITE_MORE_TO_GROUPCHAT;
    }

    void a(bcj bcj) {
        tp g = ((dek) getActivity()).g();
        if (g != null) {
            Toolbar l = ((dek) getActivity()).l();
            switch (efw.b[bcj.ordinal()]) {
                case wi.j /*1*/:
                    g.a(getResources().getString(gwb.sU));
                    l.setBackgroundColor(getResources().getColor(bc.uR));
                    break;
                case wi.l /*2*/:
                    g.a(getResources().getString(gwb.sY));
                    l.setBackgroundColor(getResources().getColor(bc.uS));
                    break;
                case wi.z /*3*/:
                case wi.h /*4*/:
                case wi.p /*5*/:
                    g.a(getResources().getString(gwb.sR));
                    l.setBackgroundColor(getResources().getColor(bc.uR));
                    break;
            }
            if (VERSION.SDK_INT >= 21) {
                a(getActivity(), bcj);
            }
        }
    }

    boolean c() {
        if (!t()) {
            return TextUtils.isEmpty(this.c.j()) && !this.c.h() && q();
        } else {
            if (b()) {
                return this.c.i();
            }
            return q();
        }
    }

    void d() {
        boolean z = true;
        if (this.i == bxt.SMS_MESSAGE && this.c.a().g().size() <= 1) {
            this.c.a(bcj.CREATE_NEW_ONE_ON_ONE);
        }
        if (e()) {
            this.h.a(this.context);
        }
        bcj f = this.c.f();
        switch (efw.b[f.ordinal()]) {
            case wi.j /*1*/:
                RealTimeChatService.a(fde.e(this.a.a()), this.ar, this.c.a());
                this.b.a(null);
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.p /*5*/:
            case wi.m /*8*/:
                int i = (this.i == bxt.VIDEO_CALL || this.i == bxt.AUDIO_CALL) ? true : 0;
                bcj f2 = this.c.f();
                if (fdq.j.b(this.a.a())) {
                    if (f2 == bcj.FORK_CONVERSATION || f2 == bcj.CREATE_NEW_GROUP_CONVERSATION || f2 == bcj.UPGRADE_TO_GROUPCHAT || i != 0) {
                        i = true;
                    } else {
                        i = 0;
                    }
                    if (f2 != bcj.CREATE_NEW_GROUP_CONVERSATION) {
                        z = false;
                    }
                    if (TextUtils.isEmpty(this.aj)) {
                        this.aq.a(this.a.a()).b().c(3334);
                    } else {
                        this.aq.a(this.a.a()).b().c(3334);
                    }
                    if (f2 == bcj.CREATE_NEW_GROUP_CONVERSATION && this.c.b() == 0) {
                        this.aq.a(this.a.a()).b().c(3331);
                    }
                } else {
                    if (f2 != bcj.FORK_CONVERSATION && i == 0) {
                        z = false;
                    }
                    boolean z2 = z;
                    z = false;
                }
                this.g.a(i != 0 ? boy.NONE : boy.LOCAL_AND_SERVER, z, this.aj, null, 1635);
                if (!this.c.k()) {
                    ((iih) this.binder.a(iih.class)).a(this.a.a()).b().c(3316);
                }
            case wi.h /*4*/:
                String str = this.ar;
                bko e = fde.e(this.a.a());
                RealTimeChatService.a(this.f);
                fme a = ((fmf) this.binder.a(fmf.class)).a();
                this.ak = a.a();
                this.ap.a(a, e, this.c.a(), str);
            case wi.s /*6*/:
            case wi.q /*7*/:
                Intent intent = new Intent();
                bcf newBuilder = juh.newBuilder();
                newBuilder.a(this.c.c());
                intent.putExtra("audience", newBuilder.a());
                this.b.a(intent);
            default:
                String valueOf = String.valueOf(f);
                glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 14).append("Audience mode ").append(valueOf).toString(), new Object[0]);
                iil.a("Unknown audience mode");
        }
    }

    boolean e() {
        bcj f = this.c.f();
        return f == bcj.UPGRADE_TO_GROUPCHAT || f == bcj.INVITE_MORE_TO_GROUPCHAT || f == bcj.CREATE_NEW_GROUP_CONVERSATION || f == bcj.CREATE_NEW_ONE_ON_ONE || f == bcj.CREATE_NEW_HANGOUT;
    }

    boolean q() {
        return this.c.f().a() && u();
    }
}
