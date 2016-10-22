package defpackage;

import java.util.List;
import obk;

/* renamed from: ezj */
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.blo r15, defpackage.fhc r16) {
        /*
        r14 = this;
        r10 = defpackage.glj.b();
        super.a(r15, r16);
        r1 = r14.k();
        r9 = r14.l();
        r0 = defpackage.evz.a;
        if (r0 == 0) goto L_0x00ac;
    L_0x0013:
        r0 = r14.g;
        r2 = r14.d;
        r4 = r14.j;
        r4 = r4.length;
        r5 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r1);
        r6 = r6.length();
        r6 = r6 + 157;
        r7 = java.lang.String.valueOf(r0);
        r7 = r7.length();
        r6 = r6 + r7;
        r7 = java.lang.String.valueOf(r9);
        r7 = r7.length();
        r6 = r6 + r7;
        r5.<init>(r6);
        r6 = "processSendChatMessageResponse Conversation id: ";
        r5 = r5.append(r6);
        r5 = r5.append(r1);
        r6 = ", messageId: ";
        r5 = r5.append(r6);
        r0 = r5.append(r0);
        r5 = ", messageTimestamp: ";
        r0 = r0.append(r5);
        r0 = r0.append(r2);
        r2 = ", messageClientGeneratedId: ";
        r0 = r0.append(r2);
        r0 = r0.append(r9);
        r2 = ", mediaId count: ";
        r0 = r0.append(r2);
        r0.append(r4);
        r2 = r14.j;
        r3 = r2.length;
        r0 = 0;
    L_0x0070:
        if (r0 >= r3) goto L_0x008c;
    L_0x0072:
        r4 = r2[r0];
        r5 = "  photoId ";
        r4 = java.lang.String.valueOf(r4);
        r6 = r4.length();
        if (r6 == 0) goto L_0x0086;
    L_0x0080:
        r5.concat(r4);
    L_0x0083:
        r0 = r0 + 1;
        goto L_0x0070;
    L_0x0086:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x0083;
    L_0x008c:
        r2 = r14.k;
        r3 = r2.length;
        r0 = 0;
    L_0x0090:
        if (r0 >= r3) goto L_0x00ac;
    L_0x0092:
        r4 = r2[r0];
        r5 = "  albumId ";
        r4 = java.lang.String.valueOf(r4);
        r6 = r4.length();
        if (r6 == 0) goto L_0x00a6;
    L_0x00a0:
        r5.concat(r4);
    L_0x00a3:
        r0 = r0 + 1;
        goto L_0x0090;
    L_0x00a6:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x00a3;
    L_0x00ac:
        r15.a();
        r12 = defpackage.glj.b();
        r0 = r15.h(r1, r9);	 Catch:{ all -> 0x0232 }
        if (r0 == 0) goto L_0x01e4;
    L_0x00b9:
        r8 = r0;
    L_0x00ba:
        if (r8 != 0) goto L_0x01ef;
    L_0x00bc:
        r0 = "Babel";
        r2 = r14.m();	 Catch:{ all -> 0x0232 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0232 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0232 }
        r4 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x0232 }
        r4 = r4.length();	 Catch:{ all -> 0x0232 }
        r4 = r4 + 85;
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0232 }
        r5 = r5.length();	 Catch:{ all -> 0x0232 }
        r4 = r4 + r5;
        r3.<init>(r4);	 Catch:{ all -> 0x0232 }
        r4 = "Received SendChatMessageResponse for nonexistant  clientGeneratedId  = ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0232 }
        r3 = r3.append(r9);	 Catch:{ all -> 0x0232 }
        r4 = " /  eventId = ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0232 }
        r2 = r3.append(r2);	 Catch:{ all -> 0x0232 }
        r2 = r2.toString();	 Catch:{ all -> 0x0232 }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0232 }
        defpackage.glk.e(r0, r2, r3);	 Catch:{ all -> 0x0232 }
    L_0x00fc:
        r0 = r14.m;	 Catch:{ all -> 0x0232 }
        if (r0 == 0) goto L_0x0117;
    L_0x0100:
        r0 = new lwm;	 Catch:{ nzd -> 0x02c6 }
        r0.<init>();	 Catch:{ nzd -> 0x02c6 }
        r2 = r14.m;	 Catch:{ nzd -> 0x02c6 }
        r0 = defpackage.nzf.a(r0, r2);	 Catch:{ nzd -> 0x02c6 }
        r0 = (defpackage.lwm) r0;	 Catch:{ nzd -> 0x02c6 }
        r0 = r0.a;	 Catch:{ nzd -> 0x02c6 }
        r2 = r14.g;	 Catch:{ nzd -> 0x02c6 }
        r3 = r14.d;	 Catch:{ nzd -> 0x02c6 }
        r5 = r15;
        defpackage.fld.a(r0, r1, r2, r3, r5);	 Catch:{ nzd -> 0x02c6 }
    L_0x0117:
        r2 = defpackage.glj.b();	 Catch:{ all -> 0x0232 }
        r0 = r15.g();	 Catch:{ all -> 0x0232 }
        r0 = r0.g();	 Catch:{ all -> 0x0232 }
        r4 = defpackage.ba.c();	 Catch:{ all -> 0x0232 }
        r4 = r4.b(r9);	 Catch:{ all -> 0x0232 }
        r1 = r4.a(r1);	 Catch:{ all -> 0x0232 }
        r4 = 10;
        r5 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r5 = r1.a(r5);	 Catch:{ all -> 0x0232 }
        defpackage.ba.a(r0, r10, r4, r5);	 Catch:{ all -> 0x0232 }
        r4 = 10;
        r5 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r5 = r1.a(r5);	 Catch:{ all -> 0x0232 }
        defpackage.ba.a(r0, r12, r4, r5);	 Catch:{ all -> 0x0232 }
        r4 = 13;
        r5 = 0;
        r1 = r1.a(r5);	 Catch:{ all -> 0x0232 }
        defpackage.ba.a(r0, r2, r4, r1);	 Catch:{ all -> 0x0232 }
        r15.b();	 Catch:{ all -> 0x0232 }
        r15.c();
        r0 = defpackage.evz.a;
        if (r0 == 0) goto L_0x02de;
    L_0x0159:
        r8 = 0;
        r0 = r15.e();	 Catch:{ all -> 0x031e }
        r1 = "messages";
        r2 = 0;
        r3 = "message_id=? OR message_id=?";
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x031e }
        r5 = 0;
        r6 = r14.l();	 Catch:{ all -> 0x031e }
        r4[r5] = r6;	 Catch:{ all -> 0x031e }
        r5 = 1;
        r6 = r14.m();	 Catch:{ all -> 0x031e }
        r4[r5] = r6;	 Catch:{ all -> 0x031e }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r1 = r0.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x031e }
        r0 = r1.getCount();	 Catch:{ all -> 0x033c }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x033c }
        r3 = 81;
        r2.<init>(r3);	 Catch:{ all -> 0x033c }
        r3 = "SendChatMessage.processResponse after endTransaction  cursor count is ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x033c }
        r2.append(r0);	 Catch:{ all -> 0x033c }
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x033c }
        if (r0 == 0) goto L_0x02d9;
    L_0x0195:
        r3 = r1.getColumnNames();	 Catch:{ all -> 0x033c }
        r4 = r3.length;	 Catch:{ all -> 0x033c }
        r0 = 0;
        r2 = r0;
    L_0x019c:
        if (r2 >= r4) goto L_0x02d3;
    L_0x019e:
        r5 = r3[r2];	 Catch:{ all -> 0x033c }
        r0 = r1.getColumnIndex(r5);	 Catch:{ all -> 0x033c }
        r6 = r1.getType(r0);	 Catch:{ all -> 0x033c }
        r7 = 4;
        if (r6 == r7) goto L_0x01e0;
    L_0x01ab:
        r0 = r1.getString(r0);	 Catch:{ all -> 0x033c }
        r6 = "text";
        r6 = r5.equals(r6);	 Catch:{ all -> 0x033c }
        if (r6 == 0) goto L_0x01bb;
    L_0x01b7:
        r0 = defpackage.glk.b(r0);	 Catch:{ all -> 0x033c }
    L_0x01bb:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x033c }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x033c }
        r7 = r7.length();	 Catch:{ all -> 0x033c }
        r7 = r7 + 5;
        r8 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x033c }
        r8 = r8.length();	 Catch:{ all -> 0x033c }
        r7 = r7 + r8;
        r6.<init>(r7);	 Catch:{ all -> 0x033c }
        r5 = r6.append(r5);	 Catch:{ all -> 0x033c }
        r6 = " ==> ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x033c }
        r5.append(r0);	 Catch:{ all -> 0x033c }
    L_0x01e0:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x019c;
    L_0x01e4:
        r0 = r14.m();	 Catch:{ all -> 0x0232 }
        r0 = r15.h(r1, r0);	 Catch:{ all -> 0x0232 }
        r8 = r0;
        goto L_0x00ba;
    L_0x01ef:
        r2 = defpackage.gwb.a(r8);	 Catch:{ all -> 0x0232 }
        r4 = r14.d;	 Catch:{ all -> 0x0232 }
        r0 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0232 }
        r4 = defpackage.gwb.a(r0);	 Catch:{ all -> 0x0232 }
        r6 = r14.h;	 Catch:{ all -> 0x0232 }
        r0 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0232 }
        r6 = defpackage.gwb.a(r0);	 Catch:{ all -> 0x0232 }
        r0 = r15;
        r0.a(r1, r2, r4, r6);	 Catch:{ all -> 0x0232 }
        r2 = r14.d;	 Catch:{ all -> 0x0232 }
        r0 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0232 }
        r2 = defpackage.gwb.a(r0);	 Catch:{ all -> 0x0232 }
        r4 = defpackage.gwb.a(r8);	 Catch:{ all -> 0x0232 }
        r0 = r15;
        r0.a(r1, r2, r4);	 Catch:{ all -> 0x0232 }
        r15.a(r14);	 Catch:{ all -> 0x0232 }
        r2 = r14.d;	 Catch:{ all -> 0x0232 }
        r0 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0232 }
        r2 = defpackage.gwb.a(r0);	 Catch:{ all -> 0x0232 }
        r15.g(r1, r2);	 Catch:{ all -> 0x0232 }
        defpackage.blf.d(r15, r1);	 Catch:{ all -> 0x0232 }
        goto L_0x00fc;
    L_0x0232:
        r0 = move-exception;
        r8 = r0;
        r15.c();
        r0 = defpackage.evz.a;
        if (r0 == 0) goto L_0x0331;
    L_0x023b:
        r9 = 0;
        r0 = r15.e();	 Catch:{ all -> 0x0332 }
        r1 = "messages";
        r2 = 0;
        r3 = "message_id=? OR message_id=?";
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0332 }
        r5 = 0;
        r6 = r14.l();	 Catch:{ all -> 0x0332 }
        r4[r5] = r6;	 Catch:{ all -> 0x0332 }
        r5 = 1;
        r6 = r14.m();	 Catch:{ all -> 0x0332 }
        r4[r5] = r6;	 Catch:{ all -> 0x0332 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r1 = r0.a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0332 }
        r0 = r1.getCount();	 Catch:{ all -> 0x033a }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x033a }
        r3 = 81;
        r2.<init>(r3);	 Catch:{ all -> 0x033a }
        r3 = "SendChatMessage.processResponse after endTransaction  cursor count is ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x033a }
        r2.append(r0);	 Catch:{ all -> 0x033a }
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x033a }
        if (r0 == 0) goto L_0x032c;
    L_0x0277:
        r3 = r1.getColumnNames();	 Catch:{ all -> 0x033a }
        r4 = r3.length;	 Catch:{ all -> 0x033a }
        r0 = 0;
        r2 = r0;
    L_0x027e:
        if (r2 >= r4) goto L_0x0326;
    L_0x0280:
        r5 = r3[r2];	 Catch:{ all -> 0x033a }
        r0 = r1.getColumnIndex(r5);	 Catch:{ all -> 0x033a }
        r6 = r1.getType(r0);	 Catch:{ all -> 0x033a }
        r7 = 4;
        if (r6 == r7) goto L_0x02c2;
    L_0x028d:
        r0 = r1.getString(r0);	 Catch:{ all -> 0x033a }
        r6 = "text";
        r6 = r5.equals(r6);	 Catch:{ all -> 0x033a }
        if (r6 == 0) goto L_0x029d;
    L_0x0299:
        r0 = defpackage.glk.b(r0);	 Catch:{ all -> 0x033a }
    L_0x029d:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x033a }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x033a }
        r7 = r7.length();	 Catch:{ all -> 0x033a }
        r7 = r7 + 5;
        r9 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x033a }
        r9 = r9.length();	 Catch:{ all -> 0x033a }
        r7 = r7 + r9;
        r6.<init>(r7);	 Catch:{ all -> 0x033a }
        r5 = r6.append(r5);	 Catch:{ all -> 0x033a }
        r6 = " ==> ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x033a }
        r5.append(r0);	 Catch:{ all -> 0x033a }
    L_0x02c2:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x027e;
    L_0x02c6:
        r0 = move-exception;
        r0 = "Babel";
        r2 = "Invalid ClientSuggestions protobuf parsed from ClientSendChatMessageResponse. This happening likely means a corrupt response proto has been received.";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0232 }
        defpackage.glk.e(r0, r2, r3);	 Catch:{ all -> 0x0232 }
        goto L_0x0117;
    L_0x02d3:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x033c }
        if (r0 != 0) goto L_0x0195;
    L_0x02d9:
        if (r1 == 0) goto L_0x02de;
    L_0x02db:
        r1.close();
    L_0x02de:
        r1 = r14.t();
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x0305;
    L_0x02e8:
        r0 = r15.f();
        r2 = defpackage.bhl.class;
        r0 = defpackage.jyn.a(r0, r2);
        r0 = (defpackage.bhl) r0;
        r2 = r15.g();
        r2 = r2.g();
        r3 = new dww;
        r4 = 1;
        r3.<init>(r2, r1, r4);
        r0.a(r3);
    L_0x0305:
        r0 = r15.f();
        r1 = defpackage.ect.class;
        r0 = defpackage.jyn.a(r0, r1);
        r0 = (defpackage.ect) r0;
        r1 = r15.g();
        r1 = r1.g();
        r2 = 1;
        r0.d(r1, r2);
        return;
    L_0x031e:
        r0 = move-exception;
        r1 = r8;
    L_0x0320:
        if (r1 == 0) goto L_0x0325;
    L_0x0322:
        r1.close();
    L_0x0325:
        throw r0;
    L_0x0326:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x033a }
        if (r0 != 0) goto L_0x0277;
    L_0x032c:
        if (r1 == 0) goto L_0x0331;
    L_0x032e:
        r1.close();
    L_0x0331:
        throw r8;
    L_0x0332:
        r0 = move-exception;
        r1 = r9;
    L_0x0334:
        if (r1 == 0) goto L_0x0339;
    L_0x0336:
        r1.close();
    L_0x0339:
        throw r0;
    L_0x033a:
        r0 = move-exception;
        goto L_0x0334;
    L_0x033c:
        r0 = move-exception;
        goto L_0x0320;
        */
        throw new UnsupportedOperationException("Method not decompiled: ezj.a(blo, fhc):void");
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
