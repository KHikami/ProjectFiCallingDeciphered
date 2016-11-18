package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class axb implements Lock {
    axb() {
    }

    public void lock() {
    }

    public void lockInterruptibly() {
    }

    public boolean tryLock() {
        return true;
    }

    public boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }

    public void unlock() {
    }

    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }
}
