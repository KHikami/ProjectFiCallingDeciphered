package p000;

public abstract class nvi<MessageType extends nvh<MessageType, BuilderType>, BuilderType extends nvi<MessageType, BuilderType>> implements nxj {
    public abstract BuilderType mo4038a();

    protected abstract BuilderType mo4039a(MessageType messageType);

    public abstract BuilderType mo4040a(nvw nvw, nwd nwd);

    public /* synthetic */ nxj mo3975b(nvw nvw, nwd nwd) {
        return mo4040a(nvw, nwd);
    }

    public /* synthetic */ nxj mo3976b(nxi nxi) {
        return m36719a(nxi);
    }

    public /* synthetic */ Object clone() {
        return mo4038a();
    }

    public BuilderType m36719a(nxi nxi) {
        if (i_().getClass().isInstance(nxi)) {
            return mo4039a((nvh) nxi);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
