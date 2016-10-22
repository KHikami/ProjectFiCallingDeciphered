package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ajr */
public final class ajr {
    private static final Map<String, Integer> i;
    private static final List<String> t;
    public List<ake> a;
    public List<ajv> b;
    public List<akg> c;
    public List<akd> d;
    public List<ajz> e;
    public List<akj> f;
    public List<akc> g;
    public aju h;
    private final aka j;
    private List<akf> k;
    private List<akh> l;
    private List<akb> m;
    private List<ajs> n;
    private ajt o;
    private List<Pair<String, String>> p;
    private final int q;
    private final Account r;
    private List<ajr> s;

    static {
        Map hashMap = new HashMap();
        i = hashMap;
        hashMap.put("X-AIM", Integer.valueOf(0));
        i.put("X-MSN", Integer.valueOf(1));
        i.put("X-YAHOO", Integer.valueOf(2));
        i.put("X-ICQ", Integer.valueOf(6));
        i.put("X-JABBER", Integer.valueOf(7));
        i.put("X-SKYPE-USERNAME", Integer.valueOf(3));
        i.put("X-GOOGLE-TALK", Integer.valueOf(5));
        i.put("X-GOOGLE TALK", Integer.valueOf(5));
        t = Collections.unmodifiableList(new ArrayList(0));
    }

    private static void a(List<? extends ajw> list, ajx ajx) {
        if (list != null && list.size() > 0) {
            ajx.a(((ajw) list.get(0)).a());
            for (ajw a : list) {
                ajx.a(a);
            }
            ajx.c();
        }
    }

    public String toString() {
        ajx aki = new aki(this);
        aki.a();
        aka aka = this.j;
        aki.a(ajy.NAME);
        aki.a(this.j);
        aki.c();
        ajr.a(this.a, aki);
        ajr.a(this.b, aki);
        ajr.a(this.c, aki);
        ajr.a(this.d, aki);
        ajr.a(this.e, aki);
        ajr.a(this.k, aki);
        ajr.a(this.f, aki);
        ajr.a(this.l, aki);
        ajr.a(this.m, aki);
        ajr.a(this.g, aki);
        ajr.a(this.n, aki);
        if (this.h != null) {
            aki.a(this.h.a());
            aki.a(this.h);
            aki.c();
        }
        if (this.o != null) {
            aki.a(this.o.a());
            aki.a(this.o);
            aki.c();
        }
        aki.b();
        return aki.toString();
    }

    public ajr() {
        this(-1073741824);
    }

    private ajr(int i) {
        this(-1073741824, null);
    }

    public ajr(int i, Account account) {
        this.j = new aka();
        this.q = i;
        this.r = account;
    }

