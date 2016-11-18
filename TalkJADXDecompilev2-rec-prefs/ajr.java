package p000;

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

public final class ajr {
    private static final Map<String, Integer> f1028i;
    private static final List<String> f1029t = Collections.unmodifiableList(new ArrayList(0));
    public List<ake> f1030a;
    public List<ajv> f1031b;
    public List<akg> f1032c;
    public List<akd> f1033d;
    public List<ajz> f1034e;
    public List<akj> f1035f;
    public List<akc> f1036g;
    public aju f1037h;
    private final aka f1038j;
    private List<akf> f1039k;
    private List<akh> f1040l;
    private List<akb> f1041m;
    private List<ajs> f1042n;
    private ajt f1043o;
    private List<Pair<String, String>> f1044p;
    private final int f1045q;
    private final Account f1046r;
    private List<ajr> f1047s;

    static {
        Map hashMap = new HashMap();
        f1028i = hashMap;
        hashMap.put("X-AIM", Integer.valueOf(0));
        f1028i.put("X-MSN", Integer.valueOf(1));
        f1028i.put("X-YAHOO", Integer.valueOf(2));
        f1028i.put("X-ICQ", Integer.valueOf(6));
        f1028i.put("X-JABBER", Integer.valueOf(7));
        f1028i.put("X-SKYPE-USERNAME", Integer.valueOf(3));
        f1028i.put("X-GOOGLE-TALK", Integer.valueOf(5));
        f1028i.put("X-GOOGLE TALK", Integer.valueOf(5));
    }

    private static void m2656a(List<? extends ajw> list, ajx ajx) {
        if (list != null && list.size() > 0) {
            ajx.mo233a(((ajw) list.get(0)).mo229a());
            for (ajw a : list) {
                ajx.mo234a(a);
            }
            ajx.mo236c();
        }
    }

    public String toString() {
        ajx aki = new aki(this);
        aki.mo232a();
        aka aka = this.f1038j;
        aki.mo233a(ajy.NAME);
        aki.mo234a(this.f1038j);
        aki.mo236c();
        ajr.m2656a(this.f1030a, aki);
        ajr.m2656a(this.f1031b, aki);
        ajr.m2656a(this.f1032c, aki);
        ajr.m2656a(this.f1033d, aki);
        ajr.m2656a(this.f1034e, aki);
        ajr.m2656a(this.f1039k, aki);
        ajr.m2656a(this.f1035f, aki);
        ajr.m2656a(this.f1040l, aki);
        ajr.m2656a(this.f1041m, aki);
        ajr.m2656a(this.f1036g, aki);
        ajr.m2656a(this.f1042n, aki);
        if (this.f1037h != null) {
            aki.mo233a(this.f1037h.mo229a());
            aki.mo234a(this.f1037h);
            aki.mo236c();
        }
        if (this.f1043o != null) {
            aki.mo233a(this.f1043o.mo229a());
            aki.mo234a(this.f1043o);
            aki.mo236c();
        }
        aki.mo235b();
        return aki.toString();
    }

    public ajr() {
        this(-1073741824);
    }

    private ajr(int i) {
        this(-1073741824, null);
    }

    public ajr(int i, Account account) {
        this.f1038j = new aka();
        this.f1045q = i;
        this.f1046r = account;
    }

