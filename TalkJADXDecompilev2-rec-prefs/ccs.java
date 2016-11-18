package p000;

import android.content.ContentValues;
import android.database.Cursor;

final class ccs implements Runnable {
    final /* synthetic */ ccr f5021a;

    ccs(ccr ccr) {
        this.f5021a = ccr;
    }

    public void run() {
        int i;
        blo blo = new blo(this.f5021a.f5017a, this.f5021a.f5020d);
        Cursor a = blo.m6044e().m6200a("conversation_participants_view", new String[]{"gaia_id", "chat_id"}, "conversation_id=?", new String[]{this.f5021a.f5019c}, null, null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(1));
        String str = "inviter_affinity";
        if (this.f5021a.f5018b) {
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
        if (this.f5021a.f5018b) {
            contentValues.put("notification_level", Integer.valueOf(30));
        }
        i = blo.m6044e().m6194a("conversations", contentValues, "conversation_id=?", new String[]{this.f5021a.f5019c});
        String str2 = this.f5021a.f5019c;
        String valueOf = String.valueOf(contentValues.getAsString("inviter_chat_id"));
        new StringBuilder((String.valueOf(str2).length() + 74) + String.valueOf(valueOf).length()).append("modifying ").append(str2).append(" pretend invite status with inviter_id ").append(valueOf).append(" updated ").append(i).append(" rows");
        blf.m5757a(this.f5021a.f5020d);
        ((ect) jyn.m25426a(this.f5021a.f5017a, ect.class)).mo1835b(this.f5021a.f5020d, true);
    }
}
