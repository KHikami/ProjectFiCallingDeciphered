package com.google.android.apps.hangouts.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ba;
import bc;
import bcc;
import bkf;
import bkh;
import bko;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import daq;
import das;
import dat;
import dau;
import dcj;
import dda;
import ddb;
import ddc;
import ddf;
import ddg;
import ddh;
import ddi;
import edk;
import edo;
import fde;
import fg;
import fh;
import fip;
import fxa;
import gui;
import guj;
import gwb;
import hsj;
import hsm;
import ig;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import jca;

public class InvitationFragment extends dcj implements OnClickListener, fh<Cursor> {
    public ddi a;
    public daq aj;
    private das ak;
    private AvatarView al;
    private TextView am;
    private final gui an;
    private FixedParticipantsGalleryView ao;
    private List<edo> ap;
    private final fip aq;
    public jca b;
    public String c;
    public edo d;
    public String e;
    public bko f;
    public int g;
    public ImageView h;
    public final ArrayList<TextView> i;

    public InvitationFragment() {
        this.i = new ArrayList();
        guj guj = new guj(gwb.H());
        guj.a(hsj.c, new hsm().a(117).a());
        guj.a(new dda(this));
        guj.a(new ddb(this));
        this.an = guj.b();
        this.aq = new ddc(this);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (jca) this.binder.a(jca.class);
        this.f = fde.e(this.b.a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.gT, viewGroup, false);
        this.aj = (daq) getChildFragmentManager().a(daq.class.getName());
        if (this.aj == null) {
            this.aj = ((dat) this.binder.a(dat.class)).a();
        }
        a(this.ak);
        this.h = (ImageView) inflate.findViewById(ba.au);
        this.al = (AvatarView) inflate.findViewById(ba.ej);
        this.al.setOnClickListener(this);
        this.am = (TextView) inflate.findViewById(ba.dy);
        this.i.add((TextView) inflate.findViewById(ba.dM));
        this.i.add((TextView) inflate.findViewById(ba.dN));
        this.i.add((TextView) inflate.findViewById(ba.dO));
        inflate.findViewById(ba.eE).setOnClickListener(this);
        inflate.findViewById(ba.es).setOnClickListener(this);
        this.ao = (FixedParticipantsGalleryView) inflate.findViewById(ba.bv);
        b();
        a(inflate);
        RealTimeChatService.a(this.aq);
        gwb.a(this.f, 1550);
        return inflate;
    }

    public void scheduleFragmentRestart(bcc bcc) {
        if (getActivity() != null) {
            this.aj = ((dat) this.binder.a(dat.class)).a();
            this.aj.a(this.ak);
            Bundle bundle = new Bundle();
            bundle.putParcelable("conversation_parameters", bcc);
            this.aj.setArguments(bundle);
            this.aj.P();
            getChildFragmentManager().a().b(ba.cD, this.aj, daq.class.getName()).a();
        }
    }

    private void a(das das) {
        this.ak = das;
        if (this.aj != null) {
            this.aj.a(this.ak);
        }
    }

    public void setHostInterface(ddi ddi, das das) {
        this.a = ddi;
        a(das);
    }

