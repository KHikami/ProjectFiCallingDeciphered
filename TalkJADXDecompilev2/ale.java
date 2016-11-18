package defpackage;

import android.content.Intent;

public final class ale extends alx {
    private Intent b;

    public ale(aln aln) {
        super(aln);
    }

    public String getMessage() {
        if (this.b != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
