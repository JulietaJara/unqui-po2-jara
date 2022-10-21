package ar.edu.unq.po2.tpComposite;

import java.time.LocalDate;

public interface FyleSystem {
    public int totalSize();
    public int getBytes(); 
	
	public void printStructure();
	
	public FyleSystem lastModified(); 
	public FyleSystem last(FyleSystem fyle); 
	public LocalDate getFechaCreación(); 
	
	public FyleSystem oldestElement();
	public FyleSystem oldQue(FyleSystem fyle); 
	
	

}
