package defpackage;

import android.text.TextUtils;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class fgn extends evz {
    private static final boolean g = false;
    private static final long serialVersionUID = 1;
    private final String h;
    private final boolean i;
    private final int j;
    private final Map<Integer, String> k;

    static {
        kae kae = glk.l;
    }

    private String l() {
        int[] iArr = new int[]{22, 18, 36, 37};
        for (int valueOf : iArr) {
            String str = (String) this.k.get(Integer.valueOf(valueOf));
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    public boolean k() {
        if (this.j == 2 && l() != null) {
            return true;
        }
        return false;
    }

    private fgn(kna kna) {
        boolean z = true;
        int i = 0;
        super(kna, kna.apiHeader);
        if (kna == null || kna.a == null || kna.a.a == null) {
            this.h = null;
            this.i = false;
            this.j = 1;
            this.k = null;
            return;
        }
        this.h = kna.a.a.h;
        if (kna.a.a.r == null) {
            z = false;
        }
        this.i = z;
        if (this.i) {
            this.j = gwb.a(kna.a.a.r.b);
            this.k = new Hashtable();
            ksx[] ksxArr = kna.a.a.r.c;
            int length = ksxArr.length;
            while (i < length) {
                ksx ksx = ksxArr[i];
                if (!TextUtils.isEmpty(ksx.d)) {
                    this.k.put(Integer.valueOf(gwb.a(ksx.a)), ksx.d);
                }
                i++;
            }
            return;
        }
        this.j = 2;
        this.k = null;
    }

    public static evz a(kna kna) {
        if (evz.a(kna.apiHeader)) {
            String valueOf = String.valueOf(kna);
            glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 55).append("OzGetPhotoResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
            return new ewv((nzf) kna, kna.apiHeader);
        }
        evz fgn = new fgn(kna);
        if (!g) {
            return fgn;
        }
        valueOf = "GetPhotoResponse photoId:";
        String valueOf2 = String.valueOf(fgn.h);
        if (valueOf2.length() != 0) {
            valueOf.concat(valueOf2);
            return fgn;
        }
        valueOf2 = new String(valueOf);
        return fgn;
    }

    public void a(blo blo, fhc fhc) {
        String str;
        super.a(blo, fhc);
        if (g) {
            str = "OzGetPhotoResponse.processResponse: retrieved photo/video with id ";
            String valueOf = String.valueOf(this.h);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        str = l();
        if (!TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(str)) {
            blo.a(this.h, str, TimeUnit.DAYS.toMillis(20) + glj.a());
            blf.c(blo);
        }
    }
}
