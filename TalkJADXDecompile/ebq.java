import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;

final class ebq extends ecj {
    private static final boolean d;
    final edo a;
    final String b;
    final boolean c;

    static {
        d = ebz.d;
    }

    int a(int i) {
        if (((fzw) jyn.a(gwb.H(), fzw.class)).a(i)) {
            return 0;
        }
        return bkf.b(fde.e(i), this.p.a);
    }

    private ebq(Cursor cursor, int i) {
        boolean z = true;
        this.p = a(cursor);
        this.q = fvd.MESSAGE;
        this.s = cursor.getString(8);
        this.r = ecj.a(cursor.getString(7), this.s, this.p, i);
        this.a = new edo(cursor.getString(5), cursor.getString(6));
        this.b = cursor.getString(2);
        if (cursor.getInt(1) != 2) {
            z = false;
        }
        this.c = z;
        if (d) {
            String str = "Invitation Line from ";
            String valueOf = String.valueOf(this.s);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    private static ear a(Cursor cursor) {
        String string = cursor.getString(2);
        String string2 = cursor.getString(3);
        if (TextUtils.isEmpty(string2)) {
            string2 = string;
        }
        int length = string.split(",").length - 1;
        String string3 = cursor.getString(0);
        return new ear(string3, string3, cursor.getInt(1), string2, cursor.getLong(4), true, length, null, 2, 0);
    }

    static ear b(int i) {
        ear ear = null;
        try {
            fzw fzw = (fzw) jyn.a(gwb.H(), fzw.class);
            if (!((jcf) jyn.a(gwb.H(), jcf.class)).c(i) || fzw.a(i)) {
                return null;
            }
            edo c = bkq.c(gwb.H(), i);
            if (c == null) {
                glk.e("Babel", "InviteLineInfo.getInvites: participantId is null.", new Object[0]);
                return null;
            } else if (c.b == null) {
                glk.e("Babel", "InviteLineInfo.getInvites: participantId.chatId is null.", new Object[0]);
                return null;
            } else {
                ear a;
                String[] strArr = new String[]{c.b};
                Cursor query = gwb.H().getContentResolver().query(EsProvider.a(EsProvider.j, i), ebr.a, "inviter_chat_id!=? AND notification_level!=10 AND is_pending_leave!=1 AND sort_timestamp>chat_watermark AND inviter_first_name IS NOT NULL", strArr, "sort_timestamp DESC");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            while (true) {
                                ebq ebq = new ebq(query, i);
                                if (ebq.s != null && ebq.r != null) {
                                    if (ear == null) {
                                        a = a(query);
                                    } else {
                                        a = ear;
                                    }
                                    a.h.add(ebq);
                                    if (a.h.size() == 7) {
                                        break;
                                    }
                                }
                                a = ear;
                                if (!query.moveToNext()) {
                                    break;
                                }
                                ear = a;
                            }
                            if (a != null) {
                                a.i = a.h.size();
                            }
                        } else {
                            a = null;
                        }
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                    }
                } else {
                    a = null;
                }
                return a;
            }
        } catch (jcj e) {
            return null;
        }
    }
}
