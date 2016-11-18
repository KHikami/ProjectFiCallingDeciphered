package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpContent;
import java.util.List;

public class eup extends esw {
    private static final long serialVersionUID = 1;
    public final int f12305c;
    public final int f12306d;
    public final String f12307e;
    public final List<edk> f12308f;
    public final String f12309k;
    public final String f12310l;

    public eup(String str, int i, String str2, List<edk> list, String str3) {
        this(str, i, 0, str2, list, null);
    }

    public eup(String str, int i, int i2, String str2, List<edk> list, String str3) {
        String b;
        iil.m21874a("Expected condition to be true", blo.m5871a(str));
        this.f12309k = str;
        this.f12305c = i;
        this.f12306d = i2;
        this.f12307e = str2;
        this.f12308f = list;
        this.f12310l = str3;
        for (edk edk : this.f12308f) {
            if (edk.f11215d != null || !TextUtils.isEmpty(edk.f11218g)) {
                b = edk.m13590b();
                if (b != null && b.startsWith("g:")) {
                    b = "CCR invitee gaiaId should not start with g:.";
                    break;
                }
            } else {
                b = "CCR invitee should not have empty fallback name.";
                break;
            }
        }
        b = null;
        if (b != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b).append(" ");
            stringBuilder.append("Invitees: ");
            for (edk edk2 : this.f12308f) {
                stringBuilder.append("[");
                stringBuilder.append("g:").append(edk2.m13590b()).append(",");
                stringBuilder.append("ch:").append(edk2.m13592c()).append(",");
                stringBuilder.append("ci:").append(edk2.f11215d).append(",");
                StringBuilder append = stringBuilder.append("p:");
                String str4 = edk2.f11214c;
                if (!TextUtils.isEmpty(str4)) {
                    int length = str4.length();
                    if (4 >= length) {
                        str4 = gwb.m2136d("x", length);
                    } else {
                        String valueOf = String.valueOf(gwb.m2136d("x", length - 4));
                        str4 = String.valueOf(str4.substring(length - 4, length));
                        str4 = str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf);
                    }
                }
                append.append(str4).append(",");
                stringBuilder.append("fallback:").append(TextUtils.isEmpty(edk2.f11218g) ? "unset" : "set");
                stringBuilder.append("] ");
            }
            iil.m21870a(stringBuilder.toString());
        }
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (glk.m17973a("BabelClient", 3)) {
            String str2 = "BabelClient";
            String str3 = "ConversationRequest build protobuf: name=";
            String valueOf = String.valueOf(this.f12307e);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17976b(str2, valueOf, new Object[0]);
        }
        nzf loz = new loz();
        loz.requestHeader = euk.m14556a(str, i, i2, this.i);
        loz.f25963a = Integer.valueOf(this.f12305c);
        loz.f25965c = blo.m5887c(this.f12309k);
        if (this.f12307e != null) {
            loz.f25966d = this.f12307e;
        }
        int size = this.f12308f != null ? this.f12308f.size() : 0;
        if (size > 0) {
            loz.f25968f = new lsh[size];
            int i3 = 0;
            for (edk edk : this.f12308f) {
                int size2;
                lsh a = gwb.m1714a(gwb.m1400H(), edk, this.f12306d);
                if (edk.f11204B != null) {
                    size2 = edk.f11204B.size() + 0;
                } else {
                    size2 = 0;
                }
                if (edk.f11203A != null) {
                    size2 += edk.f11203A.size();
                }
                size2++;
                if (size2 > 0) {
                    int i4;
                    a.f26320f = new lsi[size2];
                    if (edk.f11204B != null) {
                        i4 = 0;
                        for (String str22 : edk.f11204B) {
                            a.f26320f[i4] = new lsi();
                            a.f26320f[i4].f26324b = new lsj();
                            a.f26320f[i4].f26324b.f26326a = str22;
                            i4++;
                        }
                    } else {
                        i4 = 0;
                    }
                    if (edk.f11203A != null) {
                        for (String str222 : edk.f11203A) {
                            a.f26320f[i4] = new lsi();
                            a.f26320f[i4].f26323a = new lsl();
                            a.f26320f[i4].f26323a.f26328a = new muu();
                            a.f26320f[i4].f26323a.f26328a.f28411a = str222;
                            i4++;
                        }
                    }
                    a.f26320f[i4] = new lsi();
                    a.f26320f[i4].f26325c = new lsk();
                    if (!TextUtils.isEmpty(edk.f11207E)) {
                        a.f26320f[i4].f26325c.f26327a = edk.f11207E;
                    } else if (TextUtils.isEmpty(edk.f11216e)) {
                        a.f26320f[i4].f26325c.f26327a = "unknown person";
                    } else {
                        a.f26320f[i4].f26325c.f26327a = edk.f11216e;
                    }
                }
                loz.f25968f[i3] = a;
                i3++;
            }
        }
        if (!TextUtils.isEmpty(this.f12310l)) {
            lse lse = new lse();
            lse.f26305a = this.f12310l;
            loz.f25970h = lse;
        }
        return loz;
    }

    public HttpContent mo1956b(String str, int i, int i2) {
        nzf a = mo1944a(str, i, i2);
        if (a != null) {
            this.j = a.toString();
        }
        return new etg(a);
    }

    public String mo1947g() {
        return "conversations/createconversation";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        RealTimeChatService.m9027a(bko, this.f12309k, fdo.m15084c() == 111);
    }

    public String K_() {
        return "event_queue";
    }
}
