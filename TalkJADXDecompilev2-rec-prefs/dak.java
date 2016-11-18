package p000;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class dak implements Serializable {
    private static boolean f9425a = false;
    private String f9426b;
    private String f9427c;
    private String f9428d;
    private final List<Long> f9429e;
    private List<dam> f9430f;

    static {
        kae kae = glk.f15559f;
    }

    public dak() {
        this.f9429e = new ArrayList();
        this.f9430f = new ArrayList();
    }

    public dak(dap dap) {
        this(null, null, null, Arrays.asList(new dap[]{dap}), null, null);
    }

    public dak(String str, String str2, String str3, Iterable<dap> iterable, Iterable<dan> iterable2, Iterable<Long> iterable3) {
        this.f9429e = new ArrayList();
        this.f9430f = new ArrayList();
        this.f9426b = str;
        this.f9427c = str2;
        if (!TextUtils.isEmpty(this.f9427c)) {
            m11386c(this.f9427c);
        }
        this.f9428d = str3;
        if (iterable3 != null) {
            for (Long add : iterable3) {
                this.f9429e.add(add);
            }
        }
        if (iterable2 != null) {
            for (dan add2 : iterable2) {
                this.f9430f.add(add2);
            }
        }
        if (iterable != null) {
            for (dap add3 : iterable) {
                this.f9430f.add(add3);
            }
        }
    }

    public static dak m11378a(Context context, hwk hwk, String str) {
        List arrayList = new ArrayList();
        arrayList.add(hwk);
        return dak.m11381a(context, arrayList, str);
    }

    private static dak m11381a(Context context, List<hwk> list, String str) {
        if (list.size() == 0) {
            return null;
        }
        String str2;
        hwk hwk = (hwk) list.get(0);
        String a = hwk.mo2077a();
        String e = hwk.mo2081e();
        String h = hwk.mo2084h();
        Iterable arrayList = new ArrayList();
        Iterable arrayList2 = new ArrayList();
        Iterable arrayList3 = new ArrayList();
        if (str == null) {
            str2 = null;
        } else {
            str2 = glq.m18021e(context, str);
        }
        HashSet hashSet = new HashSet();
        String str3 = a;
        Object obj = null;
        for (hwk hwk2 : list) {
            String valueOf;
            if (f9425a) {
                valueOf = String.valueOf(hwk2.mo2077a());
                String valueOf2 = String.valueOf(hwk2.mo2081e());
                new StringBuilder(((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append("Aggregated contact:").append(valueOf).append(" Gaia:").append(valueOf2).append(" Only phone:").append(str);
            }
            if (hwk2.mo2082f()) {
                valueOf = hwk2.mo2077a();
                CharSequence h2 = hwk2.mo2084h();
                if (!TextUtils.isEmpty(h2)) {
                    h = h2;
                }
            } else {
                valueOf = str3;
            }
            for (Long l : hwk2.mo2078b()) {
                if (TextUtils.isEmpty(h)) {
                    h = frm.m16047a(l);
                }
                arrayList.add(l);
            }
            for (hwm hwm : hwk2.mo2079c()) {
                String str4;
                if (f9425a) {
                    str4 = "Email:";
                    String valueOf3 = String.valueOf(hwm.mo2951b());
                    if (valueOf3.length() != 0) {
                        str4.concat(valueOf3);
                    } else {
                        String str5 = new String(str4);
                    }
                }
                arrayList3.add(new dan(hwm.mo2951b(), hwm.mo2950a()));
            }
            Object obj2 = obj;
            for (hwr hwr : hwk2.mo2080d()) {
                String str6;
                a = hwr.mo2955b();
                str4 = glq.m18021e(context, a);
                if (!hashSet.contains(str4)) {
                    hashSet.add(str4);
                    if (str2 == null || str2.equals(str4)) {
                        arrayList2.add(new dap(a, hwr.mo2954a()));
                        obj2 = 1;
                    }
                } else if (f9425a) {
                    str6 = "Skip duplicate phone:";
                    a = String.valueOf(a);
                    if (a.length() != 0) {
                        str6.concat(a);
                    } else {
                        a = new String(str6);
                    }
                }
            }
            obj = obj2;
            str3 = valueOf;
        }
        if (str2 != null && obj == null) {
            str2 = "Babel";
            a = "Only phone number to include not found:";
            str6 = String.valueOf(str);
            glk.m17982e(str2, str6.length() != 0 ? a.concat(str6) : new String(a), new Object[0]);
        }
        return new dak(str3, e, h, arrayList2, arrayList3, arrayList);
    }

    public static dak m11379a(Context context, Iterable<bjg> iterable) {
        return dak.m11380a(context, (Iterable) iterable, null);
    }

    private static dak m11380a(Context context, Iterable<bjg> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        String str2;
        String str3;
        bjg bjg = (bjg) it.next();
        String e = bjg.mo571e();
        String i = bjg.mo575i();
        CharSequence f = bjg.mo572f();
        Iterable arrayList = new ArrayList();
        Iterable arrayList2 = new ArrayList();
        Iterable arrayList3 = new ArrayList();
        if (str == null) {
            str2 = null;
        } else {
            str2 = glq.m18021e(context, str);
        }
        HashSet hashSet = new HashSet();
        String str4 = e;
        Object obj = null;
        while (it.hasNext()) {
            String valueOf;
            bjg = (bjg) it.next();
            if (f9425a) {
                valueOf = String.valueOf(bjg.mo571e());
                String valueOf2 = String.valueOf(bjg.mo575i());
                new StringBuilder(((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append("hangouts contact:").append(valueOf).append(" Gaia:").append(valueOf2).append(" Only phone:").append(str);
            }
            if (bjg.mo591y()) {
                valueOf = bjg.mo571e();
                CharSequence f2 = bjg.mo572f();
                if (!TextUtils.isEmpty(f2)) {
                    str3 = f2;
                }
            } else {
                valueOf = str4;
            }
            if (!TextUtils.isEmpty(bjg.mo582p())) {
                Long valueOf3 = Long.valueOf(Long.parseLong(bjg.mo582p()));
                if (TextUtils.isEmpty(f)) {
                    str3 = frm.m16047a(valueOf3);
                }
                arrayList.add(valueOf3);
            }
            for (bje bje : bjg.mo570d()) {
                String str5;
                if (f9425a) {
                    str5 = "Email:";
                    String valueOf4 = String.valueOf(bje.m5365c());
                    if (valueOf4.length() != 0) {
                        str5.concat(valueOf4);
                    } else {
                        String str6 = new String(str5);
                    }
                }
                arrayList3.add(new dan(bje.m5365c(), bje.m5364b()));
            }
            Object obj2 = obj;
            for (bjo bjo : bjg.mo568b()) {
                String str7;
                e = bjo.m5474d();
                str5 = bjo.m5475e();
                if (!hashSet.contains(str5)) {
                    hashSet.add(str5);
                    if (str2 == null || str2.equals(str5)) {
                        arrayList2.add(new dap(e, bjo.m5472b()));
                        obj2 = 1;
                    }
                } else if (f9425a) {
                    str7 = "Skip duplicate phone:";
                    e = String.valueOf(e);
                    if (e.length() != 0) {
                        str7.concat(e);
                    } else {
                        e = new String(str7);
                    }
                }
            }
            obj = obj2;
            str4 = valueOf;
        }
        if (str2 != null && obj == null) {
            str2 = "Babel";
            e = "Only phone number to include not found:";
            str7 = String.valueOf(str);
            glk.m17982e(str2, str7.length() != 0 ? e.concat(str7) : new String(e), new Object[0]);
        }
        return new dak(str4, i, str3, arrayList2, arrayList3, arrayList);
    }

    public static boolean m11382a(hwk hwk) {
        return !gwb.m2185e(hwk.mo2080d());
    }

    public long m11387a() {
        if (this.f9429e.isEmpty()) {
            return -1;
        }
        return gwb.m1523a((Long) this.f9429e.get(0));
    }

    public static String m11384b(hwk hwk) {
        Iterator it = hwk.mo2079c().iterator();
        if (it.hasNext()) {
            return ((hwm) it.next()).mo2951b();
        }
        it = hwk.mo2080d().iterator();
        if (it.hasNext()) {
            return ((hwr) it.next()).mo2955b();
        }
        return null;
    }

    public String m11388b() {
        return this.f9427c;
    }

    public String m11389c() {
        return this.f9426b;
    }

    public String m11390d() {
        return this.f9428d;
    }

    private void m11386c(String str) {
        this.f9430f.add(new dao(str));
    }

    public dap m11391e() {
        for (dam dam : this.f9430f) {
            if (dam instanceof dap) {
                return (dap) dam;
            }
        }
        return null;
    }

    public List<dap> m11392f() {
        List<dap> arrayList = new ArrayList();
        for (dam dam : this.f9430f) {
            if (dam instanceof dap) {
                arrayList.add((dap) dam);
            }
        }
        return arrayList;
    }

    public List<dan> m11393g() {
        List<dan> arrayList = new ArrayList();
        for (dam dam : this.f9430f) {
            if (dam instanceof dan) {
                arrayList.add((dan) dam);
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number of details ").append(this.f9430f.size()).append("\n");
        for (dam append : this.f9430f) {
            stringBuilder.append(append).append("\n");
        }
        return stringBuilder.toString();
    }

    public static boolean m11383a(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean m11385b(String str) {
        if (TextUtils.isEmpty(str) || !PhoneNumberUtils.isWellFormedSmsAddress(str) || ajf.m2609a().mo2115a(str)) {
            return true;
        }
        Object extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(str);
        if (TextUtils.isEmpty(extractNetworkPortion) || extractNetworkPortion.length() < 3) {
            return true;
        }
        return false;
    }

    public static dak m11377a(Context context, bjg bjg) {
        return dak.m11380a(context, Collections.singletonList(bjg), null);
    }
}
