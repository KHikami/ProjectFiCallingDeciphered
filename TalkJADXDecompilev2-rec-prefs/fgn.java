package p000;

import android.text.TextUtils;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class fgn extends evz {
    private static final boolean f13005g = false;
    private static final long serialVersionUID = 1;
    private final String f13006h;
    private final boolean f13007i;
    private final int f13008j;
    private final Map<Integer, String> f13009k;

    static {
        kae kae = glk.f15565l;
    }

    private String m15252l() {
        int[] iArr = new int[]{22, 18, 36, 37};
        for (int valueOf : iArr) {
            String str = (String) this.f13009k.get(Integer.valueOf(valueOf));
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    public boolean m15254k() {
        if (this.f13008j == 2 && m15252l() != null) {
            return true;
        }
        return false;
    }

    private fgn(kna kna) {
        boolean z = true;
        int i = 0;
        super(kna, kna.apiHeader);
        if (kna == null || kna.f22414a == null || kna.f22414a.f22582a == null) {
            this.f13006h = null;
            this.f13007i = false;
            this.f13008j = 1;
            this.f13009k = null;
            return;
        }
        this.f13006h = kna.f22414a.f22582a.f23102h;
        if (kna.f22414a.f22582a.f23112r == null) {
            z = false;
        }
        this.f13007i = z;
        if (this.f13007i) {
            this.f13008j = gwb.m1507a(kna.f22414a.f22582a.f23112r.f23168b);
            this.f13009k = new Hashtable();
            ksx[] ksxArr = kna.f22414a.f22582a.f23112r.f23169c;
            int length = ksxArr.length;
            while (i < length) {
                ksx ksx = ksxArr[i];
                if (!TextUtils.isEmpty(ksx.f23182d)) {
                    this.f13009k.put(Integer.valueOf(gwb.m1507a(ksx.f23179a)), ksx.f23182d);
                }
                i++;
            }
            return;
        }
        this.f13008j = 2;
        this.f13009k = null;
    }

    public static evz m15251a(kna kna) {
        if (evz.m8119a(kna.apiHeader)) {
            String valueOf = String.valueOf(kna);
            glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 55).append("OzGetPhotoResponse.processResponse: request failed for ").append(valueOf).toString(), new Object[0]);
            return new ewv((nzf) kna, kna.apiHeader);
        }
        evz fgn = new fgn(kna);
        if (!f13005g) {
            return fgn;
        }
        valueOf = "GetPhotoResponse photoId:";
        String valueOf2 = String.valueOf(fgn.f13006h);
        if (valueOf2.length() != 0) {
            valueOf.concat(valueOf2);
            return fgn;
        }
        valueOf2 = new String(valueOf);
        return fgn;
    }

    public void mo1047a(blo blo, fhc fhc) {
        String str;
        super.mo1047a(blo, fhc);
        if (f13005g) {
            str = "OzGetPhotoResponse.processResponse: retrieved photo/video with id ";
            String valueOf = String.valueOf(this.f13006h);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        str = m15252l();
        if (!TextUtils.isEmpty(this.f13006h) && !TextUtils.isEmpty(str)) {
            blo.m5990a(this.f13006h, str, TimeUnit.DAYS.toMillis(20) + glj.m17956a());
            blf.m5817c(blo);
        }
    }
}
