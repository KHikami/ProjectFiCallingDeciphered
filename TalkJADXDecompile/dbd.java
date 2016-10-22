import android.content.ContentValues;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class dbd extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String a;
    final /* synthetic */ ConversationListFragment b;

    public dbd(ConversationListFragment conversationListFragment, String str) {
        this.b = conversationListFragment;
        this.a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("self_watermark", Integer.valueOf(0));
        contentValues.put("chat_watermark", Integer.valueOf(0));
        contentValues.put("hangout_watermark", Integer.valueOf(0));
        contentValues.put("has_chat_notifications", Integer.valueOf(1));
        contentValues.put("has_video_notifications", Integer.valueOf(1));
        int a = new blo(this.b.context, this.b.d.g()).e().a("conversations", contentValues, "conversation_id=?", new String[]{this.a});
        String str = this.a;
        new StringBuilder(String.valueOf(str).length() + 64).append("modifying ").append(str).append(" changing notification status updated ").append(a).append(" rows");
        blf.a(this.b.d.g());
        ((ect) jyn.a(this.b.context, ect.class)).b(this.b.d.g(), true);
        return null;
    }
}