    private void m2650a(int i, String str, String str2, boolean z) {
        String str3;
        Object obj = null;
        if (this.f1030a == null) {
            this.f1030a = new ArrayList();
        }
        StringBuilder stringBuilder = new StringBuilder();
        String trim = str.trim();
        if (i == 6 || ajq.m2649f(this.f1045q)) {
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
                str3 = gwb.m2001b(stringBuilder.toString(), akw.m2814a(this.f1045q));
            } else {
                str3 = stringBuilder.toString();
            }
        }
        this.f1030a.add(new ake(str3, i, str2, z));
    }

    private void m2653a(String str, String str2, String str3, String str4, int i, boolean z) {
        if (this.f1033d == null) {
            this.f1033d = new ArrayList();
        }
        this.f1033d.add(new akd(str, str2, str3, str4, i, z));
    }

    private void m2652a(String str) {
        if (this.f1033d == null) {
            m2653a(null, null, str, null, 1, false);
            return;
        }
        for (akd akd : this.f1033d) {
            if (akd.f1095c == null) {
                akd.f1095c = str;
                return;
            }
        }
        m2653a(null, null, str, null, 1, false);
    }

    private void m2655a(List<String> list) {
        if (TextUtils.isEmpty(this.f1038j.f1086g) && TextUtils.isEmpty(this.f1038j.f1088i) && TextUtils.isEmpty(this.f1038j.f1087h) && list != null) {
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
                            this.f1038j.f1086g = split[0];
                            this.f1038j.f1088i = split[1];
                            this.f1038j.f1087h = split[2];
                            return;
                        } else if (i == 2) {
                            this.f1038j.f1086g = split[0];
                            this.f1038j.f1087h = split[1];
                            return;
                        } else {
                            this.f1038j.f1087h = (String) list.get(0);
                            return;
                        }
                    }
                }
                switch (i) {
                    case 2:
                        break;
                    case 3:
                        this.f1038j.f1088i = (String) list.get(2);
                        break;
                }
                this.f1038j.f1087h = (String) list.get(1);
                this.f1038j.f1086g = (String) list.get(0);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2660a(aku aku) {
        List list = null;
        boolean z = false;
        boolean z2 = true;
        String a = aku.m2795a();
        Map b = aku.m2801b();
        List<String> d = aku.m2806d();
        byte[] e = aku.m2807e();
        if ((d != null && d.size() != 0) || e != null) {
            String stringBuilder;
            String trim;
            if (d != null) {
                int size = d.size();
                if (size > 1) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    for (String stringBuilder3 : d) {
                        stringBuilder2.append(stringBuilder3);
                        if (size - 1 > 0) {
                            stringBuilder2.append(";");
                        }
                    }
                    stringBuilder3 = stringBuilder2.toString();
                } else if (size == 1) {
                    stringBuilder3 = (String) d.get(0);
                } else {
                    stringBuilder3 = "";
                }
                trim = stringBuilder3.trim();
            } else {
                trim = null;
            }
            if (!a.equals("VERSION")) {
                if (a.equals("FN")) {
                    this.f1038j.f1085f = trim;
                } else if (a.equals("NAME")) {
                    if (TextUtils.isEmpty(this.f1038j.f1085f)) {
                        this.f1038j.f1085f = trim;
                    }
                } else if (a.equals("N")) {
                    if (!ajq.m2645b(this.f1045q) || (TextUtils.isEmpty(this.f1038j.f1086g) && TextUtils.isEmpty(this.f1038j.f1088i) && TextUtils.isEmpty(this.f1038j.f1087h))) {
                        r0 = (Collection) b.get("SORT-AS");
                        if (!(r0 == null || r0.size() == 0)) {
                            if (r0.size() > 1) {
                                a = "Incorrect multiple SORT_AS parameters detected: ";
                                r2 = String.valueOf(Arrays.toString(r0.toArray()));
                                if (r2.length() != 0) {
                                    a.concat(r2);
                                } else {
                                    r2 = new String(a);
                                }
                            }
                            List a2 = akw.m2820a((String) r0.iterator().next(), this.f1045q);
                            r0 = a2.size();
                            if (r0 > 3) {
                                r0 = 3;
                            }
                            switch (r0) {
                                case 2:
                                    break;
                                case 3:
                                    this.f1038j.f1088i = (String) a2.get(2);
                                    break;
                            }
                            this.f1038j.f1087h = (String) a2.get(1);
                            this.f1038j.f1086g = (String) a2.get(0);
                        }
                    }
                    if (d != null) {
                        r0 = d.size();
                        if (r0 > 0) {
                            if (r0 > 5) {
                                r0 = 5;
                            }
                            switch (r0) {
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    this.f1038j.f1084e = (String) d.get(4);
                                    break;
                            }
                        }
                    }
                } else if (a.equals("SORT-STRING")) {
                    this.f1038j.f1089j = trim;
                } else if (a.equals("NICKNAME") || a.equals("X-NICKNAME")) {
                    if (this.f1041m == null) {
                        this.f1041m = new ArrayList();
                    }
                    this.f1041m.add(new akb(trim));
                } else if (a.equals("SOUND")) {
                    r0 = (Collection) b.get("TYPE");
                    if (r0 != null && r0.contains("X-IRMC-N")) {
                        m2655a(akw.m2820a(trim, this.f1045q));
                    }
                } else if (a.equals("ADR")) {
                    for (String stringBuilder32 : d) {
                        if (!TextUtils.isEmpty(stringBuilder32)) {
                            r0 = false;
                            break;
                        }
                    }
                    r0 = true;
                    if (!r0) {
                        int i;
                        r0 = (Collection) b.get("TYPE");
                        if (r0 != null) {
                            trim = null;
                            r5 = true;
                            r1 = false;
                            for (String stringBuilder322 : r0) {
                                String toUpperCase = stringBuilder322.toUpperCase();
                                if (toUpperCase.equals("PREF")) {
                                    r1 = true;
                                } else if (toUpperCase.equals("HOME")) {
                                    trim = null;
                                    r5 = true;
                                } else if (toUpperCase.equals("WORK") || toUpperCase.equalsIgnoreCase("COMPANY")) {
                                    trim = null;
                                    r5 = true;
                                } else {
                                    boolean z3;
                                    if (toUpperCase.equals("PARCEL") || toUpperCase.equals("DOM") || toUpperCase.equals("INTL") || r5 < false) {
                                        stringBuilder322 = trim;
                                        z3 = r5;
                                    } else if (toUpperCase.startsWith("X-")) {
                                        trim = stringBuilder322.substring(2);
                                        r5 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    r5 = z3;
                                    trim = stringBuilder322;
                                }
                            }
                            r0 = r5;
                        } else {
                            trim = null;
                            r0 = -1;
                            r1 = false;
                        }
                        if (r0 >= 0) {
                            i = r0;
                        }
                        if (this.f1032c == null) {
                            this.f1032c = new ArrayList(0);
                        }
                        this.f1032c.add(akg.m2700a(d, i, trim, r1, this.f1045q));
                    }
                } else if (a.equals("EMAIL")) {
                    r0 = (Collection) b.get("TYPE");
                    if (r0 != null) {
                        r5 = false;
                        boolean z4 = true;
                        a = null;
                        for (String stringBuilder3222 : r0) {
                            String toUpperCase2 = stringBuilder3222.toUpperCase();
                            if (toUpperCase2.equals("PREF")) {
                                r5 = true;
                            } else if (toUpperCase2.equals("HOME")) {
                                z4 = true;
                            } else if (toUpperCase2.equals("WORK")) {
                                z4 = true;
                            } else if (toUpperCase2.equals("CELL")) {
                                z4 = true;
                            } else {
                                if (z4 >= false) {
                                    if (toUpperCase2.startsWith("X-")) {
                                        stringBuilder3222 = stringBuilder3222.substring(2);
                                    }
                                    r1 = false;
                                } else {
                                    stringBuilder3222 = a;
                                    r1 = z4;
                                }
                                z4 = r1;
                                a = stringBuilder3222;
                            }
                        }
                        r0 = z4;
                    } else {
                        r5 = false;
                        r0 = -1;
                        a = null;
                    }
                    if (r0 < 0) {
                        r0 = 3;
                    }
                    if (this.f1031b == null) {
                        this.f1031b = new ArrayList();
                    }
                    this.f1031b.add(new ajv(trim, r0, a, r5));
                } else if (a.equals("ORG")) {
                    r0 = (Collection) b.get("TYPE");
                    if (r0 != null) {
                        for (String stringBuilder32222 : r0) {
                            if (stringBuilder32222.equals("PREF")) {
                                z = true;
                            }
                        }
                    }
                    m2651a(1, (List) d, b, z);
                } else if (a.equals("TITLE")) {
                    m2652a(trim);
                } else if (!a.equals("ROLE")) {
                    if (a.equals("PHOTO") || a.equals("LOGO")) {
                        r0 = (Collection) b.get("VALUE");
                        if (r0 == null || !r0.contains("URL")) {
                            r0 = (Collection) b.get("TYPE");
                            if (r0 != null) {
                                a = null;
                                for (String stringBuilder322222 : r0) {
                                    if ("PREF".equals(stringBuilder322222)) {
                                        z = true;
                                    } else {
                                        if (a != null) {
                                            stringBuilder322222 = a;
                                        }
                                        a = stringBuilder322222;
                                    }
                                }
                            } else {
                                a = null;
                            }
                            if (this.f1039k == null) {
                                this.f1039k = new ArrayList(1);
                            }
                            this.f1039k.add(new akf(a, e, z));
                        }
                    } else if (a.equals("TEL")) {
                        String str;
                        if (!ajq.m2646c(this.f1045q)) {
                            r0 = false;
                            str = trim;
                        } else if (trim.startsWith("sip:")) {
                            r0 = true;
                            str = null;
                        } else if (trim.startsWith("tel:")) {
                            str = trim.substring(4);
                            r0 = false;
                        } else {
                            r0 = false;
                            str = trim;
                        }
                        if (r0) {
                            m2654a(trim, (Collection) b.get("TYPE"));
                        } else if (trim.length() != 0) {
                            r0 = (Collection) b.get("TYPE");
                            Object a3 = akw.m2815a(r0, str);
                            if (a3 instanceof Integer) {
                                r1 = ((Integer) a3).intValue();
                            } else {
                                r2 = a3.toString();
                                r1 = 0;
                            }
                            if (r0 == null || !r0.contains("PREF")) {
                                z2 = false;
                            }
                            m2650a(r1, str, r2, z2);
                        }
                    } else if (a.equals("X-SKYPE-PSTNNUMBER")) {
                        r0 = (Collection) b.get("TYPE");
                        if (r0 == null || !r0.contains("PREF")) {
                            z2 = false;
                        }
                        m2650a(7, trim, null, z2);
                    } else if (f1028i.containsKey(a)) {
                        int i2;
                        r1 = ((Integer) f1028i.get(a)).intValue();
                        r0 = (Collection) b.get("TYPE");
                        if (r0 != null) {
                            r5 = false;
                            i2 = -1;
                            for (String stringBuilder3222222 : r0) {
                                if (stringBuilder3222222.equals("PREF")) {
                                    r5 = true;
                                } else {
                                    if (i2 < 0) {
                                        if (stringBuilder3222222.equalsIgnoreCase("HOME")) {
                                            i2 = true;
                                        } else if (stringBuilder3222222.equalsIgnoreCase("WORK")) {
                                            r0 = 2;
                                            i2 = r0;
                                        }
                                    }
                                    r0 = i2;
                                    i2 = r0;
                                }
                            }
                        } else {
                            r5 = false;
                            i2 = -1;
                        }
                        if (i2 < 0) {
                            i2 = 1;
                        }
                        if (this.f1034e == null) {
                            this.f1034e = new ArrayList();
                        }
                        this.f1034e.add(new ajz(r1, null, trim, i2, r5));
                    } else if (a.equals("NOTE")) {
                        if (this.f1036g == null) {
                            this.f1036g = new ArrayList(1);
                        }
                        this.f1036g.add(new akc(trim));
                    } else if (a.equals("URL")) {
                        if (this.f1035f == null) {
                            this.f1035f = new ArrayList(1);
                        }
                        this.f1035f.add(new akj(trim));
                    } else if (a.equals("BDAY")) {
                        this.f1037h = new aju(trim);
                    } else if (a.equals("ANNIVERSARY")) {
                        this.f1043o = new ajt(trim);
                    } else if (a.equals("X-PHONETIC-FIRST-NAME")) {
                        this.f1038j.f1087h = trim;
                    } else if (a.equals("X-PHONETIC-MIDDLE-NAME")) {
                        this.f1038j.f1088i = trim;
                    } else if (a.equals("X-PHONETIC-LAST-NAME")) {
                        this.f1038j.f1086g = trim;
                    } else if (a.equals("IMPP")) {
                        if (trim.startsWith("sip:")) {
                            m2654a(trim, (Collection) b.get("TYPE"));
                        }
                    } else if (a.equals("X-SIP")) {
                        if (!TextUtils.isEmpty(trim)) {
                            m2654a(trim, (Collection) b.get("TYPE"));
                        }
                    } else if (a.equals("X-ANDROID-CUSTOM")) {
                        List a4 = akw.m2820a(trim, this.f1045q);
                        if (this.f1042n == null) {
                            this.f1042n = new ArrayList();
                        }
                        List list2 = this.f1042n;
                        if (a4 == null) {
                            stringBuilder3222222 = null;
                        } else if (a4.size() < 2) {
                            stringBuilder3222222 = (String) a4.get(0);
                        } else {
                            if (a4.size() < 16) {
                                r1 = a4.size();
                            } else {
                                r1 = 16;
                            }
                            stringBuilder3222222 = (String) a4.get(0);
                            list = a4.subList(1, r1);
                        }
                        list2.add(new ajs(stringBuilder3222222, list));
                    } else if (a.toUpperCase().startsWith("X-")) {
                        if (this.f1044p == null) {
                            this.f1044p = new ArrayList();
                        }
                        this.f1044p.add(new Pair(a, trim));
                    }
                }
            }
        }
    }

    private void m2654a(String str, Collection<String> collection) {
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
            if (this.f1040l == null) {
                this.f1040l = new ArrayList();
            }
            this.f1040l.add(new akh(str, i, str2, z));
        }
    }

    public void m2659a(ajr ajr) {
        if (this.f1047s == null) {
            this.f1047s = new ArrayList();
        }
        this.f1047s.add(ajr);
    }

    private String m2657c() {
        String str = null;
        if (!TextUtils.isEmpty(this.f1038j.f1085f)) {
            str = this.f1038j.f1085f;
        } else if (!this.f1038j.m2685b()) {
            str = akw.m2817a(this.f1045q, this.f1038j.f1080a, this.f1038j.f1082c, this.f1038j.f1081b, this.f1038j.f1083d, this.f1038j.f1084e);
        } else if (!this.f1038j.m2686c()) {
            str = akw.m2816a(this.f1045q, this.f1038j.f1086g, this.f1038j.f1088i, this.f1038j.f1087h);
        } else if (this.f1031b != null && this.f1031b.size() > 0) {
            str = ((ajv) this.f1031b.get(0)).f1052a;
        } else if (this.f1030a != null && this.f1030a.size() > 0) {
            str = ((ake) this.f1030a.get(0)).f1099a;
        } else if (this.f1032c != null && this.f1032c.size() > 0) {
            str = ((akg) this.f1032c.get(0)).m2702a(this.f1045q);
        } else if (this.f1033d != null && this.f1033d.size() > 0) {
            str = ((akd) this.f1033d.get(0)).m2691b();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public void m2658a() {
        this.f1038j.f1090k = m2657c();
    }

    public String m2661b() {
        if (this.f1038j.f1090k == null) {
            this.f1038j.f1090k = m2657c();
        }
        return this.f1038j.f1090k;
    }

    private void m2651a(int i, List<String> list, Map<String, Collection<String>> map, boolean z) {
        String str;
        String str2;
        String valueOf;
        String str3;
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
            List<String> a = akw.m2820a((String) collection.iterator().next(), this.f1045q);
            StringBuilder stringBuilder = new StringBuilder();
            for (String str32 : a) {
                stringBuilder.append(str32);
            }
            str = stringBuilder.toString();
        }
        if (list == null) {
            list = f1029t;
        }
        int size = list.size();
        switch (size) {
            case 0:
                valueOf = null;
                str2 = "";
                break;
            case 1:
                valueOf = null;
                str2 = (String) list.get(0);
                break;
            default:
                str32 = (String) list.get(0);
                StringBuilder stringBuilder2 = new StringBuilder();
                for (int i2 = 1; i2 < size; i2++) {
                    if (i2 > 1) {
                        stringBuilder2.append(' ');
                    }
                    stringBuilder2.append((String) list.get(i2));
                }
                valueOf = stringBuilder2.toString();
                str2 = str32;
                break;
        }
        if (this.f1033d == null) {
            m2653a(str2, valueOf, null, str, 1, z);
            return;
        }
        for (akd akd : this.f1033d) {
            if (akd.f1093a == null && akd.f1094b == null) {
                akd.f1093a = str2;
                akd.f1094b = valueOf;
                akd.f1096d = z;
                return;
            }
        }
        m2653a(str2, valueOf, null, str, 1, z);
    }
}
