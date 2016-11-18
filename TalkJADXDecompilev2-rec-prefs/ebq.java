package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;

final class ebq extends ecj {
    private static final boolean f11116d = ebz.f11037d;
    final edo f11117a;
    final String f11118b;
    final boolean f11119c;

    int m13475a(int i) {
        if (((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2146a(i)) {
            return 0;
        }
        return bkf.m5580b(fde.m15018e(i), this.p.f11061a);
    }

    private ebq(Cursor cursor, int i) {
        boolean z = true;
        this.p = ebq.m13473a(cursor);
        this.q = fvd.MESSAGE;
        this.s = cursor.getString(8);
        this.r = ecj.m13472a(cursor.getString(7), this.s, this.p, i);
        this.f11117a = new edo(cursor.getString(5), cursor.getString(6));
        this.f11118b = cursor.getString(2);
        if (cursor.getInt(1) != 2) {
            z = false;
        }
        this.f11119c = z;
        if (f11116d) {
            String str = "Invitation Line from ";
            String valueOf = String.valueOf(this.s);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    private static ear m13473a(Cursor cursor) {
        String string = cursor.getString(2);
        String string2 = cursor.getString(3);
        if (TextUtils.isEmpty(string2)) {
            string2 = string;
        }
        int length = string.split(",").length - 1;
        String string3 = cursor.getString(0);
        return new ear(string3, string3, cursor.getInt(1), string2, cursor.getLong(4), true, length, null, 2, 0);
    }

    static ear m13474b(int i) {
        ear ear = null;
        try {
            fzw fzw = (fzw) jyn.m25426a(gwb.m1400H(), fzw.class);
            if (!((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3467c(i) || fzw.mo2146a(i)) {
                return null;
            }
            edo c = bkq.m5685c(gwb.m1400H(), i);
            if (c == null) {
                glk.m17982e("Babel", "InviteLineInfo.getInvites: participantId is null.", new Object[0]);
                return null;
            } else if (c.f11245b == null) {
                glk.m17982e("Babel", "InviteLineInfo.getInvites: participantId.chatId is null.", new Object[0]);
                return null;
            } else {
                ear a;
                String[] strArr = new String[]{c.f11245b};
                Cursor query = gwb.m1400H().getContentResolver().query(EsProvider.m8251a(EsProvider.f6007j, i), ebr.f11120a, "inviter_chat_id!=? AND notification_level!=10 AND is_pending_leave!=1 AND sort_timestamp>chat_watermark AND inviter_first_name IS NOT NULL", strArr, "sort_timestamp DESC");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            while (true) {
                                ebq ebq = new ebq(query, i);
                                if (ebq.s != null && ebq.r != null) {
                                    if (ear == null) {
                                        a = ebq.m13473a(query);
                                    } else {
                                        a = ear;
                                    }
                                    a.f11068h.add(ebq);
                                    if (a.f11068h.size() == 7) {
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
                                a.f11069i = a.f11068h.size();
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
