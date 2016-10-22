import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dwj extends jzn implements dwd, jmx {
    private jmo a;
    private jcf b;
    private int c;

    public dwj() {
        this.c = -1;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (jcf) this.binder.a(jcf.class);
        this.a = (jmo) this.binder.a(jmo.class);
        this.binder.a(dwd.class, (Object) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.c = bundle.getInt("account_id");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("account_id", this.c);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void a(int i) {
        this.c = i;
        if (((fzw) this.binder.a(fzw.class)).a(i)) {
            this.a.b(getString(bc.ts), "Cannot login SMS only account");
        }
        jch a = this.b.a(i);
        if (!dwi.d(a)) {
            this.a.b(getString(bc.ts), "Account upgrade without OOBE");
        } else if (!dwi.b(a) && dwi.a(a)) {
            Context context = this.context;
            ed childFragmentManager = getChildFragmentManager();
            Bundle bundle = new Bundle();
            bundle.putString("title", context.getString(bc.hV));
            bundle.putString("message", context.getString(bc.hT));
            bundle.putString("positive", context.getString(bc.hU));
            dwc dwc = new dwc();
            dwc.setArguments(bundle);
            dwc.a(childFragmentManager, "archive_tos");
        } else if (!dwi.a(a)) {
            dwb.a(this.context, getChildFragmentManager(), bc.hZ, bc.hY);
        } else if (dwi.c(a)) {
            dwb.a(this.context, getChildFragmentManager(), bc.ib, bc.ia);
        }
    }

    public void a() {
        Context context = getContext();
        bko e = fde.e(this.c);
        if (bkq.a) {
            String valueOf = String.valueOf(glk.b(e.a()));
            new StringBuilder(String.valueOf(valueOf).length() + 49).append("setGmailChatArchiveEnabled: ").append(valueOf).append(" enableArchive: true");
        }
        RealTimeChatService.a(((fmf) jyn.a(context, fmf.class)).a(-1), e.g(), 6, true);
        ((jcf) jyn.a(context, jcf.class)).b(e.g()).b("chat_archive_enabled", true).d();
        jch a = this.b.a(this.c);
        this.a.a(a.b("account_name"), a.b("effective_gaia_id"));
    }

    public void b() {
        this.a.c();
    }
}
