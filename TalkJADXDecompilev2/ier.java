package defpackage;

import com.google.android.gms.common.api.Status;

public final class ier implements ied {
    public static final iev<ied, Status> a = new ies();
    private final Status b;

    public ier(Status status) {
        this.b = status;
    }

    public boolean a() {
        return this.b.d();
    }

    public String toString() {
        return this.b.toString();
    }
}
