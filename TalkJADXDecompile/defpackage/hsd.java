package defpackage;

/* renamed from: hsd */
public class hsd {
    public gum<hse> a(gui gui, long j) {
        if (gwb.ao()) {
            gwb.b("loadContactThumbnailByContactId", Long.valueOf(j));
        }
        return gui.a(new hir(this, gui, j));
    }

    public gum<hse> a(gui gui, String str, String str2, int i, int i2) {
        if (gwb.ao()) {
            gwb.b("loadOwnerAvatar", str, str2, Integer.valueOf(i), Integer.valueOf(1));
        }
        return gui.a(new his(this, gui, str, str2, i, 1));
    }

    @Deprecated
    public gum a(gui gui, String str, String str2) {
        return b(gui, str, str2);
    }

    public gum<hse> b(gui gui, String str, String str2) {
        if (gwb.ao()) {
            gwb.b("loadOwnerCoverPhoto", str, str2);
        }
        return gui.a(new hit(this, gui, str, str2));
    }
}
