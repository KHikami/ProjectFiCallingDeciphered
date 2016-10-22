package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.phone.EditAudienceActivity;
import com.google.android.apps.hangouts.views.ConversationListItemView;

/* renamed from: efg */
final class efg implements OnClickListener {
    final /* synthetic */ eff a;
    private final int b;
    private final long c;
    private fmz<efa> d;

    public efg(eff eff, long j, int i, fmz<efa> fmz_efa) {
        this.a = eff;
        this.c = j;
        this.b = i;
        this.d = fmz_efa;
    }

    public void onClick(View view) {
        ConversationListItemView conversationListItemView = (ConversationListItemView) view;
        Parcelable bcc = new bcc(conversationListItemView.r(), conversationListItemView.u(), conversationListItemView.v());
        int c = this.d.c.c(this.d) + this.b;
        mcr mcr = new mcr();
        mcr.a = Long.valueOf(this.c);
        mcr.e = Integer.valueOf(this.b);
        mcr.f = Integer.valueOf(c);
        ((iih) jyn.a(this.a.b, iih.class)).a(this.a.f).b().a(mcr).c(3205);
        Intent a = gwb.a(this.a.f, bcc.a, bcc.b);
        a.putExtra("conversation_parameters", bcc);
        this.a.b.startActivity(a);
        Context baseContext = ((jyr) this.a.b).getBaseContext();
        if (baseContext instanceof EditAudienceActivity) {
            ((Activity) baseContext).finish();
        }
    }
}
