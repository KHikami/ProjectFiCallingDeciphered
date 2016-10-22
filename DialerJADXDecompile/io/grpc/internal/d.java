package io.grpc.internal;

public abstract class d implements bs {
    public void close() {
    }

    protected final void a(int i) {
        if (a() < i) {
            throw new IndexOutOfBoundsException();
        }
    }
}
