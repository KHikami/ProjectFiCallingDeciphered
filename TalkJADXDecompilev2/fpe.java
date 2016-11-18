package defpackage;

import java.io.Serializable;

public final class fpe extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final String i;
    public final int j;

    protected fpe(nzr nzr, oar oar) {
        super(nzr, null, null, null, null, "hangouts/gv_voicemail");
        this.i = oar.X;
        this.j = Integer.parseInt(oar.G);
        if (fox.d) {
            String str = this.i;
            new StringBuilder(String.valueOf(str).length() + 57).append("Received voicemail with media key: ").append(str).append(" duration: ").append(this.j);
        }
    }

    public String toString() {
        String str = "mediaKey: ";
        String valueOf = String.valueOf(this.i);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
