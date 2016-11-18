package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dwj extends jzn implements dwd, jmx {
    private jmo f10672a;
    private jcf f10673b;
    private int f10674c = -1;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f10673b = (jcf) this.binder.m25443a(jcf.class);
        this.f10672a = (jmo) this.binder.m25443a(jmo.class);
        this.binder.m25444a(dwd.class, (Object) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10674c = bundle.getInt("account_id");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("account_id", this.f10674c);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void mo1736a(int i) {
        this.f10674c = i;
        if (((fzw) this.binder.m25443a(fzw.class)).mo2146a(i)) {
            this.f10672a.mo3568b(getString(bc.ts), "Cannot login SMS only account");
        }
        jch a = this.f10673b.mo3456a(i);
        if (!dwi.m12922d(a)) {
            this.f10672a.mo3568b(getString(bc.ts), "Account upgrade without OOBE");
        } else if (!dwi.m12920b(a) && dwi.m12919a(a)) {
            Context context = this.context;
            ed childFragmentManager = getChildFragmentManager();
            Bundle bundle = new Bundle();
            bundle.putString("title", context.getString(bc.hV));
            bundle.putString("message", context.getString(bc.hT));
            bundle.putString("positive", context.getString(bc.hU));
            dwc dwc = new dwc();
            dwc.setArguments(bundle);
            dwc.mo2341a(childFragmentManager, "archive_tos");
        } else if (!dwi.m12919a(a)) {
            dwb.m12897a(this.context, getChildFragmentManager(), bc.hZ, bc.hY);
        } else if (dwi.m12921c(a)) {
            dwb.m12897a(this.context, getChildFragmentManager(), bc.ib, bc.ia);
        }
    }

    public void mo495a() {
        Context context = getContext();
        bko e = fde.m15018e(this.f10674c);
        if (bkq.f3659a) {
            String valueOf = String.valueOf(glk.m17974b(e.m5629a()));
            new StringBuilder(String.valueOf(valueOf).length() + 49).append("setGmailChatArchiveEnabled: ").append(valueOf).append(" enableArchive: true");
        }
        RealTimeChatService.m9043a(((fmf) jyn.m25426a(context, fmf.class)).mo2036a(-1), e.m5638g(), 6, true);
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(e.m5638g()).m23881b("chat_archive_enabled", true).m23891d();
        jch a = this.f10673b.mo3456a(this.f10674c);
        this.f10672a.mo3566a(a.mo3440b("account_name"), a.mo3440b("effective_gaia_id"));
    }

    public void mo1737b() {
        this.f10672a.mo3569c();
    }
}
