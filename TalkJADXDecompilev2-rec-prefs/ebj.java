package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import java.util.LinkedList;
import java.util.List;

final class ebj {
    ebj() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13453a(Context context, int i, boolean z) {
        bbm bbm = (bbm) jyn.m25426a(context, bbm.class);
        fzw fzw = (fzw) jyn.m25426a(context, fzw.class);
        bko e = fde.m15018e(i);
        if (!fzw.mo2146a(i)) {
            String e2;
            String str;
            Cursor query;
            boolean z2;
            CharSequence charSequence;
            String string;
            int i2;
            long j;
            List a;
            ecm ece;
            LinkedList linkedList = new LinkedList();
            int i3 = new String[]{bkq.m5685c(context, i).f11245b};
            Uri a2 = EsProvider.m8251a(EsProvider.f6009l, i);
            LinkedList linkedList2 = new LinkedList();
            gjj gjj = new gjj();
            long j2 = 0;
            long j3 = 1;
            if (IncomingRing.f6355b != null) {
                e2 = IncomingRing.f6355b.m8635d().m11895e();
            } else if (dgg.m11692a().m11710c()) {
                did s = dgg.m11692a().m11727s();
                if (s == null) {
                    e2 = null;
                } else {
                    e2 = s.m11981e().m11895e();
                }
            } else {
                str = null;
                query = context.getContentResolver().query(a2, ebi.f11098a, ebi.f11099b, i3, "merge_key, timestamp DESC");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            z2 = ebf.f11091a;
                            charSequence = null;
                            i3 = 1;
                            while (true) {
                                string = query.getString(2);
                                i2 = query.getInt(8);
                                if (ebf.f11091a) {
                                    new StringBuilder((String.valueOf(charSequence).length() + 51) + String.valueOf(string).length()).append("[HangoutNotifications] conversationId: ").append(charSequence).append(" newConvId: ").append(string);
                                }
                                if (TextUtils.equals(string, charSequence)) {
                                    j3 = query.getInt(5);
                                    j = query.getLong(6) / 1000;
                                    if (TextUtils.equals(string, str)) {
                                        if (ebf.f11091a) {
                                            new StringBuilder(String.valueOf(string).length() + 85).append("[HangoutNotifications]  newConvId: ").append(string).append(" ignored because of active ring or joined hangout.");
                                            j = j2;
                                        }
                                        j = j2;
                                    } else if (query.getInt(1) == fwy.HANGOUT_START_EVENT.ordinal() || bbm.mo447g(i)) {
                                        a = gwb.m1696a(e, query.getString(7), true);
                                        z2 = false;
                                        if (a != null) {
                                            z2 = a.contains(bkq.m5685c(context, i));
                                        }
                                        if (!z2) {
                                            linkedList2.add(ear.m13378a(query, 3, 4));
                                            gjj.add(string);
                                        }
                                        j = j2;
                                    } else {
                                        String a3 = ear.m13378a(query, 3, 4);
                                        Object string2 = query.getString(0);
                                        iil.m21875b("Should at least have a fallback name for the inviter", string2);
                                        ecm ecs = new ecs(context, i, a3, string, j3, string2, j, i2);
                                        ecm.m13299a(ecs);
                                        linkedList.add(ecs);
                                        ecs.mo1807a(z);
                                        j = j2;
                                    }
                                    charSequence = string;
                                    i3 = j3;
                                    j3 = j;
                                } else {
                                    j3 = j2;
                                }
                                if (!query.moveToNext()) {
                                    break;
                                }
                                j2 = j3;
                            }
                            if (gjj.size() <= 0) {
                                ece = new ece(context, i, gjj, i3, linkedList2, j3);
                                ecm.m13299a(ece);
                                ece.mo1807a(z);
                            } else {
                                ece.m13495b(context, i);
                            }
                            ecs.m13519a(context, i, linkedList);
                            return;
                        }
                    } finally {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                z2 = ebf.f11091a;
                if (query != null) {
                    query.close();
                }
            }
            str = e2;
            query = context.getContentResolver().query(a2, ebi.f11098a, ebi.f11099b, i3, "merge_key, timestamp DESC");
            if (query != null) {
                if (query.moveToFirst()) {
                    z2 = ebf.f11091a;
                    charSequence = null;
                    i3 = 1;
                    while (true) {
                        string = query.getString(2);
                        i2 = query.getInt(8);
                        if (ebf.f11091a) {
                            new StringBuilder((String.valueOf(charSequence).length() + 51) + String.valueOf(string).length()).append("[HangoutNotifications] conversationId: ").append(charSequence).append(" newConvId: ").append(string);
                        }
                        if (TextUtils.equals(string, charSequence)) {
                            j3 = j2;
                        } else {
                            j3 = query.getInt(5);
                            j = query.getLong(6) / 1000;
                            if (TextUtils.equals(string, str)) {
                                if (ebf.f11091a) {
                                    new StringBuilder(String.valueOf(string).length() + 85).append("[HangoutNotifications]  newConvId: ").append(string).append(" ignored because of active ring or joined hangout.");
                                    j = j2;
                                }
                                j = j2;
                            } else {
                                if (query.getInt(1) == fwy.HANGOUT_START_EVENT.ordinal()) {
                                }
                                a = gwb.m1696a(e, query.getString(7), true);
                                z2 = false;
                                if (a != null) {
                                    z2 = a.contains(bkq.m5685c(context, i));
                                }
                                if (z2) {
                                    linkedList2.add(ear.m13378a(query, 3, 4));
                                    gjj.add(string);
                                }
                                j = j2;
                            }
                            charSequence = string;
                            i3 = j3;
                            j3 = j;
                        }
                        if (!query.moveToNext()) {
                            break;
                        }
                        j2 = j3;
                    }
                    if (gjj.size() <= 0) {
                        ece.m13495b(context, i);
                    } else {
                        ece = new ece(context, i, gjj, i3, linkedList2, j3);
                        ecm.m13299a(ece);
                        ece.mo1807a(z);
                    }
                    ecs.m13519a(context, i, linkedList);
                    return;
                }
            }
            z2 = ebf.f11091a;
            if (query != null) {
                query.close();
            }
        }
    }

    void m13454a(Context context, int i, String str) {
        gjj a = gjj.m17806a(str);
        boolean a2 = ((fuz) jyn.m25426a(context, fuz.class)).m16291a(i);
        if (blf.m5803b(new blo(context, i), a) > 0 && !a2) {
            ebj.m13453a(context, i, true);
        }
    }
}
