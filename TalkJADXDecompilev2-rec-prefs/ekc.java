package p000;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public class ekc extends dcl implements dbj, fkc {
    public final jca f6567r = new jcu(this, this.F).m23911a(this.E);
    public ConversationListFragment f6568s;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.fY);
        this.f6568s = (ConversationListFragment) J_().mo1843a(ba.ap);
        this.f6568s.m8493a((dbj) this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getResources().getColor(gwb.dV));
        }
    }

    public void mo1142a(bcc bcc) {
        Intent a = gwb.m1537a(this.f6567r.mo2317a(), bcc.f2975a, bcc.f2976b);
        a.putExtra("conversation_parameters", bcc);
        a.putExtra("opened_from_impression", 1634);
        startActivity(a);
    }

    public void mo1145a(String str, boolean z, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void mo1141a(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void B_() {
    }

    public void mo1085j() {
    }

    public void mo1143a(gag gag) {
        throw new UnsupportedOperationException();
    }

    public void mo1144a(gag gag, gag gag2) {
        throw new UnsupportedOperationException();
    }
}
