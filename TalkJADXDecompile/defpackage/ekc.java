package defpackage;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

/* renamed from: ekc */
public class ekc extends dcl implements dbj, fkc {
    public final jca r;
    public ConversationListFragment s;

    public ekc() {
        this.r = new jcu(this, this.F).a(this.E);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.fY);
        this.s = (ConversationListFragment) J_().a(ba.ap);
        this.s.a((dbj) this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getResources().getColor(gwb.dV));
        }
    }

    public void a(bcc bcc) {
        Intent a = gwb.a(this.r.a(), bcc.a, bcc.b);
        a.putExtra("conversation_parameters", bcc);
        a.putExtra("opened_from_impression", 1634);
        startActivity(a);
    }

    public void a(String str, boolean z, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void a(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void B_() {
    }

    public void j() {
    }

    public void a(gag gag) {
        throw new UnsupportedOperationException();
    }

    public void a(gag gag, gag gag2) {
        throw new UnsupportedOperationException();
    }
}
