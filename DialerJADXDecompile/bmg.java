import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
        this.d = a(this.c);
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
            map.put(str, a(d));
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
                    obj = d.doubleValue() != 0.0d ? a(d.doubleValue()) : null;
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
            a(hashMap, "t", bnd.a);
            a(hashMap, "cid", bnd.b);
            a(hashMap, "uid", bnd.c);
            a(hashMap, "sc", bnd.f);
            a(hashMap, "sf", bnd.h);
            a(hashMap, "ni", bnd.g);
            a(hashMap, "adid", bnd.d);
            a(hashMap, "ate", bnd.e);
        }
        cra cra = (cra) cqk.a(cra.class);
        if (cra != null) {
            a(hashMap, "cd", cra.a);
            a(hashMap, "a", (double) cra.b);
            a(hashMap, "dr", cra.c);
        }
        cqy cqy = (cqy) cqk.a(cqy.class);
        if (cqy != null) {
            a(hashMap, "ec", cqy.a);
            a(hashMap, "ea", cqy.b);
            a(hashMap, "el", cqy.c);
            a(hashMap, "ev", (double) cqy.d);
        }
        cqv cqv = (cqv) cqk.a(cqv.class);
        if (cqv != null) {
            a(hashMap, "cn", cqv.a);
            a(hashMap, "cs", cqv.b);
            a(hashMap, "cm", cqv.c);
            a(hashMap, "ck", cqv.d);
            a(hashMap, "cc", cqv.e);
            a(hashMap, "ci", cqv.f);
            a(hashMap, "anid", cqv.g);
            a(hashMap, "gclid", cqv.h);
            a(hashMap, "dclid", cqv.i);
            a(hashMap, "aclid", cqv.j);
        }
        cqz cqz = (cqz) cqk.a(cqz.class);
        if (cqz != null) {
            a(hashMap, "exd", cqz.a);
            a(hashMap, "exf", cqz.b);
        }
        crb crb = (crb) cqk.a(crb.class);
        if (crb != null) {
            a(hashMap, "sn", crb.a);
            a(hashMap, "sa", crb.b);
            a(hashMap, "st", crb.c);
        }
        crc crc = (crc) cqk.a(crc.class);
        if (crc != null) {
            a(hashMap, "utv", crc.a);
            a(hashMap, "utt", (double) crc.b);
            a(hashMap, "utc", crc.c);
            a(hashMap, "utl", crc.d);
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
                    hashMap.put(p, a(((Double) entry22.getValue()).doubleValue()));
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
            a(hashMap, "ul", cqw.a);
            a(hashMap, "sd", (double) cqw.b);
            a(hashMap, "sr", cqw.c, cqw.d);
            a(hashMap, "vp", cqw.e, cqw.f);
        }
        cqu cqu = (cqu) cqk.a(cqu.class);
        if (cqu != null) {
            a(hashMap, "an", cqu.a);
            a(hashMap, "aid", cqu.c);
            a(hashMap, "aiid", cqu.d);
            a(hashMap, "av", cqu.b);
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
            this.f.a().a(b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(bnd.b)) {
            this.f.a().a(b(a), "Ignoring measurement without client id");
        } else if (!this.b.d().g) {
            double d = bnd.h;
            if (bpq.a(d, bnd.b)) {
                b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                return;
            }
            Map b = b(a);
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
