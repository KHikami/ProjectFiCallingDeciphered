package defpackage;

import java.util.ArrayList;
import java.util.Collection;

final class cfu implements Runnable {
    final /* synthetic */ che a;

    cfu(che che) {
        this.a = che;
    }

    public void run() {
        bpy bpy = this.a.a.bD;
        bxt bxt = bxt.SMS_MESSAGE;
        cdr cdr = this.a.a;
        Collection arrayList = new ArrayList();
        for (edk edk : cdr.i.k().c()) {
            arrayList.add(bcn.a(fbw.a(edk.b, edk.c, edk.g), edk.e, edk.h));
        }
        bpy.a(bxt, arrayList);
    }
}
