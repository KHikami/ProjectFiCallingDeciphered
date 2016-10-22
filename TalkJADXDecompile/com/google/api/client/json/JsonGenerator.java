package com.google.api.client.json;

import bc;
import com.google.api.client.util.GenericData;
import gwb;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;
import kfi;
import kfm;
import kfr;
import kfu;

public abstract class JsonGenerator {
    public abstract void close();

    public abstract void flush();

    public abstract JsonFactory getFactory();

    public abstract void writeBoolean(boolean z);

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public abstract void writeNumber(double d);

    public abstract void writeNumber(float f);

    public abstract void writeNumber(int i);

    public abstract void writeNumber(long j);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public abstract void writeStartArray();

    public abstract void writeStartObject();

    public abstract void writeString(String str);

    public final void serialize(Object obj) {
        serialize(false, obj);
    }

    private void serialize(boolean z, Object obj) {
        boolean z2 = true;
        if (obj != null) {
            Class cls = obj.getClass();
            if (kfm.a(obj)) {
                writeNull();
            } else if (obj instanceof String) {
                writeString((String) obj);
            } else if (obj instanceof Number) {
                if (z) {
                    writeString(obj.toString());
                } else if (obj instanceof BigDecimal) {
                    writeNumber((BigDecimal) obj);
                } else if (obj instanceof BigInteger) {
                    writeNumber((BigInteger) obj);
                } else if (obj instanceof Long) {
                    writeNumber(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    boolean z3;
                    float floatValue = ((Number) obj).floatValue();
                    if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    bc.a(z3);
                    writeNumber(floatValue);
                } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    writeNumber(((Number) obj).intValue());
                } else {
                    double doubleValue = ((Number) obj).doubleValue();
                    if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                        z2 = false;
                    }
                    bc.a(z2);
                    writeNumber(doubleValue);
                }
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof kfr) {
                writeString(((kfr) obj).a());
            } else if ((obj instanceof Iterable) || cls.isArray()) {
                writeStartArray();
                for (Object serialize : gwb.M(obj)) {
                    serialize(z, serialize);
                }
                writeEndArray();
            } else if (cls.isEnum()) {
                r0 = kfu.a((Enum) obj).b();
                if (r0 == null) {
                    writeNull();
                } else {
                    writeString(r0);
                }
            } else {
                writeStartObject();
                boolean z4 = (obj instanceof Map) && !(obj instanceof GenericData);
                kfi a = z4 ? null : kfi.a(cls);
                for (Entry entry : kfm.b(obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        boolean z5;
                        r0 = (String) entry.getKey();
                        if (z4) {
                            z5 = z;
                        } else {
                            Field b = a.b(r0);
                            z5 = (b == null || b.getAnnotation(JsonString.class) == null) ? false : true;
                        }
                        writeFieldName(r0);
                        serialize(z5, value);
                    }
                }
                writeEndObject();
            }
        }
    }

    public void enablePrettyPrint() {
    }
}
