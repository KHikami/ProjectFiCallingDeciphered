package io.grpc.internal;

final class ct {
    final /* synthetic */ cs a;

    ct(cs csVar) {
        this.a = csVar;
    }

    public String toString() {
        String str = "SerializingExecutor lock: ";
        String valueOf = String.valueOf(super.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
