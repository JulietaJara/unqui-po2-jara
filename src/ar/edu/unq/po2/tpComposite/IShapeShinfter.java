package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;
import java.util.List;

public class IShapeShinfter implements IShapeShifte{
	List <IShapeShinfter> composiciones = new ArrayList <IShapeShinfter>(); 

	@Override
	public IShapeShinfter compose(IShapeShinfter b) { 
		IShapeShinfter c = new IShapeShinfter(); 
		c.getComposiciones().add(this); 
		c.getComposiciones().add(b); 
		return c;
	}

	public List<IShapeShinfter> getComposiciones() {
		// TODO Auto-generated method stub
		return composiciones;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		int cantComps = 0;
		for (IShapeShinfter b : composiciones) {
			cantComps ++; 
			cantComps += b.cantComposiciones();
		}
		return cantComps;
	}
	
	public int cantComposiciones() {
		return deepest(); 
	}

	@Override
	public IShapeShinfter flat() {
		// TODO Auto-generated method stub
		IShapeShinfter shape = new IShapeShinfter();
		for(IShapeShinfter b : composiciones) {
			shape.getComposiciones().add(b); 
			shape.agregarComp(b);
		}
		return shape;
	}
	
	public void agregarComp(IShapeShinfter sh) {
		for(IShapeShinfter s : sh.getComposiciones()) {
			
			composiciones.add(s); 
			this.agregarComp(s);
		}
	}

	@Override
	public List<IShapeShinfter> values() {
		// TODO Auto-generated method stub
		IShapeShinfter f = this.flat(); 
		List<IShapeShinfter> values = f.getComposiciones(); 
		return values;
	}

}
