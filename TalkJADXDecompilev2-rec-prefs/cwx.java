package p000;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class cwx implements OnItemClickListener {
    final /* synthetic */ cww f9245a;

    cwx(cww cww) {
        this.f9245a = cww;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jbt jbt = (jbt) ((jbq) ((jbr) this.f9245a.m7890u()).getItem(i));
        switch (cwy.f9246a[cwz.m11176a()[jbt.m23803c()] - 1]) {
            case 1:
                cww cww = this.f9245a;
                glk.m17970a("Babel_explane_linkshare", "InviteBottomSheet: inviting Hangouts users", new Object[0]);
                gwb.m2251i(cww.ak, 889);
                ((jek) jyn.m25426a(cww.ak, jek.class)).m24035a(gwb.op, gwb.m1540a(cww.ak, cww.aj));
                break;
            case 2:
                String str;
                cww cww2 = this.f9245a;
                glk.m17970a("Babel_explane_linkshare", "InviteBottomSheet: sharing link to call", new Object[0]);
                gwb.m2251i(cww2.ak, 1373);
                if (fdq.f12771M.m14370b(((jca) jyn.m25426a(cww2.ak, jca.class)).mo2317a())) {
                    glk.m17970a("Babel_explane_linkshare", "InviteBottomSheet: creating link with sharing URL", new Object[0]);
                    str = ((ijb) cww2.aj.m10974f().mo3229t().m21926a(ijb.class)).mo3375a().f26865B;
                } else {
                    glk.m17970a("Babel_explane_linkshare", "InviteBottomSheet: creating link with hangoutId", new Object[0]);
                    String b = gwb.m1998b(cww2.ak, "babel_hangout_base_url", "https://hangouts.google.com/call");
                    boolean a = gwb.m1906a(cww2.ak, "babel_hangout_underscore_after_base_url", false);
                    String d = cww2.aj.m10972d();
                    str = String.format(a ? "%s/_/%s" : "%s/%s", new Object[]{b, d});
                }
                lym c = cww2.aj.m10976h().m11101c("localParticipant");
                cww2.ak.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", cww2.getString(gwb.pt, cvh.m11090a(cww2.getActivity(), c), str)).setType("text/plain"), null));
                break;
            default:
                throw new IllegalStateException("Unknown invite bottom sheet item " + jbt.m23803c());
        }
        this.f9245a.m7002a();
    }
}
