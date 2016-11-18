package p000;

public class hrv {
    public gum<hrz> m20733a(gui gui, hry hry) {
        if (gwb.ao()) {
            gwb.m2045b("loadOwners", hry);
        }
        if (hry == null) {
            hry = hry.f17150a;
        }
        return gui.mo2510a(new hil(this, gui, hry));
    }

    public gum<hsb> m20735a(gui gui, String str, String str2, hsa hsa) {
        if (gwb.ao()) {
            gwb.m2045b("loadPeople", str, null, hsa);
        }
        return gui.mo2510a(new hin(this, gui, str, null, hsa));
    }

    public gum<hrx> m20734a(gui gui, String str, String str2, hrw hrw) {
        if (gwb.ao()) {
            gwb.m2045b("loadAggregatedPeople", str, null, hrw);
        }
        return gui.mo2510a(new hip(this, gui, str, null, hrw));
    }
}
