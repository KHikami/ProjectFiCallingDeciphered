package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bmg */
public final class bmg extends bno implements cqt {
    private static DecimalFormat a;
    private final bnp b;
    private final String c;
    private final Uri d;

    public bmg(bnp bnp, String str) {
        this(bnp, str, true, false);
    }

    private bmg(bnp bnp, String str, boolean z, boolean z2) {
        super(bnp);
        buf.n(str);
        this.b = bnp;
        this.c = str;
        this.d = bmg.a(this.c);
    }

    public static Uri a(String str) {
        buf.n(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    private static String a(double d) {
        if (a == null) {
            a = new DecimalFormat("0.######");
        }
        return a.format(d);
    }

    private static void a(Map map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, bmg.a(d));
        }
    }

    private static void a(Map map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            map.put(str, i + "x" + i2);
        }
    }

    private static void a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void a(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    private static Map b(cqk cqk) {
        CharSequence p;
        Map hashMap = new HashMap();
        bnc bnc = (bnc) cqk.a(bnc.class);
        if (bnc != null) {
            for (Entry entry : Collections.unmodifiableMap(bnc.a).entrySet()) {
                Object obj;
                Boolean value = entry.getValue();
                if (value == null) {
                    obj = null;
                } else if (value instanceof String) {
                    String str = (String) value;
                    if (TextUtils.isEmpty(str)) {
                        obj = null;
                    }
                } else if (value instanceof Double) {
                    Double d = (Double) value;
                    obj = d.doubleValue() != 0.0d ? bmg.a(d.doubleValue()) : null;
                } else {
                    obj = value instanceof Boolean ? value != Boolean.FALSE ? "1" : null : String.valueOf(value);
                }
                if (obj != null) {
                    hashMap.put(entry.getKey(), obj);
                }
            }
        }
        bnd bnd = (bnd) cqk.a(bnd.class);
        if (bnd != null) {
            bmg.a(hashMap, "t", bnd.a);
            bmg.a(hashMap, "cid", bnd.b);
            bmg.a(hashMap, "uid", bnd.c);
            bmg.a(hashMap, "sc", bnd.f);
            bmg.a(hashMap, "sf", bnd.h);
            bmg.a(hashMap, "ni", bnd.g);
            bmg.a(hashMap, "adid", bnd.d);
            bmg.a(hashMap, "ate", bnd.e);
        }
        cra cra = (cra) cqk.a(cra.class);
        if (cra != null) {
            bmg.a(hashMap, "cd", cra.a);
            bmg.a(hashMap, "a", (double) cra.b);
            bmg.a(hashMap, "dr", cra.c);
        }
        cqy cqy = (cqy) cqk.a(cqy.class);
        if (cqy != null) {
            bmg.a(hashMap, "ec", cqy.a);
            bmg.a(hashMap, "ea", cqy.b);
            bmg.a(hashMap, "el", cqy.c);
            bmg.a(hashMap, "ev", (double) cqy.d);
        }
        cqv cqv = (cqv) cqk.a(cqv.class);
        if (cqv != null) {
            bmg.a(hashMap, "cn", cqv.a);
            bmg.a(hashMap, "cs", cqv.b);
            bmg.a(hashMap, "cm", cqv.c);
            bmg.a(hashMap, "ck", cqv.d);
            bmg.a(hashMap, "cc", cqv.e);
            bmg.a(hashMap, "ci", cqv.f);
            bmg.a(hashMap, "anid", cqv.g);
            bmg.a(hashMap, "gclid", cqv.h);
            bmg.a(hashMap, "dclid", cqv.i);
            bmg.a(hashMap, "aclid", cqv.j);
        }
        cqz cqz = (cqz) cqk.a(cqz.class);
        if (cqz != null) {
            bmg.a(hashMap, "exd", cqz.a);
            bmg.a(hashMap, "exf", cqz.b);
        }
        crb crb = (crb) cqk.a(crb.class);
        if (crb != null) {
            bmg.a(hashMap, "sn", crb.a);
            bmg.a(hashMap, "sa", crb.b);
            bmg.a(hashMap, "st", crb.c);
        }
        crc crc = (crc) cqk.a(crc.class);
        if (crc != null) {
            bmg.a(hashMap, "utv", crc.a);
            bmg.a(hashMap, "utt", (double) crc.b);
            bmg.a(hashMap, "utc", crc.c);
            bmg.a(hashMap, "utl", crc.d);
        }
        bna bna = (bna) cqk.a(bna.class);
        if (bna != null) {
            for (Entry entry2 : Collections.unmodifiableMap(bna.a).entrySet()) {
                p = buf.p(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(p)) {
                    hashMap.put(p, entry2.getValue());
                }
            }
        }
        bnb bnb = (bnb) cqk.a(bnb.class);
        if (bnb != null) {
            for (Entry entry22 : Collections.unmodifiableMap(bnb.a).entrySet()) {
                p = buf.q(((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(p)) {
                    hashMap.put(p, bmg.a(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        cqx cqx = (cqx) cqk.a(cqx.class);
        if (cqx != null) {
            if (cqx.d != null) {
                for (Entry entry3 : new HashMap(null).entrySet()) {
                    if (((String) entry3.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry3.getKey()).substring(1), entry3.getValue());
                    } else {
                        hashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
            }
            int i = 1;
            for (bng a : Collections.unmodifiableList(cqx.b)) {
                hashMap.putAll(a.a(buf.u(i)));
                i++;
            }
            i = 1;
            for (bne a2 : Collections.unmodifiableList(cqx.a)) {
                hashMap.putAll(a2.a(buf.s(i)));
                i++;
            }
            i = 1;
            for (Entry entry222 : cqx.c.entrySet()) {
                List<bne> list = (List) entry222.getValue();
                String x = buf.x(i);
                int i2 = 1;
                for (bne a22 : list) {
                    hashMap.putAll(a22.a(x + buf.v(i2)));
                    i2++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry222.getKey())) {
                    hashMap.put(x + "nm", entry222.getKey());
                }
                i++;
            }
        }
        cqw cqw = (cqw) cqk.a(cqw.class);
        if (cqw != null) {
            bmg.a(hashMap, "ul", cqw.a);
            bmg.a(hashMap, "sd", (double) cqw.b);
            bmg.a(hashMap, "sr", cqw.c, cqw.d);
            bmg.a(hashMap, "vp", cqw.e, cqw.f);
        }
        cqu cqu = (cqu) cqk.a(cqu.class);
        if (cqu != null) {
            bmg.a(hashMap, "an", cqu.a);
            bmg.a(hashMap, "aid", cqu.c);
            bmg.a(hashMap, "aiid", cqu.d);
            bmg.a(hashMap, "av", cqu.b);
        }
        return hashMap;
    }

    public final Uri a() {
        return this.d;
    }

    public final void a(cqk cqk) {
        buf.A((Object) cqk);
        buf.b(cqk.c, (Object) "Can't deliver not submitted measurement");
        buf.p("deliver should be called on worker thread");
        cqk a = cqk.a();
        bnd bnd = (bnd) a.b(bnd.class);
        if (TextUtils.isEmpty(bnd.a)) {
            this.f.a().a(bmg.b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(bnd.b)) {
            this.f.a().a(bmg.b(a), "Ignoring measurement without client id");
        } else if (!this.b.d().g) {
            double d = bnd.h;
            if (bpq.a(d, bnd.b)) {
                b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                return;
            }
            Map b = bmg.b(a);
            b.put("v", "1");
            b.put("_v", bpc.b);
            b.put("tid", this.c);
            if (this.b.d().f) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Entry entry : b.entrySet()) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append((String) entry.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String) entry.getValue());
                }
                c("Dry run is enabled. GoogleAnalytics would have sent", stringBuilder.toString());
                return;
            }
            Map hashMap = new HashMap();
            bpq.a(hashMap, "uid", bnd.c);
            cqu cqu = (cqu) cqk.a(cqu.class);
            if (cqu != null) {
                bpq.a(hashMap, "an", cqu.a);
                bpq.a(hashMap, "aid", cqu.c);
                bpq.a(hashMap, "av", cqu.b);
                bpq.a(hashMap, "aiid", cqu.d);
            }
            b.put("_s", String.valueOf(this.f.c().a(new bns(0, bnd.b, this.c, !TextUtils.isEmpty(bnd.d), 0, hashMap))));
            this.f.c().a(new bos(this.f.a(), b, cqk.d, true));
        }
    }
}
