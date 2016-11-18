package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteItemView;

public final class dqo implements OnClickListener {
    final /* synthetic */ ed a;
    final /* synthetic */ InviteItemView b;

    public dqo(InviteItemView inviteItemView, ed edVar) {
        this.b = inviteItemView;
        this.a = edVar;
    }

    public void onClick(View view) {
        String charSequence = ((TextView) ((View) view.getParent().getParent().getParent()).findViewById(gwb.qE)).getText().toString();
        dau a = dau.a(this.b.k, charSequence);
        a.a(new dqp(this, charSequence));
        a.a(this.a, null);
    }
}
