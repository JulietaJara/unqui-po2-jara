package ar.edu.unq.po2.tpComposite;

import java.util.List;

public interface IShapeShifte {
	public IShapeShinfter compose(IShapeShinfter ishape); 
	
	public int deepest(); 
	
	public IShapeShinfter flat(); 
	
	public List <IShapeShinfter> values(); 

}
