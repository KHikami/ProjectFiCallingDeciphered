package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import gwb;

public class GenericJson extends GenericData implements Cloneable {
    private JsonFactory jsonFactory;

    public final JsonFactory getFactory() {
        return this.jsonFactory;
    }

    public final void setFactory(JsonFactory jsonFactory) {
        this.jsonFactory = jsonFactory;
    }

    public String toString() {
        if (this.jsonFactory == null) {
            return super.toString();
        }
        try {
            return this.jsonFactory.toString(this);
        } catch (Throwable e) {
            throw gwb.a(e);
        }
    }

    public String toPrettyString() {
        if (this.jsonFactory != null) {
            return this.jsonFactory.toPrettyString(this);
        }
        return super.toString();
    }

    public GenericJson clone() {
        return (GenericJson) super.clone();
    }

    public GenericJson set(String str, Object obj) {
        return (GenericJson) super.set(str, obj);
    }
}
