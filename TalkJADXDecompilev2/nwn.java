package defpackage;

public class nwn<MessageType extends nwo<MessageType, BuilderType>, BuilderType extends nwn<MessageType, BuilderType>> extends nwk<MessageType, BuilderType> implements nxk {
    public /* synthetic */ nvi a() {
        return m();
    }

    public /* synthetic */ nwk c() {
        return m();
    }

    public /* synthetic */ Object clone() {
        return m();
    }

    public /* synthetic */ nwi d() {
        return l();
    }

    public nwn(MessageType messageType) {
        super((nwi) messageType);
        ((nwo) this.a).d = ((nwo) this.a).d.c();
    }

    protected void b() {
        if (this.b) {
            super.b();
            ((nwo) this.a).d = ((nwo) this.a).d.c();
        }
    }

    public final MessageType l() {
        if (this.b) {
            return (nwo) this.a;
        }
        ((nwo) this.a).d.a();
        return (nwo) super.d();
    }

    public BuilderType m() {
        return (nwn) super.c();
    }

    public nwn() {
        this(oeo.e);
    }
}
