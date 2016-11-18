package p000;

import android.app.Activity;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

final class cfs implements bpf {
    final /* synthetic */ cdr f5206a;

    cfs(cdr cdr) {
        this.f5206a = cdr;
    }

    public void mo817a() {
        if (this.f5206a.getActivity() != null) {
            this.f5206a.ag();
        }
    }

    public void mo819a(List<bpd> list, bpd bpd) {
        Object loaderManager;
        int i;
        int i2 = 0;
        boolean z = this.f5206a.getActivity() != null;
        String str = "Babel";
        String valueOf = String.valueOf(this.f5206a);
        if (z) {
            loaderManager = this.f5206a.getLoaderManager();
        } else {
            loaderManager = null;
        }
        String valueOf2 = String.valueOf(loaderManager);
        glk.m17979c(str, new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()).append("Finished variant engine for ").append(valueOf).append(" loader: ").append(valueOf2).append(" hasActivity: ").append(z).toString(), new Object[0]);
        this.f5206a.f5106i.mo936a(bpd);
        if (z) {
            this.f5206a.m7353F();
        }
        this.f5206a.m7355H();
        ba.m4548a(this.f5206a.av.m5638g(), glj.m17963b(), 10, ba.m4618c().m12789a(bpd.f4146a).m12786a(212));
        if (z) {
            this.f5206a.aa();
            this.f5206a.ah();
            bns bns = (bns) this.f5206a.bH;
            boolean z2 = this.f5206a.af() || gwb.m2254i(this.f5206a.mo858d());
            bns.m6245a(z2);
        }
        if (z && this.f5206a.aX == null && list.size() > 1 && !gwb.m1926a(eow.TRANSPORT_SPINNER)) {
            for (bpd bpd2 : list) {
                if (bpd2.f4153h != null && !TextUtils.isEmpty(bpd2.f4153h.m13590b())) {
                    i2 = 1;
                    break;
                }
            }
            if (i2 != 0) {
                this.f5206a.aX = LayoutInflater.from(this.f5206a.getActivity()).inflate(gwb.hB, (ViewGroup) this.f5206a.getView().findViewById(ba.da)).findViewById(ba.fX);
                TextView textView = (TextView) this.f5206a.aX.findViewById(ba.fY);
                if (textView != null) {
                    textView.setText(Html.fromHtml(this.f5206a.getString(bc.tc)));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                this.f5206a.aX.setOnTouchListener(new cft(this));
            }
        }
        Activity activity = this.f5206a.getActivity();
        if (activity != null) {
            activity.F_();
        }
        bpd a = this.f5206a.f5106i.mo931a();
        if (a.f4146a == null) {
            cdr cdr = this.f5206a;
            iil.m21872a("Expected null", a.f4146a);
            bpd a2 = cdr.f5106i.mo931a();
            fbw a3 = fbw.m14927a(cdr.context, a2.f4150e);
            a3.m14934a(fbt.m14920b(a2.f4150e));
            juh a4 = juh.newBuilder().m4841a(bcn.newBuilder().m4905a(a3).m4904a()).m4843a();
            fme a5 = ((fmf) cdr.binder.m25443a(fmf.class)).mo2035a();
            cdr.f5102e = a5.m15674a();
            RealTimeChatService.m9048a(a5, new fei(cdr.context).m15158a(cdr.av.m5638g()).m15161a(a4).m15159a(boy.LOCAL_AND_SERVER).m15163b(a2.f4147b).m15157a());
        }
        this.f5206a.bB.m7718a(a);
        if (!this.f5206a.aN && z) {
            this.f5206a.aN = true;
            this.f5206a.lifecycle.m25514a(new cge(this.f5206a));
            this.f5206a.lifecycle.m25514a(this.f5206a.aF);
            this.f5206a.lifecycle.m25514a(this.f5206a.by);
            bph bph = (bph) this.f5206a.binder.m25443a(bph.class);
            kbn kbn = this.f5206a.lifecycle;
            bph.getClass();
            kbn.m25514a(new bpj(bph, activity, this.f5206a.av.m5638g(), this.f5206a.ae()));
        }
        bko bko = this.f5206a.av;
        if (list.size() > 1) {
            i = 2260;
        } else {
            i = 2261;
        }
        gwb.m1823a(bko, i);
        if (this.f5206a.ar == null) {
            if (!gwb.m2254i(bpd.f4147b) && this.f5206a.f5106i.mo947e() == 2) {
                this.f5206a.ar = (bqt) this.f5206a.binder.m25454b(bqt.class);
            }
            if (this.f5206a.ar != null) {
                bqt bqt = this.f5206a.ar;
                jyr jyr = this.f5206a.context;
                ((jca) this.f5206a.binder.m25443a(jca.class)).mo2317a();
                cgr cgr = this.f5206a.f5106i;
                this.f5206a.aV.findViewById(ba.dx);
                this.f5206a.getView().findViewById(ba.dh);
            }
        }
    }

    public void mo818a(bpd bpd) {
        this.f5206a.f5106i.mo936a(bpd);
        this.f5206a.bB.m7718a(bpd);
        this.f5206a.ag();
        if (bpd.f4146a == null) {
            cdr cdr = this.f5206a;
            iil.m21872a("Expected null", bpd.f4146a);
            bpd a = cdr.f5106i.mo931a();
            fbw a2 = fbw.m14927a(cdr.context, a.f4150e);
            a2.m14934a(fbt.m14920b(a.f4150e));
            juh a3 = juh.newBuilder().m4841a(bcn.newBuilder().m4905a(a2).m4904a()).m4843a();
            fme a4 = ((fmf) cdr.binder.m25443a(fmf.class)).mo2035a();
            cdr.f5102e = a4.m15674a();
            RealTimeChatService.m9048a(a4, new fei(cdr.context).m15158a(cdr.av.m5638g()).m15161a(a3).m15159a(boy.LOCAL_AND_SERVER).m15163b(a.f4147b).m15157a());
        }
        this.f5206a.m7423v();
        this.f5206a.getActivity().invalidateOptionsMenu();
        gwb.m1823a(this.f5206a.av, 2262);
    }
}
