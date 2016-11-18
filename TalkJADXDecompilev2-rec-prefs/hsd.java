package p000;

public class hsd {
    public gum<hse> m20761a(gui gui, long j) {
        if (gwb.ao()) {
            gwb.m2045b("loadContactThumbnailByContactId", Long.valueOf(j));
        }
        return gui.mo2510a(new hir(this, gui, j));
    }

    public gum<hse> m20763a(gui gui, String str, String str2, int i, int i2) {
        if (gwb.ao()) {
            gwb.m2045b("loadOwnerAvatar", str, str2, Integer.valueOf(i), Integer.valueOf(1));
        }
        return gui.mo2510a(new his(this, gui, str, str2, i, 1));
    }

    @Deprecated
    public gum m20762a(gui gui, String str, String str2) {
        return m20764b(gui, str, str2);
    }

    public gum<hse> m20764b(gui gui, String str, String str2) {
        if (gwb.ao()) {
            gwb.m2045b("loadOwnerCoverPhoto", str, str2);
        }
        return gui.mo2510a(new hit(this, gui, str, str2));
    }
}
