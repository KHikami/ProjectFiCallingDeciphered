package p000;

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
    static ebw f11121o = new ebw();
    private static final boolean f11122t = ebz.f11037d;
    public fwy f11123a;
    public CharSequence f11124b;
    public String f11125c;
    public int f11126d;
    public int f11127e;
    public int f11128f;
    public boolean f11129g;
    public String f11130h;
    public String f11131i;
    public long f11132j;
    public String f11133k;
    public String f11134l;
    public String f11135m;
    public fwx f11136n;

    public ebs(Cursor cursor, int i) {
        CharSequence a;
        int i2;
        Object obj;
        this.p = new ear(cursor.getString(7), cursor.getString(18), cursor.getInt(10), ear.m13378a(cursor, 8, 9), cursor.getLong(11), false, 0, cursor.getString(21), cursor.getInt(22), cursor.getLong(20));
        this.s = cursor.getString(1);
        String string = cursor.getString(0);
        this.f11123a = fwy.values()[cursor.getInt(4)];
        this.f11127e = cursor.getInt(14);
        this.q = fuz.m16282a(this.f11127e, false);
        this.f11133k = cursor.getString(26);
        this.f11134l = cursor.getString(11);
        String string2 = cursor.getString(3);
        this.f11130h = cursor.getString(15);
        this.f11135m = cursor.getString(2);
        String string3 = cursor.getString(16);
        String string4 = cursor.getString(17);
        int i3 = cursor.getInt(23);
        this.f11128f = cursor.getInt(19);
        this.f11129g = 2 == this.f11128f;
        if (!gwb.m2237h(this.f11127e) || this.f11129g) {
            fwy fwy = this.f11123a;
            String str = this.f11130h;
            String str2 = this.f11135m;
            switch (ebt.f11137a[fwy.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                    throw new IllegalArgumentException("Message with deprecated membership change type");
                default:
                    string2 = gwb.m1661a(fwy, fde.m15018e(i), fwx.ON_SERVER, str, str2, string3, string4, i3, true);
                    break;
            }
            if (string2 != null) {
                a = ebz.m13332a(string2);
            } else {
                a = null;
            }
        } else {
            a = string2;
        }
        this.f11124b = a;
        String string5 = cursor.getString(5);
        if (string5 == null || !(string5.startsWith("file://") || string5.startsWith("content://"))) {
            string5 = cursor.getString(6);
            if ("hangouts/location".equals(cursor.getString(13))) {
                string5 = gld.m17928a(string5);
            }
        }
        int a2 = ebs.m13476a(cursor.getString(13));
        if (string5 == null || !string5.contains(fyi.f14368a)) {
            int i4 = a2;
            string2 = string5;
            i2 = i4;
        } else {
            fyj b = ebs.m13481b(string5);
            if (b != null) {
                string2 = b.f14386a;
                i2 = ebs.m13476a(b.f14387b);
            } else {
                string2 = null;
                i2 = 0;
            }
        }
        String string6 = cursor.getString(5);
        if (string6 == null || !(string6.startsWith("sticker://") || string6.contains(gwb.m2233h(gwb.m1400H())))) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            i2 = 7;
        }
        this.f11126d = i2;
        this.f11125c = string2;
        if (!this.p.f11063c || this.f11127e != 3) {
            this.r = ecj.m13472a(string, this.s, this.p, i);
            if (this.s == null) {
                this.s = this.p.f11066f;
            }
            if (this.r == null) {
                this.r = this.p.f11066f;
            }
        } else if (string == null) {
            this.r = this.s;
        } else {
            this.r = string;
        }
        this.f11131i = cursor.getString(24);
        this.f11132j = cursor.getLong(25);
        this.f11136n = fwx.values()[cursor.getInt(12)];
        if (f11122t) {
            string5 = "Message Line from ";
            string2 = String.valueOf(this.s);
            if (string2.length() != 0) {
                string5.concat(string2);
            } else {
                string2 = new String(string5);
            }
        }
    }

    private static int m13476a(String str) {
        if (ba.m4613b(str)) {
            return 1;
        }
        if (ba.m4623c(str)) {
            return 2;
        }
        if (ba.m4630d(str)) {
            return 3;
        }
        if ("hangouts/location".equals(str)) {
            return 4;
        }
        if (ba.m4636e(str)) {
            return 6;
        }
        return 0;
    }

    private static fyj m13481b(String str) {
        ArrayList b = fyi.m16620b(str);
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            fyj fyj = (fyj) obj;
            if (ba.m4613b(fyj.f14387b)) {
                return fyj;
            }
        }
        return null;
    }

    private static void m13480a(ContentResolver contentResolver, Uri uri, String str, String[] strArr, List<ear> list, int i) {
        Cursor query = contentResolver.query(uri, ebv.f11143a, str, strArr, "merge_key, timestamp DESC");
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
                    Object obj3 = (ebs.p == null || ebs.p.f11061a == null || !RealTimeChatService.m9103d(fde.m15018e(i), ebs.p.f11061a)) ? null : 1;
                    Object obj4 = new blo(gwb.m1400H(), i).m6006b(edo.m13606b(ebs.f11135m)) == 1 ? 1 : null;
                    if (gwb.m2254i(ebs.f11127e) || !(ebs.s == null || ebs.r == null || ebs.f11124b == null || ebs.p.f11066f == null)) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    Object obj5 = (!fdq.f12807w.m14370b(i) || obj3 == null) ? null : 1;
                    if (obj == null) {
                        String str5 = "Babel";
                        String str6 = ebs.s == null ? " null authorFullName " : "";
                        str2 = ebs.r == null ? " null authorDisplayName " : "";
                        str3 = ebs.f11124b == null ? " null text " : "";
                        if (ebs.p.f11066f == null) {
                            str4 = " null groupConversationName ";
                        } else {
                            str4 = "";
                        }
                        glk.m17970a(str5, new StringBuilder((((String.valueOf(str6).length() + 29) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("Skipping notification because").append(str6).append(str2).append(str3).append(str4).toString(), new Object[0]);
                    }
                    if (obj5 != null) {
                        str3 = "Babel";
                        str2 = "Skipping notification because the user focuses in the conversation: ";
                        str4 = String.valueOf(ebs.p.f11061a);
                        if (str4.length() != 0) {
                            str4 = str2.concat(str4);
                        } else {
                            str4 = new String(str2);
                        }
                        glk.m17970a(str3, str4, new Object[0]);
                    }
                    if (obj4 != null) {
                        str3 = "Babel";
                        str2 = "Skipping notification because the message is sent from blocked participant: ";
                        str4 = String.valueOf(ebs.f11135m);
                        glk.m17970a(str3, str4.length() != 0 ? str2.concat(str4) : new String(str2), new Object[0]);
                    }
                    if (obj != null && obj5 == null && obj4 == null) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        if (ear == null || !TextUtils.equals(ebs.p.f11062b, ear.f11062b)) {
                            if (glk.m17973a("Babel", 3)) {
                                str3 = "Babel";
                                str4 = ear == null ? "null" : ear.f11061a;
                                str2 = ebs.p.f11061a;
                                glk.m17970a(str3, new StringBuilder((String.valueOf(str4).length() + 44) + String.valueOf(str2).length()).append("[Notifications] conversationId: ").append(str4).append(" newConvId: ").append(str2).toString(), new Object[0]);
                            }
                            ear = ebs.p;
                            int i2 = 0;
                            while (i2 < list.size() && ear.f11067g < ((ear) list.get(i2)).f11067g) {
                                i2++;
                            }
                            if (i2 < list.size()) {
                                list.add(i2, ear);
                                ear2 = ear;
                                ear2.f11068h.add(ebs);
                                ear2.f11069i++;
                            } else {
                                try {
                                    list.add(ear);
                                } catch (Throwable th) {
                                    query.close();
                                }
                            }
                        }
                        ear2 = ear;
                        ear2.f11068h.add(ebs);
                        ear2.f11069i++;
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

    private static void m13478a(int i, String str, long j, blr blr, dvm dvm) {
        blo blo = new blo(gwb.m1400H(), i);
        blr.f3750j = blo.m6108v(str);
        blr.f3749i = blo.m6107u(str);
        blr.f3748h = j;
        dvm.m12788a(blr);
    }

    static void m13479a(int i, List<ear> list, int i2, int i3, boolean z, blr blr) {
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
                    if (((ear) list.get(i4)).f11068h.get(0) instanceof ebs) {
                        ebs = (ebs) ((ear) list.get(i4)).f11068h.get(0);
                        long parseLong = Long.parseLong(ebs.f11134l);
                        if (j < parseLong) {
                            str5 = ebs.f11133k;
                            str6 = ((ear) list.get(i4)).f11061a;
                            str2 = ebs.f11130h;
                            str7 = ebs.f11135m;
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
                boolean a = fde.m15018e(i).m5632b().m13608a(new edo(str3, str4));
                if (!TextUtils.isEmpty(str) && !a) {
                    b = ba.m4618c().m12798c(str).m12786a(i2).m12789a(str2).m12795b(size == 1);
                    if (blr != null) {
                        ebs.m13478a(i, str2, j, blr, b);
                    }
                    ba.m4548a(i, glj.m17963b(), 10, b);
                }
            } else if (i3 != 0) {
                for (i4 = 0; i4 < size; i4++) {
                    if (!TextUtils.isEmpty(((ear) list.get(i4)).f11061a)) {
                        List list2 = ((ear) list.get(i4)).f11068h;
                        for (int i5 = 0; i5 < list2.size(); i5++) {
                            if (list2.get(i5) instanceof ebs) {
                                ebs = (ebs) list2.get(i5);
                                if (!TextUtils.isEmpty(ebs.f11133k)) {
                                    b = ba.m4618c().m12786a(i3).m12798c(ebs.f11133k).m12789a(((ear) list.get(i4)).f11061a).m12795b(size == 1);
                                    if (blr != null) {
                                        ebs.m13478a(i, ((ear) list.get(i4)).f11061a, Long.parseLong(ebs.f11134l), blr, b);
                                    }
                                    ba.m4548a(i, glj.m17963b(), 10, b);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static /* synthetic */ eap m13477a(Context context, int i, boolean z, int i2) {
        Object obj;
        String replace;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        List arrayList = new ArrayList();
        String str3 = "";
        switch (ebt.f11138b[i2 - 1]) {
            case 1:
                obj = str3;
                break;
            case 2:
                replace = " AND {is_user_mentioned} = 1".replace("{is_user_mentioned}", "is_user_mentioned");
                break;
            case 3:
                replace = " AND {is_user_mentioned} = 0".replace("{is_user_mentioned}", "is_user_mentioned");
                break;
            default:
                return null;
        }
        Uri a = EsProvider.m8251a(EsProvider.f6009l, i);
        ContentResolver contentResolver = context.getContentResolver();
        String str4 = bkq.m5685c(context, i).f11245b;
        String valueOf = String.valueOf((glj.m17956a() - gwb.m1519a(context, "babel_old_message_without_notification", fls.f13431h)) * 1000);
        String[] strArr = str4 == null ? new String[]{valueOf} : new String[]{str4, valueOf};
        if (str4 == null) {
            str = ebv.f11154l;
        } else {
            str = ebv.f11155m;
        }
        String str5;
        if (fdq.f12773O.m14370b(i)) {
            if (str4 == null) {
                str2 = ebv.f11150h;
            } else {
                str2 = ebv.f11152j;
            }
            if (str4 == null) {
                valueOf = ebv.f11145c;
            } else {
                valueOf = ebv.f11147e;
            }
            str5 = valueOf;
            obj2 = str2;
            obj3 = str5;
        } else {
            if (str4 == null) {
                str2 = ebv.f11151i;
            } else {
                str2 = ebv.f11153k;
            }
            if (str4 == null) {
                valueOf = ebv.f11146d;
            } else {
                valueOf = ebv.f11148f;
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
        if (fdq.f12807w.m14370b(i)) {
            ebs.m13480a(contentResolver, a, valueOf, strArr, arrayList, i);
            ebs.m13480a(contentResolver, a, str, strArr, arrayList, i);
        } else {
            ebs.m13480a(contentResolver, a, replace, strArr, arrayList, i);
        }
        blr blr = new blr();
        if (fdq.f12807w.m14370b(i)) {
            ebs.m13479a(i, arrayList, 407, 0, z, blr);
        } else {
            ebs.m13479a(i, arrayList, (int) HttpStatusCodes.STATUS_CODE_NOT_FOUND, 462, z, blr);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            Object obj4 = arrayList2.get(i3);
            i3++;
            i4 = ((ear) obj4).f11069i + i4;
        }
        return new eap(i4, arrayList);
    }
}
