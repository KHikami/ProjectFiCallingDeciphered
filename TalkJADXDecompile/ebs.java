import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.List;

public final class ebs extends ecj {
    static ebw o;
    private static final boolean t;
    public fwy a;
    public CharSequence b;
    public String c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public String i;
    public long j;
    public String k;
    public String l;
    public String m;
    public fwx n;

    static {
        t = ebz.d;
        o = new ebw();
    }

    public ebs(Cursor cursor, int i) {
        CharSequence a;
        int i2;
        Object obj;
        this.p = new ear(cursor.getString(7), cursor.getString(18), cursor.getInt(10), ear.a(cursor, 8, 9), cursor.getLong(11), false, 0, cursor.getString(21), cursor.getInt(22), cursor.getLong(20));
        this.s = cursor.getString(1);
        String string = cursor.getString(0);
        this.a = fwy.values()[cursor.getInt(4)];
        this.e = cursor.getInt(14);
        this.q = fuz.a(this.e, false);
        this.k = cursor.getString(26);
        this.l = cursor.getString(11);
        String string2 = cursor.getString(3);
        this.h = cursor.getString(15);
        this.m = cursor.getString(2);
        String string3 = cursor.getString(16);
        String string4 = cursor.getString(17);
        int i3 = cursor.getInt(23);
        this.f = cursor.getInt(19);
        this.g = 2 == this.f;
        if (!gwb.h(this.e) || this.g) {
            fwy fwy = this.a;
            String str = this.h;
            String str2 = this.m;
            switch (ebt.a[fwy.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    break;
                case wi.z /*3*/:
                    throw new IllegalArgumentException("Message with deprecated membership change type");
                default:
                    string2 = gwb.a(fwy, fde.e(i), fwx.ON_SERVER, str, str2, string3, string4, i3, true);
                    break;
            }
            if (string2 != null) {
                a = ebz.a(string2);
            } else {
                a = null;
            }
        } else {
            a = string2;
        }
        this.b = a;
        String string5 = cursor.getString(5);
        if (string5 == null || !(string5.startsWith("file://") || string5.startsWith("content://"))) {
            string5 = cursor.getString(6);
            if ("hangouts/location".equals(cursor.getString(13))) {
                string5 = gld.a(string5);
            }
        }
        int a2 = a(cursor.getString(13));
        if (string5 == null || !string5.contains(fyi.a)) {
            int i4 = a2;
            string2 = string5;
            i2 = i4;
        } else {
            fyj b = b(string5);
            if (b != null) {
                string2 = b.a;
                i2 = a(b.b);
            } else {
                string2 = null;
                i2 = 0;
            }
        }
        String string6 = cursor.getString(5);
        if (string6 == null || !(string6.startsWith("sticker://") || string6.contains(gwb.h(gwb.H())))) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            i2 = 7;
        }
        this.d = i2;
        this.c = string2;
        if (!this.p.c || this.e != 3) {
            this.r = ecj.a(string, this.s, this.p, i);
            if (this.s == null) {
                this.s = this.p.f;
            }
            if (this.r == null) {
                this.r = this.p.f;
            }
        } else if (string == null) {
            this.r = this.s;
        } else {
            this.r = string;
        }
        this.i = cursor.getString(24);
        this.j = cursor.getLong(25);
        this.n = fwx.values()[cursor.getInt(12)];
        if (t) {
            string5 = "Message Line from ";
            string2 = String.valueOf(this.s);
            if (string2.length() != 0) {
                string5.concat(string2);
            } else {
                string2 = new String(string5);
            }
        }
    }

    private static int a(String str) {
        if (ba.b(str)) {
            return 1;
        }
        if (ba.c(str)) {
            return 2;
        }
        if (ba.d(str)) {
            return 3;
        }
        if ("hangouts/location".equals(str)) {
            return 4;
        }
        if (ba.e(str)) {
            return 6;
        }
        return 0;
    }

