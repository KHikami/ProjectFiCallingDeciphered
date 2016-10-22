import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dro extends euj<lvp, lvq> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return drq.a((lvq) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lvp) nzf);
    }

    public dro(Context context, int i, int i2, drp drp) {
        super(jvc.newBuilder().a(context, i).a(), drp, "conversations/setgrouplinksharingenabled", fom.HANGOUTS_API, new lvp(), new lvq());
        this.a = i;
        this.b = i2;
    }

    public void a(int i, String str, Exception exception) {
        super.a(i, str, exception);
        evz d = d();
        if (d != null) {
            RealTimeChatService.a(this.a, d);
        }
    }

    private void a(lvp lvp) {
        drp drp = (drp) this.e;
        lqm lqm = new lqm();
        lqm.b = blo.c(drp.d());
        lqm.a = euk.a(drp.e());
        lqm.e = Integer.valueOf(14);
        lvp.a = lqm;
        lvp.requestHeader = a(new esq().a(this.a).b(this.b).a());
        lvp.b = Integer.valueOf(drp.c());
    }
}
