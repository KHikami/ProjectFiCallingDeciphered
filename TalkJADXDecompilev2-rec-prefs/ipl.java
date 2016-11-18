package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ipl implements ioq {
    private static final int[] f18668a = new int[]{100, 103, 106, 109, 112};
    private static final int[] f18669b = new int[]{101, 104, 107, 110, 113};
    private static final int[] f18670c = new int[]{102, 105, 108, 111, 114};
    private final ioq f18671d;
    private final iir f18672e;
    private final ipn f18673f;
    private final long f18674g;
    private boolean f18675h;
    private boolean f18676i;
    private final Map<Long, Integer> f18677j;
    private final long[] f18678k;
    private final long[] f18679l;
    private final long[] f18680m;

    public ipl(Context context, ioq ioq, String str, String str2, boolean z) {
        this(ioq, new ipo(context, str, str2), new ipn(), 40000, true);
    }

    private ipl(ioq ioq, iir iir, ipn ipn, long j, boolean z) {
        this.f18671d = ioq;
        this.f18672e = iir;
        this.f18673f = ipn;
        this.f18674g = 40000;
        this.f18675h = false;
        this.f18676i = false;
        this.f18677j = new HashMap();
        this.f18678k = new long[5];
        Arrays.fill(this.f18678k, -1);
        this.f18679l = new long[5];
        Arrays.fill(this.f18679l, -1);
        this.f18680m = new long[5];
        if (z) {
            this.f18680m[1] = 1;
            this.f18680m[4] = 1;
            return;
        }
        this.f18680m[1] = 1;
        this.f18680m[0] = 1;
        this.f18680m[2] = 1;
        this.f18680m[3] = 1;
    }

    public void mo3258a(long j, String str) {
        if (itx.m23283a()) {
            new StringBuilder(String.valueOf(str).length() + 51).append("Request starting: ").append(str).append(", requestId: ").append(j);
        }
        int i = str.startsWith("hangout_participants/add") ? 0 : str.startsWith("media_sessions/add") ? 1 : str.startsWith("media_sources/add") ? 2 : str.startsWith("media_streams/add") ? 3 : str.startsWith("hangouts/bulk") ? 4 : -1;
        if (i != -1) {
            this.f18677j.put(Long.valueOf(j), Integer.valueOf(i));
            if (this.f18678k[i] == -1) {
                this.f18678k[i] = SystemClock.elapsedRealtime();
            }
            if (this.f18674g > 0 && !this.f18675h) {
                gwb.m1864a(new ipm(this), this.f18674g);
                this.f18675h = true;
            }
        }
        this.f18671d.mo3258a(j, str);
    }

    public void mo3257a(long j) {
        if (itx.m23283a()) {
            new StringBuilder(36).append("Request failed: ").append(j);
        }
        m22852a(j, false);
        this.f18671d.mo3257a(j);
    }

    public void mo3259a(long j, byte[] bArr) {
        if (itx.m23283a()) {
            new StringBuilder(39).append("Request completed: ").append(j);
        }
        m22852a(j, true);
        this.f18671d.mo3259a(j, bArr);
    }

    private void m22852a(long j, boolean z) {
        Object obj = null;
        Integer num = (Integer) this.f18677j.remove(Long.valueOf(j));
        if (num != null && this.f18680m[num.intValue()] > 0) {
            this.f18679l[num.intValue()] = SystemClock.elapsedRealtime();
            if (z) {
                long[] jArr = this.f18680m;
                int intValue = num.intValue();
                jArr[intValue] = jArr[intValue] - 1;
                for (long j2 : this.f18680m) {
                    if (j2 > 0) {
                        break;
                    }
                }
                obj = 1;
                if (obj != null) {
                    m22853a();
                }
            }
        }
    }

    void m22853a() {
        if (!this.f18676i) {
            for (int i = 0; i < 5; i++) {
                if (this.f18678k[i] != -1) {
                    this.f18672e.mo1402a(f18668a[i], this.f18678k[i]);
                    if (this.f18680m[i] == 0) {
                        this.f18672e.mo1402a(f18669b[i], this.f18679l[i]);
                    } else {
                        long elapsedRealtime;
                        if (this.f18679l[i] == -1) {
                            elapsedRealtime = SystemClock.elapsedRealtime();
                        } else {
                            elapsedRealtime = this.f18679l[i];
                        }
                        this.f18672e.mo1402a(f18670c[i], elapsedRealtime);
                    }
                }
            }
            this.f18672e.mo1401a();
            this.f18676i = true;
        }
    }
}
