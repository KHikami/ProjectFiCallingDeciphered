package p000;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jao implements jan {
    private static final Logger f19564a = Logger.getLogger(jao.class.getName());
    private final ConcurrentHashMap<String, jbg> f19565b;
    private final ConcurrentHashMap<Integer, jbg> f19566c;
    private final String f19567d;
    private final jal f19568e;

    private jao(String str, jal jal) {
        this.f19565b = new ConcurrentHashMap();
        this.f19566c = new ConcurrentHashMap();
        this.f19567d = str;
        this.f19568e = jal;
    }

    public jao(jal jal) {
        this("/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto", jal);
    }

    public jbg mo3430a(String str) {
        jbg jbg = (jbg) this.f19565b.get(str);
        return jbg != null ? jbg : jao.m23662a(str, this.f19565b, this.f19567d, this.f19568e);
    }

    public jbg mo3429a(int i) {
        jbg jbg = (jbg) this.f19566c.get(Integer.valueOf(i));
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
            return jao.m23662a(Integer.valueOf(i), this.f19566c, this.f19567d, this.f19568e);
        }
        return null;
    }

    private static <T> jbg m23662a(T t, ConcurrentHashMap<T, jbg> concurrentHashMap, String str, jal jal) {
        String valueOf = String.valueOf(String.valueOf(str));
        String valueOf2 = String.valueOf(String.valueOf(t));
        valueOf = new StringBuilder((valueOf.length() + 1) + valueOf2.length()).append(valueOf).append("_").append(valueOf2).toString();
        InputStream a = jal.m23656a(valueOf);
        if (a == null) {
            String str2 = "missing metadata: ";
            valueOf = String.valueOf(valueOf);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        jbg[] jbgArr = jam.m23658a(a, 16384).f19716a;
        if (jbgArr.length == 0) {
            str2 = "empty metadata: ";
            valueOf = String.valueOf(valueOf);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        if (jbgArr.length > 1) {
            Logger logger = f19564a;
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
