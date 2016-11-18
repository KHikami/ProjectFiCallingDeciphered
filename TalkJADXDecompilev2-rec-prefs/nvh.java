package p000;

public abstract class nvh<MessageType extends nvh<MessageType, BuilderType>, BuilderType extends nvi<MessageType, BuilderType>> implements nxi {
    public int f28704a = 0;

    public nvn mo3947a() {
        try {
            nvs b = nvn.m33388b(m33380l());
            m33376a(b.b());
            return b.a();
        } catch (Throwable e) {
            String str = "ByteString";
            String valueOf = String.valueOf(getClass().getName());
            throw new RuntimeException(new StringBuilder((String.valueOf(valueOf).length() + 62) + String.valueOf(str).length()).append("Serializing ").append(valueOf).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    nxx m33382b() {
        return new nxx();
    }
}
