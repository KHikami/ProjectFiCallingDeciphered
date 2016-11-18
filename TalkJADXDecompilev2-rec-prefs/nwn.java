package p000;

public class nwn<MessageType extends nwo<MessageType, BuilderType>, BuilderType extends nwn<MessageType, BuilderType>> extends nwk<MessageType, BuilderType> implements nxk {
    public /* synthetic */ nvi mo4038a() {
        return m36969m();
    }

    public /* synthetic */ nwk mo4054c() {
        return m36969m();
    }

    public /* synthetic */ Object clone() {
        return m36969m();
    }

    public /* synthetic */ nwi mo4055d() {
        return m36968l();
    }

    public nwn(MessageType messageType) {
        super((nwi) messageType);
        ((nwo) this.a).d = ((nwo) this.a).d.c();
    }

    protected void mo4053b() {
        if (this.b) {
            super.mo4053b();
            ((nwo) this.a).d = ((nwo) this.a).d.c();
        }
    }

    public final MessageType m36968l() {
        if (this.b) {
            return (nwo) this.a;
        }
        ((nwo) this.a).d.a();
        return (nwo) super.mo4055d();
    }

    public BuilderType m36969m() {
        return (nwn) super.mo4054c();
    }

    public nwn() {
        this(oeo.f32473e);
    }
}
