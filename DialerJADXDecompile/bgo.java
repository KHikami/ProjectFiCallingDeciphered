import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class bgo implements bgr {
    public final List a;
    public bfs b;
    private final int c;
    private final Account d;
    private final List e;

    public bgo() {
        this(-1073741824, null);
    }

    @Deprecated
    public bgo(int i, Account account) {
        this.a = new ArrayList();
        this.e = new ArrayList();
        this.c = i;
        this.d = account;
    }

    public final void a(bgq bgq) {
        this.e.add(bgq);
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b() {
        for (bgq b : this.e) {
            b.b();
        }
    }

    public final void c() {
        this.b = new bfs(this.c, this.d);
        this.a.add(this.b);
    }

    public final void d() {
        bfs bfs = this.b;
        bfs.b.k = bfs.a();
        for (bgq a : this.e) {
            a.a(this.b);
        }
        int size = this.a.size();
        if (size > 1) {
            bfs = (bfs) this.a.get(size - 2);
            bfs bfs2 = this.b;
            if (bfs.p == null) {
                bfs.p = new ArrayList();
            }
            bfs.p.add(bfs2);
            this.b = bfs;
        } else {
            this.b = null;
        }
        this.a.remove(size - 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(bgy r11) {
        /*
        r10 = this;
        r6 = r10.b;
        r1 = r11.a;
        r5 = r11.c;
        r4 = r11.e;
        r7 = r11.f;
        if (r4 == 0) goto L_0x0012;
    L_0x000c:
        r0 = r4.size();
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        if (r7 == 0) goto L_0x005b;
    L_0x0014:
        if (r4 == 0) goto L_0x006a;
    L_0x0016:
        r2 = r4.size();
        r0 = 1;
        if (r2 <= r0) goto L_0x005c;
    L_0x001d:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r8 = r4.iterator();
    L_0x0026:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x003f;
    L_0x002c:
        r0 = r8.next();
        r0 = (java.lang.String) r0;
        r3.append(r0);
        r0 = r2 + -1;
        if (r0 <= 0) goto L_0x0026;
    L_0x0039:
        r0 = ";";
        r3.append(r0);
        goto L_0x0026;
    L_0x003f:
        r0 = r3.toString();
    L_0x0043:
        r3 = r0.trim();
    L_0x0047:
        r0 = "VERSION";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x005b;
    L_0x004f:
        r0 = "FN";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x006c;
    L_0x0057:
        r0 = r6.b;
        r0.f = r3;
    L_0x005b:
        return;
    L_0x005c:
        r0 = 1;
        if (r2 != r0) goto L_0x0067;
    L_0x005f:
        r0 = 0;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        goto L_0x0043;
    L_0x0067:
        r0 = "";
        goto L_0x0043;
    L_0x006a:
        r3 = 0;
        goto L_0x0047;
    L_0x006c:
        r0 = "NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0083;
    L_0x0074:
        r0 = r6.b;
        r0 = r0.f;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x007e:
        r0 = r6.b;
        r0.f = r3;
        goto L_0x005b;
    L_0x0083:
        r0 = "N";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0172;
    L_0x008b:
        r0 = r6.n;
        r0 = bfr.b(r0);
        if (r0 == 0) goto L_0x00cc;
    L_0x0093:
        r0 = r6.b;
        r0 = r0.g;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00b1;
    L_0x009d:
        r0 = r6.b;
        r0 = r0.i;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00b1;
    L_0x00a7:
        r0 = r6.b;
        r0 = r0.h;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00cc;
    L_0x00b1:
        if (r4 == 0) goto L_0x005b;
    L_0x00b3:
        r0 = r4.size();
        if (r0 <= 0) goto L_0x005b;
    L_0x00b9:
        r1 = 5;
        if (r0 <= r1) goto L_0x00bd;
    L_0x00bc:
        r0 = 5;
    L_0x00bd:
        switch(r0) {
            case 2: goto L_0x0165;
            case 3: goto L_0x015a;
            case 4: goto L_0x014f;
            case 5: goto L_0x0144;
            default: goto L_0x00c0;
        };
    L_0x00c0:
        r1 = r6.b;
        r0 = 0;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1.a = r0;
        goto L_0x005b;
    L_0x00cc:
        r0 = "SORT-AS";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x00b1;
    L_0x00d6:
        r1 = r0.size();
        if (r1 == 0) goto L_0x00b1;
    L_0x00dc:
        r1 = r0.size();
        r2 = 1;
        if (r1 <= r2) goto L_0x0100;
    L_0x00e3:
        r2 = "vCard";
        r3 = "Incorrect multiple SORT_AS parameters detected: ";
        r1 = r0.toArray();
        r1 = java.util.Arrays.toString(r1);
        r1 = java.lang.String.valueOf(r1);
        r5 = r1.length();
        if (r5 == 0) goto L_0x0127;
    L_0x00f9:
        r1 = r3.concat(r1);
    L_0x00fd:
        android.util.Log.w(r2, r1);
    L_0x0100:
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r1 = r6.n;
        r1 = bha.a(r0, r1);
        r0 = r1.size();
        r2 = 3;
        if (r0 <= r2) goto L_0x0118;
    L_0x0117:
        r0 = 3;
    L_0x0118:
        switch(r0) {
            case 2: goto L_0x0138;
            case 3: goto L_0x012d;
            default: goto L_0x011b;
        };
    L_0x011b:
        r2 = r6.b;
        r0 = 0;
        r0 = r1.get(r0);
        r0 = (java.lang.String) r0;
        r2.g = r0;
        goto L_0x00b1;
    L_0x0127:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x00fd;
    L_0x012d:
        r2 = r6.b;
        r0 = 2;
        r0 = r1.get(r0);
        r0 = (java.lang.String) r0;
        r2.i = r0;
    L_0x0138:
        r2 = r6.b;
        r0 = 1;
        r0 = r1.get(r0);
        r0 = (java.lang.String) r0;
        r2.h = r0;
        goto L_0x011b;
    L_0x0144:
        r1 = r6.b;
        r0 = 4;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1.e = r0;
    L_0x014f:
        r1 = r6.b;
        r0 = 3;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1.d = r0;
    L_0x015a:
        r1 = r6.b;
        r0 = 2;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1.c = r0;
    L_0x0165:
        r1 = r6.b;
        r0 = 1;
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1.b = r0;
        goto L_0x00c0;
    L_0x0172:
        r0 = "SORT-STRING";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0180;
    L_0x017a:
        r0 = r6.b;
        r0.j = r3;
        goto L_0x005b;
    L_0x0180:
        r0 = "NICKNAME";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0190;
    L_0x0188:
        r0 = "X-NICKNAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01a7;
    L_0x0190:
        r0 = r6.h;
        if (r0 != 0) goto L_0x019b;
    L_0x0194:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6.h = r0;
    L_0x019b:
        r0 = r6.h;
        r1 = new bge;
        r1.<init>(r3);
        r0.add(r1);
        goto L_0x005b;
    L_0x01a7:
        r0 = "SOUND";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01cc;
    L_0x01af:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x005b;
    L_0x01b9:
        r1 = "X-IRMC-N";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x005b;
    L_0x01c1:
        r0 = r6.n;
        r0 = bha.a(r3, r0);
        r6.a(r0);
        goto L_0x005b;
    L_0x01cc:
        r0 = "ADR";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0289;
    L_0x01d4:
        r1 = 1;
        r2 = r4.iterator();
    L_0x01d9:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x061f;
    L_0x01df:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x01d9;
    L_0x01eb:
        r0 = 0;
    L_0x01ec:
        if (r0 != 0) goto L_0x005b;
    L_0x01ee:
        r3 = -1;
        r2 = 0;
        r1 = 0;
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x026c;
    L_0x01fb:
        r5 = r0.iterator();
    L_0x01ff:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x026c;
    L_0x0205:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r7 = r0.toUpperCase();
        r8 = "PREF";
        r8 = r7.equals(r8);
        if (r8 == 0) goto L_0x021a;
    L_0x0217:
        r0 = 1;
        r1 = r0;
        goto L_0x01ff;
    L_0x021a:
        r8 = "HOME";
        r8 = r7.equals(r8);
        if (r8 == 0) goto L_0x0227;
    L_0x0222:
        r2 = 1;
        r0 = 0;
        r3 = r2;
        r2 = r0;
        goto L_0x01ff;
    L_0x0227:
        r8 = "WORK";
        r8 = r7.equals(r8);
        if (r8 != 0) goto L_0x0237;
    L_0x022f:
        r8 = "COMPANY";
        r8 = r7.equalsIgnoreCase(r8);
        if (r8 == 0) goto L_0x023c;
    L_0x0237:
        r2 = 2;
        r0 = 0;
        r3 = r2;
        r2 = r0;
        goto L_0x01ff;
    L_0x023c:
        r8 = "PARCEL";
        r8 = r7.equals(r8);
        if (r8 != 0) goto L_0x0267;
    L_0x0244:
        r8 = "DOM";
        r8 = r7.equals(r8);
        if (r8 != 0) goto L_0x0267;
    L_0x024c:
        r8 = "INTL";
        r8 = r7.equals(r8);
        if (r8 != 0) goto L_0x0267;
    L_0x0254:
        if (r3 >= 0) goto L_0x0267;
    L_0x0256:
        r2 = 0;
        r3 = "X-";
        r3 = r7.startsWith(r3);
        if (r3 == 0) goto L_0x0269;
    L_0x025f:
        r3 = 2;
        r0 = r0.substring(r3);
        r3 = r2;
        r2 = r0;
        goto L_0x01ff;
    L_0x0267:
        r0 = r2;
        r2 = r3;
    L_0x0269:
        r3 = r2;
        r2 = r0;
        goto L_0x01ff;
    L_0x026c:
        r0 = r3;
        if (r0 >= 0) goto L_0x0270;
    L_0x026f:
        r0 = 1;
    L_0x0270:
        r3 = r6.d;
        if (r3 != 0) goto L_0x027c;
    L_0x0274:
        r3 = new java.util.ArrayList;
        r5 = 0;
        r3.<init>(r5);
        r6.d = r3;
    L_0x027c:
        r3 = r6.d;
        r5 = r6.n;
        r0 = bgj.a(r4, r0, r2, r1, r5);
        r3.add(r0);
        goto L_0x005b;
    L_0x0289:
        r0 = "EMAIL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x030d;
    L_0x0291:
        r4 = -1;
        r2 = 0;
        r1 = 0;
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x061a;
    L_0x029e:
        r5 = r0.iterator();
        r9 = r1;
        r1 = r2;
        r2 = r4;
        r4 = r9;
    L_0x02a6:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x02f2;
    L_0x02ac:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r7 = r0.toUpperCase();
        r8 = "PREF";
        r8 = r7.equals(r8);
        if (r8 == 0) goto L_0x02c1;
    L_0x02be:
        r0 = 1;
        r4 = r0;
        goto L_0x02a6;
    L_0x02c1:
        r8 = "HOME";
        r8 = r7.equals(r8);
        if (r8 == 0) goto L_0x02cb;
    L_0x02c9:
        r2 = 1;
        goto L_0x02a6;
    L_0x02cb:
        r8 = "WORK";
        r8 = r7.equals(r8);
        if (r8 == 0) goto L_0x02d5;
    L_0x02d3:
        r2 = 2;
        goto L_0x02a6;
    L_0x02d5:
        r8 = "CELL";
        r8 = r7.equals(r8);
        if (r8 == 0) goto L_0x02df;
    L_0x02dd:
        r2 = 4;
        goto L_0x02a6;
    L_0x02df:
        if (r2 >= 0) goto L_0x0616;
    L_0x02e1:
        r1 = "X-";
        r1 = r7.startsWith(r1);
        if (r1 == 0) goto L_0x02ee;
    L_0x02e9:
        r1 = 2;
        r0 = r0.substring(r1);
    L_0x02ee:
        r1 = 0;
    L_0x02ef:
        r2 = r1;
        r1 = r0;
        goto L_0x02a6;
    L_0x02f2:
        r0 = r2;
    L_0x02f3:
        if (r0 >= 0) goto L_0x02f6;
    L_0x02f5:
        r0 = 3;
    L_0x02f6:
        r2 = r6.c;
        if (r2 != 0) goto L_0x0301;
    L_0x02fa:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r6.c = r2;
    L_0x0301:
        r2 = r6.c;
        r5 = new bfw;
        r5.<init>(r3, r0, r1, r4);
        r2.add(r5);
        goto L_0x005b;
    L_0x030d:
        r0 = "ORG";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0341;
    L_0x0315:
        r1 = 0;
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x033b;
    L_0x0320:
        r2 = r0.iterator();
    L_0x0324:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x033b;
    L_0x032a:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r3 = "PREF";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0613;
    L_0x0338:
        r0 = 1;
    L_0x0339:
        r1 = r0;
        goto L_0x0324;
    L_0x033b:
        r0 = 1;
        r6.a(r0, r4, r5, r1);
        goto L_0x005b;
    L_0x0341:
        r0 = "TITLE";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x034e;
    L_0x0349:
        r6.a(r3);
        goto L_0x005b;
    L_0x034e:
        r0 = "ROLE";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x005b;
    L_0x0356:
        r0 = "PHOTO";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0366;
    L_0x035e:
        r0 = "LOGO";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x03c1;
    L_0x0366:
        r0 = "VALUE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x0378;
    L_0x0370:
        r1 = "URL";
        r0 = r0.contains(r1);
        if (r0 != 0) goto L_0x005b;
    L_0x0378:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        r2 = 0;
        r1 = 0;
        if (r0 == 0) goto L_0x03a6;
    L_0x0384:
        r3 = r0.iterator();
        r9 = r1;
        r1 = r2;
        r2 = r9;
    L_0x038b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x03a9;
    L_0x0391:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = "PREF";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x03a2;
    L_0x039f:
        r0 = 1;
        r2 = r0;
        goto L_0x038b;
    L_0x03a2:
        if (r1 != 0) goto L_0x0610;
    L_0x03a4:
        r1 = r0;
        goto L_0x038b;
    L_0x03a6:
        r9 = r1;
        r1 = r2;
        r2 = r9;
    L_0x03a9:
        r0 = r6.f;
        if (r0 != 0) goto L_0x03b5;
    L_0x03ad:
        r0 = new java.util.ArrayList;
        r3 = 1;
        r0.<init>(r3);
        r6.f = r0;
    L_0x03b5:
        r0 = new bgi;
        r0.<init>(r1, r7, r2);
        r1 = r6.f;
        r1.add(r0);
        goto L_0x005b;
    L_0x03c1:
        r0 = "TEL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0434;
    L_0x03c9:
        r1 = 0;
        r0 = 0;
        r2 = r6.n;
        r2 = bfr.c(r2);
        if (r2 == 0) goto L_0x03fd;
    L_0x03d3:
        r2 = "sip:";
        r2 = r3.startsWith(r2);
        if (r2 == 0) goto L_0x03ec;
    L_0x03db:
        r0 = 1;
        r4 = r1;
    L_0x03dd:
        if (r0 == 0) goto L_0x03ff;
    L_0x03df:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        r6.a(r3, r0);
        goto L_0x005b;
    L_0x03ec:
        r1 = "tel:";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x03fb;
    L_0x03f4:
        r1 = 4;
        r1 = r3.substring(r1);
        r4 = r1;
        goto L_0x03dd;
    L_0x03fb:
        r4 = r3;
        goto L_0x03dd;
    L_0x03fd:
        r4 = r3;
        goto L_0x03dd;
    L_0x03ff:
        r0 = r3.length();
        if (r0 == 0) goto L_0x005b;
    L_0x0405:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        r1 = bha.a(r0, r4);
        r2 = r1 instanceof java.lang.Integer;
        if (r2 == 0) goto L_0x042c;
    L_0x0415:
        r1 = (java.lang.Integer) r1;
        r2 = r1.intValue();
        r1 = 0;
    L_0x041c:
        if (r0 == 0) goto L_0x0432;
    L_0x041e:
        r3 = "PREF";
        r0 = r0.contains(r3);
        if (r0 == 0) goto L_0x0432;
    L_0x0426:
        r0 = 1;
    L_0x0427:
        r6.a(r2, r4, r1, r0);
        goto L_0x005b;
    L_0x042c:
        r2 = 0;
        r1 = r1.toString();
        goto L_0x041c;
    L_0x0432:
        r0 = 0;
        goto L_0x0427;
    L_0x0434:
        r0 = "X-SKYPE-PSTNNUMBER";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0458;
    L_0x043c:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x0456;
    L_0x0446:
        r1 = "PREF";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0456;
    L_0x044e:
        r0 = 1;
    L_0x044f:
        r1 = 7;
        r2 = 0;
        r6.a(r1, r3, r2, r0);
        goto L_0x005b;
    L_0x0456:
        r0 = 0;
        goto L_0x044f;
    L_0x0458:
        r0 = bfs.a;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x04c9;
    L_0x0460:
        r0 = bfs.a;
        r0 = r0.get(r1);
        r0 = (java.lang.Integer) r0;
        r1 = r0.intValue();
        r4 = 0;
        r2 = -1;
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x04ac;
    L_0x0478:
        r5 = r0.iterator();
    L_0x047c:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x04ac;
    L_0x0482:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r7 = "PREF";
        r7 = r0.equals(r7);
        if (r7 == 0) goto L_0x0493;
    L_0x0490:
        r0 = 1;
        r4 = r0;
        goto L_0x047c;
    L_0x0493:
        if (r2 >= 0) goto L_0x060d;
    L_0x0495:
        r7 = "HOME";
        r7 = r0.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x04a0;
    L_0x049d:
        r0 = 1;
        r2 = r0;
        goto L_0x047c;
    L_0x04a0:
        r7 = "WORK";
        r0 = r0.equalsIgnoreCase(r7);
        if (r0 == 0) goto L_0x060d;
    L_0x04a8:
        r2 = 2;
        r0 = r2;
    L_0x04aa:
        r2 = r0;
        goto L_0x047c;
    L_0x04ac:
        r5 = r4;
        r4 = r2;
        if (r4 >= 0) goto L_0x04b1;
    L_0x04b0:
        r4 = 1;
    L_0x04b1:
        r0 = r6.e;
        if (r0 != 0) goto L_0x04bc;
    L_0x04b5:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6.e = r0;
    L_0x04bc:
        r6 = r6.e;
        r0 = new bga;
        r2 = 0;
        r0.<init>(r1, r2, r3, r4, r5);
        r6.add(r0);
        goto L_0x005b;
    L_0x04c9:
        r0 = "NOTE";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x04e9;
    L_0x04d1:
        r0 = r6.i;
        if (r0 != 0) goto L_0x04dd;
    L_0x04d5:
        r0 = new java.util.ArrayList;
        r1 = 1;
        r0.<init>(r1);
        r6.i = r0;
    L_0x04dd:
        r0 = r6.i;
        r1 = new bgf;
        r1.<init>(r3);
        r0.add(r1);
        goto L_0x005b;
    L_0x04e9:
        r0 = "URL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0509;
    L_0x04f1:
        r0 = r6.g;
        if (r0 != 0) goto L_0x04fd;
    L_0x04f5:
        r0 = new java.util.ArrayList;
        r1 = 1;
        r0.<init>(r1);
        r6.g = r0;
    L_0x04fd:
        r0 = r6.g;
        r1 = new bgm;
        r1.<init>(r3);
        r0.add(r1);
        goto L_0x005b;
    L_0x0509:
        r0 = "BDAY";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x051a;
    L_0x0511:
        r0 = new bfv;
        r0.<init>(r3);
        r6.k = r0;
        goto L_0x005b;
    L_0x051a:
        r0 = "ANNIVERSARY";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x052b;
    L_0x0522:
        r0 = new bfu;
        r0.<init>(r3);
        r6.l = r0;
        goto L_0x005b;
    L_0x052b:
        r0 = "X-PHONETIC-FIRST-NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0539;
    L_0x0533:
        r0 = r6.b;
        r0.h = r3;
        goto L_0x005b;
    L_0x0539:
        r0 = "X-PHONETIC-MIDDLE-NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0547;
    L_0x0541:
        r0 = r6.b;
        r0.i = r3;
        goto L_0x005b;
    L_0x0547:
        r0 = "X-PHONETIC-LAST-NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0555;
    L_0x054f:
        r0 = r6.b;
        r0.g = r3;
        goto L_0x005b;
    L_0x0555:
        r0 = "IMPP";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0572;
    L_0x055d:
        r0 = "sip:";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x005b;
    L_0x0565:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        r6.a(r3, r0);
        goto L_0x005b;
    L_0x0572:
        r0 = "X-SIP";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x058d;
    L_0x057a:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x005b;
    L_0x0580:
        r0 = "TYPE";
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        r6.a(r3, r0);
        goto L_0x005b;
    L_0x058d:
        r0 = "X-ANDROID-CUSTOM";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x05ea;
    L_0x0595:
        r0 = r6.n;
        r2 = bha.a(r3, r0);
        r0 = r6.j;
        if (r0 != 0) goto L_0x05a6;
    L_0x059f:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6.j = r0;
    L_0x05a6:
        r3 = r6.j;
        if (r2 != 0) goto L_0x05b6;
    L_0x05aa:
        r1 = 0;
        r0 = 0;
    L_0x05ac:
        r2 = new bft;
        r2.<init>(r1, r0);
        r3.add(r2);
        goto L_0x005b;
    L_0x05b6:
        r0 = r2.size();
        r1 = 2;
        if (r0 >= r1) goto L_0x05c9;
    L_0x05bd:
        r0 = 0;
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r1 = 0;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x05ac;
    L_0x05c9:
        r0 = r2.size();
        r1 = 16;
        if (r0 >= r1) goto L_0x05e6;
    L_0x05d1:
        r0 = r2.size();
        r1 = r0;
    L_0x05d6:
        r0 = 0;
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r4 = 1;
        r1 = r2.subList(r4, r1);
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x05ac;
    L_0x05e6:
        r0 = 16;
        r1 = r0;
        goto L_0x05d6;
    L_0x05ea:
        r0 = r1.toUpperCase();
        r2 = "X-";
        r0 = r0.startsWith(r2);
        if (r0 == 0) goto L_0x005b;
    L_0x05f6:
        r0 = r6.m;
        if (r0 != 0) goto L_0x0601;
    L_0x05fa:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6.m = r0;
    L_0x0601:
        r0 = r6.m;
        r2 = new android.util.Pair;
        r2.<init>(r1, r3);
        r0.add(r2);
        goto L_0x005b;
    L_0x060d:
        r0 = r2;
        goto L_0x04aa;
    L_0x0610:
        r0 = r1;
        goto L_0x03a4;
    L_0x0613:
        r0 = r1;
        goto L_0x0339;
    L_0x0616:
        r0 = r1;
        r1 = r2;
        goto L_0x02ef;
    L_0x061a:
        r0 = r4;
        r4 = r1;
        r1 = r2;
        goto L_0x02f3;
    L_0x061f:
        r0 = r1;
        goto L_0x01ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgo.a(bgy):void");
    }
}
