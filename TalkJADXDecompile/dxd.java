import java.util.ArrayList;
import java.util.List;

final class dxd implements dwr {
    dxd() {
    }

    public boolean a(bxt bxt, boolean z) {
        return !z && (bxt == bxt.HANGOUTS_MESSAGE || bxt == bxt.AUDIO_CALL || bxt == bxt.VIDEO_CALL);
    }

    public boolean a(bjg bjg, bxt bxt, boolean z) {
        if (z) {
            if (bjg.b().isEmpty()) {
                return false;
            }
            return true;
        } else if (bxt == bxt.SMS_MESSAGE || bxt == bxt.AUDIO_CALL) {
            return true;
        } else {
            return false;
        }
    }

    public boolean a(bjg bjg, boolean z) {
        return z && bjg.b().isEmpty() && !bjg.d().isEmpty();
    }

    public List<bjd> b(bjg bjg, bxt bxt, boolean z) {
        List<bjd> arrayList = new ArrayList();
        if (a(bxt, z)) {
            for (bjf bjf : bjg.j()) {
                if (!bjf.g()) {
                    arrayList.add(bjf);
                }
            }
        }
        if (a(bjg, bxt, z)) {
            for (bjo add : bjg.b()) {
                arrayList.add(add);
            }
        }
        if (a(bjg, z)) {
            for (bje add2 : bjg.d()) {
                arrayList.add(add2);
            }
        }
        return arrayList;
    }
}
