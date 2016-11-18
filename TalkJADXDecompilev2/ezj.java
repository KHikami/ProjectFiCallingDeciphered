package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;
import java.util.List;

public final class ezj extends evz {
    private static final long serialVersionUID = 2;
    private final String g;
    private final long h;
    private final String[] i;
    private final String[] j;
    private final String[] k;
    private final String[] l;
    private final byte[] m;
    private boolean n;
    private final long o;

    private ezj(luz luz) {
        super(luz, luz.responseHeader, gwb.a(luz.c.c));
        this.g = luz.c.d;
        this.h = gwb.a(luz.c.o);
        int length = luz.b.length;
        this.j = new String[length];
        this.k = new String[length];
        this.l = new String[length];
        this.i = new String[length];
        this.o = gwb.a(luz.responseHeader.d);
        if (luz.c.e == null || luz.c.e.d == null) {
            this.m = null;
        } else {
            this.m = nzf.a(luz.c.e.d);
        }
        for (int i = 0; i < length; i++) {
            obk obk = (obk) luz.b[i].a.a.a(obk.a);
            this.j[i] = obk.f;
            this.k[i] = obk.e;
            this.l[i] = obk.i;
            for (String str : obk.g) {
                if (str.startsWith("BABEL_UNIQUE_ID")) {
                    this.i[i] = str;
                    break;
                }
            }
        }
        if (evz.a) {
            String valueOf = String.valueOf(luz);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("SendChatMessageResponse from:").append(valueOf);
        }
    }

    public static evz a(luz luz) {
        if (evz.a(luz.responseHeader)) {
            return new ewv((nzf) luz, luz.responseHeader);
        }
        return new ezj(luz);
    }

    public void a(blo blo, fhc fhc) {
        int g;
        String str;
        Cursor a;
        Throwable th;
        long b = glj.b();
        super.a(blo, fhc);
        String k = k();
        String l = l();
        if (evz.a) {
            String valueOf;
            String str2 = this.g;
            new StringBuilder(((String.valueOf(k).length() + 157) + String.valueOf(str2).length()) + String.valueOf(l).length()).append("processSendChatMessageResponse Conversation id: ").append(k).append(", messageId: ").append(str2).append(", messageTimestamp: ").append(this.d).append(", messageClientGeneratedId: ").append(l).append(", mediaId count: ").append(this.j.length);
            for (Object valueOf2 : this.j) {
                str = "  photoId ";
                valueOf = String.valueOf(valueOf2);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            for (Object valueOf22 : this.k) {
                str = "  albumId ";
                valueOf = String.valueOf(valueOf22);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        }
        blo.a();
        long b2 = glj.b();
        try {
            Long l2;
            Long h = blo.h(k, l);
            if (h != null) {
                l2 = h;
            } else {
                l2 = blo.h(k, m());
            }
            if (l2 == null) {
                String valueOf3 = String.valueOf(m());
                glk.e("Babel", new StringBuilder((String.valueOf(l).length() + 85) + String.valueOf(valueOf3).length()).append("Received SendChatMessageResponse for nonexistant  clientGeneratedId  = ").append(l).append(" /  eventId = ").append(valueOf3).toString(), new Object[0]);
            } else {
                blo.a(k, gwb.a(l2), gwb.a(Long.valueOf(this.d)), gwb.a(Long.valueOf(this.h)));
                blo.a(k, gwb.a(Long.valueOf(this.d)), gwb.a(l2));
                blo.a(this);
                blo.g(k, gwb.a(Long.valueOf(this.d)));
                blf.d(blo, k);
            }
            if (this.m != null) {
                try {
                    fld.a(((lwm) nzf.a(new lwm(), this.m)).a, k, this.g, this.d, blo);
                } catch (nzd e) {
                    glk.e("Babel", "Invalid ClientSuggestions protobuf parsed from ClientSendChatMessageResponse. This happening likely means a corrupt response proto has been received.", new Object[0]);
                }
            }
            long b3 = glj.b();
            g = blo.g().g();
            dvm a2 = ba.c().b(l).a(k);
            ba.a(g, b, 10, a2.a((int) HttpStatusCodes.STATUS_CODE_NO_CONTENT));
            ba.a(g, b2, 10, a2.a(103));
            ba.a(g, b3, 13, a2.a(0));
            blo.b();
            blo.c();
            if (evz.a) {
                try {
                    a = blo.e().a("messages", null, "message_id=? OR message_id=?", new String[]{l(), m()}, null, null, null);
                    try {
                        new StringBuilder(81).append("SendChatMessage.processResponse after endTransaction  cursor count is ").append(a.getCount());
                        if (a.moveToFirst()) {
                            do {
                                for (String str3 : a.getColumnNames()) {
                                    g = a.getColumnIndex(str3);
                                    if (a.getType(g) != 4) {
                                        str2 = a.getString(g);
                                        if (str3.equals("text")) {
                                            str2 = glk.b(str2);
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
            Object t = t();
            if (!TextUtils.isEmpty(t)) {
                ((bhl) jyn.a(blo.f(), bhl.class)).a(new dww(blo.g().g(), t, true));
            }
            ((ect) jyn.a(blo.f(), ect.class)).d(blo.g().g(), true);
            return;
        } catch (Throwable th4) {
            th = th4;
        }
        if (a != null) {
            a.close();
        }
        throw th;
    }

    public String k() {
        return ((cpa) this.b).d();
    }

    public String l() {
        return ((cpa) this.b).c();
    }

    private String t() {
        return ((cpa) this.b).e();
    }

    public String m() {
        return this.g;
    }

    public long n() {
        return this.h;
    }

    public String[] o() {
        return this.j;
    }

    public String[] p() {
        return this.k;
    }

    public String[] q() {
        return this.l;
    }

    public String[] r() {
        return this.i;
    }

    public boolean s() {
        return this.n;
    }

    public void a(fok fok) {
        super.a(fok);
        if (fok instanceof cpa) {
            List g = ((cpa) fok).g();
            if (g != null && g.size() != 0) {
                boolean z;
                if (((bxn) g.get(0)).c == bxo.PHOTO && ba.b(((bxn) g.get(0)).d) && !"image/gif".equals(((bxn) g.get(0)).d)) {
                    z = true;
                } else {
                    z = false;
                }
                this.n = z;
            }
        }
    }
}
