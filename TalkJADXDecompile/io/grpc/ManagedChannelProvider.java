package io.grpc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import oku;
import okv;

public abstract class ManagedChannelProvider {
    private static final ManagedChannelProvider a;

    public abstract int b();

    static {
        ClassLoader classLoader;
        ManagedChannelProvider managedChannelProvider;
        if (a()) {
            classLoader = ManagedChannelProvider.class.getClassLoader();
        } else {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        ClassLoader okv = new okv(classLoader);
        Iterable a;
        if (a()) {
            a = a(okv);
        } else {
            a = ServiceLoader.load(ManagedChannelProvider.class, okv);
        }
        Collection arrayList = new ArrayList();
        for (ManagedChannelProvider managedChannelProvider2 : r0) {
            arrayList.add(managedChannelProvider2);
        }
        if (arrayList.isEmpty()) {
            managedChannelProvider2 = null;
        } else {
            managedChannelProvider2 = (ManagedChannelProvider) Collections.max(arrayList, new oku());
        }
        a = managedChannelProvider2;
    }

    private static Iterable<ManagedChannelProvider> a(ClassLoader classLoader) {
        Iterable arrayList = new ArrayList();
        try {
            arrayList.add(a(Class.forName("io.grpc.okhttp.OkHttpChannelProvider", true, classLoader)));
        } catch (ClassNotFoundException e) {
        }
        try {
            arrayList.add(a(Class.forName("io.grpc.netty.NettyChannelProvider", true, classLoader)));
        } catch (ClassNotFoundException e2) {
        }
        return arrayList;
    }

    private static ManagedChannelProvider a(Class<?> cls) {
        try {
            return (ManagedChannelProvider) cls.asSubclass(ManagedChannelProvider.class).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(cls.getName());
            String valueOf2 = String.valueOf(th);
            ServiceConfigurationError serviceConfigurationError = new ServiceConfigurationError(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("Provider ").append(valueOf).append(" could not be instantiated: ").append(valueOf2).toString(), th);
        }
    }

    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
