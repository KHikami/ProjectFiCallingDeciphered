package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kex;
import kfi;
import kfm;
import kfu;
import kfw;
import kfx;

public class GenericData extends AbstractMap<String, Object> implements Cloneable {
    public final kfi classInfo;
    public Map<String, Object> unknownFields;

    public GenericData() {
        this(EnumSet.noneOf(kfx.class));
    }

    public GenericData(EnumSet<kfx> enumSet) {
        this.unknownFields = new kex();
        this.classInfo = kfi.a(getClass(), enumSet.contains(kfx.IGNORE_CASE));
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        obj = (String) obj;
        kfu a = this.classInfo.a((String) obj);
        if (a != null) {
            return a.a((Object) this);
        }
        if (this.classInfo.a) {
            obj = obj.toLowerCase();
        }
        return this.unknownFields.get(obj);
    }

    public final Object put(String str, Object obj) {
        kfu a = this.classInfo.a(str);
        if (a != null) {
            Object a2 = a.a((Object) this);
            a.a((Object) this, obj);
            return a2;
        }
        if (this.classInfo.a) {
            str = str.toLowerCase();
        }
        return this.unknownFields.put(str, obj);
    }

    public GenericData set(String str, Object obj) {
        kfu a = this.classInfo.a(str);
        if (a != null) {
            a.a((Object) this, obj);
        } else {
            if (this.classInfo.a) {
                str = str.toLowerCase();
            }
            this.unknownFields.put(str, obj);
        }
        return this;
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Entry entry : map.entrySet()) {
            set((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        obj = (String) obj;
        if (this.classInfo.a((String) obj) != null) {
            throw new UnsupportedOperationException();
        }
        if (this.classInfo.a) {
            obj = obj.toLowerCase();
        }
        return this.unknownFields.remove(obj);
    }

    public Set<Entry<String, Object>> entrySet() {
        return new kfw(this);
    }

    public GenericData clone() {
        try {
            Object obj = (GenericData) super.clone();
            kfm.a((Object) this, obj);
            obj.unknownFields = (Map) kfm.c(this.unknownFields);
            return obj;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final Map<String, Object> getUnknownKeys() {
        return this.unknownFields;
    }

    public final void setUnknownKeys(Map<String, Object> map) {
        this.unknownFields = map;
    }

    public final kfi getClassInfo() {
        return this.classInfo;
    }
}
