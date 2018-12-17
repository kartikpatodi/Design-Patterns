package com.kartikpatodi.patterns.decorator;

public abstract class AbstractDecorator extends Component{
    protected Component component;
    public void setComponent(Component c){
        component = c;
    }

    @Override
    public void doJob() {
        if(component!=null) component.doJob();
    }
}
