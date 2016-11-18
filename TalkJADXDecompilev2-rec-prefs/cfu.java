package p000;

import java.util.ArrayList;
import java.util.Collection;

final class cfu implements Runnable {
    final /* synthetic */ che f5208a;

    cfu(che che) {
        this.f5208a = che;
    }

    public void run() {
        bpy bpy = this.f5208a.f5313a.bD;
        bxt bxt = bxt.SMS_MESSAGE;
        cdr cdr = this.f5208a.f5313a;
        Collection arrayList = new ArrayList();
        for (edk edk : cdr.f5106i.mo954k().m5592c()) {
            arrayList.add(bcn.m4888a(fbw.m14929a(edk.f11213b, edk.f11214c, edk.f11218g), edk.f11216e, edk.f11219h));
        }
        bpy.mo669a(bxt, arrayList);
    }
}
