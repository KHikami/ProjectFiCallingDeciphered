package defpackage;

import java.security.MessageDigest;

final class ask implements baw<asl> {
    final /* synthetic */ asj a;

    ask(asj asj) {
        this.a = asj;
    }

    public /* synthetic */ Object a() {
        return ask.b();
    }

    private static asl b() {
        try {
            return new asl(MessageDigest.getInstance("SHA-256"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