    private void a(int i, String str, String str2, boolean z) {
        String str3;
        Object obj = null;
        if (this.a == null) {
            this.a = new ArrayList();
        }
        StringBuilder stringBuilder = new StringBuilder();
        String trim = str.trim();
        if (i == 6 || ajq.f(this.q)) {
            str3 = trim;
        } else {
            int length = trim.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = trim.charAt(i2);
                if (charAt == 'p' || charAt == 'P') {
                    stringBuilder.append(',');
                    obj = 1;
                } else if (charAt == 'w' || charAt == 'W') {
                    stringBuilder.append(';');
                    int i3 = 1;
                } else if (('0' <= charAt && charAt <= '9') || (i2 == 0 && charAt == '+')) {
                    stringBuilder.append(charAt);
                }
                i2++;
            }
            if (obj == null) {
                str3 = gwb.b(stringBuilder.toString(), akw.a(this.q));
            } else {
                str3 = stringBuilder.toString();
            }
        }
        this.a.add(new ake(str3, i, str2, z));
    }

    private void a(String str, String str2, String str3, String str4, int i, boolean z) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(new akd(str, str2, str3, str4, i, z));
    }

    private void a(String str) {
        if (this.d == null) {
            a(null, null, str, null, 1, false);
            return;
        }
        for (akd akd : this.d) {
            if (akd.c == null) {
                akd.c = str;
                return;
            }
        }
        a(null, null, str, null, 1, false);
    }

    private void a(List<String> list) {
        if (TextUtils.isEmpty(this.j.g) && TextUtils.isEmpty(this.j.i) && TextUtils.isEmpty(this.j.h) && list != null) {
            int size = list.size();
            if (size > 0) {
                int i;
                if (size > 3) {
                    i = 3;
                } else {
                    i = size;
                }
                if (((String) list.get(0)).length() > 0) {
                    for (int i2 = 1; i2 < i; i2++) {
                        if (((String) list.get(i2)).length() > 0) {
                            size = 0;
                            break;
                        }
                    }
                    size = 1;
                    if (size != 0) {
                        String[] split = ((String) list.get(0)).split(" ");
                        i = split.length;
                        if (i == 3) {
                            this.j.g = split[0];
                            this.j.i = split[1];
                            this.j.h = split[2];
                            return;
                        } else if (i == 2) {
                            this.j.g = split[0];
                            this.j.h = split[1];
                            return;
                        } else {
                            this.j.h = (String) list.get(0);
                            return;
                        }
                    }
                }
                switch (i) {
                    case wi.l /*2*/:
                        break;
                    case wi.z /*3*/:
                        this.j.i = (String) list.get(2);
                        break;
                }
                this.j.h = (String) list.get(1);
                this.j.g = (String) list.get(0);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.aku r15) {
        /*
        r14 = this;
        r8 = 3;
        r7 = 2;
        r2 = 0;
        r4 = 0;
        r6 = 1;
        r1 = r15.a();
        r9 = r15.b();
        r10 = r15.d();
        r5 = r15.e();
        if (r10 == 0) goto L_0x001d;
    L_0x0017:
        r0 = r10.size();
        if (r0 != 0) goto L_0x0020;
    L_0x001d:
        if (r5 != 0) goto L_0x0020;
    L_0x001f:
        return;
    L_0x0020:
        if (r10 == 0) goto L_0x0073;
    L_0x0022:
        r3 = r10.size();
        if (r3 <= r6) goto L_0x0067;
    L_0x0028:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = r10.iterator();
    L_0x0031:
        r0 = r12.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0037:
        r0 = r12.next();
        r0 = (java.lang.String) r0;
        r11.append(r0);
        r0 = r3 + -1;
        if (r0 <= 0) goto L_0x0031;
    L_0x0044:
        r0 = ";";
        r11.append(r0);
        goto L_0x0031;
    L_0x004a:
        r0 = r11.toString();
    L_0x004e:
        r3 = r0.trim();
    L_0x0052:
        r0 = "VERSION";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x001f;
    L_0x005a:
        r0 = "FN";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0075;
    L_0x0062:
        r0 = r14.j;
        r0.f = r3;
        goto L_0x001f;
    L_0x0067:
        if (r3 != r6) goto L_0x0070;
    L_0x0069:
        r0 = r10.get(r4);
        r0 = (java.lang.String) r0;
        goto L_0x004e;
    L_0x0070:
        r0 = "";
        goto L_0x004e;
    L_0x0073:
        r3 = r2;
        goto L_0x0052;
    L_0x0075:
        r0 = "NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x008c;
    L_0x007d:
        r0 = r14.j;
        r0 = r0.f;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x0087:
        r0 = r14.j;
        r0.f = r3;
        goto L_0x001f;
    L_0x008c:
        r0 = "N";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x016d;
    L_0x0094:
        r0 = r14.q;
        r0 = defpackage.ajq.b(r0);
        if (r0 == 0) goto L_0x00d5;
    L_0x009c:
        r0 = r14.j;
        r0 = r0.g;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00ba;
    L_0x00a6:
        r0 = r14.j;
        r0 = r0.i;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00ba;
    L_0x00b0:
        r0 = r14.j;
        r0 = r0.h;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00d5;
    L_0x00ba:
        if (r10 == 0) goto L_0x001f;
    L_0x00bc:
        r0 = r10.size();
        if (r0 <= 0) goto L_0x001f;
    L_0x00c2:
        r1 = 5;
        if (r0 <= r1) goto L_0x00c6;
    L_0x00c5:
        r0 = 5;
    L_0x00c6:
        switch(r0) {
            case 2: goto L_0x0161;
            case 3: goto L_0x0157;
            case 4: goto L_0x014d;
            case 5: goto L_0x0142;
            default: goto L_0x00c9;
        };
    L_0x00c9:
        r1 = r14.j;
        r0 = r10.get(r4);
        r0 = (java.lang.String) r0;
        r1.a = r0;
        goto L_0x001f;
    L_0x00d5:
        r0 = "SORT-AS";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x00ba;
    L_0x00df:
        r1 = r0.size();
        if (r1 == 0) goto L_0x00ba;
    L_0x00e5:
        r1 = r0.size();
        if (r1 <= r6) goto L_0x0102;
    L_0x00eb:
        r1 = "Incorrect multiple SORT_AS parameters detected: ";
        r2 = r0.toArray();
        r2 = java.util.Arrays.toString(r2);
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 == 0) goto L_0x0127;
    L_0x00ff:
        r1.concat(r2);
    L_0x0102:
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r1 = r14.q;
        r1 = defpackage.akw.a(r0, r1);
        r0 = r1.size();
        if (r0 <= r8) goto L_0x0119;
    L_0x0118:
        r0 = r8;
    L_0x0119:
        switch(r0) {
            case 2: goto L_0x0137;
            case 3: goto L_0x012d;
            default: goto L_0x011c;
        };
    L_0x011c:
        r2 = r14.j;
        r0 = r1.get(r4);
        r0 = (java.lang.String) r0;
        r2.g = r0;
        goto L_0x00ba;
    L_0x0127:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x0102;
    L_0x012d:
        r2 = r14.j;
        r0 = r1.get(r7);
        r0 = (java.lang.String) r0;
        r2.i = r0;
    L_0x0137:
        r2 = r14.j;
        r0 = r1.get(r6);
        r0 = (java.lang.String) r0;
        r2.h = r0;
        goto L_0x011c;
    L_0x0142:
        r1 = r14.j;
        r0 = 4;
        r0 = r10.get(r0);
        r0 = (java.lang.String) r0;
        r1.e = r0;
    L_0x014d:
        r1 = r14.j;
        r0 = r10.get(r8);
        r0 = (java.lang.String) r0;
        r1.d = r0;
    L_0x0157:
        r1 = r14.j;
        r0 = r10.get(r7);
        r0 = (java.lang.String) r0;
        r1.c = r0;
    L_0x0161:
        r1 = r14.j;
        r0 = r10.get(r6);
        r0 = (java.lang.String) r0;
        r1.b = r0;
        goto L_0x00c9;
    L_0x016d:
        r0 = "SORT-STRING";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x017b;
    L_0x0175:
        r0 = r14.j;
        r0.j = r3;
        goto L_0x001f;
    L_0x017b:
        r0 = "NICKNAME";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x018b;
    L_0x0183:
        r0 = "X-NICKNAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01a2;
    L_0x018b:
        r0 = r14.m;
        if (r0 != 0) goto L_0x0196;
    L_0x018f:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r14.m = r0;
    L_0x0196:
        r0 = r14.m;
        r1 = new akb;
        r1.<init>(r3);
        r0.add(r1);
        goto L_0x001f;
    L_0x01a2:
        r0 = "SOUND";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01c7;
    L_0x01aa:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x001f;
    L_0x01b4:
        r1 = "X-IRMC-N";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x001f;
    L_0x01bc:
        r0 = r14.q;
        r0 = defpackage.akw.a(r3, r0);
        r14.a(r0);
        goto L_0x001f;
    L_0x01c7:
        r0 = "ADR";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x027a;
    L_0x01cf:
        r1 = r10.iterator();
    L_0x01d3:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x05f8;
    L_0x01d9:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x01d3;
    L_0x01e5:
        r0 = r4;
    L_0x01e6:
        if (r0 != 0) goto L_0x001f;
    L_0x01e8:
        r1 = -1;
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x05f3;
    L_0x01f3:
        r8 = r0.iterator();
        r3 = r2;
        r5 = r1;
        r1 = r4;
    L_0x01fa:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x025f;
    L_0x0200:
        r0 = r8.next();
        r0 = (java.lang.String) r0;
        r9 = r0.toUpperCase();
        r11 = "PREF";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x0214;
    L_0x0212:
        r1 = r6;
        goto L_0x01fa;
    L_0x0214:
        r11 = "HOME";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x021f;
    L_0x021c:
        r3 = r2;
        r5 = r6;
        goto L_0x01fa;
    L_0x021f:
        r11 = "WORK";
        r11 = r9.equals(r11);
        if (r11 != 0) goto L_0x022f;
    L_0x0227:
        r11 = "COMPANY";
        r11 = r9.equalsIgnoreCase(r11);
        if (r11 == 0) goto L_0x0232;
    L_0x022f:
        r3 = r2;
        r5 = r7;
        goto L_0x01fa;
    L_0x0232:
        r11 = "PARCEL";
        r11 = r9.equals(r11);
        if (r11 != 0) goto L_0x05ef;
    L_0x023a:
        r11 = "DOM";
        r11 = r9.equals(r11);
        if (r11 != 0) goto L_0x05ef;
    L_0x0242:
        r11 = "INTL";
        r11 = r9.equals(r11);
        if (r11 != 0) goto L_0x05ef;
    L_0x024a:
        if (r5 >= 0) goto L_0x05ef;
    L_0x024c:
        r3 = "X-";
        r3 = r9.startsWith(r3);
        if (r3 == 0) goto L_0x025b;
    L_0x0254:
        r0 = r0.substring(r7);
        r3 = r0;
        r5 = r4;
        goto L_0x01fa;
    L_0x025b:
        r3 = r4;
    L_0x025c:
        r5 = r3;
        r3 = r0;
        goto L_0x01fa;
    L_0x025f:
        r0 = r5;
    L_0x0260:
        if (r0 >= 0) goto L_0x05ec;
    L_0x0262:
        r0 = r14.c;
        if (r0 != 0) goto L_0x026d;
    L_0x0266:
        r0 = new java.util.ArrayList;
        r0.<init>(r4);
        r14.c = r0;
    L_0x026d:
        r0 = r14.c;
        r2 = r14.q;
        r1 = defpackage.akg.a(r10, r6, r3, r1, r2);
        r0.add(r1);
        goto L_0x001f;
    L_0x027a:
        r0 = "EMAIL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02fa;
    L_0x0282:
        r1 = -1;
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x05e7;
    L_0x028d:
        r9 = r0.iterator();
        r5 = r4;
        r13 = r2;
        r2 = r1;
        r1 = r13;
    L_0x0295:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x02df;
    L_0x029b:
        r0 = r9.next();
        r0 = (java.lang.String) r0;
        r10 = r0.toUpperCase();
        r11 = "PREF";
        r11 = r10.equals(r11);
        if (r11 == 0) goto L_0x02af;
    L_0x02ad:
        r5 = r6;
        goto L_0x0295;
    L_0x02af:
        r11 = "HOME";
        r11 = r10.equals(r11);
        if (r11 == 0) goto L_0x02b9;
    L_0x02b7:
        r2 = r6;
        goto L_0x0295;
    L_0x02b9:
        r11 = "WORK";
        r11 = r10.equals(r11);
        if (r11 == 0) goto L_0x02c3;
    L_0x02c1:
        r2 = r7;
        goto L_0x0295;
    L_0x02c3:
        r11 = "CELL";
        r11 = r10.equals(r11);
        if (r11 == 0) goto L_0x02cd;
    L_0x02cb:
        r2 = 4;
        goto L_0x0295;
    L_0x02cd:
        if (r2 >= 0) goto L_0x05e3;
    L_0x02cf:
        r1 = "X-";
        r1 = r10.startsWith(r1);
        if (r1 == 0) goto L_0x02db;
    L_0x02d7:
        r0 = r0.substring(r7);
    L_0x02db:
        r1 = r4;
    L_0x02dc:
        r2 = r1;
        r1 = r0;
        goto L_0x0295;
    L_0x02df:
        r0 = r2;
    L_0x02e0:
        if (r0 >= 0) goto L_0x02e3;
    L_0x02e2:
        r0 = r8;
    L_0x02e3:
        r2 = r14.b;
        if (r2 != 0) goto L_0x02ee;
    L_0x02e7:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r14.b = r2;
    L_0x02ee:
        r2 = r14.b;
        r4 = new ajv;
        r4.<init>(r3, r0, r1, r5);
        r2.add(r4);
        goto L_0x001f;
    L_0x02fa:
        r0 = "ORG";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x032b;
    L_0x0302:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x0326;
    L_0x030c:
        r1 = r0.iterator();
    L_0x0310:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0326;
    L_0x0316:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = "PREF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0310;
    L_0x0324:
        r4 = r6;
        goto L_0x0310;
    L_0x0326:
        r14.a(r6, r10, r9, r4);
        goto L_0x001f;
    L_0x032b:
        r0 = "TITLE";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0338;
    L_0x0333:
        r14.a(r3);
        goto L_0x001f;
    L_0x0338:
        r0 = "ROLE";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x001f;
    L_0x0340:
        r0 = "PHOTO";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0350;
    L_0x0348:
        r0 = "LOGO";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x03a3;
    L_0x0350:
        r0 = "VALUE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x0362;
    L_0x035a:
        r1 = "URL";
        r0 = r0.contains(r1);
        if (r0 != 0) goto L_0x001f;
    L_0x0362:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x038b;
    L_0x036c:
        r3 = r0.iterator();
        r1 = r2;
    L_0x0371:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x038c;
    L_0x0377:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r2 = "PREF";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0387;
    L_0x0385:
        r4 = r6;
        goto L_0x0371;
    L_0x0387:
        if (r1 != 0) goto L_0x05e0;
    L_0x0389:
        r1 = r0;
        goto L_0x0371;
    L_0x038b:
        r1 = r2;
    L_0x038c:
        r0 = r14.k;
        if (r0 != 0) goto L_0x0397;
    L_0x0390:
        r0 = new java.util.ArrayList;
        r0.<init>(r6);
        r14.k = r0;
    L_0x0397:
        r0 = new akf;
        r0.<init>(r1, r5, r4);
        r1 = r14.k;
        r1.add(r0);
        goto L_0x001f;
    L_0x03a3:
        r0 = "TEL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0415;
    L_0x03ab:
        r0 = r14.q;
        r0 = defpackage.ajq.c(r0);
        if (r0 == 0) goto L_0x03df;
    L_0x03b3:
        r0 = "sip:";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x03cc;
    L_0x03bb:
        r0 = r6;
        r5 = r2;
    L_0x03bd:
        if (r0 == 0) goto L_0x03e2;
    L_0x03bf:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        r14.a(r3, r0);
        goto L_0x001f;
    L_0x03cc:
        r0 = "tel:";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x03dc;
    L_0x03d4:
        r0 = 4;
        r0 = r3.substring(r0);
        r5 = r0;
        r0 = r4;
        goto L_0x03bd;
    L_0x03dc:
        r0 = r4;
        r5 = r3;
        goto L_0x03bd;
    L_0x03df:
        r0 = r4;
        r5 = r3;
        goto L_0x03bd;
    L_0x03e2:
        r0 = r3.length();
        if (r0 == 0) goto L_0x001f;
    L_0x03e8:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        r1 = defpackage.akw.a(r0, r5);
        r3 = r1 instanceof java.lang.Integer;
        if (r3 == 0) goto L_0x040d;
    L_0x03f8:
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
    L_0x03fe:
        if (r0 == 0) goto L_0x0413;
    L_0x0400:
        r3 = "PREF";
        r0 = r0.contains(r3);
        if (r0 == 0) goto L_0x0413;
    L_0x0408:
        r14.a(r1, r5, r2, r6);
        goto L_0x001f;
    L_0x040d:
        r2 = r1.toString();
        r1 = r4;
        goto L_0x03fe;
    L_0x0413:
        r6 = r4;
        goto L_0x0408;
    L_0x0415:
        r0 = "X-SKYPE-PSTNNUMBER";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0437;
    L_0x041d:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x0435;
    L_0x0427:
        r1 = "PREF";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0435;
    L_0x042f:
        r0 = 7;
        r14.a(r0, r3, r2, r6);
        goto L_0x001f;
    L_0x0435:
        r6 = r4;
        goto L_0x042f;
    L_0x0437:
        r0 = i;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x04a7;
    L_0x043f:
        r0 = i;
        r0 = r0.get(r1);
        r0 = (java.lang.Integer) r0;
        r1 = r0.intValue();
        r5 = -1;
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x048a;
    L_0x0456:
        r8 = r0.iterator();
        r13 = r5;
        r5 = r4;
        r4 = r13;
    L_0x045d:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x048d;
    L_0x0463:
        r0 = r8.next();
        r0 = (java.lang.String) r0;
        r9 = "PREF";
        r9 = r0.equals(r9);
        if (r9 == 0) goto L_0x0473;
    L_0x0471:
        r5 = r6;
        goto L_0x045d;
    L_0x0473:
        if (r4 >= 0) goto L_0x05dd;
    L_0x0475:
        r9 = "HOME";
        r9 = r0.equalsIgnoreCase(r9);
        if (r9 == 0) goto L_0x047f;
    L_0x047d:
        r4 = r6;
        goto L_0x045d;
    L_0x047f:
        r9 = "WORK";
        r0 = r0.equalsIgnoreCase(r9);
        if (r0 == 0) goto L_0x05dd;
    L_0x0487:
        r0 = r7;
    L_0x0488:
        r4 = r0;
        goto L_0x045d;
    L_0x048a:
        r13 = r5;
        r5 = r4;
        r4 = r13;
    L_0x048d:
        if (r4 >= 0) goto L_0x0490;
    L_0x048f:
        r4 = r6;
    L_0x0490:
        r0 = r14.e;
        if (r0 != 0) goto L_0x049b;
    L_0x0494:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r14.e = r0;
    L_0x049b:
        r6 = r14.e;
        r0 = new ajz;
        r0.<init>(r1, r2, r3, r4, r5);
        r6.add(r0);
        goto L_0x001f;
    L_0x04a7:
        r0 = "NOTE";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x04c6;
    L_0x04af:
        r0 = r14.g;
        if (r0 != 0) goto L_0x04ba;
    L_0x04b3:
        r0 = new java.util.ArrayList;
        r0.<init>(r6);
        r14.g = r0;
    L_0x04ba:
        r0 = r14.g;
        r1 = new akc;
        r1.<init>(r3);
        r0.add(r1);
        goto L_0x001f;
    L_0x04c6:
        r0 = "URL";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x04e5;
    L_0x04ce:
        r0 = r14.f;
        if (r0 != 0) goto L_0x04d9;
    L_0x04d2:
        r0 = new java.util.ArrayList;
        r0.<init>(r6);
        r14.f = r0;
    L_0x04d9:
        r0 = r14.f;
        r1 = new akj;
        r1.<init>(r3);
        r0.add(r1);
        goto L_0x001f;
    L_0x04e5:
        r0 = "BDAY";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x04f6;
    L_0x04ed:
        r0 = new aju;
        r0.<init>(r3);
        r14.h = r0;
        goto L_0x001f;
    L_0x04f6:
        r0 = "ANNIVERSARY";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0507;
    L_0x04fe:
        r0 = new ajt;
        r0.<init>(r3);
        r14.o = r0;
        goto L_0x001f;
    L_0x0507:
        r0 = "X-PHONETIC-FIRST-NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0515;
    L_0x050f:
        r0 = r14.j;
        r0.h = r3;
        goto L_0x001f;
    L_0x0515:
        r0 = "X-PHONETIC-MIDDLE-NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0523;
    L_0x051d:
        r0 = r14.j;
        r0.i = r3;
        goto L_0x001f;
    L_0x0523:
        r0 = "X-PHONETIC-LAST-NAME";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0531;
    L_0x052b:
        r0 = r14.j;
        r0.g = r3;
        goto L_0x001f;
    L_0x0531:
        r0 = "IMPP";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x054e;
    L_0x0539:
        r0 = "sip:";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x0541:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        r14.a(r3, r0);
        goto L_0x001f;
    L_0x054e:
        r0 = "X-SIP";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0569;
    L_0x0556:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x001f;
    L_0x055c:
        r0 = "TYPE";
        r0 = r9.get(r0);
        r0 = (java.util.Collection) r0;
        r14.a(r3, r0);
        goto L_0x001f;
    L_0x0569:
        r0 = "X-ANDROID-CUSTOM";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x05ba;
    L_0x0571:
        r0 = r14.q;
        r3 = defpackage.akw.a(r3, r0);
        r0 = r14.n;
        if (r0 != 0) goto L_0x0582;
    L_0x057b:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r14.n = r0;
    L_0x0582:
        r5 = r14.n;
        if (r3 != 0) goto L_0x0591;
    L_0x0586:
        r0 = r2;
    L_0x0587:
        r1 = new ajs;
        r1.<init>(r0, r2);
        r5.add(r1);
        goto L_0x001f;
    L_0x0591:
        r0 = r3.size();
        if (r0 >= r7) goto L_0x059e;
    L_0x0597:
        r0 = r3.get(r4);
        r0 = (java.lang.String) r0;
        goto L_0x0587;
    L_0x059e:
        r0 = r3.size();
        r1 = 16;
        if (r0 >= r1) goto L_0x05b6;
    L_0x05a6:
        r0 = r3.size();
        r1 = r0;
    L_0x05ab:
        r0 = r3.get(r4);
        r0 = (java.lang.String) r0;
        r2 = r3.subList(r6, r1);
        goto L_0x0587;
    L_0x05b6:
        r0 = 16;
        r1 = r0;
        goto L_0x05ab;
    L_0x05ba:
        r0 = r1.toUpperCase();
        r2 = "X-";
        r0 = r0.startsWith(r2);
        if (r0 == 0) goto L_0x001f;
    L_0x05c6:
        r0 = r14.p;
        if (r0 != 0) goto L_0x05d1;
    L_0x05ca:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r14.p = r0;
    L_0x05d1:
        r0 = r14.p;
        r2 = new android.util.Pair;
        r2.<init>(r1, r3);
        r0.add(r2);
        goto L_0x001f;
    L_0x05dd:
        r0 = r4;
        goto L_0x0488;
    L_0x05e0:
        r0 = r1;
        goto L_0x0389;
    L_0x05e3:
        r0 = r1;
        r1 = r2;
        goto L_0x02dc;
    L_0x05e7:
        r5 = r4;
        r0 = r1;
        r1 = r2;
        goto L_0x02e0;
    L_0x05ec:
        r6 = r0;
        goto L_0x0262;
    L_0x05ef:
        r0 = r3;
        r3 = r5;
        goto L_0x025c;
    L_0x05f3:
        r3 = r2;
        r0 = r1;
        r1 = r4;
        goto L_0x0260;
    L_0x05f8:
        r0 = r6;
        goto L_0x01e6;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajr.a(aku):void");
    }

    private void a(String str, Collection<String> collection) {
        if (!TextUtils.isEmpty(str)) {
            boolean z;
            int i;
            if (str.startsWith("sip:")) {
                str = str.substring(4);
                if (str.length() == 0) {
                    return;
                }
            }
            int i2 = -1;
            String str2 = null;
            if (collection != null) {
                z = false;
                for (String str3 : collection) {
                    String str32;
                    String toUpperCase = str32.toUpperCase();
                    if (toUpperCase.equals("PREF")) {
                        z = true;
                    } else if (toUpperCase.equals("HOME")) {
                        i2 = 1;
                    } else if (toUpperCase.equals("WORK")) {
                        i2 = 2;
                    } else {
                        int i3;
                        if (i2 < 0) {
                            if (toUpperCase.startsWith("X-")) {
                                str32 = str32.substring(2);
                            }
                            i3 = 0;
                        } else {
                            str32 = str2;
                            i3 = i2;
                        }
                        i2 = i3;
                        str2 = str32;
                    }
                }
                i = i2;
            } else {
                z = false;
                i = -1;
            }
            if (i < 0) {
                i = 3;
            }
            if (this.l == null) {
                this.l = new ArrayList();
            }
            this.l.add(new akh(str, i, str2, z));
        }
    }

    public void a(ajr ajr) {
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(ajr);
    }

    private String c() {
        String str = null;
        if (!TextUtils.isEmpty(this.j.f)) {
            str = this.j.f;
        } else if (!this.j.b()) {
            str = akw.a(this.q, this.j.a, this.j.c, this.j.b, this.j.d, this.j.e);
        } else if (!this.j.c()) {
            str = akw.a(this.q, this.j.g, this.j.i, this.j.h);
        } else if (this.b != null && this.b.size() > 0) {
            str = ((ajv) this.b.get(0)).a;
        } else if (this.a != null && this.a.size() > 0) {
            str = ((ake) this.a.get(0)).a;
        } else if (this.c != null && this.c.size() > 0) {
            str = ((akg) this.c.get(0)).a(this.q);
        } else if (this.d != null && this.d.size() > 0) {
            str = ((akd) this.d.get(0)).b();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public void a() {
        this.j.k = c();
    }

    public String b() {
        if (this.j.k == null) {
            this.j.k = c();
        }
        return this.j.k;
    }

    private void a(int i, List<String> list, Map<String, Collection<String>> map, boolean z) {
        String str;
        String str2;
        String valueOf;
        Collection collection = (Collection) map.get("SORT-AS");
        if (collection == null || collection.size() == 0) {
            str = null;
        } else {
            if (collection.size() > 1) {
                str2 = "Incorrect multiple SORT_AS parameters detected: ";
                valueOf = String.valueOf(Arrays.toString(collection.toArray()));
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            List<String> a = akw.a((String) collection.iterator().next(), this.q);
            StringBuilder stringBuilder = new StringBuilder();
            for (String append : a) {
                String append2;
                stringBuilder.append(append2);
            }
            str = stringBuilder.toString();
        }
        if (list == null) {
            list = t;
        }
        int size = list.size();
        switch (size) {
            case wi.w /*0*/:
                valueOf = null;
                str2 = "";
                break;
            case wi.j /*1*/:
                valueOf = null;
                str2 = (String) list.get(0);
                break;
            default:
                append2 = (String) list.get(0);
                StringBuilder stringBuilder2 = new StringBuilder();
                for (int i2 = 1; i2 < size; i2++) {
                    if (i2 > 1) {
                        stringBuilder2.append(' ');
                    }
                    stringBuilder2.append((String) list.get(i2));
                }
                valueOf = stringBuilder2.toString();
                str2 = append2;
                break;
        }
        if (this.d == null) {
            a(str2, valueOf, null, str, 1, z);
            return;
        }
        for (akd akd : this.d) {
            if (akd.a == null && akd.b == null) {
                akd.a = str2;
                akd.b = valueOf;
                akd.d = z;
                return;
            }
        }
        a(str2, valueOf, null, str, 1, z);
    }
}
