package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class dba implements OnClickListener {
    final /* synthetic */ ConversationListFragment a;

    public dba(ConversationListFragment conversationListFragment) {
        this.a = conversationListFragment;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("opened_from_impression", 2149);
        intent.putExtra("account_id", this.a.d.g());
        this.a.g.a(intent);
    }
}
