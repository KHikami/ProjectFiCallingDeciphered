package p000;

class mjl<E> extends mjm<E> {
    Object[] f27831a;
    int f27832b = 0;

    public /* synthetic */ mjm mo3840b(Object obj) {
        return mo3854a(obj);
    }

    mjl(int i) {
        gwb.m2121d(i, "initialCapacity");
        this.f27831a = new Object[i];
    }

    private void m32352a(int i) {
        if (this.f27831a.length < i) {
            this.f27831a = mmr.m32523a(this.f27831a, mjm.m32349a(this.f27831a.length, i));
        }
    }

    public mjl<E> mo3854a(E e) {
        bm.m6122a((Object) e);
        m32352a(this.f27832b + 1);
        Object[] objArr = this.f27831a;
        int i = this.f27832b;
        this.f27832b = i + 1;
        objArr[i] = e;
        return this;
    }

    public mjm<E> mo3839a(E... eArr) {
        mmr.m32524b(eArr, eArr.length);
        m32352a(this.f27832b + eArr.length);
        System.arraycopy(eArr, 0, this.f27831a, this.f27832b, eArr.length);
        this.f27832b += eArr.length;
        return this;
    }
}
