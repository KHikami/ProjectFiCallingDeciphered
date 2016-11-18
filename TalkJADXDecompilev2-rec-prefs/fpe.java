package p000;

import java.io.Serializable;

public final class fpe extends foz implements Serializable {
    private static final long serialVersionUID = 1;
    public final String f13653i;
    public final int f13654j;

    protected fpe(nzr nzr, oar oar) {
        super(nzr, null, null, null, null, "hangouts/gv_voicemail");
        this.f13653i = oar.X;
        this.f13654j = Integer.parseInt(oar.G);
        if (fox.f13616d) {
            String str = this.f13653i;
            new StringBuilder(String.valueOf(str).length() + 57).append("Received voicemail with media key: ").append(str).append(" duration: ").append(this.f13654j);
        }
    }

    public String toString() {
        String str = "mediaKey: ";
        String valueOf = String.valueOf(this.f13653i);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
