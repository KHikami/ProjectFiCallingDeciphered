package p000;

import java.security.MessageDigest;

final class ask implements baw<asl> {
    final /* synthetic */ asj f2284a;

    ask(asj asj) {
        this.f2284a = asj;
    }

    public /* synthetic */ Object mo341a() {
        return ask.m3938b();
    }

    private static asl m3938b() {
        try {
            return new asl(MessageDigest.getInstance("SHA-256"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
