package cn.sztu.slq.Beans;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-16-16:54
 */
@Component
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"cn.sztu.slq.Beans.Job", Travel.class.getName()};
    }

}
