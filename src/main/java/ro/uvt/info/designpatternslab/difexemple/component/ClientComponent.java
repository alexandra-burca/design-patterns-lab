package ro.uvt.info.designpatternslab.difexemple.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.uvt.info.designpatternslab.difexemple.component.SingletonComponent;
import ro.uvt.info.designpatternslab.difexemple.component.TransientComponent;

@Component
public class ClientComponent {

    private final TransientComponent transientComponent;
    private final SingletonComponent singletonComponent;

    @Autowired
    public ClientComponent(TransientComponent transientComponent, SingletonComponent singletonComponent) {
        this.transientComponent = transientComponent;
        this.singletonComponent = singletonComponent;
    }

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println("    SingletonComponent = " + this.singletonComponent);
        System.out.println("    TransientComponent = " + this.transientComponent);
    }


}