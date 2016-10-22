import android.content.SharedPreferences.Editor;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

public class bot extends bpb {
    static bot a;
    private static String b;
    private static String c;

    static {
        b = "3";
        c = "01VDIWEA?";
    }

    public bot(bnp bnp) {
        super(bnp);
    }

    private static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object l = obj instanceof Integer ? new Long((long) ((Integer) obj).intValue()) : obj;
        if (!(l instanceof Long)) {
            return l instanceof Boolean ? String.valueOf(l) : l instanceof Throwable ? l.getClass().getCanonicalName() : "-";
        } else {
            if (Math.abs(((Long) l).longValue()) < 100) {
                return String.valueOf(l);
            }
            String str = String.valueOf(l).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(((Long) l).longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return stringBuilder.toString();
        }
    }

    protected final void a() {
        synchronized (bot.class) {
            a = this;
        }
    }

    public final void a(bos bos, String str) {
        d("Discarding hit. " + str, bos != null ? bos.toString() : "no hit data");
    }

    public final void a(Map map, String str) {
        Object stringBuilder;
        if (map != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append(',');
                }
                stringBuilder2.append((String) entry.getKey());
                stringBuilder2.append('=');
                stringBuilder2.append((String) entry.getValue());
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "no hit data";
        }
        d("Discarding hit. " + str, stringBuilder);
    }

    public final synchronized void b(int i, String str, Object obj, Object obj2, Object obj3) {
        int i2;
        int length;
        buf.A((Object) str);
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (i2 >= c.length()) {
            length = c.length() - 1;
        } else {
            length = i2;
        }
        char c = h().a() ? btq.a ? 'P' : 'C' : btq.a ? 'p' : 'c';
        String str2 = b + c.charAt(length) + c + bpc.a + ":" + bno.a(str, a(obj), a(obj2), a(obj3));
        if (str2.length() > 1024) {
            str2 = str2.substring(0, 1024);
        }
        bnp bnp = this.f;
        box box = (bnp.g == null || !bnp.g.n()) ? null : bnp.g;
        if (box != null) {
            String str3;
            boy boy = box.b;
            if (boy.b() == 0) {
                boy.a();
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            synchronized (boy) {
                long j = boy.b.a.getLong(boy.c(), 0);
                if (j <= 0) {
                    Editor edit = boy.b.a.edit();
                    edit.putString(boy.d(), str3);
                    edit.putLong(boy.c(), 1);
                    edit.apply();
                } else {
                    Object obj4;
                    if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / (1 + j)) {
                        obj4 = 1;
                    } else {
                        obj4 = null;
                    }
                    Editor edit2 = boy.b.a.edit();
                    if (obj4 != null) {
                        edit2.putString(boy.d(), str3);
                    }
                    edit2.putLong(boy.c(), j + 1);
                    edit2.apply();
                }
            }
        }
    }
}
