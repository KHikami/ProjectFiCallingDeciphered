package p000;

import android.content.Intent;

public final class ale extends alx {
    private Intent f1181b;

    public ale(aln aln) {
        super(aln);
    }

    public String getMessage() {
        if (this.f1181b != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
