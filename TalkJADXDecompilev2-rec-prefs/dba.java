package p000;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class dba implements OnClickListener {
    final /* synthetic */ ConversationListFragment f9445a;

    public dba(ConversationListFragment conversationListFragment) {
        this.f9445a = conversationListFragment;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("opened_from_impression", 2149);
        intent.putExtra("account_id", this.f9445a.f6258d.m5638g());
        this.f9445a.f6261g.mo1141a(intent);
    }
}
