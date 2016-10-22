package defpackage;

/* renamed from: hrv */
public class hrv {
    public gum<hrz> a(gui gui, hry hry) {
        if (gwb.ao()) {
            gwb.b("loadOwners", hry);
        }
        if (hry == null) {
            hry = hry.a;
        }
        return gui.a(new hil(this, gui, hry));
    }

    public gum<hsb> a(gui gui, String str, String str2, hsa hsa) {
        if (gwb.ao()) {
            gwb.b("loadPeople", str, null, hsa);
        }
        return gui.a(new hin(this, gui, str, null, hsa));
    }

    public gum<hrx> a(gui gui, String str, String str2, hrw hrw) {
        if (gwb.ao()) {
            gwb.b("loadAggregatedPeople", str, null, hrw);
        }
        return gui.a(new hip(this, gui, str, null, hrw));
    }
}
