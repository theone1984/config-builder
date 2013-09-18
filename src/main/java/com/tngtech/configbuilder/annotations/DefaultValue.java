package com.tngtech.configbuilder.annotations;

import com.tngtech.configbuilder.annotationhandlers.DefaultValueProcessor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ValueExtractor(DefaultValueProcessor.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultValue {
    String value();
}
