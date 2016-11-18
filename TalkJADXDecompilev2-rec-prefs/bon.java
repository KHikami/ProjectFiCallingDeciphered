package p000;

import java.io.File;

public final class bon extends bnn {
    private final int f4105i;

    public bon(int i, gkc gkc, String str, bnq bnq, boolean z, Object obj) {
        super(gkc, bnq, true, obj);
        this.f4105i = i;
        if (str == null) {
            return;
        }
        if (new File(str).exists()) {
            this.f.m5537a(str);
            return;
        }
        String str2 = "Babel_StickerRequest";
        String str3 = "Missing cache file:";
        String valueOf = String.valueOf(str);
        glk.m17981d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
    }

    public boolean mo599f() {
        return true;
    }

    public File mo635j() {
        return new File(gwb.m2233h(gwb.m1400H()));
    }

    public void mo634a(String str) {
        File file;
        String str2 = "Babel_StickerRequest";
        String str3 = "fileSaved fileName:";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            valueOf = str3.concat(valueOf);
        } else {
            valueOf = new String(str3);
        }
        glk.m17979c(str2, valueOf, new Object[0]);
        blo blo = new blo(gwb.m1400H(), this.f4105i);
        eyi ae = blo.ae(this.f.m5543p());
        if (!(ae == null || ae.f12522c == null || ae.f12522c.equals(str))) {
            String str4;
            if (!ae.f12522c.contains("sticker_cache") || ae.f12522c.contains(gwb.m2233h(gwb.m1400H()))) {
                file = new File(ae.f12522c);
                if (file.exists() && !file.delete()) {
                    str4 = "Babel_StickerRequest";
                    String str5 = "Couldn't delete file:";
                    valueOf = String.valueOf(ae.f12522c);
                    if (valueOf.length() != 0) {
                        valueOf = str5.concat(valueOf);
                    } else {
                        valueOf = new String(str5);
                    }
                    glk.m17982e(str4, valueOf, new Object[0]);
                }
                str3 = ae.f12522c;
                glk.m17982e("Babel_StickerRequest", new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str3).length()).append("Deleted old file. fileName=").append(str).append(" oldFileName=").append(str3).toString(), new Object[0]);
            } else {
                str3 = ae.f12522c;
                str4 = String.valueOf(gwb.m2233h(gwb.m1400H()));
                glk.m17982e("Babel_StickerRequest", new StringBuilder((String.valueOf(str3).length() + 38) + String.valueOf(str4).length()).append("path change detected. oldPath:").append(str3).append(" not in:").append(str4).toString(), new Object[0]);
            }
        }
        if (!blo.m6088m(str, this.f.m5543p())) {
            file = new File(str);
            if (file.exists() && !file.delete()) {
                str2 = "Babel_StickerRequest";
                str3 = "Couldn't delete file:";
                valueOf = String.valueOf(str);
                glk.m17982e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            }
            str2 = String.valueOf(this.f.m5543p());
            glk.m17981d("Babel_StickerRequest", new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(str2).length()).append("Failed to update sticker fileName=").append(str).append(" photoId=").append(str2).toString(), new Object[0]);
        }
    }
}
