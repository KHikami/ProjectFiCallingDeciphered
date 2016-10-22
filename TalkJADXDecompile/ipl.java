import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ipl implements ioq {
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private final ioq d;
    private final iir e;
    private final ipn f;
    private final long g;
    private boolean h;
    private boolean i;
    private final Map<Long, Integer> j;
    private final long[] k;
    private final long[] l;
    private final long[] m;

    static {
        a = new int[]{100, 103, 106, 109, 112};
        b = new int[]{101, 104, 107, 110, 113};
        c = new int[]{102, 105, 108, 111, 114};
    }

    public ipl(Context context, ioq ioq, String str, String str2, boolean z) {
        this(ioq, new ipo(context, str, str2), new ipn(), 40000, true);
    }

    private ipl(ioq ioq, iir iir, ipn ipn, long j, boolean z) {
        this.d = ioq;
        this.e = iir;
        this.f = ipn;
        this.g = 40000;
        this.h = false;
        this.i = false;
        this.j = new HashMap();
        this.k = new long[5];
        Arrays.fill(this.k, -1);
        this.l = new long[5];
        Arrays.fill(this.l, -1);
        this.m = new long[5];
        if (z) {
            this.m[1] = 1;
            this.m[4] = 1;
            return;
        }
        this.m[1] = 1;
        this.m[0] = 1;
        this.m[2] = 1;
        this.m[3] = 1;
    }

    public void a(long j, String str) {
        if (itx.a()) {
            new StringBuilder(String.valueOf(str).length() + 51).append("Request starting: ").append(str).append(", requestId: ").append(j);
        }
        int i = str.startsWith("hangout_participants/add") ? 0 : str.startsWith("media_sessions/add") ? 1 : str.startsWith("media_sources/add") ? 2 : str.startsWith("media_streams/add") ? 3 : str.startsWith("hangouts/bulk") ? 4 : -1;
        if (i != -1) {
            this.j.put(Long.valueOf(j), Integer.valueOf(i));
            if (this.k[i] == -1) {
                this.k[i] = SystemClock.elapsedRealtime();
            }
            if (this.g > 0 && !this.h) {
                gwb.a(new ipm(this), this.g);
                this.h = true;
            }
        }
        this.d.a(j, str);
    }

    public void a(long j) {
        if (itx.a()) {
            new StringBuilder(36).append("Request failed: ").append(j);
        }
        a(j, false);
        this.d.a(j);
    }

    public void a(long j, byte[] bArr) {
        if (itx.a()) {
            new StringBuilder(39).append("Request completed: ").append(j);
        }
        a(j, true);
        this.d.a(j, bArr);
    }

    private void a(long j, boolean z) {
        Object obj = null;
        Integer num = (Integer) this.j.remove(Long.valueOf(j));
        if (num != null && this.m[num.intValue()] > 0) {
            this.l[num.intValue()] = SystemClock.elapsedRealtime();
            if (z) {
                long[] jArr = this.m;
                int intValue = num.intValue();
                jArr[intValue] = jArr[intValue] - 1;
                for (long j2 : this.m) {
                    if (j2 > 0) {
                        break;
                    }
                }
                obj = 1;
                if (obj != null) {
                    a();
                }
            }
        }
    }

    void a() {
        if (!this.i) {
            for (int i = 0; i < 5; i++) {
                if (this.k[i] != -1) {
                    this.e.a(a[i], this.k[i]);
                    if (this.m[i] == 0) {
                        this.e.a(b[i], this.l[i]);
                    } else {
                        long elapsedRealtime;
                        if (this.l[i] == -1) {
                            elapsedRealtime = SystemClock.elapsedRealtime();
                        } else {
                            elapsedRealtime = this.l[i];
                        }
                        this.e.a(c[i], elapsedRealtime);
                    }
                }
            }
            this.e.a();
            this.i = true;
        }
    }
}
