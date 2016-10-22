package defpackage;

import java.io.Serializable;
import nzr;
import oar;

/* renamed from: fpa */
public final class fpa extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final String i;

    protected fpa(nzr nzr, oar oar) {
        super(nzr, null, null, null, null, "audio/*");
        this.i = oar.X;
        if (fox.d) {
            String str = "Received audio attachment with media key: ";
            String valueOf = String.valueOf(this.i);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    public String toString() {
        String str = "mediaKey: ";
        String valueOf = String.valueOf(this.i);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
