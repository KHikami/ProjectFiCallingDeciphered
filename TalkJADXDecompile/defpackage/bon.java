package defpackage;

import java.io.File;

/* renamed from: bon */
public final class bon extends bnn {
    private final int i;

    public bon(int i, gkc gkc, String str, bnq bnq, boolean z, Object obj) {
        super(gkc, bnq, true, obj);
        this.i = i;
        if (str == null) {
            return;
        }
        if (new File(str).exists()) {
            this.f.a(str);
            return;
        }
        String str2 = "Babel_StickerRequest";
        String str3 = "Missing cache file:";
        String valueOf = String.valueOf(str);
        glk.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
    }

    public boolean f() {
        return true;
    }

    public File j() {
        return new File(gwb.h(gwb.H()));
    }

    public void a(String str) {
        File file;
        String str2 = "Babel_StickerRequest";
        String str3 = "fileSaved fileName:";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            valueOf = str3.concat(valueOf);
        } else {
            valueOf = new String(str3);
        }
        glk.c(str2, valueOf, new Object[0]);
        blo blo = new blo(gwb.H(), this.i);
        eyi ae = blo.ae(this.f.p());
        if (!(ae == null || ae.c == null || ae.c.equals(str))) {
            String str4;
            if (!ae.c.contains("sticker_cache") || ae.c.contains(gwb.h(gwb.H()))) {
                file = new File(ae.c);
                if (file.exists() && !file.delete()) {
                    str4 = "Babel_StickerRequest";
                    String str5 = "Couldn't delete file:";
                    valueOf = String.valueOf(ae.c);
                    if (valueOf.length() != 0) {
                        valueOf = str5.concat(valueOf);
                    } else {
                        valueOf = new String(str5);
                    }
                    glk.e(str4, valueOf, new Object[0]);
                }
                str3 = ae.c;
                glk.e("Babel_StickerRequest", new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str3).length()).append("Deleted old file. fileName=").append(str).append(" oldFileName=").append(str3).toString(), new Object[0]);
            } else {
                str3 = ae.c;
                str4 = String.valueOf(gwb.h(gwb.H()));
                glk.e("Babel_StickerRequest", new StringBuilder((String.valueOf(str3).length() + 38) + String.valueOf(str4).length()).append("path change detected. oldPath:").append(str3).append(" not in:").append(str4).toString(), new Object[0]);
            }
        }
        if (!blo.m(str, this.f.p())) {
            file = new File(str);
            if (file.exists() && !file.delete()) {
                str2 = "Babel_StickerRequest";
                str3 = "Couldn't delete file:";
                valueOf = String.valueOf(str);
                glk.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            }
            str2 = String.valueOf(this.f.p());
            glk.d("Babel_StickerRequest", new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(str2).length()).append("Failed to update sticker fileName=").append(str).append(" photoId=").append(str2).toString(), new Object[0]);
        }
    }
}
