package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteItemView;

public final class dqo implements OnClickListener {
    final /* synthetic */ ed f10347a;
    final /* synthetic */ InviteItemView f10348b;

    public dqo(InviteItemView inviteItemView, ed edVar) {
        this.f10348b = inviteItemView;
        this.f10347a = edVar;
    }

    public void onClick(View view) {
        String charSequence = ((TextView) ((View) view.getParent().getParent().getParent()).findViewById(gwb.qE)).getText().toString();
        dau a = dau.m11397a(this.f10348b.f6469k, charSequence);
        a.m11399a(new dqp(this, charSequence));
        a.mo2341a(this.f10347a, null);
    }
}
