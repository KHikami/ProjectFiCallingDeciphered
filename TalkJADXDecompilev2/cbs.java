package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.conversation.peopleandoptions.impl.PeopleAndOptionsActivity;

public final class cbs implements cbk {
    private final Context a;

    public cbs(Context context) {
        this.a = context;
    }

    public Intent a(int i, String str, String str2, int i2, int i3, int i4, long j, boolean z, int i5, String str3, boolean z2, String str4, String str5, String[] strArr, String str6, String str7) {
        Intent intent = new Intent();
        intent.setClass(this.a, PeopleAndOptionsActivity.class);
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", str);
        intent.putExtra("conversation_name", str2);
        intent.putExtra("client_conversation_type", i2);
        intent.putExtra("transport_type", i3);
        intent.putExtra("notification_level", i4);
        intent.putExtra("latest_timestamp", j);
        intent.putExtra("has_unknown_sender", z);
        intent.putExtra("is_group_link_sharing_enabled", i5);
        intent.putExtra("group_conversation_link", str3);
        intent.putExtra("is_conversation_guest", z2);
        intent.putExtra("chat_ringtone_uri", str4);
        intent.putExtra("hangout_ringtone_uri", str5);
        intent.putExtra("merged_conversation_ids", strArr);
        intent.putExtra("preferred_chat_id", str6);
        intent.putExtra("preferred_gaia_id", str7);
        return intent;
    }
}
