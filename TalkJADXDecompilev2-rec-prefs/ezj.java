package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;
import java.util.List;

public final class ezj extends evz {
    private static final long serialVersionUID = 2;
    private final String f12543g;
    private final long f12544h;
    private final String[] f12545i;
    private final String[] f12546j;
    private final String[] f12547k;
    private final String[] f12548l;
    private final byte[] f12549m;
    private boolean f12550n;
    private final long f12551o;

    private ezj(luz luz) {
        super(luz, luz.responseHeader, gwb.m1523a(luz.f26567c.f26108c));
        this.f12543g = luz.f26567c.f26109d;
        this.f12544h = gwb.m1523a(luz.f26567c.f26120o);
        int length = luz.f26566b.length;
        this.f12546j = new String[length];
        this.f12547k = new String[length];
        this.f12548l = new String[length];
        this.f12545i = new String[length];
        this.f12551o = gwb.m1523a(luz.responseHeader.f26518d);
        if (luz.f26567c.f26110e == null || luz.f26567c.f26110e.f26134d == null) {
            this.f12549m = null;
        } else {
            this.f12549m = nzf.m1029a(luz.f26567c.f26110e.f26134d);
        }
        for (int i = 0; i < length; i++) {
            obk obk = (obk) luz.f26566b[i].f26357a.a.a(obk.a);
            this.f12546j[i] = obk.f;
            this.f12547k[i] = obk.e;
            this.f12548l[i] = obk.i;
            for (String str : obk.g) {
                if (str.startsWith("BABEL_UNIQUE_ID")) {
                    this.f12545i[i] = str;
                    break;
                }
            }
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(luz);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("SendChatMessageResponse from:").append(valueOf);
        }
    }

    public static evz m14806a(luz luz) {
        if (evz.m8120a(luz.responseHeader)) {
            return new ewv((nzf) luz, luz.responseHeader);
        }
        return new ezj(luz);
    }

    public void mo1047a(blo blo, fhc fhc) {
        int g;
        String str;
        Cursor a;
        Throwable th;
        long b = glj.m17963b();
        super.mo1047a(blo, fhc);
        String k = m14810k();
        String l = m14811l();
        if (evz.f5798a) {
            String valueOf;
            String str2 = this.f12543g;
            new StringBuilder(((String.valueOf(k).length() + 157) + String.valueOf(str2).length()) + String.valueOf(l).length()).append("processSendChatMessageResponse Conversation id: ").append(k).append(", messageId: ").append(str2).append(", messageTimestamp: ").append(this.d).append(", messageClientGeneratedId: ").append(l).append(", mediaId count: ").append(this.f12546j.length);
            for (Object valueOf2 : this.f12546j) {
                str = "  photoId ";
                valueOf = String.valueOf(valueOf2);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            for (Object valueOf22 : this.f12547k) {
                str = "  albumId ";
                valueOf = String.valueOf(valueOf22);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        }
        blo.m5958a();
        long b2 = glj.m17963b();
        try {
            Long l2;
            Long h = blo.m6064h(k, l);
            if (h != null) {
                l2 = h;
            } else {
                l2 = blo.m6064h(k, m14812m());
            }
            if (l2 == null) {
                String valueOf3 = String.valueOf(m14812m());
                glk.m17982e("Babel", new StringBuilder((String.valueOf(l).length() + 85) + String.valueOf(valueOf3).length()).append("Received SendChatMessageResponse for nonexistant  clientGeneratedId  = ").append(l).append(" /  eventId = ").append(valueOf3).toString(), new Object[0]);
            } else {
                blo.m5976a(k, gwb.m1523a(l2), gwb.m1523a(Long.valueOf(this.d)), gwb.m1523a(Long.valueOf(this.f12544h)));
                blo.m5975a(k, gwb.m1523a(Long.valueOf(this.d)), gwb.m1523a(l2));
                blo.m5970a(this);
                blo.m6060g(k, gwb.m1523a(Long.valueOf(this.d)));
                blf.m5821d(blo, k);
            }
            if (this.f12549m != null) {
                try {
                    fld.m15598a(((lwm) nzf.m1027a(new lwm(), this.f12549m)).f26693a, k, this.f12543g, this.d, blo);
                } catch (nzd e) {
                    glk.m17982e("Babel", "Invalid ClientSuggestions protobuf parsed from ClientSendChatMessageResponse. This happening likely means a corrupt response proto has been received.", new Object[0]);
                }
            }
            long b3 = glj.m17963b();
            g = blo.m6056g().m5638g();
            dvm a2 = ba.m4618c().m12794b(l).m12789a(k);
            ba.m4548a(g, b, 10, a2.m12786a((int) HttpStatusCodes.STATUS_CODE_NO_CONTENT));
            ba.m4548a(g, b2, 10, a2.m12786a(103));
            ba.m4548a(g, b3, 13, a2.m12786a(0));
            blo.m6015b();
            blo.m6028c();
            if (evz.f5798a) {
                try {
                    a = blo.m6044e().m6200a("messages", null, "message_id=? OR message_id=?", new String[]{m14811l(), m14812m()}, null, null, null);
                    try {
                        new StringBuilder(81).append("SendChatMessage.processResponse after endTransaction  cursor count is ").append(a.getCount());
                        if (a.moveToFirst()) {
                            do {
                                for (String str3 : a.getColumnNames()) {
                                    g = a.getColumnIndex(str3);
                                    if (a.getType(g) != 4) {
                                        str2 = a.getString(g);
                                        if (str3.equals("text")) {
                                            str2 = glk.m17974b(str2);
                                        }
                                        new StringBuilder((String.valueOf(str3).length() + 5) + String.valueOf(str2).length()).append(str3).append(" ==> ").append(str2);
                                    }
                                }
                            } while (a.moveToNext());
                        }
                        if (a != null) {
                            a.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a = null;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            Object t = m14807t();
            if (!TextUtils.isEmpty(t)) {
                ((bhl) jyn.m25426a(blo.m6049f(), bhl.class)).mo550a(new dww(blo.m6056g().m5638g(), t, true));
            }
            ((ect) jyn.m25426a(blo.m6049f(), ect.class)).mo1838d(blo.m6056g().m5638g(), true);
            return;
        } catch (Throwable th4) {
            th = th4;
        }
        if (a != null) {
            a.close();
        }
        throw th;
    }

    public String m14810k() {
        return ((cpa) this.b).m8181d();
    }

    public String m14811l() {
        return ((cpa) this.b).m8180c();
    }

    private String m14807t() {
        return ((cpa) this.b).m8182e();
    }

    public String m14812m() {
        return this.f12543g;
    }

    public long m14813n() {
        return this.f12544h;
    }

    public String[] m14814o() {
        return this.f12546j;
    }

    public String[] m14815p() {
        return this.f12547k;
    }

    public String[] m14816q() {
        return this.f12548l;
    }

    public String[] m14817r() {
        return this.f12545i;
    }

    public boolean m14818s() {
        return this.f12550n;
    }

    public void mo1960a(fok fok) {
        super.mo1960a(fok);
        if (fok instanceof cpa) {
            List g = ((cpa) fok).m8184g();
            if (g != null && g.size() != 0) {
                boolean z;
                if (((bxn) g.get(0)).f4741c == bxo.PHOTO && ba.m4613b(((bxn) g.get(0)).f4742d) && !"image/gif".equals(((bxn) g.get(0)).f4742d)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f12550n = z;
            }
        }
    }
}
