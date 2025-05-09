package practice.architecture.hexagonal.annotation.adapter;

import org.springframework.stereotype.Component;
import practice.architecture.hexagonal.annotation.adapter.constant.AdapterType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface Adapter {
    AdapterType value();
}
