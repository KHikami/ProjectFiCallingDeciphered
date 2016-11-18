package defpackage;

class mjl<E> extends mjm<E> {
    Object[] a;
    int b = 0;

    public /* synthetic */ mjm b(Object obj) {
        return a(obj);
    }

    mjl(int i) {
        gwb.d(i, "initialCapacity");
        this.a = new Object[i];
    }

    private void a(int i) {
        if (this.a.length < i) {
            this.a = mmr.a(this.a, mjm.a(this.a.length, i));
        }
    }

    public mjl<E> a(E e) {
        bm.a((Object) e);
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = e;
        return this;
    }

    public mjm<E> a(E... eArr) {
        mmr.b(eArr, eArr.length);
        a(this.b + eArr.length);
        System.arraycopy(eArr, 0, this.a, this.b, eArr.length);
        this.b += eArr.length;
        return this;
    }
}
