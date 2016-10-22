package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import ojj;
import oll;
import oln;
import olo;
import olp;

public abstract class NameResolverProvider extends oll {
    public static final ojj<Integer> b;
    public static final oll c;
    private static final List<NameResolverProvider> d;

    public abstract int b();

    static {
        ClassLoader classLoader;
        b = oll.a;
        if (c()) {
            classLoader = NameResolverProvider.class.getClassLoader();
        } else {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        ClassLoader olp = new olp(classLoader);
        Iterable a;
        if (c()) {
            a = a(olp);
        } else {
            a = ServiceLoader.load(NameResolverProvider.class, olp);
        }
        List arrayList = new ArrayList();
        for (NameResolverProvider add : r0) {
            arrayList.add(add);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new oln()));
        d = Collections.unmodifiableList(arrayList);
        c = new olo(d);
    }

    private static Iterable<NameResolverProvider> a(ClassLoader classLoader) {
        Iterable arrayList = new ArrayList();
        try {
            arrayList.add(a(Class.forName("io.grpc.internal.DnsNameResolverProvider", true, classLoader)));
        } catch (ClassNotFoundException e) {
        }
        return arrayList;
    }

    private static NameResolverProvider a(Class<?> cls) {
        try {
            return (NameResolverProvider) cls.asSubclass(NameResolverProvider.class).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(cls.getName());
            String valueOf2 = String.valueOf(th);
            ServiceConfigurationError serviceConfigurationError = new ServiceConfigurationError(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("Provider ").append(valueOf).append(" could not be instantiated: ").append(valueOf2).toString(), th);
        }
    }

    private static boolean c() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
