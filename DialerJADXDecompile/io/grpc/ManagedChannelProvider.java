package io.grpc;

import dgp;
import dgq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: PG */
public abstract class ManagedChannelProvider {
    public abstract int b();

    static {
        ClassLoader classLoader;
        if (a()) {
            classLoader = ManagedChannelProvider.class.getClassLoader();
        } else {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        ServiceLoader load = ServiceLoader.load(ManagedChannelProvider.class, new dgq(classLoader));
        Collection arrayList = new ArrayList();
        Iterator it = load.iterator();
        while (it.hasNext()) {
            arrayList.add((ManagedChannelProvider) it.next());
        }
        if (!arrayList.isEmpty()) {
            ManagedChannelProvider managedChannelProvider = (ManagedChannelProvider) Collections.max(arrayList, new dgp());
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