    public void onDestroyView() {
        super.onDestroyView();
        RealTimeChatService.b(this.aq);
        if (this.an.e() || this.an.f()) {
            this.an.d();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void initialize(Bundle bundle) {
        this.c = bundle.getString("conversation_id");
        this.d = gwb.a(bundle);
        if (TextUtils.isEmpty(this.c) || this.d != null) {
            this.f = fde.e(this.b.a());
            this.g = bundle.getInt("client_conversation_type", 0);
            fg loaderManager = getLoaderManager();
            loaderManager.a(1001);
            ig a = loaderManager.a(1001, null, this);
            if (a != null) {
                a.t();
            }
            a(getView());
            if (!(this.d == null || TextUtils.isEmpty(this.d.a))) {
                RealTimeChatService.b(this.f, this.d.a);
            }
            if (!TextUtils.isEmpty(this.c)) {
                gwb.a(this.context, this.f.g(), bundle.getLong("invite_timestamp", 0));
            }
            if (this.h != null) {
                this.h.setImageBitmap(null);
            }
            if (this.al != null) {
                this.al.a(null, null, null);
            }
            if (this.am != null) {
                this.am.setText("");
            }
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((TextView) obj).setVisibility(8);
            }
            if (!this.an.e()) {
                this.an.b();
            }
            if (this.f != null) {
                if (this.aj != null) {
                    scheduleFragmentRestart(new bcc(this.c, this.g));
                }
                new ddf(this).execute(new Void[0]);
                return;
            }
            return;
        }
        throw new InvalidParameterException("InvitationFragment requires a valid inviter id");
    }

    public void onStart() {
        super.onStart();
        if (!this.an.e() && !this.an.f()) {
            this.an.b();
        }
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        switch (i) {
            case 1001:
                if (!(this.f == null || this.c == null || this.d == null)) {
                    return bkf.a(this.f, this.c, bkh.b);
                }
        }
        return null;
    }

    public void onLoadFinished(ig<Cursor> igVar, Cursor cursor) {
        switch (igVar.p()) {
            case 1001:
                if (cursor != null) {
                    bko bko = this.f;
                    String str = this.c;
                    bkf bkf = new bkf();
                    bkf.d(bko, str);
                    bkf.a(cursor);
                    List arrayList = new ArrayList();
                    for (edk edk : bkf.b()) {
                        if (!bkf.c(edk.b)) {
                            if (this.d.a(edk.b)) {
                                this.e = edk.e;
                                if (TextUtils.isEmpty(this.e)) {
                                    this.e = getActivity().getString(bc.df);
                                }
                                this.al.a(edk.h, edk.e, this.f);
                                this.al.setContentDescription(getActivity().getString(bc.jy, new Object[]{this.e}));
                                this.am.setText(this.e);
                                CharSequence text = getActivity().getText(bc.jc);
                                SpannableString valueOf = SpannableString.valueOf(TextUtils.expandTemplate(text, new CharSequence[]{this.e}));
                                URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.expandTemplate(text, new CharSequence[]{this.e}));
                                if (uRLSpanArr.length > 0) {
                                    spannableStringBuilder.clearSpans();
                                    Object obj = uRLSpanArr[0];
                                    spannableStringBuilder.setSpan(new ddg(this), valueOf.getSpanStart(obj), valueOf.getSpanEnd(obj), 33);
                                }
                            } else {
                                arrayList.add(edk.b);
                            }
                        }
                    }
                    this.ap = arrayList;
                    b();
                    getLoaderManager().a(1001);
                }
            default:
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }

    public void onClick(View view) {
        if (this.f != null && this.c != null) {
            if (view.getId() == ba.es) {
                RealTimeChatService.a(this.b.a(), this.c, true, false, false);
                this.a.c(this.c);
                gwb.a(this.f, 1551);
            } else if (view.getId() == ba.eE) {
                dau a = dau.a(this.b.a(), this.e);
                a.a(new ddh(this));
                a.a(getFragmentManager(), null);
            } else if (view == this.al && this.d != null) {
                a();
            }
        }
    }

    public boolean isEmpty() {
        return false;
    }

    public void a() {
        ((fxa) this.binder.b(fxa.class)).a(this.context, this.aj, this.d.a, this.e, this.al.a());
    }

    private void a(View view) {
        if (view != null) {
            view.findViewById(ba.bd).setVisibility(TextUtils.isEmpty(this.c) ? 0 : 8);
        }
    }

    public String getConversationId() {
        return this.c;
    }

    public int getConversationType() {
        return this.g;
    }

    public edo getInviterId() {
        return this.d;
    }

    private void b() {
        if (this.ap == null || this.g != 2) {
            this.ao.setVisibility(8);
            this.ao.a();
            return;
        }
        this.ao.setVisibility(0);
        this.ao.a(this.f, this.ap, this.d);
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onHiddenChanged(boolean z) {
        new StringBuilder(22).append("onHiddenChanged: ").append(z);
        super.onHiddenChanged(z);
        if (getView() != null && getActivity() != null && z) {
            this.c = null;
            this.d = null;
            this.h.setImageBitmap(null);
            this.ao.a();
            if (getLoaderManager().b(1001) != null) {
                getLoaderManager().a(1001);
            }
        }
    }
}
