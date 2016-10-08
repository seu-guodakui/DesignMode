
public abstract class Decorater extends Component {

	protected Component component; 
	@Override
	public void operator() {
		if(component != null){
			component.operator();
		}

	}
	
	public void setComponent(Component component){
		this.component=component;
	}

}
