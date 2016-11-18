package p000;

import java.io.IOException;

public final class nwa extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    nwa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    nwa(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    nwa(String str, Throwable th) {
        String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        String valueOf2 = String.valueOf(str);
        super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
    }
}
