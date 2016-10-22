package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: ccs */
final class ccs implements Runnable {
    final /* synthetic */ ccr a;

    ccs(ccr ccr) {
        this.a = ccr;
    }

    public void run() {
        int i;
        blo blo = new blo(this.a.a, this.a.d);
        Cursor a = blo.e().a("conversation_participants_view", new String[]{"gaia_id", "chat_id"}, "conversation_id=?", new String[]{this.a.c}, null, null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(1));
        String str = "inviter_affinity";
        if (this.a.b) {
            i = 1;
        } else {
            i = 2;
        }
        contentValues.put(str, Integer.valueOf(i));
        if (a.moveToLast()) {
            contentValues.put("inviter_gaia_id", a.getString(0));
            contentValues.put("inviter_chat_id", a.getString(1));
        }
        a.close();
        contentValues.put("self_watermark", Integer.valueOf(0));
        contentValues.put("chat_watermark", Integer.valueOf(0));
        contentValues.put("hangout_watermark", Integer.valueOf(0));
        if (this.a.b) {
            contentValues.put("notification_level", Integer.valueOf(30));
        }
        i = blo.e().a("conversations", contentValues, "conversation_id=?", new String[]{this.a.c});
        String str2 = this.a.c;
        String valueOf = String.valueOf(contentValues.getAsString("inviter_chat_id"));
        new StringBuilder((String.valueOf(str2).length() + 74) + String.valueOf(valueOf).length()).append("modifying ").append(str2).append(" pretend invite status with inviter_id ").append(valueOf).append(" updated ").append(i).append(" rows");
        blf.a(this.a.d);
        ((ect) jyn.a(this.a.a, ect.class)).b(this.a.d, true);
    }
}
