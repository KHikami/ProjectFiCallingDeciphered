package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.phone.EditAudienceActivity;
import com.google.android.apps.hangouts.views.ConversationListItemView;

final class efg implements OnClickListener {
    final /* synthetic */ eff f11354a;
    private final int f11355b;
    private final long f11356c;
    private fmz<efa> f11357d;

    public efg(eff eff, long j, int i, fmz<efa> fmz_efa) {
        this.f11354a = eff;
        this.f11356c = j;
        this.f11355b = i;
        this.f11357d = fmz_efa;
    }

    public void onClick(View view) {
        ConversationListItemView conversationListItemView = (ConversationListItemView) view;
        Parcelable bcc = new bcc(conversationListItemView.m9315r(), conversationListItemView.m9318u(), conversationListItemView.m9319v());
        int c = this.f11357d.f11360c.mo1874c(this.f11357d) + this.f11355b;
        mcr mcr = new mcr();
        mcr.f27357a = Long.valueOf(this.f11356c);
        mcr.f27361e = Integer.valueOf(this.f11355b);
        mcr.f27362f = Integer.valueOf(c);
        ((iih) jyn.m25426a(this.f11354a.f11345b, iih.class)).mo1979a(this.f11354a.f11349f).mo1693b().mo1706a(mcr).mo1714c(3205);
        Intent a = gwb.m1537a(this.f11354a.f11349f, bcc.f2975a, bcc.f2976b);
        a.putExtra("conversation_parameters", bcc);
        this.f11354a.f11345b.startActivity(a);
        Context baseContext = ((jyr) this.f11354a.f11345b).getBaseContext();
        if (baseContext instanceof EditAudienceActivity) {
            ((Activity) baseContext).finish();
        }
    }
}
