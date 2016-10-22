package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer implements Runnable {
    private static final Logger a;
    private static final Field e;
    private final WeakReference<Class<?>> b;
    private final PhantomReference<Object> c;
    private final ReferenceQueue<Object> d;

    static {
        a = Logger.getLogger(Finalizer.class.getName());
        e = b();
    }

    public static void startFinalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        if (cls.getName().equals("com.google.common.base.FinalizableReference")) {
            Thread thread = new Thread(new Finalizer(cls, referenceQueue, phantomReference));
            thread.setName(Finalizer.class.getName());
            thread.setDaemon(true);
            try {
                if (e != null) {
                    e.set(thread, null);
                }
            } catch (Throwable th) {
                a.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th);
            }
            thread.start();
            return;
        }
        throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
    }

    private Finalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.d = referenceQueue;
        this.b = new WeakReference(cls);
        this.c = phantomReference;
    }

    public void run() {
        while (a(this.d.remove())) {
            try {
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean a(Reference<?> reference) {
        Method a = a();
        if (a == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.c) {
                return false;
            }
            try {
                a.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                a.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.d.poll();
        } while (reference != null);
        return true;
    }

    private Method a() {
        Class cls = (Class) this.b.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    private static Field b() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            a.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }
}
