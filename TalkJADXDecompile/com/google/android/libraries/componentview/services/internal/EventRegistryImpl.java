package com.google.android.libraries.componentview.services.internal;

import com.google.android.libraries.componentview.core.ComponentInterface;
import com.google.android.libraries.componentview.services.internal.Event.EventType;
import com.google.android.libraries.componentview.services.internal.EventRegistry.Callable;
import com.google.android.libraries.componentview.services.internal.EventRegistry.Listener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class EventRegistryImpl implements EventManager, EventRegistry {
    private final HashMap<EventKey, EventHandler> a;
    private final Stack<EventInfo> b;

    class CallableImpl implements Callable {
        final List<Listener> a;

        CallableImpl() {
            this.a = new ArrayList();
        }
    }

    class EventHandler {
        final List<CallableImpl> a;
        final List<Listener> b;

        private EventHandler() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    class EventInfo {
        final ComponentInterface a;
        final EventKey b;
        final Callable c;
        final Listener d;
    }

    class EventKey {
        final EventType a;
        final String b;

        public int hashCode() {
            return ((this.a.name().hashCode() + 31) * 31) + this.b.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventKey eventKey = (EventKey) obj;
            if (this.a == eventKey.a && this.b.equals(eventKey.b)) {
                return true;
            }
            return false;
        }
    }

    public EventRegistryImpl() {
        this.a = new HashMap();
        this.b = new Stack();
    }

    public void a(ComponentInterface componentInterface) {
        while (!this.b.empty() && ((EventInfo) this.b.peek()).a == componentInterface) {
            EventInfo eventInfo = (EventInfo) this.b.pop();
            EventHandler eventHandler = (EventHandler) this.a.get(eventInfo.b);
            if (eventHandler != null) {
                if (!(eventInfo.c == null || eventHandler.a.isEmpty())) {
                    eventHandler.a.remove(eventInfo.c);
                }
                if (!(eventInfo.d == null || eventHandler.b.isEmpty())) {
                    eventHandler.b.remove(eventInfo.d);
                }
                if (eventHandler.b.isEmpty() && eventHandler.a.isEmpty()) {
                    this.a.remove(eventInfo.b);
                }
            }
        }
    }
}