    private static fyj b(String str) {
        ArrayList b = fyi.b(str);
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            fyj fyj = (fyj) obj;
            if (ba.b(fyj.b)) {
                return fyj;
            }
        }
        return null;
    }

    private static void a(ContentResolver contentResolver, Uri uri, String str, String[] strArr, List<ear> list, int i) {
        Cursor query = contentResolver.query(uri, ebv.a, str, strArr, "merge_key, timestamp DESC");
        if (query != null) {
            if (query.moveToFirst()) {
                ear ear = null;
                while (true) {
                    Object obj;
                    String str2;
                    String str3;
                    String str4;
                    Object obj2;
                    ear ear2;
                    ebs ebs = new ebs(query, i);
                    Object obj3 = (ebs.p == null || ebs.p.a == null || !RealTimeChatService.d(fde.e(i), ebs.p.a)) ? null : 1;
                    Object obj4 = new blo(gwb.H(), i).b(edo.b(ebs.m)) == 1 ? 1 : null;
                    if (gwb.i(ebs.e) || !(ebs.s == null || ebs.r == null || ebs.b == null || ebs.p.f == null)) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    Object obj5 = (!fdq.w.b(i) || obj3 == null) ? null : 1;
                    if (obj == null) {
                        String str5 = "Babel";
                        String str6 = ebs.s == null ? " null authorFullName " : "";
                        str2 = ebs.r == null ? " null authorDisplayName " : "";
                        str3 = ebs.b == null ? " null text " : "";
                        if (ebs.p.f == null) {
                            str4 = " null groupConversationName ";
                        } else {
                            str4 = "";
                        }
                        glk.a(str5, new StringBuilder((((String.valueOf(str6).length() + 29) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("Skipping notification because").append(str6).append(str2).append(str3).append(str4).toString(), new Object[0]);
                    }
                    if (obj5 != null) {
                        str3 = "Babel";
                        str2 = "Skipping notification because the user focuses in the conversation: ";
                        str4 = String.valueOf(ebs.p.a);
                        if (str4.length() != 0) {
                            str4 = str2.concat(str4);
                        } else {
                            str4 = new String(str2);
                        }
                        glk.a(str3, str4, new Object[0]);
                    }
                    if (obj4 != null) {
                        str3 = "Babel";
                        str2 = "Skipping notification because the message is sent from blocked participant: ";
                        str4 = String.valueOf(ebs.m);
                        glk.a(str3, str4.length() != 0 ? str2.concat(str4) : new String(str2), new Object[0]);
                    }
                    if (obj != null && obj5 == null && obj4 == null) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        if (ear == null || !TextUtils.equals(ebs.p.b, ear.b)) {
                            if (glk.a("Babel", 3)) {
                                str3 = "Babel";
                                str4 = ear == null ? "null" : ear.a;
                                str2 = ebs.p.a;
                                glk.a(str3, new StringBuilder((String.valueOf(str4).length() + 44) + String.valueOf(str2).length()).append("[Notifications] conversationId: ").append(str4).append(" newConvId: ").append(str2).toString(), new Object[0]);
                            }
                            ear = ebs.p;
                            int i2 = 0;
                            while (i2 < list.size() && ear.g < ((ear) list.get(i2)).g) {
                                i2++;
                            }
                            if (i2 < list.size()) {
                                list.add(i2, ear);
                                ear2 = ear;
                                ear2.h.add(ebs);
                                ear2.i++;
                            } else {
                                try {
                                    list.add(ear);
                                } catch (Throwable th) {
                                    query.close();
                                }
                            }
                        }
                        ear2 = ear;
                        ear2.h.add(ebs);
                        ear2.i++;
                    } else {
                        ear2 = ear;
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                    ear = ear2;
                }
            }
            query.close();
        }
    }

    private static void a(int i, String str, long j, blr blr, dvm dvm) {
        blo blo = new blo(gwb.H(), i);
        blr.j = blo.v(str);
        blr.i = blo.u(str);
        blr.h = j;
        dvm.a(blr);
    }

    static void a(int i, List<ear> list, int i2, int i3, boolean z, blr blr) {
        int size = list.size();
        if (size > 0) {
            int i4;
            ebs ebs;
            dvm b;
            if (z) {
                long j = 0;
                String str = "";
                String str2 = "";
                String str3 = "";
                String str4 = "";
                i4 = 0;
                while (i4 < size) {
                    String str5;
                    String str6;
                    String str7;
                    long j2;
                    String str8;
                    if (((ear) list.get(i4)).h.get(0) instanceof ebs) {
                        ebs = (ebs) ((ear) list.get(i4)).h.get(0);
                        long parseLong = Long.parseLong(ebs.l);
                        if (j < parseLong) {
                            str5 = ebs.k;
                            str6 = ((ear) list.get(i4)).a;
                            str2 = ebs.h;
                            str7 = ebs.m;
                            j2 = parseLong;
                            i4++;
                            str = str5;
                            str8 = str2;
                            str2 = str6;
                            j = j2;
                            str4 = str7;
                            str3 = str8;
                        }
                    }
                    str7 = str4;
                    j2 = j;
                    str6 = str2;
                    str5 = str;
                    str2 = str3;
                    i4++;
                    str = str5;
                    str8 = str2;
                    str2 = str6;
                    j = j2;
                    str4 = str7;
                    str3 = str8;
                }
                boolean a = fde.e(i).b().a(new edo(str3, str4));
                if (!TextUtils.isEmpty(str) && !a) {
                    b = ba.c().c(str).a(i2).a(str2).b(size == 1);
                    if (blr != null) {
                        a(i, str2, j, blr, b);
                    }
                    ba.a(i, glj.b(), 10, b);
                }
            } else if (i3 != 0) {
                for (i4 = 0; i4 < size; i4++) {
                    if (!TextUtils.isEmpty(((ear) list.get(i4)).a)) {
                        List list2 = ((ear) list.get(i4)).h;
                        for (int i5 = 0; i5 < list2.size(); i5++) {
                            if (list2.get(i5) instanceof ebs) {
                                ebs = (ebs) list2.get(i5);
                                if (!TextUtils.isEmpty(ebs.k)) {
                                    b = ba.c().a(i3).c(ebs.k).a(((ear) list.get(i4)).a).b(size == 1);
                                    if (blr != null) {
                                        a(i, ((ear) list.get(i4)).a, Long.parseLong(ebs.l), blr, b);
                                    }
                                    ba.a(i, glj.b(), 10, b);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static /* synthetic */ eap a(Context context, int i, boolean z, int i2) {
        Object obj;
        String replace;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        List arrayList = new ArrayList();
        String str3 = "";
        switch (ebt.b[i2 - 1]) {
            case wi.j /*1*/:
                obj = str3;
                break;
            case wi.l /*2*/:
                replace = " AND {is_user_mentioned} = 1".replace("{is_user_mentioned}", "is_user_mentioned");
                break;
            case wi.z /*3*/:
                replace = " AND {is_user_mentioned} = 0".replace("{is_user_mentioned}", "is_user_mentioned");
                break;
            default:
                return null;
        }
        Uri a = EsProvider.a(EsProvider.l, i);
        ContentResolver contentResolver = context.getContentResolver();
        String str4 = bkq.c(context, i).b;
        String valueOf = String.valueOf((glj.a() - gwb.a(context, "babel_old_message_without_notification", fls.h)) * 1000);
        String[] strArr = str4 == null ? new String[]{valueOf} : new String[]{str4, valueOf};
        if (str4 == null) {
            str = ebv.l;
        } else {
            str = ebv.m;
        }
        String str5;
        if (fdq.O.b(i)) {
            if (str4 == null) {
                str2 = ebv.h;
            } else {
                str2 = ebv.j;
            }
            if (str4 == null) {
                valueOf = ebv.c;
            } else {
                valueOf = ebv.e;
            }
            str5 = valueOf;
            obj2 = str2;
            obj3 = str5;
        } else {
            if (str4 == null) {
                str2 = ebv.i;
            } else {
                str2 = ebv.k;
            }
            if (str4 == null) {
                valueOf = ebv.d;
            } else {
                valueOf = ebv.f;
            }
            str5 = valueOf;
            valueOf = str2;
            str2 = str5;
        }
        str4 = String.valueOf(obj2);
        valueOf = String.valueOf(obj);
        valueOf = valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4);
        str2 = String.valueOf(obj3);
        replace = String.valueOf(obj);
        if (replace.length() != 0) {
            replace = str2.concat(replace);
        } else {
            replace = new String(str2);
        }
        if (fdq.w.b(i)) {
            a(contentResolver, a, valueOf, strArr, arrayList, i);
            a(contentResolver, a, str, strArr, arrayList, i);
        } else {
            a(contentResolver, a, replace, strArr, arrayList, i);
        }
        blr blr = new blr();
        if (fdq.w.b(i)) {
            a(i, arrayList, 407, 0, z, blr);
        } else {
            a(i, arrayList, (int) HttpStatusCodes.STATUS_CODE_NOT_FOUND, 462, z, blr);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            Object obj4 = arrayList2.get(i3);
            i3++;
            i4 = ((ear) obj4).i + i4;
        }
        return new eap(i4, arrayList);
    }
}
