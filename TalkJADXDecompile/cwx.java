import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class cwx implements OnItemClickListener {
    final /* synthetic */ cww a;

    cwx(cww cww) {
        this.a = cww;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jbt jbt = (jbt) ((jbq) ((jbr) this.a.u()).getItem(i));
        switch (cwy.a[cwz.a()[jbt.c()] - 1]) {
            case wi.j /*1*/:
                cww cww = this.a;
                glk.a("Babel_explane_linkshare", "InviteBottomSheet: inviting Hangouts users", new Object[0]);
                gwb.i(cww.ak, 889);
                ((jek) jyn.a(cww.ak, jek.class)).a(gwb.op, gwb.a(cww.ak, cww.aj));
                break;
            case wi.l /*2*/:
                String str;
                cww cww2 = this.a;
                glk.a("Babel_explane_linkshare", "InviteBottomSheet: sharing link to call", new Object[0]);
                gwb.i(cww2.ak, 1373);
                if (fdq.M.b(((jca) jyn.a(cww2.ak, jca.class)).a())) {
                    glk.a("Babel_explane_linkshare", "InviteBottomSheet: creating link with sharing URL", new Object[0]);
                    str = ((ijb) cww2.aj.f().t().a(ijb.class)).a().B;
                } else {
                    glk.a("Babel_explane_linkshare", "InviteBottomSheet: creating link with hangoutId", new Object[0]);
                    String b = gwb.b(cww2.ak, "babel_hangout_base_url", "https://hangouts.google.com/call");
                    boolean a = gwb.a(cww2.ak, "babel_hangout_underscore_after_base_url", false);
                    String d = cww2.aj.d();
                    str = String.format(a ? "%s/_/%s" : "%s/%s", new Object[]{b, d});
                }
                lym c = cww2.aj.h().c("localParticipant");
                cww2.ak.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", cww2.getString(gwb.pt, cvh.a(cww2.getActivity(), c), str)).setType("text/plain"), null));
                break;
            default:
                throw new IllegalStateException("Unknown invite bottom sheet item " + jbt.c());
        }
        this.a.a();
    }
}
