package p000;

import java.util.ArrayList;
import java.util.List;

final class dxd implements dwr {
    dxd() {
    }

    public boolean mo1743a(bxt bxt, boolean z) {
        return !z && (bxt == bxt.HANGOUTS_MESSAGE || bxt == bxt.AUDIO_CALL || bxt == bxt.VIDEO_CALL);
    }

    public boolean mo1741a(bjg bjg, bxt bxt, boolean z) {
        if (z) {
            if (bjg.mo568b().isEmpty()) {
                return false;
            }
            return true;
        } else if (bxt == bxt.SMS_MESSAGE || bxt == bxt.AUDIO_CALL) {
            return true;
        } else {
            return false;
        }
    }

    public boolean mo1742a(bjg bjg, boolean z) {
        return z && bjg.mo568b().isEmpty() && !bjg.mo570d().isEmpty();
    }

    public List<bjd> mo1744b(bjg bjg, bxt bxt, boolean z) {
        List<bjd> arrayList = new ArrayList();
        if (mo1743a(bxt, z)) {
            for (bjf bjf : bjg.mo576j()) {
                if (!bjf.m5377g()) {
                    arrayList.add(bjf);
                }
            }
        }
        if (mo1741a(bjg, bxt, z)) {
            for (bjo add : bjg.mo568b()) {
                arrayList.add(add);
            }
        }
        if (mo1742a(bjg, z)) {
            for (bje add2 : bjg.mo570d()) {
                arrayList.add(add2);
            }
        }
        return arrayList;
    }
}
