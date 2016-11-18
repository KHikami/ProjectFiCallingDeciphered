package defpackage;

public abstract class nvi<MessageType extends nvh<MessageType, BuilderType>, BuilderType extends nvi<MessageType, BuilderType>> implements nxj {
    public abstract BuilderType a();

    protected abstract BuilderType a(MessageType messageType);

    public abstract BuilderType a(nvw nvw, nwd nwd);

    public /* synthetic */ nxj b(nvw nvw, nwd nwd) {
        return a(nvw, nwd);
    }

    public /* synthetic */ nxj b(nxi nxi) {
        return a(nxi);
    }

    public /* synthetic */ Object clone() {
        return a();
    }

    public BuilderType a(nxi nxi) {
        if (i_().getClass().isInstance(nxi)) {
            return a((nvh) nxi);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
