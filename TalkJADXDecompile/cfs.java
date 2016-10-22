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
    final /* synthetic */ cdr a;

    cfs(cdr cdr) {
        this.a = cdr;
    }

    public void a() {
        if (this.a.getActivity() != null) {
            this.a.ag();
        }
    }

    public void a(List<bpd> list, bpd bpd) {
        Object loaderManager;
        int i;
        int i2 = 0;
        boolean z = this.a.getActivity() != null;
        String str = "Babel";
        String valueOf = String.valueOf(this.a);
        if (z) {
            loaderManager = this.a.getLoaderManager();
        } else {
            loaderManager = null;
        }
        String valueOf2 = String.valueOf(loaderManager);
        glk.c(str, new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()).append("Finished variant engine for ").append(valueOf).append(" loader: ").append(valueOf2).append(" hasActivity: ").append(z).toString(), new Object[0]);
        this.a.i.a(bpd);
        if (z) {
            this.a.F();
        }
        this.a.H();
        ba.a(this.a.av.g(), glj.b(), 10, ba.c().a(bpd.a).a(212));
        if (z) {
            this.a.aa();
            this.a.ah();
            bns bns = (bns) this.a.bH;
            boolean z2 = this.a.af() || gwb.i(this.a.d());
            bns.a(z2);
        }
        if (z && this.a.aX == null && list.size() > 1 && !gwb.a(eow.TRANSPORT_SPINNER)) {
            for (bpd bpd2 : list) {
                if (bpd2.h != null && !TextUtils.isEmpty(bpd2.h.b())) {
                    i2 = 1;
                    break;
                }
            }
            if (i2 != 0) {
                this.a.aX = LayoutInflater.from(this.a.getActivity()).inflate(gwb.hB, (ViewGroup) this.a.getView().findViewById(ba.da)).findViewById(ba.fX);
                TextView textView = (TextView) this.a.aX.findViewById(ba.fY);
                if (textView != null) {
                    textView.setText(Html.fromHtml(this.a.getString(bc.tc)));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                this.a.aX.setOnTouchListener(new cft(this));
            }
        }
        Activity activity = this.a.getActivity();
        if (activity != null) {
            activity.F_();
        }
        bpd a = this.a.i.a();
        if (a.a == null) {
            cdr cdr = this.a;
            iil.a("Expected null", a.a);
            bpd a2 = cdr.i.a();
            fbw a3 = fbw.a(cdr.context, a2.e);
            a3.a(fbt.b(a2.e));
            juh a4 = juh.newBuilder().a(bcn.newBuilder().a(a3).a()).a();
            fme a5 = ((fmf) cdr.binder.a(fmf.class)).a();
            cdr.e = a5.a();
            RealTimeChatService.a(a5, new fei(cdr.context).a(cdr.av.g()).a(a4).a(boy.LOCAL_AND_SERVER).b(a2.b).a());
        }
        this.a.bB.a(a);
        if (!this.a.aN && z) {
            this.a.aN = true;
            this.a.lifecycle.a(new cge(this.a));
            this.a.lifecycle.a(this.a.aF);
            this.a.lifecycle.a(this.a.by);
            bph bph = (bph) this.a.binder.a(bph.class);
            kbn kbn = this.a.lifecycle;
            bph.getClass();
            kbn.a(new bpj(bph, activity, this.a.av.g(), this.a.ae()));
        }
        bko bko = this.a.av;
        if (list.size() > 1) {
            i = 2260;
        } else {
            i = 2261;
        }
        gwb.a(bko, i);
        if (this.a.ar == null) {
            if (!gwb.i(bpd.b) && this.a.i.e() == 2) {
                this.a.ar = (bqt) this.a.binder.b(bqt.class);
            }
            if (this.a.ar != null) {
                bqt bqt = this.a.ar;
                jyr jyr = this.a.context;
                ((jca) this.a.binder.a(jca.class)).a();
                cgr cgr = this.a.i;
                this.a.aV.findViewById(ba.dx);
                this.a.getView().findViewById(ba.dh);
            }
        }
    }

    public void a(bpd bpd) {
        this.a.i.a(bpd);
        this.a.bB.a(bpd);
        this.a.ag();
        if (bpd.a == null) {
            cdr cdr = this.a;
            iil.a("Expected null", bpd.a);
            bpd a = cdr.i.a();
            fbw a2 = fbw.a(cdr.context, a.e);
            a2.a(fbt.b(a.e));
            juh a3 = juh.newBuilder().a(bcn.newBuilder().a(a2).a()).a();
            fme a4 = ((fmf) cdr.binder.a(fmf.class)).a();
            cdr.e = a4.a();
            RealTimeChatService.a(a4, new fei(cdr.context).a(cdr.av.g()).a(a3).a(boy.LOCAL_AND_SERVER).b(a.b).a());
        }
        this.a.v();
        this.a.getActivity().invalidateOptionsMenu();
        gwb.a(this.a.av, 2262);
    }
}
