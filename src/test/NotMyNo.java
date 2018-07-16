package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//런타임시에 사용
@Target(ElementType.METHOD)//실행 대상은 메소드

public @interface NotMyNo { //사용할 어노테이션을 선언

}
