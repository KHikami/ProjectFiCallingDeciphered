package defpackage;

import nyw;

/* renamed from: omn */
public class omn<T extends nzf> {
    public final int a;

    public T a() {
        mvi mvi;
        switch (this.a) {
            case wi.w /*0*/:
                mvi = new mvi();
                break;
            case wi.j /*1*/:
                mvi = new mvj();
                break;
            case wi.l /*2*/:
                mvi = new mvk();
                break;
            case wi.z /*3*/:
                mvi = new nyw();
                break;
            default:
                throw new AssertionError();
        }
        return mvi;
    }

    public omn(int i) {
        this.a = i;
    }
}
