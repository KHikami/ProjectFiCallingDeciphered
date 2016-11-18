package p000;

import java.io.Serializable;

public final class fpa extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final String f13633i;

    protected fpa(nzr nzr, oar oar) {
        super(nzr, null, null, null, null, "audio/*");
        this.f13633i = oar.X;
        if (fox.f13616d) {
            String str = "Received audio attachment with media key: ";
            String valueOf = String.valueOf(this.f13633i);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    public String toString() {
        String str = "mediaKey: ";
        String valueOf = String.valueOf(this.f13633i);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
