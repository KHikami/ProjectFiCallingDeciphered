package defpackage;

final class ayv implements ayo {
    final /* synthetic */ ayu a;

    ayv(ayu ayu) {
        this.a = ayu;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.a);
        return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append("{fragment=").append(valueOf2).append("}").toString();
    }
}
