package p000;

import android.content.ContentValues;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class dbd extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String f9448a;
    final /* synthetic */ ConversationListFragment f9449b;

    public dbd(ConversationListFragment conversationListFragment, String str) {
        this.f9449b = conversationListFragment;
        this.f9448a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11402a();
    }

    private Void m11402a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("self_watermark", Integer.valueOf(0));
        contentValues.put("chat_watermark", Integer.valueOf(0));
        contentValues.put("hangout_watermark", Integer.valueOf(0));
        contentValues.put("has_chat_notifications", Integer.valueOf(1));
        contentValues.put("has_video_notifications", Integer.valueOf(1));
        int a = new blo(this.f9449b.context, this.f9449b.f6258d.m5638g()).m6044e().m6194a("conversations", contentValues, "conversation_id=?", new String[]{this.f9448a});
        String str = this.f9448a;
        new StringBuilder(String.valueOf(str).length() + 64).append("modifying ").append(str).append(" changing notification status updated ").append(a).append(" rows");
        blf.m5757a(this.f9449b.f6258d.m5638g());
        ((ect) jyn.m25426a(this.f9449b.context, ect.class)).mo1835b(this.f9449b.f6258d.m5638g(), true);
        return null;
    }
}
