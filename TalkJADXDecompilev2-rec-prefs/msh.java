package p000;

final class msh extends msa {
    void mo3932a(msl msl, Thread thread) {
        msl.thread = thread;
    }

    void mo3933a(msl msl, msl msl2) {
        msl.next = msl2;
    }

    boolean mo3936a(mrz<?> mrz_, msl msl, msl msl2) {
        boolean z;
        synchronized (mrz_) {
            if (mrz_.waiters == msl) {
                mrz_.waiters = msl2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    boolean mo3935a(mrz<?> mrz_, mse mse, mse mse2) {
        boolean z;
        synchronized (mrz_) {
            if (mrz_.listeners == mse) {
                mrz_.listeners = mse2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    boolean mo3934a(mrz<?> mrz_, Object obj, Object obj2) {
        boolean z;
        synchronized (mrz_) {
            if (mrz_.value == obj) {
                mrz_.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    msh() {
    }
}
