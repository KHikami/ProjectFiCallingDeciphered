package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.ConversationInviteListActivity;

public final class dqk implements dqh {
    public Intent mo1653a(Context context, int i) {
        Intent intent = new Intent();
        intent.setClass(context, ConversationInviteListActivity.class);
        intent.putExtra("account_id", i);
        intent.setFlags(872415232);
        return intent;
    }
}
