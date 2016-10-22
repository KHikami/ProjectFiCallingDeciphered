package defpackage;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: jao */
final class jao implements jan {
    private static final Logger a;
    private final ConcurrentHashMap<String, jbg> b;
    private final ConcurrentHashMap<Integer, jbg> c;
    private final String d;
    private final jal e;

    static {
        a = Logger.getLogger(jao.class.getName());
    }

    private jao(String str, jal jal) {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = str;
        this.e = jal;
    }

    public jao(jal jal) {
        this("/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto", jal);
    }

    public jbg a(String str) {
        jbg jbg = (jbg) this.b.get(str);
        return jbg != null ? jbg : jao.a(str, this.b, this.d, this.e);
    }

    public jbg a(int i) {
        jbg jbg = (jbg) this.c.get(Integer.valueOf(i));
        if (jbg != null) {
            return jbg;
        }
        int i2;
        List list = (List) gwb.aB().get(Integer.valueOf(i));
        if (list.size() == 1 && "001".equals(list.get(0))) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            return jao.a(Integer.valueOf(i), this.c, this.d, this.e);
        }
        return null;
    }

    private static <T> jbg a(T t, ConcurrentHashMap<T, jbg> concurrentHashMap, String str, jal jal) {
        String valueOf = String.valueOf(String.valueOf(str));
        String valueOf2 = String.valueOf(String.valueOf(t));
        valueOf = new StringBuilder((valueOf.length() + 1) + valueOf2.length()).append(valueOf).append("_").append(valueOf2).toString();
        InputStream a = jal.a(valueOf);
        if (a == null) {
            String str2 = "missing metadata: ";
            valueOf = String.valueOf(valueOf);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        jbg[] jbgArr = jam.a(a, 16384).a;
        if (jbgArr.length == 0) {
            str2 = "empty metadata: ";
            valueOf = String.valueOf(valueOf);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        if (jbgArr.length > 1) {
            Logger logger = a;
            Level level = Level.WARNING;
            String str3 = "invalid metadata (too many entries): ";
            valueOf = String.valueOf(valueOf);
            logger.log(level, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        jbg jbg = jbgArr[0];
        jbg jbg2 = (jbg) concurrentHashMap.putIfAbsent(t, jbg);
        if (jbg2 != null) {
            return jbg2;
        }
        return jbg;
    }
}
