package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpContent;
import java.util.List;

/* renamed from: eup */
public class eup extends esw {
    private static final long serialVersionUID = 1;
    public final int c;
    public final int d;
    public final String e;
    public final List<edk> f;
    public final String k;
    public final String l;

    public eup(String str, int i, String str2, List<edk> list, String str3) {
        this(str, i, 0, str2, list, null);
    }

    public eup(String str, int i, int i2, String str2, List<edk> list, String str3) {
        String b;
        iil.a("Expected condition to be true", blo.a(str));
        this.k = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = list;
        this.l = str3;
        for (edk edk : this.f) {
            if (edk.d != null || !TextUtils.isEmpty(edk.g)) {
                b = edk.b();
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
            for (edk edk2 : this.f) {
                stringBuilder.append("[");
                stringBuilder.append("g:").append(edk2.b()).append(",");
                stringBuilder.append("ch:").append(edk2.c()).append(",");
                stringBuilder.append("ci:").append(edk2.d).append(",");
                StringBuilder append = stringBuilder.append("p:");
                String str4 = edk2.c;
                if (!TextUtils.isEmpty(str4)) {
                    int length = str4.length();
                    if (4 >= length) {
                        str4 = gwb.d("x", length);
                    } else {
                        String valueOf = String.valueOf(gwb.d("x", length - 4));
                        str4 = String.valueOf(str4.substring(length - 4, length));
                        str4 = str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf);
                    }
                }
                append.append(str4).append(",");
                stringBuilder.append("fallback:").append(TextUtils.isEmpty(edk2.g) ? "unset" : "set");
                stringBuilder.append("] ");
            }
            iil.a(stringBuilder.toString());
        }
    }

    public nzf a(String str, int i, int i2) {
        if (glk.a("BabelClient", 3)) {
            String str2 = "BabelClient";
            String str3 = "ConversationRequest build protobuf: name=";
            String valueOf = String.valueOf(this.e);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.b(str2, valueOf, new Object[0]);
        }
        nzf loz = new loz();
        loz.requestHeader = euk.a(str, i, i2, this.i);
        loz.a = Integer.valueOf(this.c);
        loz.c = blo.c(this.k);
        if (this.e != null) {
            loz.d = this.e;
        }
        int size = this.f != null ? this.f.size() : 0;
        if (size > 0) {
            loz.f = new lsh[size];
            int i3 = 0;
            for (edk edk : this.f) {
                int size2;
                lsh a = gwb.a(gwb.H(), edk, this.d);
                if (edk.B != null) {
                    size2 = edk.B.size() + 0;
                } else {
                    size2 = 0;
                }
                if (edk.A != null) {
                    size2 += edk.A.size();
                }
                size2++;
                if (size2 > 0) {
                    int i4;
                    a.f = new lsi[size2];
                    if (edk.B != null) {
                        i4 = 0;
                        for (String str22 : edk.B) {
                            a.f[i4] = new lsi();
                            a.f[i4].b = new lsj();
                            a.f[i4].b.a = str22;
                            i4++;
                        }
                    } else {
                        i4 = 0;
                    }
                    if (edk.A != null) {
                        for (String str222 : edk.A) {
                            a.f[i4] = new lsi();
                            a.f[i4].a = new lsl();
                            a.f[i4].a.a = new muu();
                            a.f[i4].a.a.a = str222;
                            i4++;
                        }
                    }
                    a.f[i4] = new lsi();
                    a.f[i4].c = new lsk();
                    if (!TextUtils.isEmpty(edk.E)) {
                        a.f[i4].c.a = edk.E;
                    } else if (TextUtils.isEmpty(edk.e)) {
                        a.f[i4].c.a = "unknown person";
                    } else {
                        a.f[i4].c.a = edk.e;
                    }
                }
                loz.f[i3] = a;
                i3++;
            }
        }
        if (!TextUtils.isEmpty(this.l)) {
            lse lse = new lse();
            lse.a = this.l;
            loz.h = lse;
        }
        return loz;
    }

    public HttpContent b(String str, int i, int i2) {
        nzf a = a(str, i, i2);
        if (a != null) {
            this.j = a.toString();
        }
        return new etg(a);
    }

    public String g() {
        return "conversations/createconversation";
    }

    public void a(Context context, bko bko, fdo fdo) {
        RealTimeChatService.a(bko, this.k, fdo.c() == 111);
    }

    public String K_() {
        return "event_queue";
    }
}
